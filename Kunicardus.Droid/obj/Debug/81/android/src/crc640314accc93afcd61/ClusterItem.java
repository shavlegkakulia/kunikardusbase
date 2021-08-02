package crc640314accc93afcd61;


public class ClusterItem
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.maps.android.clustering.ClusterItem
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getPosition:()Lcom/google/android/gms/maps/model/LatLng;:GetGetPositionHandler:Com.Google.Maps.Android.Clustering.IClusterItemInvoker, GoogleMapsUtilityBinding\n" +
			"n_getSnippet:()Ljava/lang/String;:GetGetSnippetHandler:Com.Google.Maps.Android.Clustering.IClusterItemInvoker, GoogleMapsUtilityBinding\n" +
			"n_getTitle:()Ljava/lang/String;:GetGetTitleHandler:Com.Google.Maps.Android.Clustering.IClusterItemInvoker, GoogleMapsUtilityBinding\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.ClusterItem, Unicard.Droid", ClusterItem.class, __md_methods);
	}


	public ClusterItem ()
	{
		super ();
		if (getClass () == ClusterItem.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.ClusterItem, Unicard.Droid", "", this, new java.lang.Object[] {  });
	}

	public ClusterItem (double p0, double p1, java.lang.String p2)
	{
		super ();
		if (getClass () == ClusterItem.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.ClusterItem, Unicard.Droid", "System.Double, mscorlib:System.Double, mscorlib:System.String, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public com.google.android.gms.maps.model.LatLng getPosition ()
	{
		return n_getPosition ();
	}

	private native com.google.android.gms.maps.model.LatLng n_getPosition ();


	public java.lang.String getSnippet ()
	{
		return n_getSnippet ();
	}

	private native java.lang.String n_getSnippet ();


	public java.lang.String getTitle ()
	{
		return n_getTitle ();
	}

	private native java.lang.String n_getTitle ();

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
