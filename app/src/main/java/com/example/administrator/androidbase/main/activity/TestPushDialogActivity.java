package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/3/19.
 */
public class TestPushDialogActivity extends Activity implements View.OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_push_dialog);
		initView();

	}

	private void initView() {
		findViewById(R.id.test_one_button_dialog).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
			case R.id.test_one_button_dialog:

				break;
		}
	}
}
