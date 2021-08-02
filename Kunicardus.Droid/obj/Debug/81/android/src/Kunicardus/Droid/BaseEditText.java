package Kunicardus.Droid;


public class BaseEditText
	extends android.widget.EditText
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_setError:(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V:GetSetError_Ljava_lang_CharSequence_Landroid_graphics_drawable_Drawable_Handler\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.BaseEditText, Unicard.Droid", BaseEditText.class, __md_methods);
	}


	public BaseEditText (android.content.Context p0)
	{
		super (p0);
		if (getClass () == BaseEditText.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BaseEditText, Unicard.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public BaseEditText (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == BaseEditText.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BaseEditText, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public BaseEditText (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == BaseEditText.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BaseEditText, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public BaseEditText (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == BaseEditText.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BaseEditText, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void setError (java.lang.CharSequence p0, android.graphics.drawable.Drawable p1)
	{
		n_setError (p0, p1);
	}

	private native void n_setError (java.lang.CharSequence p0, android.graphics.drawable.Drawable p1);

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
