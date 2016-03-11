package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/3/11.
 */
public class FrameActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frame);
		findViewById(R.id.btn_tabhost_activity).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(FrameActivity.this, TabHostActivity.class));
			}
		});

		findViewById(R.id.btn_tabhost_fragment).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(FrameActivity.this,TabFragmentActivity.class));
			}
		});

	}
}
