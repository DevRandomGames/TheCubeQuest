package com.me.TCQ.Managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.me.TCQ.LevelWorld.Level;

public class LevelManager {
	
	Level theLevel;
	DiscManager disc;
	
	public LevelManager() {
		theLevel = new Level();
		disc = new DiscManager();
		
	}
	
	public void renderTheLevel(){
		theLevel.renderLevel();
	}

}
