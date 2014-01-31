package com.me.TCQ.Managers;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;

public class MyAssetManager extends AssetManager {
	
private static MyAssetManager instance = null;
	
	/*
	 * Implementation of a Singleton
	 */
	
	public synchronized static MyAssetManager Instance(){
		if(instance == null){
			instance = new MyAssetManager();
		}
		return instance;
	}

	public MyAssetManager() {
		// TODO Auto-generated constructor stub
	}

	public MyAssetManager(FileHandleResolver resolver) {
		super(resolver);
		// TODO Auto-generated constructor stub
	}

}
