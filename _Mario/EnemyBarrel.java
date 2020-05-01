import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.ArrayList;

public class EnemyBarrel{

BufferedImage Barrel;
boolean barrel1 = true;
boolean barrel2 = false;
boolean barrel3 = false;
boolean barrel4 = false;
boolean barrel5 = false;

boolean BarrYDrop = false;
boolean Reverse = false;
boolean move = true;
boolean down = false;
int godown = (int)(Math.random()*100)+1;
Barrel b;

int BarrX = 110;
int BarrY = 179;

Rectangle hitbox = new Rectangle(BarrX,BarrY,25,21);



public EnemyBarrel(Barrel b){
	this.b = b;



}




public void paint(Graphics g){
	//System.out.println("Gang");
	//Enemy Barrel
	//g.drawRect(BarrX,BarrY+5,25,21);


	//g.drawRect(500,190,50,30);
	//g.drawRect(485,190,1,80);
	//g.drawRect(150,300,1,70);
	//g.drawRect(410,460,1,80);
	//g.drawRect(400,190,50,20);
	//g.drawRect(350,190,50,20);



if(!down){
	if(barrel1 && b.getAnim() <= 25){
		try{
			Barrel = ImageIO.read(new File("D:\\_Mario\\Images\\Barrel1.png"));
		}catch(Exception e){
			System.out.println("Barrel 1 image not found");
		}

		barrel2 = true;
		if(b.getAnim() == 25)
		barrel1 = false;

	}

	if(barrel2 && b.getAnim() <= 50 && b.getAnim() > 25){
		try{
			Barrel = ImageIO.read(new File("D:\\_Mario\\Images\\Barrel2.png"));
		}catch(Exception e){
			System.out.println("Barrel 2 image not found");
		}
		barrel3 = true;
		if(b.getAnim() == 50)
		barrel2 = false;

	}

	if(barrel3 && b.getAnim() <= 75 && b.getAnim() > 50){
		try{
			Barrel = ImageIO.read(new File("D:\\_Mario\\Images\\Barrel3.png"));
		}catch(Exception e){
			System.out.println("Barrel 3 image not found");
		}
		barrel4 = true;
		if(b.getAnim() == 75)
		barrel3 = false;

	}

	if(barrel4 && b.getAnim() <= 100 && b.getAnim() > 75){
		try{
			Barrel = ImageIO.read(new File("D:\\_Mario\\Images\\Barrel4.png"));
		}catch(Exception e){
			System.out.println("Barrel 1 image not found");
		}
		barrel1 = true;
		if(b.getAnim() == 100)
		barrel4 = false;

	}

}

if(!down){
	if(Reverse){
		if(barrel1 && b.getAnim() <= 25){
				try{
					Barrel = ImageIO.read(new File("D:\\_Mario\\Images\\Barrel4.png"));
				}catch(Exception e){
					System.out.println("Barrel 1 image not found");
				}

				barrel2 = true;
				if(b.getAnim() == 25)
				barrel1 = false;

			}

			if(barrel2 && b.getAnim() <= 50 && b.getAnim() > 25){
				try{
					Barrel = ImageIO.read(new File("D:\\_Mario\\Images\\Barrel3.png"));
				}catch(Exception e){
					System.out.println("Barrel 2 image not found");
				}
				barrel3 = true;
				if(b.getAnim() == 50)
				barrel2 = false;

			}

			if(barrel3 && b.getAnim() <= 75 && b.getAnim() > 50){
				try{
					Barrel = ImageIO.read(new File("D:\\_Mario\\Images\\Barrel2.png"));
				}catch(Exception e){
					System.out.println("Barrel 3 image not found");
				}
				barrel4 = true;
				if(b.getAnim() == 75)
				barrel3 = false;

			}

			if(barrel4 && b.getAnim() <= 100 && b.getAnim() > 75){
				try{
					Barrel = ImageIO.read(new File("D:\\_Mario\\Images\\Barrel1.png"));
				}catch(Exception e){
					System.out.println("Barrel 1 image not found");
				}
				barrel1 = true;
				if(b.getAnim() == 100)
				barrel4 = false;

	}
	}
}

	if(down){
		barrel1 = false;
		barrel2 = false;
		barrel3 = false;
		barrel4 = false;

		try{
			Barrel = ImageIO.read(new File("D:\\_Mario\\Images\\Barrel5.png"));
		}catch(Exception e){
			System.out.println("Barrel 1 image not found");
		}

	}

	g.drawImage(Barrel,BarrX,BarrY,null);





}

public void move(Mario m){

if(m.getAlive()){
if(move){
	if(!Reverse)
	BarrX++;
	if(Reverse)
	BarrX--;

}
}

}

public Rectangle getHitBox(){
	Rectangle hitbox = new Rectangle(BarrX,BarrY,25,21);
	return hitbox;
}

public void setBarrY(int y){
	BarrY = y;
}
public int getBarrY(){
	return BarrY;
}

public void InBounds(){

	if(BarrX >= 660)
		BarrX = 660;



	if(BarrY >= 650)
		BarrY = 650;

	if(BarrY <= 0)
		BarrY = 0;


}


public void HeightSet(){



	if(BarrX == 351 && BarrY == 179 && !Reverse)
		BarrY = BarrY + 5;


	if(BarrX == 401 && BarrY == 184 && !Reverse)
		BarrY = BarrY + 5;
	if(BarrX == 451 && BarrY == 189 && !Reverse)
		BarrY = BarrY + 5;

	if(BarrX == 501 && BarrY == 194 && !Reverse)
		BarrY = BarrY + 5;
	if(BarrX == 551 && BarrY == 199 && !Reverse)
		BarrYDrop = true;

	if(BarrYDrop){
		BarrY++;

		if(BarrY == 270){
			BarrYDrop = false;
			Reverse = true;
		}

		if(BarrY == 365){
			BarrYDrop = false;
			Reverse = false;
		}

		if(BarrY == 450){
			BarrYDrop = false;
			Reverse = true;
		}

		if(BarrY == 530){
			BarrYDrop = false;
			Reverse = false;
		}

		if(BarrY == 592){
			BarrYDrop = false;
			Reverse = true;
		}



	}

	if(Reverse && BarrY == 270){
			if(BarrX == 323){
				BarrY+=5;
			}
	}

	if(BarrX == 273 && BarrY == 275 && Reverse){
		BarrY+=5;
	}

	if(BarrX == 223 && BarrY == 280 && Reverse){
			BarrY+=5;
	}
	if(BarrX == 173 && BarrY == 285 && Reverse){
				BarrY+=5;
	}
	if(BarrX == 123 && BarrY == 290){
					BarrYDrop = true;
	}

	if(BarrX == 351 && BarrY == 365 && !Reverse){
		BarrY+=2;
	}
	if(BarrX == 401 && BarrY == 367 && !Reverse){
			BarrY+=2;
	}
	if(BarrX == 451 && BarrY == 369 && !Reverse){
			BarrY+=2;
	}
	if(BarrX == 501 && BarrY == 371 && !Reverse){
				BarrY+=5;
	}
	if(BarrX == 551 && BarrY == 376)
		BarrYDrop = true;

	if(BarrX == 322 && BarrY ==450 & Reverse){
		BarrY+=5;
	}
	if(BarrX == 272 && BarrY ==455 & Reverse){
			BarrY+=5;
	}
	if(BarrX == 222 && BarrY ==460 & Reverse){
			BarrY+=5;
	}
	if(BarrX == 172 && BarrY ==465 & Reverse){
			BarrY+=5;
	}
	if(BarrX == 122 && BarrY ==470 & Reverse){
				BarrYDrop = true;
	}

	if(BarrX == 350 && BarrY ==530 & !Reverse){
				BarrY+=2;
	}
	if(BarrX == 400 && BarrY ==532 & !Reverse){
				BarrY+=2;
	}
	if(BarrX == 450 && BarrY ==534 & !Reverse){
				BarrY+=2;
	}
	if(BarrX == 500 && BarrY ==536 & !Reverse){
				BarrY+=2;
	}
	if(BarrX == 550 && BarrY ==538 & !Reverse){
				BarrY+=5;
	}
	if(BarrX == 600 && BarrY ==543 & !Reverse){
				BarrYDrop = true;
	}

	if(BarrX == 590 && BarrY == 592 & Reverse){
		BarrY+=5;
	}
	if(BarrX == 540 && BarrY == 597 & Reverse){
			BarrY+=5;
	}
	if(BarrX == 490 && BarrY == 602 & Reverse){
			BarrY+=5;
	}
	if(BarrX == 440 && BarrY == 607 & Reverse){
				BarrY+=5;
	}


}


public void GoDownLadder(Rectangle h){

	Rectangle Ladder1 = new Rectangle(485,190,1,80);
	Rectangle Ladder3 = new Rectangle(150,300,1,67);
	Rectangle Ladder7 = new Rectangle(410,460,1,80);

	 down = false;


	if(h.intersects(Ladder1)){
		//System.out.println(godown);
		if(godown > 50){
			down = true;
		}
	}

	if(BarrY == 270){
		Reverse = true;
		move = true;
		barrel1 = true;
		down = false;
	}

	if(h.intersects(Ladder3)){
			if(godown > 50){
				down = true;
			}
		}


		if(BarrY == 365 && down){
			Reverse = false;
			move = true;
			barrel1 = true;
			down = false;
		}

	if(h.intersects(Ladder7)){
				if(godown > 50){
					down = true;
				}
		}

		if(BarrY == 536 && down){
			Reverse = false;
			move = true;
			barrel1 = true;
			down = false;
		}



	if(down){
		move = false;
		BarrY++;
	}

}

public void HitMario(Rectangle m, Rectangle b, Mario ma){
	if(b.intersects(m)){
		ma.setAlive(false);
	}
}


}