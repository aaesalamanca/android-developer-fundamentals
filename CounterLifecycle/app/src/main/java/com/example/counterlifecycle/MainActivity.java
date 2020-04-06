package com.example.counterlifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

// https://codelabs.developers.google.com/codelabs/android-training-activity-lifecycle-and-state/#8
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Fields.
    private static final String KEY_RESTORE = "restore";

    private TextView tvCounter;
    private Button btnCount;

    private int counter;

    // Events.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tvCounter);
        btnCount = findViewById(R.id.btnCount);
        btnCount.setOnClickListener(this);

        if (savedInstanceState != null) {
            tvCounter.setText(savedInstanceState.getString(KEY_RESTORE));
        }
    }

    @Override
    public void onClick(View v) {
        counter = Integer.parseInt(tvCounter.getText().toString()) + 1;

        tvCounter.setText(String.valueOf(counter));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(KEY_RESTORE, tvCounter.getText().toString());
    }
}
