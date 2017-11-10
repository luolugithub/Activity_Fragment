package com.example.luolu.myappfra;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OneFragment.OnOneFragmentClickLisener {

    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container,new OneFragment());
        ft.commit();
    }
    @Override
    public  void onArticleClick(String text){
           TwoFragment newFragment = new TwoFragment();
           Bundle args = new Bundle();
           args.putString("text",text);
           newFragment.setArguments(args);

           ft = fm.beginTransaction();
           ft.replace(R.id.fragment_container,newFragment);
           ft.commit();
    }

}
