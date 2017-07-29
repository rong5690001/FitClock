package com.rong.map.fitclock;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.rong.map.fitclock.model.ClockModel;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;
    private FloatingActionButton mFab;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mainAdapter = new MainAdapter(this, getData(), R.layout.item_main);
        mRecyclerView.setAdapter(mainAdapter);
    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mFab = (FloatingActionButton) findViewById(R.id.fab);
    }

    private List<ClockModel> getData() {
        List<ClockModel> clockModels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ClockModel clockModel = new ClockModel();
            clockModel.time = "8:00";
            clockModel.date = "每天";
            clockModel.isOpened = true;
            clockModels.add(clockModel);
        }
        return clockModels;
    }
}
