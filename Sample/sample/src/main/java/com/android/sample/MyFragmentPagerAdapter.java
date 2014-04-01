package com.android.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by veinhorn on 1.4.14.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private final static int TABS_NUMBER = 10;
    private String[] tabs = { "Tab 1", "Tab 2", "Tab 3", "Tab 4", "Tab 5", "Tab 6", "Tab 7", "Tab 8", "Tab 9", "Tab 10"};

    public MyFragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int i) {
        SimpleFragment simpleFragment = new SimpleFragment();
        Bundle bundle = new Bundle();
        bundle.putString("number", "" + i);
        simpleFragment.setArguments(bundle);
        return simpleFragment;
    }

    @Override
    public int getCount() {
        return TABS_NUMBER;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
