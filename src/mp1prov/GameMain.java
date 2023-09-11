package mp1prov;

import java.awt.Image;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.ImageIcon;

import se.egy.graphics.*;

public class GameMain implements KeyListener{
	private HashMap<String, Boolean> keyDown = new HashMap<>();

	private boolean gameRunning = true;
	private Entity player; // FIXA!
	private GameScreen gameScreen;
	public GameMain(){
		gameScreen = new GameScreen("Game", 800, 600, false); // false vid testkörning
		gameScreen.setKeyListener(this);

		keyDown.put("left", false); 
		keyDown.put("right", false);
		loadImages();
		gameLoop();
	}

	public void loadImages(){
		Image img = new ImageIcon(getClass().getResource("./imgs/playerImg.png")).getImage();

		// --- KOD BEHÖVS ---
		player = new Entity(img, 384, 284);
	}


	public void update(){
		// --- KOD BEHÖVS  ---
		if (keyDown.get("right") && player.getX() < gameScreen.getWidth() - player.getWidth() - 5)
			player.setX(player.getX() + 5);
		if (keyDown.get("left") && player.getX() > 5)
			player.setX(player.getX() - 5);
	}

	public void render(){
		// --- KOD BEHÖVS  ---
		Drawable[] drawables = new Drawable[]{player};
		gameScreen.render(drawables);
	}

	public void gameLoop(){
		while(gameRunning){
			update();
			render();

			// Fördröjning
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {}
		}
	}

	/** Spelets tangentbordslyssnare */
	public void keyTyped(KeyEvent e) {}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if(key == KeyEvent.VK_LEFT)
			keyDown.put("left", true); 
		else if(key == KeyEvent.VK_RIGHT)
			keyDown.put("right", true);
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if(key == KeyEvent.VK_LEFT)
			keyDown.put("left", false);
		else if(key == KeyEvent.VK_RIGHT)
			keyDown.put("right", false);
	}
	public static void main(String[] args) {
		new GameMain();
	}
}
