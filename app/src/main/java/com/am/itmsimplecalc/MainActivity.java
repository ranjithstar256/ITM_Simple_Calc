package com.am.itmsimplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4 ;    EditText ed1,ed2;    String s1,s2;    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        textView=findViewById(R.id.textView);        b2=findViewById(R.id.button2);        b3=findViewById(R.id.button3);        b4=findViewById(R.id.button4);
        ed1=findViewById(R.id.editTextTextPersonName);        ed2=findViewById(R.id.editTextTextPersonName2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();

                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c = a+b;

                textView.setText(c+"");
                Toast.makeText(MainActivity.this, ""+s1+"\n"+s2, Toast.LENGTH_SHORT).show();
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();

                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c = a-b;

                textView.setText(c+"");
                Toast.makeText(MainActivity.this, ""+s1+"\n"+s2, Toast.LENGTH_SHORT).show();
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();

                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c = a*b;

                textView.setText(c+"");
                Toast.makeText(MainActivity.this, ""+s1+"\n"+s2, Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();

                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c = a/b;

                textView.setText(c+"");
                Toast.makeText(MainActivity.this, ""+s1+"\n"+s2, Toast.LENGTH_SHORT).show();
            }
        });
    }
}