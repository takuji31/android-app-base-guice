package com.github.takuji31.appbaseguice;


import com.github.rtyley.android.sherlock.roboguice.fragment.RoboSherlockListFragment;
import com.github.takuji31.appbase.app.BaseApp;

public class RoboBaseListFragment<AppClass extends BaseApp, ActivityClass extends RoboBaseActivity<AppClass>>
		extends RoboSherlockListFragment {

	public AppClass getMyApp() {
		return getMyActivity().getMyApp();
	}

	@SuppressWarnings("unchecked")
	public ActivityClass getMyActivity() {
		return (ActivityClass) getActivity();
	}
}
