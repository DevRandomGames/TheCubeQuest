package com.me.TCQ.Actors;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class AnimationTemplate extends Animation {

	public AnimationTemplate(float frameDuration,
			Array<? extends TextureRegion> keyFrames) {
		super(frameDuration, keyFrames);
		// TODO Auto-generated constructor stub
	}

	public AnimationTemplate(float frameDuration, TextureRegion... keyFrames) {
		super(frameDuration, keyFrames);
		// TODO Auto-generated constructor stub
	}

	public AnimationTemplate(float frameDuration,
			Array<? extends TextureRegion> keyFrames, int playType) {
		super(frameDuration, keyFrames, playType);
		// TODO Auto-generated constructor stub
	}

}
