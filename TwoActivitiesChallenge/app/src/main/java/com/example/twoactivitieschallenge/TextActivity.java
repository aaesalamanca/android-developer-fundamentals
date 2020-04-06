package com.example.twoactivitieschallenge;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextActivity extends AppCompatActivity {

    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        tvText = findViewById(R.id.tvText);

        Bundle bundle = getIntent().getExtras();
        switch (bundle.getInt(MainActivity.EXTRA_KEY)) {
            case MainActivity.EXTRA_TEXT_ONE:
                tvText.setText(R.string.text_one);
                break;
            case MainActivity.EXTRA_TEXT_TWO:
                tvText.setText(R.string.text_two);
                break;
            case MainActivity.EXTRA_TEXT_THREE:
                tvText.setText(R.string.text_three);
                break;
            default:
                break;
        }
    }
}
