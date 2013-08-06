package com.cvgstudios.pokemonchrome;

import java.io.File;

import com.badlogic.gdx.Game;
import com.cvgstudios.pokemonchrome.javascript.JSExecutor;
import com.cvgstudios.pokemonchrome.screens.SplashScreen;

public class ChromeGame extends Game {
	public static final String POKECHROME_VERSION = "0.0.0.03 Pre-Alpha";
	public static final String LOG = "Pokemon Chrome";

	@Override
	public void create() {
		//Mark yea it can be called here, I tried moving the res/ to the default project but it kept screwing up
		JSExecutor.initializeExecutor(new File("res/javascript").getAbsolutePath());
		
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int w, int h) {
		super.resize(w, h);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}
