package com.khalilayache.miwoktranslation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author USUARIO
 * @since 26/12/2016.
 */

public class MiwokFragmentAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 4;
    private String mTabTitles[] = new String[]{"Numbers","Family","Colors","Phrases"};

    public MiwokFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            case 3:
                return new PhrasesFragment();
            default:
                return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
