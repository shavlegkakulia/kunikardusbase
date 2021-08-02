package crc640314accc93afcd61;


public class PinInputDialogFragment
	extends android.app.DialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.PinInputDialogFragment, Unicard.Droid", PinInputDialogFragment.class, __md_methods);
	}


	public PinInputDialogFragment ()
	{
		super ();
		if (getClass () == PinInputDialogFragment.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.PinInputDialogFragment, Unicard.Droid", "", this, new java.lang.Object[] {  });
	}

	public PinInputDialogFragment (java.lang.String p0, boolean p1, boolean p2)
	{
		super ();
		if (getClass () == PinInputDialogFragment.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.PinInputDialogFragment, Unicard.Droid", "System.String, mscorlib:System.Boolean, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);

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
