package com.example.android.kolkatatour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by meghnabanerjee on 5/13/17.
 */

public class KolkataFragmentAdapter extends FragmentPagerAdapter {


    public KolkataFragmentAdapter(FragmentManager fm)
    {
        super(fm);


    }

    @Override
    public Fragment getItem(int position) { //INFORMS WHICH FRAGMENT TO OPEN IN WHICH POSITION AFTER TAKING IN POSITION

        if (position == 0) {
            return new ShopFragment();
        }
        else if (position == 1) {
            return new FoodFragment();
        }

        else {
            return new SitesFragment();
        }
    }

    @Override
    public int getCount() { //INFORMS HOW MANY FRAGMENTS ARE NEEDED
        return 3;
    }

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Shop";
        }
        else if (position == 1) {
            return "Food";
        }

        else {
            return "Sites";
        }
    }

}


