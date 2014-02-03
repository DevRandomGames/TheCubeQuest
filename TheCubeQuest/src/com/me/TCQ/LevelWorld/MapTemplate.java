package com.me.TCQ.LevelWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.me.TCQ.Managers.CombatManager;

public class MapTemplate extends Stage {
	
	private OrthographicCamera camera;
	private CombatManager combatsMan;
	private GroupTemplate actors;
	private World world;
	private Box2DDebugRenderer debugRenderer;
	private SpriteBatch batch;
	

	public MapTemplate() {
		world = new World(new Vector2(0,-9.81f),true);
		debugRenderer = new Box2DDebugRenderer();
		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
	}

	public MapTemplate(float width, float height) {
		super(width, height);
		
	}

	public MapTemplate(float width, float height, boolean keepAspectRatio) {
		super(width, height, keepAspectRatio);
		
	}

	public MapTemplate(float width, float height, boolean keepAspectRatio, Batch batch) {
		super(width, height, keepAspectRatio, batch);
		
	}
	
	public void renderMap() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		Texture texture = new Texture("data/libgdx.png");
		Sprite sprite = new Sprite(texture);
		sprite.setSize(0.9f, 0.9f);
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		sprite.draw(batch);
		batch.end();
	}

}