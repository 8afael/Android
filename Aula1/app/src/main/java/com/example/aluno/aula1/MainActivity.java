package com.example.aluno.aula1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Aluno on 11/07/2016.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); //vincula tua activity ao XML

        TextView tfText = (TextView) findViewById(R.id.tfText); //Pegando da activity o TextView, para poder manipular


    }
}
