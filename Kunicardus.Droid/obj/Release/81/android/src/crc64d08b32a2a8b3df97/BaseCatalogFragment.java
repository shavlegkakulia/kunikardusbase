package crc64d08b32a2a8b3df97;


public class BaseCatalogFragment
	extends crc640314accc93afcd61.BaseMvxFragment
	implements
		mono.android.IGCUserPeer,
		android.widget.ExpandableListView.OnChildClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"n_onAttach:(Landroid/app/Activity;)V:GetOnAttach_Landroid_app_Activity_Handler\n" +
			"n_onChildClick:(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z:GetOnChildClick_Landroid_widget_ExpandableListView_Landroid_view_View_IIJHandler:Android.Widget.ExpandableListView/IOnChildClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.Fragments.BaseCatalogFragment, Unicard.Droid", BaseCatalogFragment.class, __md_methods);
	}


	public BaseCatalogFragment ()
	{
		super ();
		if (getClass () == BaseCatalogFragment.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.Fragments.BaseCatalogFragment, Unicard.Droid", "", this, new java.lang.Object[] {  });
	}


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);


	public void onAttach (android.app.Activity p0)
	{
		n_onAttach (p0);
	}

	private native void n_onAttach (android.app.Activity p0);


	public boolean onChildClick (android.widget.ExpandableListView p0, android.view.View p1, int p2, int p3, long p4)
	{
		return n_onChildClick (p0, p1, p2, p3, p4);
	}

	private native boolean n_onChildClick (android.widget.ExpandableListView p0, android.view.View p1, int p2, int p3, long p4);

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
