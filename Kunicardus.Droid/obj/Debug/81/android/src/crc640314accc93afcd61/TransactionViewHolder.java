package crc640314accc93afcd61;


public class TransactionViewHolder
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.TransactionViewHolder, Unicard.Droid", TransactionViewHolder.class, __md_methods);
	}


	public TransactionViewHolder ()
	{
		super ();
		if (getClass () == TransactionViewHolder.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.TransactionViewHolder, Unicard.Droid", "", this, new java.lang.Object[] {  });
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
