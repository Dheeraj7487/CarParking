package com.example.experement;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.razorpay.Checkout;

import org.json.JSONObject;

public class rzpay extends AppCompatActivity {
    Button paybtn;
    TextView textid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rzpay);

        Checkout.preload(getApplicationContext());

        paybtn = findViewById(R.id.paybtn);
        textid = findViewById(R.id.textid);

        paybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makepayment();

            }
        });
    }
    private  void makepayment()
    {
        Checkout checkout = new Checkout();
        checkout.setKeyID("rzp_test_dmxbpbyrGy3Pug");

        checkout.setImage(R.drawable.caee);

        final Activity activity = this;

        try {
            JSONObject options = new JSONObject();

            options.put("name", "E-Parking ");
            options.put("description", "Reference No. #123456");
            options.put("image", "https://s3.amazonaws.com/rzp-mobile/images/rzp.png");
            //   options.put("order_id", "order_DBJOWzybf0sJbb");//from response of step 3.
            options.put("theme.color", "#3399cc");
            options.put("currency", "INR");
            options.put("amount", "5000");//pass amount in currency subunits
            options.put("prefill.email", "ayushshah279@gmail.com.com");
            options.put("prefill.contact","9664772765");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            options.put("retry", retryObj);

            checkout.open(activity, options);

        } catch(Exception e) {
            Log.e("TAG", "Error in starting Razorpay Checkout", e);
        }
    }
}




