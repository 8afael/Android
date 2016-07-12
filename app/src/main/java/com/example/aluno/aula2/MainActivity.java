package com.example.aluno.aula2;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Aluno on 12/07/2016.
 */
public class MainActivity extends Activity {

    private final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //vincula tua activity ao XML


        Log.d(TAG, "OnCreate");
    }
}

