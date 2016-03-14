package com.example.administrator.androidbase.main.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.Environment;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.administrator.androidbase.main.inter.BaseMp3Inter;

/**
 * Created by rjasus on 2016/3/14.
 */
public class BaseMp3Service extends Service {
    private MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyInter();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            player = new MediaPlayer();
            player.reset();
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                String path = Environment.getExternalStorageDirectory() + "/Idina Menzel - Let It Go.mp3";
                Log.d("taxi","path ="+path);
                player.setDataSource(path);
                player.prepare();
                player.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class MyInter extends Binder implements BaseMp3Inter {

        @Override
        public void play() {
            if (!player.isPlaying()) {
                player.start();
            }
        }

        @Override
        public void pause() {
            if (player.isPlaying()) {
                player.pause();
            }
        }

        @Override
        public boolean isPlaying() {
            return player.isPlaying();
        }
    }
}
