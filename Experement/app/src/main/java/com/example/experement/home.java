package com.example.experement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class home extends AppCompatActivity {


    private  DrawerLayout drawerLayout;
    private Toolbar tool;
    NavigationView navigationView;



    ActionBarDrawerToggle actionBarDrawerToggle;
    LinearLayout userlayout;
    LinearLayout feedbacklayout;
    LinearLayout Contectuslayout;
    LinearLayout Maplayout;
    LinearLayout parking;
    LinearLayout walletpay;
    LinearLayout AboutUS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setuptoolbar();

    }

        private void setuptoolbar() {
        drawerLayout = findViewById(R.id.drawlayout);
        tool = findViewById(R.id.toolbar);
        userlayout = findViewById(R.id.userlayout);
        feedbacklayout = findViewById(R.id.feedbackliner);
        Contectuslayout = findViewById(R.id.contectuslayout);
            Maplayout = findViewById(R.id.mapLayout);
        parking = findViewById(R.id.parking);
        walletpay= findViewById(R.id.walletpay);
        AboutUS= findViewById(R.id.AboutUS);

        userlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userinfo = new Intent(home.this,userform.class);
                home.this.startActivity(userinfo);
            }
        });

            Maplayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent currentmap = new Intent(home.this,MainActivity.class);
                    home.this.startActivity(currentmap);
                }
            });

        feedbacklayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent feedback = new Intent(home.this,feedbackuser.class);
                home.this.startActivity(feedback);
            }
        });

        Contectuslayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contect = new Intent(home.this,contectuspage.class);
                home.this.startActivity(contect);
            }
        });



        parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent park = new Intent(home.this,ParkingListing.class);
                home.this.startActivity(park);
            }
        });

        walletpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent payway = new Intent(home.this,rzpay.class);
                home.this.startActivity(payway);
            }
        });

            AboutUS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent about = new Intent(home.this,aboutus.class);
                    home.this.startActivity(about);
                }
            });



            // for  Navigation menu
        navigationView = findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        Intent direct = new Intent(home.this,home.class);
                        home.this.startActivity(direct);

                        Toast.makeText(home.this, "Home clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.nav_parking:
                        Intent parkk = new Intent(home.this,ParkingListing.class);
                        home.this.startActivity(parkk);

                        Toast.makeText(home.this, "Parking clicked", Toast.LENGTH_SHORT).show();
                        break;


                        case R.id.share:
                        Intent  share = new Intent(Intent.ACTION_SEND);
                        share.setType("text/plain");
                        String body = "Link to your app";
                        String subject = "Your Subject";
                        share.putExtra(Intent.EXTRA_SUBJECT, subject);
                        share.putExtra(Intent.EXTRA_TEXT, body);
                        startActivity(Intent.createChooser(share, "Share using"));
                        break;

                    case R.id.settings:
                        Toast.makeText(home.this, "Settings clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.nav_about:
                        Intent Aboutt = new Intent(home.this,aboutus.class);
                        home.this.startActivity(Aboutt);

                        Toast.makeText(home.this, "About clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.Logout:
                        Intent logout = new Intent(home.this,Login.class);
                        home.this.startActivity(logout);
                        Toast.makeText(home.this, "Logout successfull", Toast.LENGTH_SHORT).show();
                        break;
                }


                return false;
            }
        });

        actionBarDrawerToggle= new ActionBarDrawerToggle(this, drawerLayout, tool ,R.string.app_name  , R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();






    }
}