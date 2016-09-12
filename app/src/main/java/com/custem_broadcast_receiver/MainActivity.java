package com.custem_broadcast_receiver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_send_bdcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_send_bdcast = (Button) findViewById(R.id.btn_send_bdcast);
        btn_send_bdcast.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setAction("com.custombroadast");
        intent.putExtra("value",1000);
        sendBroadcast(intent);
    }
}
