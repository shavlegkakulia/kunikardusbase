package crc640314accc93afcd61;


public abstract class BasePinFragment
	extends mvvmcross.droid.support.v4.MvxFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.BasePinFragment, Unicard.Droid", BasePinFragment.class, __md_methods);
	}


	public BasePinFragment ()
	{
		super ();
		if (getClass () == BasePinFragment.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BasePinFragment, Unicard.Droid", "", this, new java.lang.Object[] {  });
	}

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
