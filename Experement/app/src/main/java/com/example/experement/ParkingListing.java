package com.example.experement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ParkingListing extends AppCompatActivity {

    private RecyclerView loclist;
    Button btncancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_listing);

        loclist=findViewById(R.id.loclist);
         btncancle = findViewById(R.id.cbook);

        ParkingLocation[] loc=new ParkingLocation[3];

        loc[0]=new ParkingLocation(R.drawable.miragecinema,"Mirage Cinema Nikol","30","13","7","6");
        loc[1]=new ParkingLocation(R.drawable.alpha_logo,"Alpha Mall Sarkhej ","50","40","15","25");
        loc[2]=new ParkingLocation(R.drawable.apollo,"Apollo Hospital Gandhinagar ","40","20","7","13");

        ParkAdapter pslot =new ParkAdapter();

        pslot.setItems(loc);
        loclist.setAdapter(pslot);



    }
    }
