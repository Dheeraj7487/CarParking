package com.example.experement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

public class register extends AppCompatActivity {

    private EditText etcheckkname;
    private EditText etcheckpass;
    private Button btncheck;
    public  Credential user;


    //This is for offline data store in phone for app. sharepreferences
    SharedPreferences sharedPreferences;
    //SharedpreferencesEditer is  use for  add values in the file .
    SharedPreferences.Editor sharedPreferencesEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etcheckkname = findViewById(R.id.etnamechekk);
        etcheckpass = findViewById(R.id.etpasschekk);
        btncheck = findViewById(R.id.btnchekk);

        user = new Credential();

        //getapplicationcontext for you are in this app and getsharedpreferences for create file and attatch mode for file .
        sharedPreferences = getApplicationContext().getSharedPreferences("CredentialDB",MODE_PRIVATE);

      //By sharedPrefernces.edit we can edit sharepreferences file ....
        sharedPreferencesEditor =sharedPreferences.edit();


        if(sharedPreferences != null){

            Map<String,?> preferencesMap = sharedPreferences.getAll();
            if (preferencesMap.size() != 0 ){
                user.loadCredential(preferencesMap);
            }

        }
        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etcheckkname.getText().toString();
                String userpass = etcheckpass.getText().toString();

                if (validate(username, userpass)) {

                    if (user.checkusername(username)) {
                        Toast.makeText(register.this, "Username alredy taken", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        user.addCredential(username, userpass);

                        //store the credentials
                        sharedPreferencesEditor.putString(username, userpass);
                        // after shrepreferencesEditor.apply all the changes what we were do in file is save.
                        //commits the changes and adds them to the file
                        sharedPreferencesEditor.apply();

                        Intent next = new Intent(register.this, Login.class);

                        register.this.startActivity(next);
                        Toast.makeText(register.this, "successfull", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });


    }

    private  boolean validate(String name,String pass)
    {
        if (name.isEmpty() || pass.length() < 8)
        {
            Toast.makeText(this, "wrong wrong wrong", Toast.LENGTH_SHORT).show();
            return false;
        }
        return  true;
    }
}