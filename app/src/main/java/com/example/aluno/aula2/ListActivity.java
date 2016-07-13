package com.example.aluno.aula2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aluno on 12/07/2016.
 */
public class ListActivity extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list); //vincula tua activity ao XML

        RecyclerView rvList = (RecyclerView) findViewById(R.id.rvList); //vincula tua activity da lista
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this); //cria o layoutManager
        rvList.setLayoutManager(layoutManager); //vincula a lista ao layoutManager

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.format("Item %s", i));
        }

        ListAdapter adapter = new ListAdapter(list);
        rvList.setAdapter(adapter);

    }
}

