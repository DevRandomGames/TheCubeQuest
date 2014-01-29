package com.me.TCQ;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
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

public class CubeGame extends Game {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private TextureAtlas texture;
	private Sprite sprite;
	private Screen mainmenu;
	private Array<Sprite> ninja;
	private int total;
	
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
		texture = new TextureAtlas(Gdx.files.internal("data/NinjaMove.png"));
		ninja = texture.createSprites("Nin");
		
		for(int i=0;i<ninja.size;++i){
			ninja.get(i).setSize(3.0f, 3.0f);
			ninja.get(i).setOrigin(ninja.get(i).getWidth()/2, ninja.get(i).getHeight()/2);
			ninja.get(i).setPosition(-ninja.get(i).getWidth()/2, -ninja.get(i).getHeight()/2);
		}
		
		//TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);
		
		/*sprite = new Sprite(region);
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);*/
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		float dt = Gdx.graphics.getDeltaTime();
		total+=dt;
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		ninja.get(total%7).draw(batch);
		batch.end();
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
