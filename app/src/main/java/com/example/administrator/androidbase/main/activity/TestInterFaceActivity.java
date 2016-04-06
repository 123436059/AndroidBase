package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/4/6.
 */
public class TestInterFaceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_interface);
		initView();

	}

	private void initView() {
		findViewById(R.id.btn_base_inter).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(TestInterFaceActivity.this,TestInterBaseActivity.class));
			}
		});
	}
}
