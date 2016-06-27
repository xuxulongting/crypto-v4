package com.bhdc.jce.provider;

import java.security.KeyPair;
import java.security.KeyPairGeneratorSpi;
import java.security.SecureRandom;

import com.bhdc.jce.util.*;

public class KeyPairGenerator extends KeyPairGeneratorSpi {
	
	static {
		System.loadLibrary("KeyPairGenerator");
	}
	
	public native static int SDF_GenerateKeyPair_ECC(Void[] hSessionHandle, 
			int uiAlgID,int  uiKeyBits, ECCrefPublicKey[] pucPublicKey, 
			ECCrefPrivateKey[] pucPrivateKey);

	@Override
	public void initialize(int keysize, SecureRandom random) {
		// TODO Auto-generated method stub

	}

	@Override
	public KeyPair generateKeyPair() {
		// TODO Auto-generated method stub
		return null;
	}

}
