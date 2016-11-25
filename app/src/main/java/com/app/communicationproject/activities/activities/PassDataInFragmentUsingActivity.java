package com.app.communicationproject.activities.activities;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.communicationproject.R;
import com.app.communicationproject.activities.fragments.FragmentFirst;
import com.app.communicationproject.activities.fragments.FragmentSecond;
import com.app.communicationproject.activities.listner.OnFragmentInteractionListener;
import com.app.communicationproject.activities.listner.OnSetNameListner;

public class PassDataInFragmentUsingActivity extends FragmentActivity implements FragmentFirst.OnSetNameListner1 {


    @Override
    public void searchName(String origin, String destination) {

       FragmentSecond fragmentSecond = (FragmentSecond) getSupportFragmentManager().findFragmentById(R.id.id_Fragment2);

        String result=" "+ origin + " <-  " + destination + "... " ;
        fragmentSecond.displayName(result);
    }

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_data_in_fragment_using);

    }
}
