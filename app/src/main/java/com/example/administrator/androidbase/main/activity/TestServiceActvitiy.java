package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/3/14.
 */
public class TestServiceActvitiy extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_service);
		findViewById(R.id.btn_mpp3_service).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(TestServiceActvitiy.this, TestBaseMp3Activity.class));
			}
		});
	}
}
