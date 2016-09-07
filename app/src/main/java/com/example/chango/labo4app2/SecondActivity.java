package com.example.chango.labo4app2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

/**
 * Created by Chango on 07/09/2016.
 */
public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        String varString = getIntent().getStringExtra("valorTest");
        Log.d("Second Activity", varString);
    }
}
