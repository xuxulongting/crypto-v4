package com.bhdc.jce.provider;

import java.security.AccessController;
import java.security.Provider;

public final class BhdcProvider extends Provider {
	private static final String INFO = "BHDC " + 
		    "(SM2 key/parameter generation; SM2 signing; " +
		    "SM3digests; SecureRandom; X.509 certificates)";

	protected BhdcProvider(String arg0, double arg1, String arg2) {
		super("BHDC", 1.0, INFO);
		AccessController.doPrivileged(new java.security.PrivilegedAction() {
		    public Object run() {
		    	/*
		         *  Key Pair Generator engines 
		         */
                put("KeyPairGenerator.SM2", "com.bhdc.jce.provider.KeyPairGenerator");
                put("Alg.Alias.KeyPairGenerator.OID.1.2.840.10040.4.1", "SM2");
                put("Alg.Alias.KeyPairGenerator.1.2.840.10040.4.1", "SM2");
                put("Alg.Alias.KeyPairGenerator.1.3.14.3.2.12", "SM2");
				return null;
		    
		    }
		});
	}

}
