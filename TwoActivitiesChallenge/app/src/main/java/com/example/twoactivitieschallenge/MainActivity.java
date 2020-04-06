package com.example.twoactivitieschallenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// https://codelabs.developers.google.com/codelabs/android-training-create-an-activity/#7
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_KEY = MainActivity.class.getName();
    public static final int EXTRA_TEXT_ONE = 1;
    public static final int EXTRA_TEXT_TWO = 2;
    public static final int EXTRA_TEXT_THREE = 3;

    private Button btnLeft;
    private Button btnMiddle;
    private Button btnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadComponents();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, TextActivity.class);
        switch (v.getId()) {
            case R.id.btnLeft:
                intent.putExtra(EXTRA_KEY, EXTRA_TEXT_ONE);
                break;
            case R.id.btnMiddle:
                intent.putExtra(EXTRA_KEY, EXTRA_TEXT_TWO);
                break;
            case R.id.btnRight:
                intent.putExtra(EXTRA_KEY, EXTRA_TEXT_THREE);
                break;
            default:
                break;
        }
        startActivity(intent);
    }

    private void loadComponents() {
        btnLeft = findViewById(R.id.btnLeft);
        btnMiddle = findViewById(R.id.btnMiddle);
        btnRight = findViewById(R.id.btnRight);

        btnLeft.setOnClickListener(this);
        btnMiddle.setOnClickListener(this);
        btnRight.setOnClickListener(this);
    }
}
