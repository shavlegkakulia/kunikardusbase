package crc6497dcda19196fd9dd;


public class BaseScrollView
	extends android.widget.ScrollView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_requestChildFocus:(Landroid/view/View;Landroid/view/View;)V:GetRequestChildFocus_Landroid_view_View_Landroid_view_View_Handler\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.BaseWidgets.BaseScrollView, Unicard.Droid", BaseScrollView.class, __md_methods);
	}


	public BaseScrollView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == BaseScrollView.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BaseWidgets.BaseScrollView, Unicard.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public BaseScrollView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == BaseScrollView.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BaseWidgets.BaseScrollView, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public BaseScrollView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == BaseScrollView.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BaseWidgets.BaseScrollView, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public BaseScrollView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == BaseScrollView.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BaseWidgets.BaseScrollView, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void requestChildFocus (android.view.View p0, android.view.View p1)
	{
		n_requestChildFocus (p0, p1);
	}

	private native void n_requestChildFocus (android.view.View p0, android.view.View p1);

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
