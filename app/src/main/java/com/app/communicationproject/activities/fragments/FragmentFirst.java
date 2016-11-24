package com.app.communicationproject.activities.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.app.communicationproject.R;
import com.app.communicationproject.activities.activities.BaseActivity;
import com.app.communicationproject.activities.listner.OnSetNameListner;

import java.util.zip.Inflater;

/**
 * Created by Android on 23-Nov-16.
 */

public class FragmentFirst extends BaseFragments {
//FF -> First Fragment
    EditText mEtFFGetData;
    Button mBtnFFSubmit;
    OnSetNameListner onSetNameListner;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle saveInstanceState)
    {
        View view;

        view= inflater.inflate(R.layout.first_fragment,container,false);

        mBtnFFSubmit=(Button)view.findViewById(R.id.id_Btn_FF_Submit);
        mEtFFGetData=(EditText)view.findViewById(R.id.id_Et_FF_Passdata);

        mBtnFFSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name= mEtFFGetData.getText().toString();
                System.out.print(name);
                onSetNameListner.setName(name);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            onSetNameListner = (OnSetNameListner)context;
        }catch (Exception e)
        {

        }

    }
}
