package crc644abe232e1f2035d1;


public class SlidingUpPanelLayout_LayoutParams
	extends android.view.ViewGroup.MarginLayoutParams
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+LayoutParams, Unicard.Droid", SlidingUpPanelLayout_LayoutParams.class, __md_methods);
	}


	public SlidingUpPanelLayout_LayoutParams (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == SlidingUpPanelLayout_LayoutParams.class)
			mono.android.TypeManager.Activate ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+LayoutParams, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public SlidingUpPanelLayout_LayoutParams (android.view.ViewGroup.LayoutParams p0)
	{
		super (p0);
		if (getClass () == SlidingUpPanelLayout_LayoutParams.class)
			mono.android.TypeManager.Activate ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+LayoutParams, Unicard.Droid", "Android.Views.ViewGroup+LayoutParams, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public SlidingUpPanelLayout_LayoutParams (android.view.ViewGroup.MarginLayoutParams p0)
	{
		super (p0);
		if (getClass () == SlidingUpPanelLayout_LayoutParams.class)
			mono.android.TypeManager.Activate ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+LayoutParams, Unicard.Droid", "Android.Views.ViewGroup+MarginLayoutParams, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public SlidingUpPanelLayout_LayoutParams (int p0, int p1)
	{
		super (p0, p1);
		if (getClass () == SlidingUpPanelLayout_LayoutParams.class)
			mono.android.TypeManager.Activate ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+LayoutParams, Unicard.Droid", "System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
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
