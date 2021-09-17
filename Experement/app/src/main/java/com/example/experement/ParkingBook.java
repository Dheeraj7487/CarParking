package com.example.experement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ParkingBook extends AppCompatActivity {
    private Button book_button;
    private TextView registerno;
    private TextView hour;
    private RadioGroup radiogroup;
    String registno,bhour;
    int totalcost,cost;
    private RadioButton radioButton;
    private String vehicletype;
    private String totcost;
    private TextView status;
    private Button paygateway;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_book);

        book_button=findViewById(R.id.book_btn);
        registerno=findViewById(R.id.book_vehicle_no_reg);
        hour=findViewById(R.id.book_number_hour);
        radiogroup=findViewById(R.id.type_select);
        status=findViewById(R.id.booking_status);
        paygateway=findViewById(R.id.paygateway);



        paygateway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentway = new Intent(ParkingBook.this,rzpay.class);
                ParkingBook.this.startActivity(paymentway);
            }
        });
        book_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registno= registerno.getText().toString();
                bhour=hour.getText().toString();
                int selectedId=radiogroup.getCheckedRadioButtonId();
                radioButton=findViewById(selectedId);
                vehicletype= radioButton.getText().toString();
                if(vehicletype.equals("Car"))
                {
                    cost=50;
                    int hr=Integer.parseInt(bhour);

                    totalcost=cost*hr;

                    totcost=String.valueOf(totalcost)+" Rs";
                }

                else if (vehicletype.equals("Bike"))
                {
                    cost=25;
                    int hr=Integer.parseInt(bhour);

                    totalcost=cost*hr;

                    totcost=String.valueOf(totalcost)+" Rs";
                }

                status.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                status.setText("Total Cost is :- "+ totcost);
                paygateway.setVisibility(View.VISIBLE);
            }
        });
    }

}
