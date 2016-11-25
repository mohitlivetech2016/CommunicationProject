package com.app.communicationproject.activities.fragments;

import android.bluetooth.le.ScanRecord;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.app.communicationproject.R;
import com.app.communicationproject.activities.activities.BaseActivity;
import com.app.communicationproject.activities.listner.OnSetNameListner;

/**
 * Created by Android on 23-Nov-16.
 */

public class FragmentSecond extends BaseFragments {


    OnSetNameListner mval;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.second_fragment,container,false);

    }

        public void displayName(String result)
        {
            TextView mTvShow;
            EditText mEtShow;

            mTvShow=(TextView)getActivity().findViewById(R.id.id_Tv_SF_showData);
            mEtShow=(EditText)getActivity().findViewById(R.id.id_Et_SF_showData);
            mTvShow.setText(result);

        }


    /*public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState)
    {
        View v;

        v = inflater.inflate(R.layout.second_fragment,container,false);

        mTvShow=(TextView)v.findViewById(R.id.id_Tv_SF_showData);

        String getArgument = getArguments().getString("value");
        mTvShow.setText(getArgument);
        System.out.print(getArgument);
        // String value = getArguments().getString("Val");
        *//*Bundle intent = getArguments();
        String message = intent.toString("message");
        System.out.print(saveInstanceState);*//*
      //  mTvShow.setText(name);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();

      //  String value = getArguments().getString("Val");

    }*/
}
