package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/3/23.
 */
public class TestEdittextActivity extends Activity {

	private EditText et_edit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_edit);
		et_edit = (EditText) findViewById(R.id.et_edit);

		findViewById(R.id.btn_toast).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String rs = et_edit.getText().toString();
				if (!TextUtils.isEmpty(rs)) {
					Toast.makeText(TestEdittextActivity.this, rs, Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
