package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    private TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        tvCount = findViewById(R.id.tvCount);
        tvCount.setText(String.valueOf(getIntent().getExtras().getInt(MainActivity.EXTRA_KEY)));
    }
}
