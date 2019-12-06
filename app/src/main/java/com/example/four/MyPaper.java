package com.example.four;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

class MyPager extends PagerAdapter {

    private List<View> myViewList;

    public MyPager(List<View> myViewList){
        this.myViewList = myViewList;
    }

    @Override
    public int getCount() {
        return myViewList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(myViewList.get(position));
        return myViewList.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(myViewList.get(position));
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "第一个";
            case 1:
                return "第二个";
            case 2:
                return "第三个";
            default:
                return "第四个";
        }
    }

}

