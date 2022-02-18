package com.example.HondaCar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

import androidx.appcompat.app.AppCompatActivity;

public class emi extends AppCompatActivity {

    private EditText principal, interest, years, downpayment;
    private TextView monthlyEMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);

        principal = (EditText)findViewById(R.id.principal_amount);
        downpayment=(EditText)findViewById(R.id.down_payment);
        interest = (EditText)findViewById(R.id.interest_rate);
        years = (EditText)findViewById(R.id.total_years);
        monthlyEMI = (TextView)findViewById(R.id.calculated_emi);


        ImageView Icon = findViewById(R.id.back);
        Icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(emi.this, MainActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }

    public void calculatePayments(View clickedButton){

        double principalAmount = Double.parseDouble(principal.getText().toString());
        double interestRate = Double.parseDouble(interest.getText().toString());
        double totalYears = Double.parseDouble(years.getText().toString());
        double downpment = Double.parseDouble(downpayment.getText().toString());
        double p = principalAmount;
        double d = downpment;
        double r2 = p - d;
        double r = (interestRate/12)/100;
        double n = totalYears * 12;

        double r1 = Math.pow((1+r), n);
        double emi = r2 * ((r*r1)/(r1-1));

        monthlyEMI.setText(new DecimalFormat(".00").format(emi));

    }

}