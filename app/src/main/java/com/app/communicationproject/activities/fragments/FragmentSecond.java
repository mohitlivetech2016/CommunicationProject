package com.app.communicationproject.activities.fragments;

import android.bluetooth.le.ScanRecord;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.communicationproject.R;
import com.app.communicationproject.activities.activities.BaseActivity;
import com.app.communicationproject.activities.listner.OnSetNameListner;

/**
 * Created by Android on 23-Nov-16.
 */

public class FragmentSecond extends BaseFragments {

    private TextView mTvShow;
    OnSetNameListner mval;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState)
    {
        View v;

        v = inflater.inflate(R.layout.second_fragment,container,false);

        mTvShow=(TextView)v.findViewById(R.id.id_Tv_SF_showData);

        /*Bundle intent = getArguments();
        String message = intent.toString("message");
        System.out.print(saveInstanceState);*/
      //  mTvShow.setText(name);
        return v;
    }


}
