package com.example.learnapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {
    private ListView historyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        historyListView = findViewById(R.id.history_list);

        List<String> historyItems = new ArrayList<>();
        historyItems.add("Completed: Java Basics");
        historyItems.add("Completed: Android Intents");
        historyItems.add("Scored 85% in OOP Quiz");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, historyItems);
        historyListView.setAdapter(adapter);
    }
}
