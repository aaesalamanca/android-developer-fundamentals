package com.example.hellotoast;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-a/#1
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_KEY = MainActivity.class.getName();

    private int mCount;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCount = 0;
        mShowCount = findViewById(R.id.show_count);
    }

    public void startHelloActivity(View view) {
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra(EXTRA_KEY, mCount);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(String.valueOf(mCount));
        }
    }
}
