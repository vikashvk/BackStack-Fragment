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
import android.widget.TextView;

public class Frag2 extends Fragment {
    FragmentTransaction ft;
    FragmentManager fm;
    Bundle bu,bv;
    final String milgya="EM";
    String aaja="";
    final String keylock1="SHADY";
    EditText e2;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bu=getArguments();
        if(bu!=null){
            aaja=bu.getString(milgya);
            }k
            bv=new Bundle();
}

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag2,container,false);
        Button b2=(Button)view.findViewById(R.id.bt2);
        TextView textView=(TextView)view.findViewById(R.id.tv2);
        e2=(EditText)view.findViewById(R.id.ed2);
        textView.setText(aaja);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bv.putString(keylock1,e2.getText().toString());
                Frag3 f3= new Frag3();
                f3.setArguments(bv);
                fm=getFragmentManager();
                ft=fm.beginTransaction();
                ft.replace(R.id.fl,f3,null);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return view;
    }
}
