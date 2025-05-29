package com.example.learnapp;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LlamaChatActivity extends AppCompatActivity {

    private EditText inputField;
    private TextView responseView;
    private Button sendButton;
    private ApiClient.ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llama_chat);

        inputField = findViewById(R.id.llama_input);
        responseView = findViewById(R.id.llama_response);
        sendButton = findViewById(R.id.llama_send_button);

        // Initialize Retrofit API client
        apiService = ApiClient.getApiService();

        sendButton.setOnClickListener(v -> {
            String prompt = inputField.getText().toString();
            if (!prompt.isEmpty()) {
                sendPromptToBackend(prompt);
            }
        });
    }

    private void sendPromptToBackend(String prompt) {
        Message message = new Message(prompt);

        Call<String> call = apiService.sendMessage(message);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful()) {
                    responseView.setText(response.body());
                } else {
                    responseView.setText("Error: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                responseView.setText("Failed: " + t.getMessage());
            }
        });
    }
}
