package crc6443a6eca19b0ab299;


public class ResizeAnimation
	extends android.view.animation.Animation
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_applyTransformation:(FLandroid/view/animation/Transformation;)V:GetApplyTransformation_FLandroid_view_animation_Transformation_Handler\n" +
			"n_initialize:(IIII)V:GetInitialize_IIIIHandler\n" +
			"n_willChangeBounds:()Z:GetWillChangeBoundsHandler\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.Plugins.ResizeAnimation, Unicard.Droid", ResizeAnimation.class, __md_methods);
	}


	public ResizeAnimation ()
	{
		super ();
		if (getClass () == ResizeAnimation.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.Plugins.ResizeAnimation, Unicard.Droid", "", this, new java.lang.Object[] {  });
	}


	public ResizeAnimation (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ResizeAnimation.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.Plugins.ResizeAnimation, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public void applyTransformation (float p0, android.view.animation.Transformation p1)
	{
		n_applyTransformation (p0, p1);
	}

	private native void n_applyTransformation (float p0, android.view.animation.Transformation p1);


	public void initialize (int p0, int p1, int p2, int p3)
	{
		n_initialize (p0, p1, p2, p3);
	}

	private native void n_initialize (int p0, int p1, int p2, int p3);


	public boolean willChangeBounds ()
	{
		return n_willChangeBounds ();
	}

	private native boolean n_willChangeBounds ();

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
