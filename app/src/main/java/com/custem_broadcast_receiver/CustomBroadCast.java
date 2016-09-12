package com.custem_broadcast_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Ramesh on 9/12/16.
 */
public class CustomBroadCast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"yes! Custom Broadcast Receiver",Toast.LENGTH_LONG).show();
    }
}
