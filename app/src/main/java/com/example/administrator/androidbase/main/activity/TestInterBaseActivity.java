package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.androidbase.R;
import com.example.administrator.androidbase.main.activity.interActivity.InterAactivity;
import com.example.administrator.androidbase.main.activity.interActivity.InterBactivity;

/**
 * Created by Administrator on 2016/4/6.
 */
public class TestInterBaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_inter_base);
		initView();

	}

	private void initView() {
		findViewById(R.id.btn_a).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(TestInterBaseActivity.this, InterAactivity.class));
			}
		});

		findViewById(R.id.btn_b).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(TestInterBaseActivity.this, InterBactivity.class));
			}
		});
	}
}
