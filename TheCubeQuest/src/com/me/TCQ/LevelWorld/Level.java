package com.me.TCQ.LevelWorld;

import com.badlogic.gdx.utils.Array;

public class Level {
	
	Player myPlayer;
	Array<MapTemplate> levelMaps;
	

	public Level() {
		levelMaps = new Array<MapTemplate>();
		for(int i = 0; i < 5; ++i)
			levelMaps.add(new MapTemplate());
		myPlayer = new Player();
	}
	
	public void renderLevel(){
		levelMaps.get(0).renderMap();
	}

}
