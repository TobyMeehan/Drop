package com.tobymeehan.drop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class Drop extends ApplicationAdapter {
	private Texture dropImage;
	private Texture bucketImage;

	private OrthographicCamera camera;
	private SpriteBatch batch;

	private Rectangle bucket;
	
	@Override
	public void create () {

		dropImage = new Texture(Gdx.files.internal("drop.png"));
		bucketImage = new Texture(Gdx.files.internal("bucket.png"));

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 400);

		batch = new SpriteBatch();

		bucket = new Rectangle();
		bucket.x = 800 / 2 - 64 - 2;
		bucket.y = 20;
		bucket.width = 64;
		bucket.height = 64;
	}

	@Override
	public void render () {

	}
	
	@Override
	public void dispose () {

	}
}
