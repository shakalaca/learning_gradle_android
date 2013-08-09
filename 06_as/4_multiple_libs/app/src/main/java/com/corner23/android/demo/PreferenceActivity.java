package com.corner23.android.demo;

import android.content.Context;
import android.os.Bundle;

import net.saik0.android.unifiedpreference.UnifiedPreferenceFragment;
import net.saik0.android.unifiedpreference.UnifiedSherlockPreferenceActivity;

public class PreferenceActivity extends UnifiedSherlockPreferenceActivity {

	@Override public void onCreate(Bundle savedInstanceState) {
        // Set header resource MUST BE CALLED BEFORE super.onCreate
		setHeaderRes(R.xml.pref_headers);

		// Set desired preference file and mode (optional)
		setSharedPreferencesName("demo");
		setSharedPreferencesMode(Context.MODE_PRIVATE);
		super.onCreate(savedInstanceState);
	}

	public static class GeneralPreferenceFragment extends UnifiedPreferenceFragment {}

	public static class NotificationPreferenceFragment extends UnifiedPreferenceFragment {}

	public static class DataSyncPreferenceFragment extends UnifiedPreferenceFragment {}
}
