package com.factory;

public class OpratringSystemFactory {
	public OpratingSystem getInstance(String os) {
		if(os.equals("android")) {
			return new Android();
		}
		else if(os.equals("windows")) {
			return new Windows();
		}
		else if(os.equals("ios")) {
			return new IOS();
		}
		return null;
	}

}
