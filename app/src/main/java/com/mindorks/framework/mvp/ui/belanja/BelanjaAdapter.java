package com.mindorks.framework.mvp.ui.belanja;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mindorks.framework.mvp.ui.belanja.fragment.RiwayatFragment;
import com.mindorks.framework.mvp.ui.belanja.fragment.TagihanFragment;

import java.util.ArrayList;
import java.util.List;

public class BelanjaAdapter extends FragmentPagerAdapter {

    final String[] tabTitle = {"Riwayat", "Tagihan"};

    public static int PAGE_COUNT = 2;

    public BelanjaAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new RiwayatFragment();
            case 1:
                return new TagihanFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
