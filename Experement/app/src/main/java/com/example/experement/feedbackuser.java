package com.example.experement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class feedbackuser extends AppCompatActivity {

    RatingBar rating;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbackuser);

        rating = findViewById(R.id.Rating);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s  = String.valueOf(rating.getRating());
                Toast.makeText(feedbackuser.this, s+"star", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(feedbackuser.this,home.class);
                feedbackuser.this.startActivity(move);
            }
        });
    }
}