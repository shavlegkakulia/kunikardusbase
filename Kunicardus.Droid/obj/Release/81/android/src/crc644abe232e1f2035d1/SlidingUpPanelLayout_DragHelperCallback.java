package crc644abe232e1f2035d1;


public class SlidingUpPanelLayout_DragHelperCallback
	extends android.support.v4.widget.ViewDragHelper.Callback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_tryCaptureView:(Landroid/view/View;I)Z:GetTryCaptureView_Landroid_view_View_IHandler\n" +
			"n_onViewDragStateChanged:(I)V:GetOnViewDragStateChanged_IHandler\n" +
			"n_onViewCaptured:(Landroid/view/View;I)V:GetOnViewCaptured_Landroid_view_View_IHandler\n" +
			"n_onViewPositionChanged:(Landroid/view/View;IIII)V:GetOnViewPositionChanged_Landroid_view_View_IIIIHandler\n" +
			"n_onViewReleased:(Landroid/view/View;FF)V:GetOnViewReleased_Landroid_view_View_FFHandler\n" +
			"n_getViewVerticalDragRange:(Landroid/view/View;)I:GetGetViewVerticalDragRange_Landroid_view_View_Handler\n" +
			"n_clampViewPositionVertical:(Landroid/view/View;II)I:GetClampViewPositionVertical_Landroid_view_View_IIHandler\n" +
			"";
		mono.android.Runtime.register ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+DragHelperCallback, Unicard.Droid", SlidingUpPanelLayout_DragHelperCallback.class, __md_methods);
	}


	public SlidingUpPanelLayout_DragHelperCallback ()
	{
		super ();
		if (getClass () == SlidingUpPanelLayout_DragHelperCallback.class)
			mono.android.TypeManager.Activate ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+DragHelperCallback, Unicard.Droid", "", this, new java.lang.Object[] {  });
	}

	public SlidingUpPanelLayout_DragHelperCallback (crc644abe232e1f2035d1.SlidingUpPanelLayout p0)
	{
		super ();
		if (getClass () == SlidingUpPanelLayout_DragHelperCallback.class)
			mono.android.TypeManager.Activate ("Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout+DragHelperCallback, Unicard.Droid", "Kunikardus.Droid.Plugins.SlidingUpPanel.SlidingUpPanelLayout, Unicard.Droid", this, new java.lang.Object[] { p0 });
	}


	public boolean tryCaptureView (android.view.View p0, int p1)
	{
		return n_tryCaptureView (p0, p1);
	}

	private native boolean n_tryCaptureView (android.view.View p0, int p1);


	public void onViewDragStateChanged (int p0)
	{
		n_onViewDragStateChanged (p0);
	}

	private native void n_onViewDragStateChanged (int p0);


	public void onViewCaptured (android.view.View p0, int p1)
	{
		n_onViewCaptured (p0, p1);
	}

	private native void n_onViewCaptured (android.view.View p0, int p1);


	public void onViewPositionChanged (android.view.View p0, int p1, int p2, int p3, int p4)
	{
		n_onViewPositionChanged (p0, p1, p2, p3, p4);
	}

	private native void n_onViewPositionChanged (android.view.View p0, int p1, int p2, int p3, int p4);


	public void onViewReleased (android.view.View p0, float p1, float p2)
	{
		n_onViewReleased (p0, p1, p2);
	}

	private native void n_onViewReleased (android.view.View p0, float p1, float p2);


	public int getViewVerticalDragRange (android.view.View p0)
	{
		return n_getViewVerticalDragRange (p0);
	}

	private native int n_getViewVerticalDragRange (android.view.View p0);


	public int clampViewPositionVertical (android.view.View p0, int p1, int p2)
	{
		return n_clampViewPositionVertical (p0, p1, p2);
	}

	private native int n_clampViewPositionVertical (android.view.View p0, int p1, int p2);

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
