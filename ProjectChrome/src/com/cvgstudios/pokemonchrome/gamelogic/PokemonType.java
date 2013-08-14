package com.cvgstudios.pokemonchrome.gamelogic;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;

import com.badlogic.gdx.graphics.Texture;

/**
 * A class that describes a "type" of pokemon. So, a class that describes
 * Charizards in general, or Kirbys in general.
 * 
 * @author qmpzaltb
 */

public class PokemonType {

	protected static Vector<PokemonType> typesOfPokemon;

	protected Vector<String> actions;
	protected Vector<String> actionNames;

	protected String baseName;
	protected String typeName;

	protected String[] types;
	
	protected int typeID;
	
	protected int baseHP;
	protected int baseAttack;
	protected int baseDefense;
	protected int baseSpAttack;
	protected int baseSpDefense;
	protected int baseSpeed;

	protected Image frontImage;
	protected Image backImage;
	
	protected Texture frontTexture;
	protected Texture backTexture;

	public PokemonType(String basePokemonName) {
		baseName = basePokemonName;
		actions = new Vector<String>();
		actionNames = new Vector<String>();
	}

	public String getBaseName() {
		return baseName;
	}

	public Image getFrontImage() {
		return frontImage;
	}

	public Image getBackImage() {
		return backImage;
	}
	
	public Texture getFrontTexture(){
		return frontTexture;
	}
	public Texture getBackTexture(){
		return backTexture;
	}

	public Vector<String> getActions() {
		return actions;
	}

	public Vector<String> getActionNames() {
		return actionNames;
	}

	public void setTypeName(String name) {
		typeName = name;
	}
	
	public void setTypes(String[] type){
		types = type;
	}

	public String getTypeName() {
		return typeName;
	}
	
	public boolean hasType(String type){
		for (String t : types){
			if (t.equalsIgnoreCase(type)){
				return true;
			}
			
		}
		return false;
	}

	public void setFrontImage(String filepath) {
		try {
			System.out.print("Loading " + filepath);
			frontImage = ImageIO.read(new File(filepath));
		} catch (IOException e) {
			System.out.print(" File IO error!");
			// e.printStackTrace();
		} finally {
			System.out.println();
		}
	}

	public void setBackImage(String filepath) {
		try {
			System.out.print("Loading " + filepath);
			backImage = ImageIO.read(new File(filepath));
		} catch (IOException e) {
			System.out.print(" File IO error!");
			// e.printStackTrace();
		} finally {
			System.out.println();
		}
	}
	
	public void setFrontTexture(String filepath) {
		System.out.print("Loading " + filepath);
		frontTexture = new Texture(filepath);
	}

	public void setBackTexture(String filepath) {
		System.out.print("Loading " + filepath);
		backTexture = new Texture(filepath);
	}

	public void setHP(int hp) {
		baseHP = hp;
	}

	public void setAttack(int attack) {
		baseAttack = attack;
	}

	public void setDefense(int defense) {
		baseDefense = defense;
	}

	public void setSpAttack(int spAttack) {
		baseSpAttack = spAttack;
	}

	public void setSpDefense(int spDefense) {
		baseSpDefense = spDefense;
	}

	public void setSpeed(int speed) {
		baseSpeed = speed;
	}
	
	public void setTypeID(int id){
		typeID = id;
	}

	public void giveAction(String actionname, String actionTrueName) {
		actions.add(actionname);
		actionNames.add(actionTrueName);
	}
	
	public int getTypeID(){
		return typeID;
	}

	public static void initializeTypes() {
		typesOfPokemon = new Vector<PokemonType>();
	}

	public static void addPokemon(String pokemonName) {
		typesOfPokemon.add(new PokemonType(pokemonName));
	}

	public static PokemonType getPokemon(String pokemonName) {

		for (int i = 0; i < typesOfPokemon.size(); i++) {
			if (typesOfPokemon.get(i).baseName.equalsIgnoreCase(pokemonName)) {
				return typesOfPokemon.get(i);
			}
		}

		return null;

	}

}
