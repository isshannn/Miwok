package com.example.android.miwok;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /*
       This Function helps to return specific fragment as per position
    */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumberFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorFragment();
        } else {
            return new PhraseFragment();
        }
    }

    @Override
    public int getCount() {  // returns number of fragments present to SimpleFragmentPagerAdapter
        return 4;
    }
}
