package com.example.application.backstack;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        Frag1 f1=new Frag1();
        ft.replace(R.id.fl,f1,null);
        ft.commit();
    }
}
