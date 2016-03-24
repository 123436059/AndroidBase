package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/2/26.
 */
public class ViewsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actvitiy_views);

		findViewById(R.id.test_list_max).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(ViewsActivity.this, ListViewMaxActivity.class));
			}
		});

		findViewById(R.id.btn_test_edit).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(ViewsActivity.this,TestEdittextActivity.class));
			}
		});

		findViewById(R.id.btn_test_menu).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(ViewsActivity.this,TestMenu.class));
			}
		});

	}
}
