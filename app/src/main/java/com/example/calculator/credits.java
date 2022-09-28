package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class credits extends AppCompatActivity {

    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        tv = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        getIntentInfo();
    }


    public void getIntentInfo()
    {
        Intent gi = getIntent();

        float ans = gi.getFloatExtra("num", 0);
        String ansString = Float.toString(ans);
        tv.setText("Made by Harel Levi with the help of Albert\n Last answer: " + ansString);
        tv.setTextSize(25);
    }

    public void returnToCalc(View view)
    {
        Intent si = new Intent(this,MainActivity.class);
        startActivity(si);
    }

}


