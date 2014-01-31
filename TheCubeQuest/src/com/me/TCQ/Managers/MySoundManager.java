package com.me.TCQ.Managers;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.utils.Array;

public class MySoundManager {

	private Array<Sound> Sounds;
	private Array<Music> Musics;
	
	private static MySoundManager instance = null;
	
	/*
	 * Implementation of a Singleton
	 */
	
	public synchronized static MySoundManager Instance(){
		if(instance == null){
			instance = new MySoundManager();
		}
		return instance;
	}
	
	public MySoundManager() {
		// TODO Auto-generated constructor stub
	}

}
