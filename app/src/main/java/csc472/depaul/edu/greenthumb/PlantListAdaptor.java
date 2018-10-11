package csc472.depaul.edu.greenthumb;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class PlantListAdaptor extends RecyclerView.Adapter<PlantListAdaptor.ViewHolderListOfPlants> {
        private List<PlantList> plantList;


        public static class ViewHolderListOfPlants extends RecyclerView.ViewHolder {

            public TextView plantNameCommon;

            public ViewHolderListOfPlants(View v) {
                super(v);
                plantNameCommon = (TextView) v.findViewById(R.id.nameOfPlant);
            }
        }

        public PlantListAdaptor(List<PlantList> plantList) {
            this.plantList = plantList;
        }


        @Override
        public ViewHolderListOfPlants onCreateViewHolder(ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_of_plants, parent, false);
            ViewHolderListOfPlants vh = new ViewHolderListOfPlants(v);
            return vh;

        }

        @Override
        public void onBindViewHolder(ViewHolderListOfPlants holder, int position) {

            PlantList plantName = plantList.get(position);
            holder.plantNameCommon.setText(plantName.getNameCommon());


        }

        @Override
        public int getItemCount() {

            return plantList.size();
        }

}
