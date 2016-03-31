package com.example.melnikov.myapp.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.melnikov.myapp.R;
import com.example.melnikov.myapp.fragment.AbstractTabFragment;
import com.example.melnikov.myapp.fragment.BirthdaysFragment;
import com.example.melnikov.myapp.fragment.HistoryFragment;
import com.example.melnikov.myapp.fragment.IdeasFragment;
import com.example.melnikov.myapp.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MelnikOV on 031 31.03.16.
 */
public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer,AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return  tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {




        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
