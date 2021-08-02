package crc640314accc93afcd61;


public class LoginView_CustomProfileTracker
	extends com.facebook.ProfileTracker
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCurrentProfileChanged:(Lcom/facebook/Profile;Lcom/facebook/Profile;)V:GetOnCurrentProfileChanged_Lcom_facebook_Profile_Lcom_facebook_Profile_Handler\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.LoginView+CustomProfileTracker, Unicard.Droid", LoginView_CustomProfileTracker.class, __md_methods);
	}


	public LoginView_CustomProfileTracker ()
	{
		super ();
		if (getClass () == LoginView_CustomProfileTracker.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.LoginView+CustomProfileTracker, Unicard.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCurrentProfileChanged (com.facebook.Profile p0, com.facebook.Profile p1)
	{
		n_onCurrentProfileChanged (p0, p1);
	}

	private native void n_onCurrentProfileChanged (com.facebook.Profile p0, com.facebook.Profile p1);

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
