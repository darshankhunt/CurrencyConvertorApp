package com.example.currencyconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edCurr;
    private TextView USText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edCurr = findViewById(R.id.edCurr);
        USText = findViewById(R.id.USText);
    }

    public void convertAmount(View v){
        String Curr = edCurr.getText().toString();
        if(Curr.equals("")){
            edCurr.setError("Enter Value in Rs.");
        }else {
            int INRCurr = Integer.parseInt(Curr);
            int Ans = INRCurr * 78;
            Toast.makeText(MainActivity.this, "Result: "+Ans, Toast.LENGTH_SHORT).show();
            USText.setText("US $: "+Ans);
        }
    }
}