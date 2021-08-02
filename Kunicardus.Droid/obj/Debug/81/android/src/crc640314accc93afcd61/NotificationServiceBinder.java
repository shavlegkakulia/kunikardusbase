package crc640314accc93afcd61;


public class NotificationServiceBinder
	extends android.os.Binder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.NotificationServiceBinder, Unicard.Droid", NotificationServiceBinder.class, __md_methods);
	}


	public NotificationServiceBinder ()
	{
		super ();
		if (getClass () == NotificationServiceBinder.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.NotificationServiceBinder, Unicard.Droid", "", this, new java.lang.Object[] {  });
	}

	public NotificationServiceBinder (crc640314accc93afcd61.NotificationService p0)
	{
		super ();
		if (getClass () == NotificationServiceBinder.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.NotificationServiceBinder, Unicard.Droid", "Kunicardus.Droid.NotificationService, Unicard.Droid", this, new java.lang.Object[] { p0 });
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
