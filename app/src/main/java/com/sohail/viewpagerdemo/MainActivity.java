package com.sohail.viewpagerdemo;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ViewGroup tab=(ViewGroup)findViewById(R.id.tab);

        tab.addView(LayoutInflater.from(this).inflate(R.layout.always_in_centre,tab,false));

        ViewPager viewPager=(ViewPager)findViewById(R.id.viewpager);
        SmartTabLayout viewPagerTab=(SmartTabLayout)findViewById(R.id.viewpagertab);

        FragmentPagerItems pages=new FragmentPagerItems(this);
        for(int title: tab10()){
            pages.add(FragmentPagerItem.of(getString(title),MainFragment.class));
        }

        FragmentPagerItemAdapter adapter=new FragmentPagerItemAdapter(getSupportFragmentManager(),pages);
        viewPager.setAdapter(adapter);
        viewPagerTab.setViewPager(viewPager);
    }

    public static int[] tab10() {
        return new int[] {
                R.string.demo_tab_1,
                R.string.demo_tab_2,
                R.string.demo_tab_3,
                R.string.demo_tab_4,
                R.string.demo_tab_5,
                R.string.demo_tab_6,
                R.string.demo_tab_7,
                R.string.demo_tab_8,
                R.string.demo_tab_9,
                R.string.demo_tab_10
        };
    }
}
