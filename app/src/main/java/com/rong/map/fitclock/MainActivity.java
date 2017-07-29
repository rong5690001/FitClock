package com.rong.map.fitclock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.rong.map.fitclock.model.ClockModel;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mainAdapter = new MainAdapter(this, getData(), R.layout.item_main);
        mRecyclerView.setAdapter(mainAdapter);
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
