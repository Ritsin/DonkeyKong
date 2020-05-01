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

public class Barrel{
DK dk;

boolean fire = false;
boolean OilHit = false;
BufferedImage firebarrel;
BufferedImage Oil;
int fireBarX = 30;
int fireBarY = 169;



boolean createBarr = false;
int anim = 0;
int max = 100;







public Barrel(DK dk){
	this.dk = dk;
}


public void paint(Graphics g){


	if(anim >= max)
		anim = 0;

	anim++;


	//Fire Barrel

	//g.drawRect(fireBarX,fireBarY,40,25);
	//g.drawRect(110,178,25,21);
	//g.drawRect(50,275,20,20);

	if(fire){
	try{
	firebarrel = ImageIO.read(new File("D:\\_Mario\\Images\\FireBarrel.png"));
	}catch(Exception e){
	System.out.println("FireBarrel image not found");
	}
	g.drawImage(firebarrel,fireBarX,fireBarY,null);
	}

	if(!OilHit){
	try{
	Oil = ImageIO.read(new File("D:\\_Mario\\Images\\OilBarrel.png"));
	}catch(Exception e){
	System.out.println("Oil image not found");
	}
	g.drawImage(Oil,30,600,null);
	}

	if(OilHit){
	try{
	Oil = ImageIO.read(new File("D:\\_Mario\\Images\\OilBarrelFire.png"));
	}catch(Exception e){
	System.out.println("OilFire image not found");
	}
	g.drawImage(Oil,30,593,null);
	}
	//End of Fire Barrel







}


public void FireBarrel(Rectangle mar, Mario m){

	Rectangle OilBar = new Rectangle(30,600,25,50);
	Rectangle firebar = new Rectangle(fireBarX,fireBarY,40,25);
	Rectangle DKanim = new Rectangle(50,275,20,20);
	fire = true;
		if(m.getAlive())
		fireBarY++;

	if(DKanim.intersects(firebar)){
		dk.setOilanim(false);

	}


	if(OilBar.intersects(firebar)){
		OilHit = true;
		fire = false;
	}

	if(firebar.intersects(mar)){
		m.setAlive(false);
	}

}



public void setCreateBarr(boolean s){
	createBarr = s;
}

public int getAnim(){
	return anim;
}





}