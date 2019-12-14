package com.yb.myredhatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yb.mylibrary.Hello;

public class MainActivity extends AppCompatActivity {
Hello hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello=new Hello("hi all","050000000");
    }
}
