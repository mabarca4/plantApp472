package csc472.depaul.edu.greenthumb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    //for RecyclerViewAdapter and plant_type_list.xml
    private String[] ArrayOfPlantTypes = {"Succulents", "Trees", "Herbs", "Flowers", "Cacti"};
    //for list_of_plants.xml and PlantListAdaptor.java and PlantList.java
    private List<PlantList> plantList = new ArrayList<>();
    private RecyclerView.Adapter m2Adapter;
    private RecyclerView m2RecyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewId);

        //mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new RecyclerViewAdapter(ArrayOfPlantTypes);
        mRecyclerView.setAdapter(mAdapter);


        m2RecyclerView = (RecyclerView) findViewById(R.id.recyclerViewId);
        m2Adapter = new PlantListAdaptor(plantList);
        m2RecyclerView.setAdapter(m2Adapter);

        preparePlantList();
    }

    private void preparePlantList() {
        PlantList plantname = new PlantList("Aloe");
        plantList.add(plantname);

        plantname = new PlantList("Echeveria");
        plantList.add(plantname);

        plantname = new PlantList("Zebra Plant");
        plantList.add(plantname);

        plantname = new PlantList("Jade Plant");
        plantList.add(plantname);

    }
}
