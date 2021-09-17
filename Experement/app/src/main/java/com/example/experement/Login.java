package com.example.experement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;

public class Login extends AppCompatActivity {


    private EditText etName;
    private EditText etPass;
    private Button btnlogin;
    private TextView txtTry;
    private TextView txtinfo;
    public Integer count = 5;
    public Credential credential;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedPreferencesEditor;



    boolean isvalid = false;
    private CheckBox checkbox;

    //Credential user = new Credential("Admin","123456789");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etName = findViewById(R.id.etNameLogin);
        etPass = findViewById(R.id.etPassLogin);
        btnlogin = findViewById(R.id.btnlogin);
        txtTry = findViewById(R.id.txtTry);
        txtinfo = findViewById(R.id.txtInfo);
        txtTry.setText("Left Try :5");
        checkbox = findViewById(R.id.checkBoxRemember);

        credential = new Credential();

        sharedPreferences = getApplicationContext().getSharedPreferences("CredentialDB",MODE_PRIVATE);
        sharedPreferencesEditor = sharedPreferences.edit();

        if(sharedPreferences != null){

            Map<String,?> preferencesMap = sharedPreferences.getAll();
            if (preferencesMap.size() != 0 ){
                credential.loadCredential(preferencesMap);
            }


            String savedusername = sharedPreferences.getString("LastsavedUsername","");
            String savedpassword = sharedPreferences.getString("LastsavedPassword","");


           if (sharedPreferences.getBoolean("RememberMECheck",false))
           {
               etName.setText(savedusername);
               etPass.setText(savedpassword);
               checkbox.setChecked(true);

           }

        }

       // user.setUsername("Admin1");
       // user.setPassword("987654321");



        txtinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Regiester = new Intent(Login.this,register.class);
                Login.this.startActivity(Regiester);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputname = etName.getText().toString();
                String inputpass = etPass.getText().toString();

                if (inputname.isEmpty() || inputpass.length() < 8)
                {
                    Toast.makeText(Login.this, "please enter valide length credential paaword <5", Toast.LENGTH_LONG).show();
                }

                else {
                    isvalid = validate(inputname,inputpass);
                    if (!isvalid)
                    {
                        count--;
                        txtTry.setText("Try left :" + count);
                        if(count == 0)
                        {
                            btnlogin.setEnabled(false);
                        }
                        Toast.makeText(Login.this, "Try again wrong details", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        sharedPreferencesEditor.putString("LastsavedUsername",inputname);
                        sharedPreferencesEditor.putString("LastsavedPassword",inputpass);

                        sharedPreferencesEditor.putBoolean("RememberMECheck",checkbox.isChecked());
                        sharedPreferencesEditor.apply();


                        Toast.makeText(Login.this, "Login Successfull", Toast.LENGTH_LONG).show();
                        Intent next = new Intent(Login.this,home.class);
                        Login.this.startActivity(next);
                    }

                }
            }
        });


    }

    private boolean validate(String checkname, String checkpass)

    {
        return  credential.varifyCredential(checkname,checkpass);
          }
}