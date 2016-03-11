package com.example.administrator.androidbase.main.fragment.TabFragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/3/11.
 */
public class TwoFragment extends Fragment {

	private View view;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_one, container, false);
		return view;
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);
		tvTitle.setText("TwoFragment");
	}
}
