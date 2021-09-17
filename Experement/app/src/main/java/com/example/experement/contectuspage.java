package com.example.experement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class contectuspage extends AppCompatActivity {

    LinearLayout call;
    LinearLayout Email;
    LinearLayout instagrm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contectuspage);

        call = findViewById(R.id.call);
        Email = findViewById(R.id.email);
        instagrm = findViewById(R.id.instagram);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dial = new Intent(Intent.ACTION_DIAL);
                dial.setData(Uri.parse("tel:123456789"));
                startActivity(dial);
            }
        });

        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"E-parking@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT,"Feedback");
                email.putExtra(Intent.EXTRA_TEXT, "feedback from  customer");

                //need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));



            }
        });
    }
}