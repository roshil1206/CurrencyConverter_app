package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button euro,pound,dollar,bitcoin,cad,aud,dinar,yen,nzd;
    float value;
    boolean flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        euro=findViewById(R.id.b1);
        pound=findViewById(R.id.b2);
        dollar=findViewById(R.id.b3);
        bitcoin=findViewById(R.id.b4);
        cad=findViewById(R.id.b5);
        aud=findViewById(R.id.b6);
        dinar=findViewById(R.id.b7);
        yen=findViewById(R.id.b8);
        nzd=findViewById(R.id.b9);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    CheckAndGo();
                    if(!flag) {
                        value /= 78.49;
                        display();
                    }
                    }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAndGo();
                if(!flag)
                {
                    value/=90.87;
                    display();
                }
            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAndGo();
                if(!flag)
                {
                    value/=70.84;
                    display();
                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAndGo();
                if(!flag)
                {
                    value/=647124.11;
                    display();
                }
            }
        });
        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAndGo();
                if(!flag)
                {
                    value/=54.24;
                    display();
                }
            }
        });
        aud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAndGo();
                if(!flag)
                {
                    value/=48.33;
                    display();
                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAndGo();
                if(!flag)
                {
                    value/=19.27;
                    display();
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAndGo();
                if(!flag)
                {
                    value/=0.65;
                    display();
                }
            }
        });
        nzd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAndGo();
                if(!flag)
                {
                    value/=44.98;
                    display();
                }
            }
        });




    }
    void CheckAndGo()
    {
        try {
            flag=false;
          textView.setText(null);
          value= Float.parseFloat(editText.getText().toString());
        }
        catch (Exception e)
        {   flag=true;
            editText.setError("Error");
        }
    }
    void display()
    {
        DecimalFormat format = new DecimalFormat("#0.00");
        textView.setText("" + format.format(value));
    }
}
