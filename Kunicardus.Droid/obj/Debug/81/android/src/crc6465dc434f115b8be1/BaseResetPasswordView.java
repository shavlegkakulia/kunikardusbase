package crc6465dc434f115b8be1;


public class BaseResetPasswordView
	extends mvvmcross.droid.support.v4.MvxFragmentActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.Views.BaseResetPasswordView, Unicard.Droid", BaseResetPasswordView.class, __md_methods);
	}


	public BaseResetPasswordView ()
	{
		super ();
		if (getClass () == BaseResetPasswordView.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.Views.BaseResetPasswordView, Unicard.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
