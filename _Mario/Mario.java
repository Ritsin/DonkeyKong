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
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Timer;
import java.util.TimerTask;




public class Mario{

int right = 0;
int left = 0;
int up = 0;
int down = 0;
boolean walkR = false;
boolean walkL = false;
boolean facingL = true;
boolean climb = false;
boolean jump = false;
boolean startClimb = false;
boolean downLadder = false;
boolean alive = true;

boolean death = false;
boolean death1 = false;
boolean death2 = false;
boolean death3 = false;
boolean death4 = false;
boolean death5 = false;
boolean GG = false;
boolean minus = false;


int MarX = 80;
int MarY = 592;
int count = 60;
boolean done;
int anim = 0;

float positionX;
float positionY;
float velocityX;
float velocityY;
float gravity = 0.2f;
boolean onground = true;
boolean Jump = false;

int lastKey;

Timer timer = new Timer();
BufferedImage MarStand;


public void Update(){
	//System.out.println(keyPressedMillis);

	positionX = MarX;
	positionY = MarY;

	positionX += velocityX;
	positionY += velocityY;

	velocityY += gravity;


	if(!climb){
	MarY = (int)positionY;
	MarX = (int)positionX;
	}




}

public void StartJump() {
    if (onground) {
        velocityY = -4;
        onground = false;

    }
		//if(jump)
			//jump = false;
}

public void EndJump(){
	if(velocityY < -6.0)
       velocityY = -6;

		jump = false;

}

public void move() {

		if(climb){
			right = 0;
			left = 0;
		}

		if(death1){

			right = 0;
			left = 0;

		}

        MarX += right;
        MarX -= left;
        MarY -= up;
        MarY += down;

        if(anim >= count)
        	anim = 0;

        anim++;


}


public void paint(Graphics g) {




	if(facingL && !death)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-StandR.png"));
	}catch(Exception e){
		System.out.println("Mario StandR image not found");
	}

	if(!facingL && !death)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-StandL.png"));
	}catch(Exception e){
		System.out.println("Mario StandL image not found");
	}


	//Anim for walk (left)
	if(walkL)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-RunL1.png"));
	}catch(Exception e){
	System.out.println("Mario WalkL1 image not found");
	}

	if(anim > 20 && walkL)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-StandL.png"));
	}catch(Exception e){
	System.out.println("Mario StandL image not found");
	}

	if(anim > 40 && walkL)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-RunL2.png"));
	}catch(Exception w){
	System.out.println("Mario WalkL2 image not found");
	}


	//Anim for walk (right)
	if(walkR)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-RunR1.png"));
	}catch(Exception e){
	System.out.println("Mario WalkR1 image not found");
	}


	if(anim > 20 && walkR)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-StandR.png"));
	}catch(Exception e){
	System.out.println("Mario StandR image not found");
	}

	if(anim > 40 && walkR)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-RunR2.png"));
	}catch(Exception e){
	System.out.println("Mario WalkR2 image not found");
	}


	// Anim for climbing
	if(startClimb && climb)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-Climb1.png"));
	}catch(Exception e){
	System.out.println("Mario Climb1 image not found");
	}

	if(!startClimb && climb)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-Climb1.png"));
	}catch(Exception e){
	System.out.println("Mario Climb1 image not found");
	}



	if(anim > 33 && startClimb && climb)
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\Mario-Climb2.png"));
	}catch(Exception e){
	System.out.println("Mario Climb2 image not found");
	}

	//Anim for Death
if(death){
	count = 200;


	if(anim <= 40 && death1){
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\MarioDead1.png"));
	}catch(Exception e){
	System.out.println("Mario Climb2 image not found");
	}
	death2 = true;
	if(anim == 40)
	death1 = false;

	}


	if(anim <= 80 && anim > 40 && death2){
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\MarioDead2.png"));
	}catch(Exception e){
	System.out.println("Mario Climb2 image not found");
	}
	death3 = true;
	if(anim == 80)
	death2 = false;

	}

	if(anim <= 120 && anim > 80 && death3){
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\MarioDead3.png"));
	}catch(Exception e){
	System.out.println("Mario Climb2 image not found");
	}
	death4 = true;
	if(anim == 120)
	death3 = false;

	}

	if(anim <= 160 && anim > 120 && death4){
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\MarioDead4.png"));
	}catch(Exception e){
	System.out.println("Mario Climb2 image not found");
	}
	death5 = true;
	if(anim == 160)
	death4 = false;
	}


	if(anim <= 200 && anim > 160 && death5){
	try{
	MarStand = ImageIO.read(new File("D:\\_Mario\\Images\\MarioDead5.png"));
	}catch(Exception e){
	System.out.println("Mario Climb2 image not found");
	}
		minus = true;
		GG = true;
	}
}




	g.drawImage(MarStand, MarX,(int)MarY, null);


}

public void keyPressed(KeyEvent e){

	if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D){
            right = 1;
            walkR = true;
            facingL = true;
}
	if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A){
            left = 1;
            walkL = true;
            facingL = false;

}
	if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W){
            up = 1;
            startClimb = true;
}
	if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S){
            down = 1;
            startClimb = true;
            downLadder = true;

}


    if (e.getKeyCode() == KeyEvent.VK_SPACE){

			if(!Jump){
			Jump = true;
			StartJump();
			jump = true;
			}else{
				jump = false;
			}

		//System.out.println(jump);

	}



}
public void keyTyped(KeyEvent e){

}


public void keyReleased(KeyEvent e){


	if(e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT){
		right = 0;
		walkR = false;
	}
	if(e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT){
		left = 0;
		walkL = false;
	}
	if(e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP){
		up = 0;
		startClimb = false;

	}
	if(e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN){
		down = 0;
		startClimb = false;
		downLadder = false;

	}
	if (e.getKeyCode() == KeyEvent.VK_SPACE){
		Jump = false;
		EndJump();
	}




}


public int getMarX(){
	return MarX;
}
public int getMarY(){
	return MarY;
}
public void setMarY(int y){
	MarY = y;
}
public void setMarX(int x){
	MarX = x;
}
public boolean getClimb(){
	return climb;
}
public void setClimb(boolean c){
	climb = c;
}
public boolean startClimb(){
	return startClimb;
}
public boolean getDownLadder(){
	return downLadder;
}
public void setAlive(boolean a){
	alive = a;
}

public boolean getAlive(){
	return alive;
}
public void setDeath(boolean d){
	death = d;
}
public void setDeath1(boolean d){
	death1 = d;
}
public boolean getGG(){
	return GG;
}

public void setVeloY(float y){
	velocityY = y;
}

public void setOnGround(boolean b){
	onground = b;
}

public boolean getOnGround(){
	return onground;
}

public boolean getJump(){
	return jump;
}

public void setJump(boolean b){
	jump = b;
}




}
