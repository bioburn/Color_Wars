package character;

import java.awt.Graphics;
import java.util.ArrayList;

public class Projectiles extends ArrayList<Projectile> {
	
	public void render(Graphics g){	
		for(int i=0;i<size();i++)
			this.get(i).render(g);
	}
	
	//Updates the whole wave via a for loop
	public void update(double playerX, double playerY){
		for(int i=0;i<size();i++){
			this.get(i).update(playerX, playerY);
			if(!this.get(i).isAlive){
				this.remove(i);
			}
		}

	}
}