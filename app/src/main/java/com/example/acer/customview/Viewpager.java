package com.example.acer.customview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Acer on 22.7.2016 г..
 */
public class Viewpager extends FragmentPagerAdapter {
    public Viewpager(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int arg0) {

        switch (arg0) {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }


}
