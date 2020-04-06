package com.example.helloconstraint;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-b/#9
public class MainActivity extends AppCompatActivity {

    private int mCount;
    private Button button_zero;
    private Button button_count;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCount = 0;
        button_zero = findViewById(R.id.button_zero);
        button_count = findViewById(R.id.button_count);
        mShowCount = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countZero(View view) {
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(String.valueOf(mCount));

            button_zero.setBackgroundColor(Color.GRAY);
            button_count.setBackgroundColor(Color.GREEN);
        }
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(String.valueOf(mCount));

            if ((mCount % 2) == 0) {
                view.setBackgroundColor(Color.GREEN);
            } else {
                view.setBackgroundColor(Color.MAGENTA);
            }

            button_zero.setBackgroundColor(Color.RED);
        }
    }
}
