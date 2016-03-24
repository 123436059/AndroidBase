package com.example.administrator.androidbase.main.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.administrator.androidbase.R;

/**
 * Created by Administrator on 2016/3/24.
 */
public class TestMenu extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_test,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
			case R.id.item_home:
				Toast.makeText(TestMenu.this,"home",Toast.LENGTH_SHORT).show();
				break;

			case R.id.item_scan:
				Toast.makeText(TestMenu.this,"scan",Toast.LENGTH_SHORT).show();
				break;

			case R.id.item_setting:
				Toast.makeText(TestMenu.this,"set",Toast.LENGTH_SHORT).show();
				break;
		}
		return super.onOptionsItemSelected(item);
	}
}
