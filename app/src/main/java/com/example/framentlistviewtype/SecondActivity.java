package com.example.framentlistviewtype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        int takeposition=intent.getIntExtra("position",0);


        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

        ImageFragment imageFragment =new ImageFragment();

        Bundle bundle= new Bundle();
        bundle.putInt("position",takeposition);
        imageFragment.setArguments(bundle);

        fragmentTransaction.add(R.id.frameme,imageFragment);
        fragmentTransaction.commit();
    }
}