package com.example.tablayout;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    Context context;
    int totalTabs;


    public MyAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FootBall footballFragment = new FootBall();
                return footballFragment;

            case 1:
                Cricket cricketFragment = new Cricket();
                return cricketFragment;

            case 2:
                BadMinton badmintonFragment = new BadMinton();
                return badmintonFragment;

            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return totalTabs;
    }
}
