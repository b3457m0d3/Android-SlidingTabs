package com.android.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by veinhorn on 1.4.14.
 */
public class SimpleFragment extends Fragment {
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState) {
        View view = layoutInflater.inflate(R.layout.simple_fragment, container, false);
        textView = (TextView)view.findViewById(R.id.textview);
        textView.setText("Tab " + getArguments().getString("number"));
        return view;
    }
}
