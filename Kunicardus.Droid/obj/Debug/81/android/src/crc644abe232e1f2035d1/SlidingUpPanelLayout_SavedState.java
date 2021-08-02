package crc644abe232e1f2035d1;


public class SlidingUpPanelLayout_SavedState
	extends android.view.View.BaseSavedState
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_writeToParcel:(Landroid/os/Parcel;I)V:GetWriteToParcel_Landroid_os_Parcel_IHandler\n" +
			"n_InitializeCreator:()Lcrc644abe232e1f2035d1/SlidingUpPanelLayout_SavedState_SavedStateCreator;:__export__\n" +
			"";
		mono.android.Runtime.register ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+SavedState, Unicard.Droid", SlidingUpPanelLayout_SavedState.class, __md_methods);
	}


	public SlidingUpPanelLayout_SavedState (android.os.Parcel p0)
	{
		super (p0);
		if (getClass () == SlidingUpPanelLayout_SavedState.class)
			mono.android.TypeManager.Activate ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+SavedState, Unicard.Droid", "Android.OS.Parcel, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public SlidingUpPanelLayout_SavedState (android.os.Parcel p0, java.lang.ClassLoader p1)
	{
		super (p0, p1);
		if (getClass () == SlidingUpPanelLayout_SavedState.class)
			mono.android.TypeManager.Activate ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+SavedState, Unicard.Droid", "Android.OS.Parcel, Mono.Android:Java.Lang.ClassLoader, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public SlidingUpPanelLayout_SavedState (android.os.Parcelable p0)
	{
		super (p0);
		if (getClass () == SlidingUpPanelLayout_SavedState.class)
			mono.android.TypeManager.Activate ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+SavedState, Unicard.Droid", "Android.OS.IParcelable, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	private static crc644abe232e1f2035d1.SlidingUpPanelLayout_SavedState_SavedStateCreator CREATOR = InitializeCreator ();


	public void writeToParcel (android.os.Parcel p0, int p1)
	{
		n_writeToParcel (p0, p1);
	}

	private native void n_writeToParcel (android.os.Parcel p0, int p1);

	private static crc644abe232e1f2035d1.SlidingUpPanelLayout_SavedState_SavedStateCreator InitializeCreator ()
	{
		return n_InitializeCreator ();
	}

	private static native crc644abe232e1f2035d1.SlidingUpPanelLayout_SavedState_SavedStateCreator n_InitializeCreator ();

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
