package com.me.TCQ.UserInterface;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class InGameScreen extends ScreenTemplate {

	public InGameScreen() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		//Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		Texture texture = new Texture("data/libgdx.png");
		Sprite sprite = new Sprite(texture);
		sprite.setSize(0.1f, 0.1f);
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);
		SpriteBatch batch = new SpriteBatch();
		OrthographicCamera camera = new OrthographicCamera(1,1);
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		sprite.draw(batch);
		batch.end();

	}

}
