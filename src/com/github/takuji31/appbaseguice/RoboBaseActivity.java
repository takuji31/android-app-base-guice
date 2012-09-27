package com.github.takuji31.appbaseguice;


import com.github.rtyley.android.sherlock.roboguice.activity.RoboSherlockFragmentActivity;
import com.github.takuji31.appbase.app.BaseApp;

public class RoboBaseActivity<AppClass extends BaseApp> extends
		RoboSherlockFragmentActivity {

	@SuppressWarnings("unchecked")
	public AppClass getMyApp() {
		return (AppClass) getApplication();
	}
}
