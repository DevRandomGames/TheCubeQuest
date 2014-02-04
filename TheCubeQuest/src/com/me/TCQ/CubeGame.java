package com.me.TCQ;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.me.TCQ.Managers.LevelManager;
import com.me.TCQ.UserInterface.InGameScreen;

public class CubeGame extends Game {
	private Screen mainMenu;
	private InGameScreen theGameScreen;
	private LevelManager levelManager;
	private InputMultiplexer inMult;
	
	
	@Override
	public void create() {		
		theGameScreen = new InGameScreen();
		levelManager = new LevelManager();
		inMult = new InputMultiplexer();
		Gdx.input.setInputProcessor(inMult);
		
		/*
		texture = new TextureAtlas(Gdx.files.internal("data/NinjaMove.png"));
		ninja = texture.createSprites("Nin");
		
		for(int i=0;i<ninja.size;++i){
			ninja.get(i).setSize(3.0f, 3.0f);
			ninja.get(i).setOrigin(ninja.get(i).getWidth()/2, ninja.get(i).getHeight()/2);
			ninja.get(i).setPosition(-ninja.get(i).getWidth()/2, -ninja.get(i).getHeight()/2);
		}
		
		//TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);
		
		sprite = new Sprite(region);
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);
		*/
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() {	
		levelManager.renderTheLevel();
		theGameScreen.render(0);
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
