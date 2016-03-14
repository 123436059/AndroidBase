package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import com.example.administrator.androidbase.R;

/**
 * Created by rjasus on 2016/3/12.
 */
public class BaseAnimaionActiviy extends Activity implements View.OnClickListener {

    private TextView tvPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_animation);
        initView();
    }


    private void initView() {
        findViewById(R.id.btn_translation).setOnClickListener(this);
        tvPaint = (TextView) findViewById(R.id.tv_paint);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_translation:
                TranslateAnimation translateAnimation = new TranslateAnimation(
                        0, 150, 0, 0

                );
                translateAnimation.setDuration(1000);
                translateAnimation.setFillAfter(true);
                tvPaint.startAnimation(translateAnimation);
                break;


        }
    }
}
