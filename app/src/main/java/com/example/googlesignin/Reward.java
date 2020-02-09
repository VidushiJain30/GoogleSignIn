package com.example.googlesignin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.example.googlesignin.GlobalVariable.points;

import androidx.appcompat.app.AppCompatActivity;

public class Reward extends Activity {
    Button home,voucher;
    TextView text;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);
        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Reward.this,MainActivity.class));
            }
        });
        voucher = findViewById(R.id.voucher);
        voucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Reward.this,Voucher.class));
            }
        });
        text=findViewById(R.id.text);
        text.append(String.valueOf(points));
    }
}

