package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;

import com.example.administrator.androidbase.R;
import com.example.administrator.androidbase.main.inter.BaseMp3Inter;
import com.example.administrator.androidbase.main.service.BaseMp3Service;

/**
 * Created by Administrator on 2016/3/14.
 */
public class TestBaseMp3Activity extends Activity implements View.OnClickListener {

    private Button btnPlay;
    private TestBaseMp3Activity mContext;
    private BaseMp3Inter myInter;
    private ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myInter = (BaseMp3Inter) service;
            if (myInter.isPlaying()) {
                btnPlay.setText("暂停");
            } else
                btnPlay.setText("继续");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            myInter = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(R.layout.activity_test_base_mp3);
        initView();
    }


    private void initService() {
        Intent service = new Intent(mContext, BaseMp3Service.class);
        startService(service);
        bindService(service, mServiceConnection, Context.BIND_AUTO_CREATE);
    }

    private void initView() {
        findViewById(R.id.btn_mpp3_service).setOnClickListener(this);
        findViewById(R.id.btn_play).setOnClickListener(this);
        btnPlay = (Button) findViewById(R.id.btn_play);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_mpp3_service:
                initService();
                break;

            case R.id.btn_play:
                if (myInter == null)
                    return;

                if (myInter.isPlaying()) {
                    btnPlay.setText("继续");
                    myInter.pause();
                } else {
                    btnPlay.setText("暂停");
                    myInter.play();
                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(mServiceConnection);
    }
}
