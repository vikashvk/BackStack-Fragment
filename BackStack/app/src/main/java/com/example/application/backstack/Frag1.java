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
import android.widget.EditText;

public class Frag1 extends Fragment {
    Bundle bd;
    FragmentManager fm;
    FragmentTransaction ft;
    final String keylock="EM";
    EditText e1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bd=new Bundle();
    }

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag1,container,false);
        Button b1=(Button)view.findViewById(R.id.btt);
        e1=(EditText)view.findViewById(R.id.ed1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd.putString(keylock,e1.getText().toString());
                Frag2 f2=new Frag2();
                fm=getFragmentManager();
                f2.setArguments(bd);
                ft=fm.beginTransaction();
                ft.replace(R.id.fl,f2,null);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
return view;
    }
}
