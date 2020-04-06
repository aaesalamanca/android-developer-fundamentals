package com.example.twoactivitieslifecyclechallenge;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

// https://codelabs.developers.google.com/codelabs/android-training-activity-lifecycle-and-state/#4
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Fields.
    public static final String KEY_SELECTED_ITEM = "item";
    public static final String KEY_RESTORE = "restore";

    private static final int RC_ITEMS_ACTIVITY = 0;

    private int[] idsTv;

    private Button btnAddItem;

    // Events.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        if (savedInstanceState != null) {
            for (int index : idsTv) {
                TextView tv = findViewById(index);
                tv.setText(savedInstanceState.getString(KEY_RESTORE + index));
            }
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ItemsActivity.class);
        startActivityForResult(intent, RC_ITEMS_ACTIVITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_ITEMS_ACTIVITY) {
            if (resultCode == RESULT_OK) {
                for (int index : idsTv) {
                    TextView tv = findViewById(index);
                    if (TextUtils.isEmpty(tv.getText())) {
                        tv.setText(data.getStringExtra(KEY_SELECTED_ITEM));
                        break;
                    }
                }
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        for (int index : idsTv) {
            TextView tv = findViewById(index);
            outState.putString(KEY_RESTORE + index, tv.getText().toString());
        }
    }

    // Regular methods.
    private void init() {
        // EditText id's.
        idsTv = new int[10];
        idsTv[0] = R.id.tvItem0;
        idsTv[1] = R.id.tvItem1;
        idsTv[2] = R.id.tvItem2;
        idsTv[3] = R.id.tvItem3;
        idsTv[4] = R.id.tvItem4;
        idsTv[5] = R.id.tvItem5;
        idsTv[6] = R.id.tvItem6;
        idsTv[7] = R.id.tvItem7;
        idsTv[8] = R.id.tvItem8;
        idsTv[9] = R.id.tvItem9;

        // Button.
        btnAddItem = findViewById(R.id.btnAddItem);
        btnAddItem.setOnClickListener(this);
    }
}
