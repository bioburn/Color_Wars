package character;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import framework.Game;

@SuppressWarnings("serial")
public class Wave extends ArrayList<Enemy> {

	Enemy e;
	Color color;
	int x;
	int y;
	int numEnemies;
	
	/*
	 * This creates a wave of enemies
	 * All of them are randomly generated
	 * Creates numEnemies Enemies
	 */
	public Wave(int numEnemies){
		Random random = new Random();
		for(int i=0; i<numEnemies; i++){
			int enemyType = random.nextInt(3);
			int enemyColor = random.nextInt(4);
			int x = random.nextInt(Game.WIDTH);
			int y = random.nextInt(Game.HEIGHT);
			
			if(enemyColor==0) color = Color.RED;
			if(enemyColor==1) color = Color.BLUE;
			if(enemyColor==2) color = Color.GREEN;
			if(enemyColor==3) color = Color.YELLOW;
			
			if(enemyType == 0) e = new Circle(x,y,color);
			if(enemyType == 1) e = new Square(x,y,color);
			if(enemyType == 2) e = new Triangle(x,y,color);
			
			this.add(e);
			
		}
	}
	
	//Renders the whole wave via a for loop (hopefully...)
	public void render(Graphics g){
		//SUPPOSED TO BE A FOR LOOP HERE. NOT WORKING.
		//for(int i=0;i<numEnemies;i++)
			//this.get(i).render(g);
		 
		this.get(0).render(g);
		this.get(1).render(g);
	}
	
	//Updates the whole wave via a for loop (again, hopefully...) 
	public void update(){
		//ALSO SUPPOSED TO BE A FOR LOOP. ALSO NOT WORKING
		//for(int i=0;i<numEnemies;i++)
			//this.get(i).update();
		
		this.get(0).update();
		this.get(1).update();
	}
	
}