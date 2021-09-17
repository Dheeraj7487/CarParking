package com.example.experement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ParkingCancel extends AppCompatActivity {

    private Button cbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_cancel);
        cbutton=findViewById(R.id.cancel_book_btn);

        cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ParkingCancel.this,"Booking is cancelled", Toast.LENGTH_LONG).show();
            }
        });
    }
    }
