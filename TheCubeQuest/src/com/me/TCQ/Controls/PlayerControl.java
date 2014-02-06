package com.me.TCQ.Controls;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.me.TCQ.Actors.PlayerEntity;

public class PlayerControl extends ControlTemplate {
	
	PlayerEntity character;

	public PlayerControl(PlayerEntity p) {
		
	}

	@Override
	public boolean keyDown(int keycode) {
		switch(keycode){
			case Input.Keys.W: character.Jump();break;
			case Input.Keys.A: character.WalkLeft();break;
			case Input.Keys.S: character.Down();break;
			case Input.Keys.D: character.WalkRight();break;
			case Input.Keys.E: character.Interaction();break;
				
		}
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return super.keyUp(keycode);
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return super.keyTyped(character);
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		switch(button){
			case Input.Buttons.LEFT: character.Attack();break;
			case Input.Buttons.RIGHT: character.DefenseOn();break;
			
		}
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		switch(button){
			case Input.Buttons.RIGHT: character.DefenseOff();break;
		}
		return true;
		
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return super.touchDragged(screenX, screenY, pointer);
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return super.mouseMoved(screenX, screenY);
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return super.scrolled(amount);
	}
	
	

}
