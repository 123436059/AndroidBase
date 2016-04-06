package com.example.administrator.androidbase.main.activity.interActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/4/6.
 */
public class InterBactivity extends Activity {
	private EditText et_b;
	public interface ChangeAListener{
		void changeA(String content);
	}

	private static ChangeAListener listener;

	public static void setListener(ChangeAListener slistener){
		listener = slistener;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inter_b);
		et_b = (EditText) findViewById(R.id.et_b);
		findViewById(R.id.btn_b).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String content = et_b.getText().toString();
				if (!TextUtils.isEmpty(content)){
					listener.changeA(content);
				}
			}
		});
	}
}
