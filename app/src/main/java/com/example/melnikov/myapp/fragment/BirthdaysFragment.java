package com.example.melnikov.myapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.melnikov.myapp.R;

/**
 * Created by MelnikOV on 031 31.03.16.
 */
public class BirthdaysFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_example;

    public static BirthdaysFragment getInstance(Context context) {

       Bundle args = new Bundle();
       BirthdaysFragment fragment = new BirthdaysFragment();
       fragment.setArguments(args);
       fragment.setContext(context);
       fragment.setTitle(context.getString(R.string.tab_item_birthdays));

       return fragment;
   }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }



    public void setContext(Context context) {
        this.context = context;
    }


}
