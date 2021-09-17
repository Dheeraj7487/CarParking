package com.example.experement;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class userform extends AppCompatActivity {

    CircleImageView userimage;
    TextView usernickname;
    TextView recoveryemail;
    TextView aboutyou;
    Button okkbtn;
    int SELECT_IMAGE_CODD = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userform);
        usernickname= findViewById(R.id.etnickname);
        recoveryemail = findViewById(R.id.etrecoveryemail);
        aboutyou = findViewById(R.id.etaboutyou);
        userimage=  findViewById(R.id.userimage);
        okkbtn = findViewById(R.id.btnOK);

        okkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(userform.this, "successfully save Details", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(userform.this,home.class);
                userform.this.startActivity(move);
            }
        });

        userimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gallry = new Intent();
                gallry.setType("image/*");
                gallry.setAction(Intent.ACTION_GET_CONTENT);

                startActivityForResult(Intent.createChooser(gallry,"select image"),SELECT_IMAGE_CODD);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1)
        {

            Uri uri = data.getData();
            userimage.setImageURI(uri);



        }
    }
}