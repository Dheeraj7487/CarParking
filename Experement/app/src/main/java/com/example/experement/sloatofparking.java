package com.example.experement;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class sloatofparking extends AppCompatActivity {
                LinearLayout sloat1;
                LinearLayout sloat2;
                LinearLayout sloat3;
                LinearLayout sloat4;
                LinearLayout sloat5;
                LinearLayout sloat6;
                LinearLayout sloat7;
                LinearLayout sloat8;
                TextView txt1;
                TextView txt2;
                TextView txt3;
                TextView txt4;
                TextView txt5;
                TextView txt6;
                TextView txt7;
                TextView txt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sloatofparking);

        sloat1= findViewById(R.id.sloat1);
        sloat2= findViewById(R.id.sloat2);
        sloat3= findViewById(R.id.sloat3);
        sloat4= findViewById(R.id.sloat4);
        sloat5= findViewById(R.id.sloat5);
        sloat6= findViewById(R.id.sloat6);
        sloat7= findViewById(R.id.sloat7);
        sloat8= findViewById(R.id.sloat8);
        txt1 = findViewById(R.id.txtid1);
        txt2 = findViewById(R.id.txtid2);
        txt3 = findViewById(R.id.txtid3);
        txt4 = findViewById(R.id.txtid4);
        txt5 = findViewById(R.id.txtid5);
        txt6 = findViewById(R.id.txtid6);
        txt7 = findViewById(R.id.txtid7);
        txt8 = findViewById(R.id.txtid8);


        sloat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sloat = new Intent(sloatofparking.this,ParkingBook.class);
                sloatofparking.this.startActivity(sloat);
                txt1.setText("Booked");
                sloat1.setEnabled(false);
                sloat1.setBackgroundResource(R.color.red);

            }
        });

        sloat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sloat = new Intent(sloatofparking.this,ParkingBook.class);
                sloatofparking.this.startActivity(sloat);
                txt2.setText("Booked");
                sloat2.setEnabled(false);
                sloat2.setBackgroundResource(R.color.red);

            }
        });

        sloat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sloat = new Intent(sloatofparking.this,ParkingBook.class);
                sloatofparking.this.startActivity(sloat);
                txt3.setText("Booked");
                sloat3.setEnabled(false);
                sloat3.setBackgroundResource(R.color.red);


            }
        });

        sloat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sloat = new Intent(sloatofparking.this,ParkingBook.class);
                sloatofparking.this.startActivity(sloat);
                txt4.setText("Booked");
                sloat4.setEnabled(false);
                sloat4.setBackgroundResource(R.color.red);


            }
        });

        sloat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sloat = new Intent(sloatofparking.this,ParkingBook.class);
                sloatofparking.this.startActivity(sloat);
                txt5.setText("Booked");
                sloat5.setEnabled(false);
                sloat5.setBackgroundResource(R.color.red);


            }
        });

        sloat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sloat = new Intent(sloatofparking.this,ParkingBook.class);
                sloatofparking.this.startActivity(sloat);
                txt6.setText("Booked");
                sloat6.setEnabled(false);
                sloat6.setBackgroundResource(R.color.red);


            }
        });

        sloat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sloat = new Intent(sloatofparking.this,ParkingBook.class);
                sloatofparking.this.startActivity(sloat);
                txt7.setText("Booked");
                sloat7.setEnabled(false);
                sloat7.setBackgroundResource(R.color.red);


            }
        });

        sloat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sloat = new Intent(sloatofparking.this,ParkingBook.class);
                sloatofparking.this.startActivity(sloat);
                txt8.setText("Booked");
                sloat8.setEnabled(false);
                sloat8.setBackgroundResource(R.color.red);


            }
        });




    }
}