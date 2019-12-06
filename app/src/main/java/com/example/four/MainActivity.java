package com.example.four;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    private Object myadapter;

    @SuppressLint("Assert")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        viewPager = findViewById(R.id.viewpaper);
        List<View> myViewList = new ArrayList<>();
        LayoutInflater layoutInflater = getLayoutInflater().from(MainActivity.this);
        View view1 = layoutInflater.inflate(R.layout.layout1, null);
        View view2 = layoutInflater.inflate(R.layout.layout2, null);
        View view3 = layoutInflater.inflate(R.layout.layout3, null);
        View view4 = layoutInflater.inflate(R.layout.layout4, null);
        myViewList.add(view1);
        myViewList.add(view2);
        myViewList.add(view3);
        myViewList.add(view4);
        viewPager.setAdapter(new MyPager(myViewList));
    }
}

