package com.splunk.mint;


public class Mint_UncaughtExceptionHandler
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		java.lang.Thread.UncaughtExceptionHandler
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_uncaughtException:(Ljava/lang/Thread;Ljava/lang/Throwable;)V:GetUncaughtException_Ljava_lang_Thread_Ljava_lang_Throwable_Handler:Java.Lang.Thread/IUncaughtExceptionHandlerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Splunk.Mint.Mint+UncaughtExceptionHandler, SplunkMint.Xamarin.Android", Mint_UncaughtExceptionHandler.class, __md_methods);
	}


	public Mint_UncaughtExceptionHandler ()
	{
		super ();
		if (getClass () == Mint_UncaughtExceptionHandler.class)
			mono.android.TypeManager.Activate ("Splunk.Mint.Mint+UncaughtExceptionHandler, SplunkMint.Xamarin.Android", "", this, new java.lang.Object[] {  });
	}


	public void uncaughtException (java.lang.Thread p0, java.lang.Throwable p1)
	{
		n_uncaughtException (p0, p1);
	}

	private native void n_uncaughtException (java.lang.Thread p0, java.lang.Throwable p1);

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
