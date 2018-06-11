package com.example.kmj.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch(i) {
            case 0:
                return new Fragment_one();
            case 1:
                return new Fragment_two();
            case 2:
                return new Fragment_three();
        }
        return new Fragment_one();
     }

    @Override
    public int getCount() {
        return 3;
    }
}
