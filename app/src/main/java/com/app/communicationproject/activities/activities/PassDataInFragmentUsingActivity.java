package com.app.communicationproject.activities.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.app.communicationproject.R;
import com.app.communicationproject.activities.fragments.FragmentFirst;
import com.app.communicationproject.activities.fragments.FragmentSecond;
import com.app.communicationproject.activities.listner.OnFragmentInteractionListener;
import com.app.communicationproject.activities.listner.OnSetNameListner;

public class PassDataInFragmentUsingActivity extends AppCompatActivity implements OnSetNameListner {
    Bundle bundle = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_data_in_fragment_using);

    }

    @Override
    public void setName(String name) {




    }



}
