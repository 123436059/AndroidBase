package com.example.administrator.androidbase.main.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.androidbase.R;
import com.example.administrator.androidbase.main.fragment.TabFragment.OneFragment;
import com.example.administrator.androidbase.main.fragment.TabFragment.ThreeFragment;
import com.example.administrator.androidbase.main.fragment.TabFragment.TwoFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/11.
 */
public class TabFragmentActivity extends FragmentActivity implements View.OnClickListener {
	ViewPager mViewpager;
	private List<Fragment> mFragments;
	OneFragment tab1;
	TwoFragment tab2;
	ThreeFragment tab3;
	FragmentPagerAdapter mAdapter;
	private TextView tab_title_one;
	private TextView tab_title_two;
	private TextView tab_title_three;
	private List<TextView> viewList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tabfragment);
		mViewpager = (ViewPager) findViewById(R.id.vp_fragment);
		mFragments = new ArrayList<>();
		initView();
		setViewPagerAdapter();
	}

	private void setViewPagerAdapter() {

		mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
			@Override
			public Fragment getItem(int position) {
				return mFragments.get(position);
			}

			@Override
			public int getCount() {
				return mFragments.size();
			}
		};

		mViewpager.setAdapter(mAdapter);

		mViewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

			}

			@Override
			public void onPageSelected(int position) {
				retSetButton(position);
			}

			@Override
			public void onPageScrollStateChanged(int state) {

			}
		});

		retSetButton(1);
		mViewpager.setCurrentItem(1);
	}

	private void retSetButton(int position) {
		for (int i = 0; i < viewList.size(); i++) {
			TextView textView = viewList.get(i);
			if (position == i) {
				textView.setTextColor(getResources().getColor(R.color.colorAccent));
				textView.setBackgroundColor(getResources().getColor(R.color.green));
			} else {
				textView.setTextColor(getResources().getColor(R.color.green));
				textView.setBackgroundColor(getResources().getColor(R.color.colorAccent));
			}
		}
	}


	private void initView() {
		viewList = new ArrayList<>();

		tab_title_one = (TextView) findViewById(R.id.tv_title1);
		tab_title_two = (TextView) findViewById(R.id.tv_title2);
		tab_title_three = (TextView) findViewById(R.id.tv_title3);

		tab_title_one.setOnClickListener(this);
		tab_title_three.setOnClickListener(this);
		tab_title_two.setOnClickListener(this);

		viewList.add(tab_title_one);
		viewList.add(tab_title_two);
		viewList.add(tab_title_three);

		tab1 = new OneFragment();

		tab2 = new TwoFragment();

		tab3 = new ThreeFragment();

		mFragments.add(tab1);
		mFragments.add(tab2);
		mFragments.add(tab3);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.title1:
				Toast.makeText(TabFragmentActivity.this, "点击", Toast.LENGTH_LONG).show();
				mViewpager.setCurrentItem(0);
				break;

			case R.id.title2:
				Toast.makeText(TabFragmentActivity.this, "点击", Toast.LENGTH_LONG).show();
				mViewpager.setCurrentItem(1);
				break;

			case R.id.title3:
				Toast.makeText(TabFragmentActivity.this, "点击", Toast.LENGTH_LONG).show();
				mViewpager.setCurrentItem(2);
				break;
		}
	}
}
