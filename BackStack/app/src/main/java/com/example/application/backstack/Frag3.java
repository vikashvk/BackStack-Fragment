package com.example.application.backstack;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Frag3 extends Fragment {
    FragmentManager fm;
    FragmentTransaction ft;
    final String milgyaa="SHADY";
    String ajaa="";
    Bundle by;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        by=getArguments();
        if(by!=null){
            ajaa=by.getString(milgyaa);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag3,container,false);
        Button b3=(Button)view.findViewById(R.id.bt3);
        TextView tv2=(TextView)view.findViewById(R.id.tv3);
        tv2.setText(ajaa);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }
}
