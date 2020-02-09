package com.example.googlesignin;

import android.app.Application;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class GlobalVariable extends AppCompatActivity {
    public static int points = 0;

    private static GlobalVariable singleton;

    public static GlobalVariable getInstance() {
        return singleton;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        singleton = this;
    }
}
