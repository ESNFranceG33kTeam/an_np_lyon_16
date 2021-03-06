package org.geekteam.nplyon2016.nplyon2016.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    int count;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        count = 6;
    }

    @Override
    public Fragment getItem(int position) {
        OCFragment ocFragment = new OCFragment();
        ScheduleFragment scheduleFragment = new ScheduleFragment();
        MapFragment mapFragment = new MapFragment();
        AboutFragment aboutFragment = new AboutFragment();
        TipsFragment tipsFragment = new TipsFragment();
        AwardsFragment awardsFragment = new AwardsFragment();

        switch (position) {
            case 0: return ocFragment;
            case 1: return scheduleFragment;
            case 2: return tipsFragment;
            case 3: return mapFragment;
            case 4: return awardsFragment;
            case 5: return aboutFragment;
            default: return ocFragment;
        }
    }

    @Override
    public int getCount() {
        return count;
    }
}
