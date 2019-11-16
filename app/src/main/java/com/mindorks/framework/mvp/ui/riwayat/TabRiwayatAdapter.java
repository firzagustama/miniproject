package com.mindorks.framework.mvp.ui.riwayat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabRiwayatAdapter extends FragmentPagerAdapter {

    public static int PAGE_COUNT = 2;

    private String judulTab[] = new String[] {"Riwayat", "Tagihan"};

    public TabRiwayatAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RiwayatFragment();
            case 1:
                return new TagihanFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return judulTab[position];
    }
}
