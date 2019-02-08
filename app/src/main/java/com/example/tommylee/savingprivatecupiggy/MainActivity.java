package com.example.tommylee.savingprivatecupiggy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView listRoll;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager listLayoutManager;
    private ArrayList Dataset = new ArrayList();
    private String[] myDataset= {"Chicken Tikka Kebab","Supreme Pizza","Vegan BBQ Pork","Vegan Fish Fillet"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listRoll = (RecyclerView)findViewById(R.id.recyclerroll);
        listRoll.setHasFixedSize(true);
        listLayoutManager = new LinearLayoutManager(this);
        listRoll.setLayoutManager(listLayoutManager);
        createRollObj();
        // specify an adapter (see also next example)
        mAdapter = new RollAdapter(myDataset,getApplicationContext());
        listRoll.setAdapter(mAdapter);

    }
    private void createRollObj(){
        ListObject one = new ListObject();
    }
}
