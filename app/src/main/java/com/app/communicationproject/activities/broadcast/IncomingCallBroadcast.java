package com.app.communicationproject.activities.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by Android on 23-Nov-16.
 */

public class IncomingCallBroadcast extends BroadcastReceiver {
    Context mContext;

    @Override
    public void onReceive(Context mContext, Intent intent)
    {
        try
        {

            String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
            String phoneNo = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
            System.out.print(phoneNo);

            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING))
            {
                Toast.makeText( mContext, "Phone No = "+ phoneNo, Toast.LENGTH_LONG).show();
                Toast.makeText(mContext, "Phone Is Ringing", Toast.LENGTH_LONG).show();
     }

            if(state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))
            {
                Toast.makeText(mContext, "Call Recieved", Toast.LENGTH_LONG).show();

            }

            if (state.equals(TelephonyManager.EXTRA_STATE_IDLE))
            {

                Toast.makeText(mContext, "Phone Is Idle", Toast.LENGTH_LONG).show();
                //Toast.makeText( mContext, "Phone No = "+ phoneNo, Toast.LENGTH_LONG).show();

            }
        }
        catch(Exception e)
        {
            System.out.print("Nothing to show");
        }

    }

}
