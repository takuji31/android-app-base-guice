package com.github.takuji31.appbaseguice;
/**
 *
 */


import com.github.rtyley.android.sherlock.roboguice.fragment.RoboSherlockFragment;
import com.github.takuji31.appbase.app.BaseApp;

/**
 * @author takuji
 * 
 */
public class RoboBaseFragment<AppClass extends BaseApp, ActivityClass extends RoboBaseActivity<AppClass>>
		extends RoboSherlockFragment {

	@SuppressWarnings("unchecked")
	public ActivityClass getMyActivity() {
		return (ActivityClass) getActivity();
	}

	public AppClass getMyApp() {
		return getMyActivity().getMyApp();
	}
}
