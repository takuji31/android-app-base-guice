package com.github.takuji31.appbaseguice;


import com.actionbarsherlock.app.SherlockDialogFragment;
import com.github.takuji31.appbase.app.BaseApp;

public class RoboBaseDialogFragment<AppClass extends BaseApp, ActivityClass extends RoboBaseActivity<AppClass>>
		extends SherlockDialogFragment {

	public AppClass getMyApp() {
		return getMyActivity().getMyApp();
	}

	@SuppressWarnings("unchecked")
	public ActivityClass getMyActivity() {
		return (ActivityClass) getActivity();
	}
}
