package com.example.randomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    TextView txtView;
    EditText edt1, edt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String chuoi1 = edt1.getText().toString().trim();
                String chuoi2 = edt2.getText().toString().trim();

                //chuoi1.length()==0
                //chuoi1.isEmpty()
                if (chuoi1.isEmpty()  || chuoi2.length()==0) {
                    Toast.makeText(MainActivity.this, "Input Number!", Toast.LENGTH_LONG).show();
                } else if(chuoi1.length()>chuoi2.length()){
                    Toast.makeText(MainActivity.this,"The first number must be less than the second number", Toast.LENGTH_LONG).show();

                }
                    else {
                    //ep kieu du lieu tu chuoi -> so
                    int min = Integer.parseInt(chuoi1);
                    int max = Integer.parseInt(chuoi2);

                    Random random = new Random();
                    int number = random.nextInt(max - min + 1) + min;
                    //so->chuoi
                    txtView.setText(String.valueOf(number));
                }
            }
        });
    }

    private void AnhXa(){
        txtView = (TextView) findViewById(R.id.txtmain);
        btnClick = (Button) findViewById(R.id.btn1);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
    }
}
