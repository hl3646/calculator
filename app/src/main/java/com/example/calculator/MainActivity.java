package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button plus, minus, mult, div, ac, equals, credits;
    EditText et1;
    float ans = 0;
    int op = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        ac = findViewById(R.id.ac);
        equals = findViewById(R.id.equals);
        credits = findViewById(R.id.credits);
        et1 = findViewById(R.id.et1);


    }

    public void add(View view)
    {
        if (op == 5)
        {
            Toast.makeText(getApplicationContext(),"Please press on a button again",Toast.LENGTH_SHORT).show();
            op = 6;
        }
        else
        {
            String strNum1 = et1.getText().toString();
            float num1 = 0;
            if (strNum1.length() == 0) {
                num1 = 0;
            } else {
                num1 = Float.parseFloat(strNum1);
            }
            if (op == 0)
            {
                ans += num1;
            }
            else
            {
                doAction(num1);
            }
            et1.setHint(Float.toString(ans));
            et1.getText().clear();
            op = 1;
        }
    }

    public void sub(View view)
    {
        if (op == 5)
        {
            Toast.makeText(getApplicationContext(),"Please press on a button again",Toast.LENGTH_SHORT).show();
            op = 6;
        }
        else
        {
            String strNum1 = et1.getText().toString();
            float num1 = 0;
            if (strNum1.length() == 0) {
                num1 = 0;
            } else {
                num1 = Float.parseFloat(strNum1);
            }
            if (op == 0)
            {
                ans += num1;
            }
            else
            {
                doAction(num1);
            }
            et1.setHint(Float.toString(ans));
            et1.getText().clear();
            op = 2;
        }
    }

    public void multiply(View view) {
        if (op == 5)
        {
            Toast.makeText(getApplicationContext(),"Please press on a button again",Toast.LENGTH_SHORT).show();
            op = 6;
        }
        else
        {
            String strNum1 = et1.getText().toString();
            float num1 = 0;
            if (strNum1.length() == 0) {
                num1 = 1;
            } else {
                num1 = Float.parseFloat(strNum1);
            }
            if (op == 0)
            {
                ans += num1;
            }
            else
            {
                doAction(num1);
            }
            et1.setHint(Float.toString(ans));
            et1.getText().clear();
            op = 3;
        }
    }

    public void divide(View view) {
        if (op == 5)
        {
            Toast.makeText(getApplicationContext(),"Please press on a button again",Toast.LENGTH_SHORT).show();
            op = 6;
        }
        else
        {
            String strNum1 = et1.getText().toString();
            float num1 = 0;
            if (strNum1.length() == 0) {
                num1 = 1;
            } else {
                num1 = Float.parseFloat(strNum1);
            }
            if (op == 0)
            {
                ans += num1;
            }
            else
            {
                doAction(num1);
            }
            et1.setHint(Float.toString(ans));
            et1.getText().clear();
            op = 4;
        }
    }

    public void zeroAns(View view)
    {
        op = 0;
        ans = 0;
        et1.setHint("0.0");
        et1.getText().clear();
        plus.setEnabled(true);
        minus.setEnabled(true);
        mult.setEnabled(true);
        div.setEnabled(true);
        equals.setEnabled(true);
        credits.setEnabled(true);
    }

    public void getAns(View view)
    {

        String strNum1 = et1.getText().toString();
        float num1 = 0;
        if (strNum1.length() == 0)
        {
            num1 = 0;
        }
        else
        {
            num1 = Float.parseFloat(strNum1);
        }
        doAction(num1);
        et1.setHint(Float.toString(ans));
        et1.getText().clear();
        op = 5;
    }

    public void showCredits(View view)
    {
        Intent si = new Intent(this,credits.class);
        si.putExtra("num", ans);
        startActivity(si);
    }

    public void doAction(float num1)
    {
        if (op == 1)
        {
            ans += num1;
        }
        else if (op == 2)
        {
            ans -= num1;
        }
        else if (op == 3)
        {
            ans *= num1;
        }
        else if (op == 4)
        {
            if (num1 == 0)
            {
                Toast.makeText(getApplicationContext(),"Invalid number to divide by please click on A/C to start again",Toast.LENGTH_SHORT).show();
                et1.getText().clear();
                plus.setEnabled(false);
                minus.setEnabled(false);
                mult.setEnabled(false);
                div.setEnabled(false);
                equals.setEnabled(false);
                credits.setEnabled(false);
            }
            else
            {
                ans /= num1;
            }
        }
    }
}