package Kunicardus.Droid;


public class BasePaymentEditText
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
		mono.android.Runtime.register ("Kunicardus.Droid.BasePaymentEditText, Unicard.Droid", BasePaymentEditText.class, __md_methods);
	}


	public BasePaymentEditText (android.content.Context p0)
	{
		super (p0);
		if (getClass () == BasePaymentEditText.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BasePaymentEditText, Unicard.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public BasePaymentEditText (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == BasePaymentEditText.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BasePaymentEditText, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public BasePaymentEditText (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == BasePaymentEditText.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.BasePaymentEditText, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
