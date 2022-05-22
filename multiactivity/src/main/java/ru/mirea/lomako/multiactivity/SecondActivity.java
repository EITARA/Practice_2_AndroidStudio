package ru.mirea.lomako.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String TAG = SecondActivity.class.getSimpleName();
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        Log.i(TAG, "onCreate()");
        String text = (String) getIntent().getSerializableExtra("key");
        textView2 =(TextView) findViewById(R.id.textView2);
        textView2.setText(text);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, " onPause()");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, " onSaveInstanceState()");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, " onStop()");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, " onDestroy()");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.i(TAG, " onRestart()");
    }
    @Override
    public void onRestoreInstanceState(Bundle outState) {
        super.onRestoreInstanceState(outState);
        Log.i(TAG, " onRestoreInstanceState()");
    }
}