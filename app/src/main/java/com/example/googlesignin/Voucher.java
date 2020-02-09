package com.example.googlesignin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.googlesignin.GlobalVariable.points;


import androidx.appcompat.app.AppCompatActivity;

public class Voucher extends Activity {
    Button v1,v2,v3,home;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voucher);
        v1=findViewById(R.id.v1);
        v2=findViewById(R.id.v2);
        v3=findViewById(R.id.v3);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(points>=100)
                {points=points-100;
                    Toast.makeText(Voucher.this, "Congratulations!! The voucher will be credited to you within 24 hrs", Toast.LENGTH_SHORT).show();}
                else
                    Toast.makeText(Voucher.this, "Sorry!!You don't have enough points", Toast.LENGTH_SHORT).show();
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(points>=100)
                {points=points-100;
                Toast.makeText(Voucher.this, "Congratulations!! The voucher will be credited to you within 24 hrs", Toast.LENGTH_SHORT).show();}
                else
                    Toast.makeText(Voucher.this, "Sorry!!You don't have enough points", Toast.LENGTH_SHORT).show();
        }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(points>=100)
                {points=points-100;
                    Toast.makeText(Voucher.this, "Congratulations!! The voucher will be credited to you within 24 hrs", Toast.LENGTH_SHORT).show();}
                else
                    Toast.makeText(Voucher.this, "Sorry!!You don't have enough points", Toast.LENGTH_SHORT).show();
            }
        });
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Voucher.this,MainActivity.class));
            }
        });
    }
}
