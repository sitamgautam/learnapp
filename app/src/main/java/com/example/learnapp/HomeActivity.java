package com.example.learnapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends Activity {

    Button btnCourse, btnQuiz, btnRecommendation, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnCourse = findViewById(R.id.btnCourse);
        btnQuiz = findViewById(R.id.btnQuiz);
        btnRecommendation = findViewById(R.id.btnRecommendation);
        btnProfile = findViewById(R.id.btnProfile);

        btnCourse.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, CourseActivity.class);
            startActivity(intent);
        });

        btnQuiz.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, QuizActivity.class);
            startActivity(intent);
        });

        btnRecommendation.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, RecommendationActivity.class);
            startActivity(intent);
        });

        btnProfile.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
    }
}
