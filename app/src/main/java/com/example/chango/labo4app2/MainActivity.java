package com.example.chango.labo4app2;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        Log.d("HelloWorld", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("HelloWorld", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("HelloWorld", "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("HelloWorld", "onResume");
        super.onResume();
    }
}
