package com.example.administrator.androidbase.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.androidbase.R;
import com.example.administrator.androidbase.main.activity.AnimationMainActivity;
import com.example.administrator.androidbase.main.activity.BaseAnimaionActiviy;
import com.example.administrator.androidbase.main.activity.DownLoadActivity;
import com.example.administrator.androidbase.main.activity.FrameActivity;
import com.example.administrator.androidbase.main.activity.ListViewBottomActivity;
import com.example.administrator.androidbase.main.activity.ListViewSeparatorActivity;
import com.example.administrator.androidbase.main.activity.TabHostActivity;
import com.example.administrator.androidbase.main.activity.ViewsActivity;
import com.example.administrator.androidbase.main.activity.WindowManagerActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.test_down_load).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, DownLoadActivity.class));
			}
		});


		findViewById(R.id.test_frame).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, FrameActivity.class));
			}
		});


		findViewById(R.id.btn_testWidget).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, ViewsActivity.class));
			}
		});

		findViewById(R.id.btn_testListViewBottom).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, ListViewBottomActivity.class));
			}
		});

		findViewById(R.id.btn_testListSeparator).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, ListViewSeparatorActivity.class));
			}
		});

		findViewById(R.id.btn_test_windownManager).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, WindowManagerActivity.class));
			}
		});

		findViewById(R.id.btn_test_animation).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, AnimationMainActivity.class));
			}
		});
	}
}

