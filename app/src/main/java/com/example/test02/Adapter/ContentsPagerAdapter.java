package com.example.test02.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.test02.Fragment.SalePercent;
import com.example.test02.Fragment.SalePrice;

public class ContentsPagerAdapter extends FragmentStatePagerAdapter {
    private int mPageCount;

    public ContentsPagerAdapter(FragmentManager fm, int pageCount) {
        super(fm);
        this.mPageCount = pageCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SalePercent salePercent = new SalePercent();
                return salePercent;

            case 1:
                SalePrice salePrice = new SalePrice();
                return salePrice;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
            return mPageCount;
    }
}
