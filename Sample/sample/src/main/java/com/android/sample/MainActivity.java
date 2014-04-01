package com.android.sample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import com.android.sample.view.SlidingTabLayout;


public class MainActivity extends ActionBarActivity {
    private ViewPager viewPager;
    private SlidingTabLayout slidingTabLayout;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        slidingTabLayout = (SlidingTabLayout)findViewById(R.id.sliding_tab_layout);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myFragmentPagerAdapter);
        slidingTabLayout.setViewPager(viewPager);
        slidingTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.orange));
        slidingTabLayout.setDividerColors(getResources().getColor(R.color.orange));
    }
}
