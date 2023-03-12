package com.skyiot.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AminoAcidModel> aminoAcidModels = new ArrayList<>();

    int[] aminoAcidImage = {R.drawable.ic_baseline_,R.drawable.ic_1circle,R.drawable.ic_circle,
                            R.drawable.ic_cloud,R.drawable.ic_commute,R.drawable.ic_connected,
                            R.drawable.ic_contact_,R.drawable.ic_corporate,R.drawable.ic_cottage,
                            R.drawable.ic_done,R.drawable.ic_mail,R.drawable.ic_offer};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpAminoAcidModels();

        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(this,
                aminoAcidModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private void setUpAminoAcidModels() {
    }

    private void setAminoAcidModels(){
        String[] aminoAcidNames = getResources().getStringArray(R.array.amino_acid_full_txt);
        String[] aminoAcidAbbreviation = getResources().getStringArray(R.array.amino_acid_full_txt);
        String[] aminoAcidAbbreviationSmall = getResources().getStringArray(R.array.amino_acid_full_txt);

        for (int i = 0; i<aminoAcidNames.length; i++){
            aminoAcidModels.add(new AminoAcidModel(aminoAcidNames[i],
                    aminoAcidAbbreviation[i],
                    aminoAcidAbbreviationSmall[i],
                    aminoAcidImage[i]));
        }
    }
}