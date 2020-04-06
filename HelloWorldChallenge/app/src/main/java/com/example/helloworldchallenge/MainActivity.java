package com.example.helloworldchallenge;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

// https://codelabs.developers.google.com/codelabs/android-training-hello-world/#8
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] strings = null;
        try {
            for (int cont = 0; cont < 5; cont++) {
                strings[cont] = String.valueOf(cont);
            }
        } catch (NullPointerException exception) {
            Log.e(TAG, exception.toString());
        }
    }
}
