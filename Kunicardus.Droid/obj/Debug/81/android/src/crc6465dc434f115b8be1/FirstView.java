package crc6465dc434f115b8be1;


public class FirstView
	extends mvvmcross.platforms.android.views.MvxActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.Views.FirstView, Unicard.Droid", FirstView.class, __md_methods);
	}


	public FirstView ()
	{
		super ();
		if (getClass () == FirstView.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.Views.FirstView, Unicard.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

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
