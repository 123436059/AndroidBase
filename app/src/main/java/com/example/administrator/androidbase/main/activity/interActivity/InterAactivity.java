package com.example.administrator.androidbase.main.activity.interActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/4/6.
 */
public class InterAactivity extends Activity implements InterBactivity.ChangeAListener{

	private TextView tv_content;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inter_a);
		tv_content = (TextView) findViewById(R.id.tv_a);
		InterBactivity.setListener(this);

		findViewById(R.id.btn_jb).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(InterAactivity.this,InterBactivity.class));
			}
		});
	}

	@Override
	public void changeA(String content) {
		tv_content.setText(content);
	}
}
