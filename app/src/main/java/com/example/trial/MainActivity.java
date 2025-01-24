package com.example.trial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edAngkaSatu;
    Spinner spOperator;
    TextView tvResult;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edAngkaSatu = (EditText) findViewById(R.id.edAngka1);
        spOperator = (Spinner) findViewById(R.id.spOperator);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btnReset = (Button) findViewById(R.id.btnReset);

        //action selected
        spOperator.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        int calculate = Integer.parseInt(edAngkaSatu.getText().toString()) * 2;
                        tvResult.setText(calculate+"");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, MyMenu.class);
                startActivity(in);
            }
        });

    }
}