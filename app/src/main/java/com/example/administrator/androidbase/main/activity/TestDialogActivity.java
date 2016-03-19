package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/3/19.
 */
public class TestDialogActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_dialog);
		findViewById(R.id.btn_test_push).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(TestDialogActivity.this,TestPushDialogActivity.class));
			}
		});

	}
}
