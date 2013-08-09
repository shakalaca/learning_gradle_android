package com.corner23.android.demo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.actionbarsherlock.view.Menu;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView tv = (TextView) findViewById(R.id.pkg_text);
		tv.setText(getPackageName());

		TextView tv2 = (TextView) findViewById(R.id.ver_text);
		
		String versionName = "";
		try {
			PackageInfo pinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
			versionName = pinfo.versionName;
		} catch (PackageManager.NameNotFoundException e) {
			e.printStackTrace();
		}
                		
		tv2.setText(versionName);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
                getSupportMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(this, PreferenceActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

