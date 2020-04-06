package com.example.twoactivitieslifecyclechallenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ItemsActivity extends AppCompatActivity {

    // Events.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
    }

    public void itemClicked(View view) {
        Button btn = (Button) view;
        Intent intent = new Intent();
        intent.putExtra(MainActivity.KEY_SELECTED_ITEM, btn.getText());
        setResult(RESULT_OK, intent);
        finish();
    }
}
