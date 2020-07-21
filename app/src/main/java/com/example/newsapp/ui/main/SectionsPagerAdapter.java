package com.example.newsapp.ui.main;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.newsapp.Business;
import com.example.newsapp.Entertainment;
import com.example.newsapp.Politics;
import com.example.newsapp.Sport;
import com.example.newsapp.Technology;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
//    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private int numoftabs;

    public SectionsPagerAdapter(FragmentManager fm, int numofTabs) {
        super(fm);
        this.numoftabs = numofTabs;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                return new Business();
            case 1:
                return new Entertainment();
            case 2:
                return new Politics();
            case 3:
                return new Sport();
            case 4:
                return new Technology();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}