package Kunicardus.Droid;


public class FocusableBaseEditText_BaseInputConnection
	extends android.view.inputmethod.InputConnectionWrapper
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_deleteSurroundingText:(II)Z:GetDeleteSurroundingText_IIHandler\n" +
			"n_sendKeyEvent:(Landroid/view/KeyEvent;)Z:GetSendKeyEvent_Landroid_view_KeyEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.FocusableBaseEditText+BaseInputConnection, Unicard.Droid", FocusableBaseEditText_BaseInputConnection.class, __md_methods);
	}


	public FocusableBaseEditText_BaseInputConnection (android.view.inputmethod.InputConnection p0, boolean p1)
	{
		super (p0, p1);
		if (getClass () == FocusableBaseEditText_BaseInputConnection.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.FocusableBaseEditText+BaseInputConnection, Unicard.Droid", "Android.Views.InputMethods.IInputConnection, Mono.Android:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean deleteSurroundingText (int p0, int p1)
	{
		return n_deleteSurroundingText (p0, p1);
	}

	private native boolean n_deleteSurroundingText (int p0, int p1);


	public boolean sendKeyEvent (android.view.KeyEvent p0)
	{
		return n_sendKeyEvent (p0);
	}

	private native boolean n_sendKeyEvent (android.view.KeyEvent p0);

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
