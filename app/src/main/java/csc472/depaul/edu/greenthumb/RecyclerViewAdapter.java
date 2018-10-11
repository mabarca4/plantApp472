package csc472.depaul.edu.greenthumb;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private String[] ArrayOfPlantTypes;



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView plantType;

        public MyViewHolder(View v) {
            super(v);
            plantType = (TextView) v.findViewById(R.id.plantType);
        }
    }

    public RecyclerViewAdapter(String[] theArrayOfPlantTypes) {
        ArrayOfPlantTypes = theArrayOfPlantTypes;
    }



    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.plant_type_list, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.plantType.setText(ArrayOfPlantTypes[position]);


    }

    @Override
    public int getItemCount() {
        return ArrayOfPlantTypes.length;
    }


}
