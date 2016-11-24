package com.app.communicationproject.activities.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.communicationproject.R;
import com.app.communicationproject.activities.activities.BaseActivity;

/**
 * Created by Android on 23-Nov-16.
 */

public class FragmentSecond extends BaseFragments {

    TextView mTvShow;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState)
    {
        View v;

        v = inflater.inflate(R.layout.second_fragment,container,false);

        mTvShow=(TextView)v.findViewById(R.id.id_Tv_SF_showData);
      //  mTvShow.setText(name);
        return v;
    }


    void setMessage(String name){

    }
}
