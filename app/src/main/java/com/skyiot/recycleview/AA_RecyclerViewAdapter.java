package com.skyiot.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AA_RecyclerViewAdapter extends RecyclerView.Adapter< AA_RecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<AminoAcidModel> aminoAcidModels;


    public AA_RecyclerViewAdapter(Context context, ArrayList<AminoAcidModel> aminoAcidModels){
       this.context = context;
       this.aminoAcidModels = aminoAcidModels;
    }


    @NonNull
    @Override
    public AA_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // This is where you inflate the layout (Giving a look to our rows]
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row,parent,false);

        return new AA_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerViewAdapter.MyViewHolder holder, int position) {
        // assigning values to the View we created in the recycler_view_row layout file
        // based on the position of the recycler view
        holder.tvName.setText(aminoAcidModels.get(position).getAminoAcidName());
        holder.tv3Letter.setText(aminoAcidModels.get(position).getAminoAcidAbbreviation());
        holder.tv1Letter.setText(aminoAcidModels.get(position).getAminoAcidAbbreviationSmall());
        holder.imageView.setImageResource(aminoAcidModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        // The recycler view just wants to know the number of item you want displayed
        return aminoAcidModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        // grabbing the view from our recycler _view_row layout file
        // Kinda like in the onCreate method

        ImageView imageView;
        TextView  tvName, tv3Letter, tv1Letter;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

         imageView = itemView.findViewById(R.id.imageView);
         tvName = itemView.findViewById(R.id.textView);
         tv3Letter = itemView.findViewById(R.id.textView2);
         tv1Letter = itemView.findViewById(R.id.textView3);
        }
    }
}
