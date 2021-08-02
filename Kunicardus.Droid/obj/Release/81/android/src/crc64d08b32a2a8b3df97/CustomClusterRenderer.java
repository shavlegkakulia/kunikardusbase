package crc64d08b32a2a8b3df97;


public class CustomClusterRenderer
	extends com.google.maps.android.clustering.view.DefaultClusterRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBeforeClusterItemRendered:(Lcom/google/maps/android/clustering/ClusterItem;Lcom/google/android/gms/maps/model/MarkerOptions;)V:GetOnBeforeClusterItemRendered_Lcom_google_maps_android_clustering_ClusterItem_Lcom_google_android_gms_maps_model_MarkerOptions_Handler\n" +
			"n_shouldRenderAsCluster:(Lcom/google/maps/android/clustering/Cluster;)Z:GetShouldRenderAsCluster_Lcom_google_maps_android_clustering_Cluster_Handler\n" +
			"";
		mono.android.Runtime.register ("Kunicardus.Droid.Fragments.CustomClusterRenderer, Unicard.Droid", CustomClusterRenderer.class, __md_methods);
	}


	public CustomClusterRenderer (android.content.Context p0, com.google.android.gms.maps.GoogleMap p1, com.google.maps.android.clustering.ClusterManager p2)
	{
		super (p0, p1, p2);
		if (getClass () == CustomClusterRenderer.class)
			mono.android.TypeManager.Activate ("Kunicardus.Droid.Fragments.CustomClusterRenderer, Unicard.Droid", "Android.Content.Context, Mono.Android:Android.Gms.Maps.GoogleMap, Xamarin.GooglePlayServices.Maps:Com.Google.Maps.Android.Clustering.ClusterManager, GoogleMapsUtilityBinding", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onBeforeClusterItemRendered (com.google.maps.android.clustering.ClusterItem p0, com.google.android.gms.maps.model.MarkerOptions p1)
	{
		n_onBeforeClusterItemRendered (p0, p1);
	}

	private native void n_onBeforeClusterItemRendered (com.google.maps.android.clustering.ClusterItem p0, com.google.android.gms.maps.model.MarkerOptions p1);


	public boolean shouldRenderAsCluster (com.google.maps.android.clustering.Cluster p0)
	{
		return n_shouldRenderAsCluster (p0);
	}

	private native boolean n_shouldRenderAsCluster (com.google.maps.android.clustering.Cluster p0);

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
