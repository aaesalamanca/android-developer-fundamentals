 package com.example.implicitintentsreceiver;

 import android.content.Intent;
 import android.net.Uri;
 import android.os.Bundle;
 import android.widget.TextView;

 import androidx.appcompat.app.AppCompatActivity;

 // https://codelabs.developers.google.com/codelabs/android-training-activity-with-implicit-intent/#6
public class MainActivity extends AppCompatActivity {

    // Events.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Uri uri = intent.getData();
        if (uri != null) {
            TextView textView = findViewById(R.id.text_uri_message);
            textView.setText("URI: " + uri.toString());
        }
    }
}
