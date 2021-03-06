package com.redpois0n.common.util;

public enum OperatingSystem {

	FREEBSD, OPENBSD, OSX, SOLARIS, LINUX, WINDOWS, UNSUPPORTED;

	/**
	 * From JNativeHook
	 * @param str
	 * @return The operating system found from the specified string
	 */
	public static OperatingSystem getOperatingSystem(String str) {		
		str = str.toLowerCase();
		
		OperatingSystem os;
		
		if (str.equalsIgnoreCase("freebsd")) {
			os = OperatingSystem.FREEBSD;
		} else if (str.equalsIgnoreCase("openbsd")) {
			os = OperatingSystem.OPENBSD;
		} else if (str.contains("mac")) {
			os = OperatingSystem.OSX;
		} else if (str.equalsIgnoreCase("solaris") || str.equalsIgnoreCase("sunos")) {
			os = OperatingSystem.SOLARIS;
		} else if (str.equalsIgnoreCase("linux")) {
			os = OperatingSystem.LINUX;
		} else if (str.contains("win")) {
			os = OperatingSystem.WINDOWS;
		} else {
			os = OperatingSystem.UNSUPPORTED;
		}
		
		return os;
	}
	
	/**
	 * 
	 * @return operating system of current machine
	 */
	public static OperatingSystem getOperatingSystem() {
		return OperatingSystem.getOperatingSystem(System.getProperty("os.name"));
	}

}
