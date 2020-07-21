package com.example.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class News extends AppCompatActivity {
    TextView textContent,textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        String text = i.getStringExtra("title");

        String[] temp = text.split("\n",2);
        String title = temp[0];
        int titleLen = title.length();
        String content = text.substring(titleLen).trim();

        textContent = findViewById(R.id.content);
        textTitle = findViewById(R.id.title);
        textTitle.setText(title);
        textContent.setText(content);

    }
}
