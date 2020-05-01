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

public class DK{



	public DK(Mario mario){
		this.mario = mario;
	}

	Mario mario;
	boolean roarL = false;
	boolean roarR = false;
	boolean oil = false;
	boolean oilanim =false;
	boolean throwAnim = false;
	BufferedImage dk;
	int anim = 0;
	Rectangle dkHit = new Rectangle(0,120,100,82);
	boolean norm = false;


public void paint(Graphics g) {

	//g.drawRect(0,120,100,82);

	if(anim >= 50)
		anim = 0;

	anim++;



//Roar Anim
if(roarL){
try{
dk = ImageIO.read(new File("D:\\_Mario\\Images\\DKroarL.png"));
}catch(Exception e){
System.out.println("DKroarL image not found");
}
 norm = false;
}
if(roarR){
try{
dk = ImageIO.read(new File("D:\\_Mario\\Images\\DKroarR.png"));
}catch(Exception e){
System.out.println("DKroarR image not found");
}
 norm = false;
}
if(oilanim){
try{
dk = ImageIO.read(new File("D:\\_Mario\\Images\\DKThrowFire.png"));
}catch(Exception e){
System.out.println("DK image not found");
}
norm = false;
}


//Normal Anim
if(!oilanim && !roarR && !roarL && !throwAnim || norm)
try{
dk = ImageIO.read(new File("D:\\_Mario\\Images\\DK.png"));
}catch(Exception e){
System.out.println("DK image not found");
}


//Throw Anim
if(throwAnim){
try{
dk = ImageIO.read(new File("D:\\_Mario\\Images\\DKThrowR.png"));
}catch(Exception e){
System.out.println("DK image not found");
}
norm = false;
}







g.drawImage(dk,0,120,null);


}

public void roar(){
	if(anim > 25){
		roarL = true;
		roarR = false;
	}
	if(anim <= 25){
			roarL = false;
			roarR = true;
	}


}

public void resetAnim(){

	roarL = false;
	roarR = false;
	oil = false;
	throwAnim = false;

}

public void dropOil(){
	oil = true;
}

public boolean getOil(){
	return oil;
}

public void setOilanim(boolean o){
	oilanim = o;
}

public void chechHit(Rectangle m){
	if(m.intersects(dkHit)){
		mario.setAlive(false);
	}
}

public void setThrow(boolean bool){
	throwAnim = bool;
}
public boolean getThrow(){
	return throwAnim;
}

public void setNorm(boolean b){
	norm = b;
}




}