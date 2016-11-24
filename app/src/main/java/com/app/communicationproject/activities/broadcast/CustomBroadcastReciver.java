package com.app.communicationproject.activities.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by mohit on 24-11-2016.
 */

public class CustomBroadcastReciver extends BroadcastReceiver {

    @Override

    public void onReceive(Context context, Intent intent) {


        Toast.makeText(context, "Custom Broadcast received", Toast.LENGTH_LONG).show();


    }
}
