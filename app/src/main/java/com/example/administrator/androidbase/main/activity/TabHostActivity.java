package com.example.administrator.androidbase.main.activity;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.administrator.androidbase.R;
import com.example.administrator.androidbase.main.activity.tabhostactivity.AAcvtivity;
import com.example.administrator.androidbase.main.activity.tabhostactivity.BActivity;
import com.example.administrator.androidbase.main.activity.tabhostactivity.CActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/23.
 */
public class TabHostActivity extends TabActivity implements View.OnClickListener {

	private static final String MOD1 = "mod1";
	private static final String MOD2 = "mod2";
	private static final String MOD3 = "mod3";


	private List<TextView> tvs;
	private int[] tvids = {R.id.title1, R.id.title2, R.id.title3};

	TabHost mTabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tabhost);
		tvs = new ArrayList<>();
		mTabHost = getTabHost();
		mTabHost.setup();
		TabHost.TabSpec tabSpec;
		tabSpec = mTabHost.newTabSpec(MOD1).setIndicator(MOD1).setContent(new Intent(this, AAcvtivity.class));
		mTabHost.addTab(tabSpec);

		tabSpec = mTabHost.newTabSpec(MOD2).setIndicator(MOD2).setContent(new Intent(this, BActivity.class));
		mTabHost.addTab(tabSpec);

		tabSpec = mTabHost.newTabSpec(MOD3).setIndicator(MOD3).setContent(new Intent(this, CActivity.class));
		mTabHost.addTab(tabSpec);

		for (int i = 0; i < tvids.length; i++) {
			findViewById(tvids[i]).setOnClickListener(this);
			tvs.add((TextView) findViewById(tvids[i]));
		}
		changeTab(0);
	}


	private void changeTab(int index) {
		switch (index) {
			case 0:
				mTabHost.setCurrentTabByTag(MOD1);
				break;

			case 1:
				mTabHost.setCurrentTabByTag(MOD2);
				break;
			case 2:
				mTabHost.setCurrentTabByTag(MOD3);
				break;
		}


		for (int i = 0; i < tvids.length; i++) {
			if (i == index) {
				tvs.get(i).setTextColor(Color.parseColor("#FF2020"));
				tvs.get(i).setBackgroundColor(Color.parseColor("#FFFF20"));
			} else {
				tvs.get(i).setTextColor(Color.parseColor("#FFFF20"));
				tvs.get(i).setBackgroundColor(Color.parseColor("#FF2020"));
			}
		}
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.title1:
				changeTab(0);
				break;

			case R.id.title2:
				changeTab(1);
				break;

			case R.id.title3:
				changeTab(2);
				break;
		}
	}
}
