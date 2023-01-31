package main;

import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable{
	// SCREEN SETTINGS
	final int originalTileSize = 16; // 16 x 16 tile
	final int scale = 3; 
	
	final int tileSize = originalTileSize * scale;
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol; // 768px
	final int screenHeight = tileSize * maxScreenRow; // 576px
	
	Thread gameThread;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
		
	}
	
}
