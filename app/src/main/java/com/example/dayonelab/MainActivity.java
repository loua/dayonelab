package com.example.dayonelab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Log statements with varying levels
        Log.d(LOG_TAG, "Hello World debug statement");
        Log.i(LOG_TAG, "Hello World info statement");
        Log.w(LOG_TAG, "Hello World warn statement");
        Log.e(LOG_TAG, "Hello World error statement");
    }
}
