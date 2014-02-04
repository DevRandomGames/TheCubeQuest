package com.me.TCQ.LevelWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.ChainShape;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
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
	private int Width;
	private int Height;
	

	public MapTemplate() {
		world = new World(new Vector2(0,-9.81f),true);
		debugRenderer = new Box2DDebugRenderer();
		Width = Gdx.graphics.getWidth();
		Height = Gdx.graphics.getHeight();
		camera = new OrthographicCamera(Width, Height);
		batch = new SpriteBatch();
		
		//ball definition
		BodyDef ballDef = new BodyDef();
		FixtureDef ballFixture = new FixtureDef();
		CircleShape ballShape = new CircleShape();
		ballShape.setRadius(2.0f);
		ballDef.type = BodyType.DynamicBody;
		ballDef.position.set(0.0f,2.0f);
		ballFixture.shape = ballShape;
		ballFixture.density = 2.5f;
		ballFixture.friction = 0.25f;
		ballFixture.restitution = 0.75f;
		world.createBody(ballDef).createFixture(ballFixture);
		ballShape.dispose();
		
		BodyDef groundDef = new BodyDef();
		FixtureDef groundFixture = new FixtureDef();
		ChainShape groundShape = new ChainShape();
		groundShape.createChain(new Vector2[] {new Vector2(500f,0f),new Vector2(-500f,0f)});
		groundDef.type = BodyType.StaticBody;
		groundDef.position.set(0.0f,0.0f);
		groundFixture.shape = groundShape;
		groundFixture.density = 5.0f;
		groundFixture.friction = 0.25f;
		groundFixture.restitution = 0.75f;
		world.createBody(groundDef).createFixture(groundFixture);
		groundShape.dispose();
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
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		Texture texture = new Texture("data/libgdx.png");
		Sprite sprite = new Sprite(texture);
		sprite.setSize(0.9f, 0.9f);
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);
		
		debugRenderer.render(world, camera.combined);
		
		/*batch.setProjectionMatrix(camera.combined);
		batch.begin();
		sprite.draw(batch);
		batch.end();*/
	}

}