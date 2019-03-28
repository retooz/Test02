package com.example.test02.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.test02.Adapter.ContentsPagerAdapter;
import com.example.test02.R;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager mViewPager;
        ContentsPagerAdapter mContentsPagerAdapter;
        TabLayout mTabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager = (ViewPager) findViewById(R.id.pager_content);

        mContentsPagerAdapter = new ContentsPagerAdapter(
                getSupportFragmentManager(), mTabLayout.getTabCount());

        mViewPager.setAdapter(mContentsPagerAdapter);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        mTabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


}
