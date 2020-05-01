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

public class Ladder{


ArrayList<Rectangle> Ladder = new ArrayList<Rectangle>();
ArrayList<Rectangle> LadderEnd = new ArrayList<Rectangle>();
ArrayList<Rectangle> LadderEndDown = new ArrayList<Rectangle>();

BufferedImage Ladder1;
BufferedImage Ladder2;
BufferedImage Ladder3;
BufferedImage Ladder4;
BufferedImage Ladder5;
BufferedImage Ladder6;
BufferedImage Ladder7;
BufferedImage Ladder8;
BufferedImage Ladder9;
BufferedImage Ladder10;

Mario mario;

public Ladder(Mario mario){
this.mario = mario;


try{
Ladder1 = ImageIO.read(new File("D:\\_Mario\\Images\\Ladder1.png"));
}catch(Exception e){
System.out.println("Ladder1 image not found");
}
try{
Ladder2 = ImageIO.read(new File("D:\\_Mario\\Images\\Ladder2.png"));
}catch(Exception e){
System.out.println("Ladder2 image not found");
}
try{
Ladder3 = ImageIO.read(new File("D:\\_Mario\\Images\\Ladder3.png"));
}catch(Exception e){
System.out.println("Ladder3 image not found");
}
try{
Ladder4 = ImageIO.read(new File("D:\\_Mario\\Images\\Ladder4.png"));
}catch(Exception e){
System.out.println("Ladder4 image not found");
}
try{
Ladder5 = ImageIO.read(new File("D:\\_Mario\\Images\\Ladder5.png"));
}catch(Exception e){
System.out.println("Ladder5 image not found");
}
try{
Ladder6 = ImageIO.read(new File("D:\\_Mario\\Images\\Ladder6.png"));
}catch(Exception e){
System.out.println("Ladder6 image not found");
}
try{
Ladder7 = ImageIO.read(new File("D:\\_Mario\\Images\\Ladder7.png"));
}catch(Exception e){
System.out.println("Ladder6 image not found");
}
try{
Ladder8 = ImageIO.read(new File("D:\\_Mario\\Images\\Ladder8.png"));
}catch(Exception e){
System.out.println("Ladder6 image not found");
}
try{
Ladder9 = ImageIO.read(new File("D:\\_Mario\\Images\\Ladder9.png"));
}catch(Exception e){
System.out.println("Ladder6 image not found");
}
try{
Ladder10 = ImageIO.read(new File("D:\\_Mario\\Images\\Ladder10.png"));
}catch(Exception e){
System.out.println("Ladder6 image not found");
}




//Ladder 1
Rectangle Ladder1 = new Rectangle(510,569,1,52);
Ladder.add(Ladder1);
Rectangle Ladder1End = new Rectangle(500,505,15,20);
LadderEnd.add(Ladder1End);
Rectangle Ladder1EndDown = new Rectangle(500,620,25,20);
LadderEndDown.add(Ladder1EndDown);
//End of Ladder 1

//Ladder 2
Rectangle Ladder2 = new Rectangle(422,475,1,80);
Ladder.add(Ladder2);
Rectangle Ladder2End = new Rectangle(415,413,15,20);
LadderEnd.add(Ladder2End);
Rectangle Ladder2EndDown = new Rectangle(410,553,25,7);
LadderEndDown.add(Ladder2EndDown);
//End of Ladder 2

//Ladder 3
Rectangle Ladder3 = new Rectangle(210,490,1,60);
Ladder.add(Ladder3);
Rectangle Ladder3End = new Rectangle(198,428,15,20);
LadderEnd.add(Ladder3End);
Rectangle Ladder3EndDown = new Rectangle(198,548,25,7);
LadderEndDown.add(Ladder3EndDown);
//End of Ladder 3

//Ladder 4
Rectangle Ladder4 = new Rectangle(307,390,1,85);
Ladder.add(Ladder4);
Rectangle Ladder4End = new Rectangle(295,328,15,20);
LadderEnd.add(Ladder4End);
Rectangle Ladder4EndDown = new Rectangle(295,473,25,7);
LadderEndDown.add(Ladder4EndDown);
//End of Ladder 4

//Ladder 5
Rectangle Ladder5 = new Rectangle(475,398,1,72);
Ladder.add(Ladder5);
Rectangle Ladder5End = new Rectangle(463,335,15,20);
LadderEnd.add(Ladder5End);
Rectangle Ladder5EndDown = new Rectangle(463,468,25,7);
LadderEndDown.add(Ladder5EndDown);
//End of Ladder 5

//Ladder 6
Rectangle Ladder6 = new Rectangle(160,315,1,70);
Ladder.add(Ladder6);
Rectangle Ladder6End = new Rectangle(148,252,15,20);
LadderEnd.add(Ladder6End);
Rectangle Ladder6EndDown = new Rectangle(148,383,25,7);
LadderEndDown.add(Ladder6EndDown);
//End of Ladder 6

//Ladder 7
Rectangle Ladder7 = new Rectangle(260,305,1,80);
Ladder.add(Ladder7);
Rectangle Ladder7End = new Rectangle(248,242,15,20);
LadderEnd.add(Ladder7End);
Rectangle Ladder7EndDown = new Rectangle(248,383,25,7);
LadderEndDown.add(Ladder7EndDown);
//End of Ladder 7

//Ladder8
Rectangle Ladder8 = new Rectangle(475,220,1,70);
Ladder.add(Ladder8);
Rectangle Ladder8End = new Rectangle(463,157,15,20);
LadderEnd.add(Ladder8End);
Rectangle Ladder8EndDown = new Rectangle(463,288,25,7);
LadderEndDown.add(Ladder8EndDown);
//End of Ladder 8

//Ladder9
Rectangle Ladder9 = new Rectangle(330,132,1,70);
Ladder.add(Ladder9);
Rectangle Ladder9End = new Rectangle(318,67,15,20);
LadderEnd.add(Ladder9End);
Rectangle Ladder9EndDown = new Rectangle(318,200,25,7);
LadderEndDown.add(Ladder9EndDown);
//End of Ladder 9




}

public void paint(Graphics g) {
	//Ladder 1
	/*
	g.drawRect(510,569,1,53);
	g.drawRect(500,505,15,20);
	g.drawRect(500,620,25,20);
	*/

	//Ladder 2

	//g.drawRect(422,475,1,80);
	//g.drawRect(415,413,15,20);
	//g.drawRect(410,553,25,7);


	//Ladder 3
	/*
	g.drawRect(210,490,1,60);
	g.drawRect(198,428,15,20);
	g.drawRect(198,548,25,7);
	*/

	//Ladder 4
	/*
	g.drawRect(307,390,1,85);
	g.drawRect(295,328,15,20);
	g.drawRect(295,473,25,7);
	*/

	//Ladder 5
	/*
	g.drawRect(475,398,1,72);
	g.drawRect(463,335,15,20);
	g.drawRect(463,468,25,7);
	*/

	//Ladder 6
	/*
	g.drawRect(160,315,1,70);
	g.drawRect(148,252,15,20);
	g.drawRect(148,383,25,7);
	*/


	//Ladder 7
	/*
	g.drawRect(260,305,1,80);
	g.drawRect(248,242,15,20);
	g.drawRect(248,383,25,7);
	*/

	//Ladder 8

	//g.drawRect(475,220,1,70);
	//g.drawRect(463,157,15,20);
	//g.drawRect(463,288,25,7);



	//Ladder 9
	/*
	g.drawRect(330,135,1,70);
	g.drawRect(318,65,15,20);
	g.drawRect(318,200,25,7);
	*/

	//Ladder 10
	/*
	g.drawRect(140,0,1,200);
	g.drawRect(128,200,25,7);
	*/

	//Ladder 11
	/*
	g.drawRect(120,0,1,200);
	g.drawRect(108,200,25,7);
	*/





	g.drawImage(Ladder1,500,569,null);
	g.drawImage(Ladder2,412,475,null);
	g.drawImage(Ladder3,200,490,null);
	g.drawImage(Ladder4,298,390,null);
	g.drawImage(Ladder5,465,398,null);
	g.drawImage(Ladder6,150,315,null);
	g.drawImage(Ladder7,250,305,null);
	g.drawImage(Ladder8,465,220,null);
	g.drawImage(Ladder9,320,130,null);
	g.drawImage(Ladder10,130,0,null);
	g.drawImage(Ladder10,109,0,null);


}




public void checkIntersect(Rectangle marHitBox){


	if(!mario.getDownLadder()){
		for(int x = 0; x < LadderEnd.size(); x++){
			if(marHitBox.intersects(LadderEnd.get(x))){
				mario.setClimb(false);
			}

		}
	}

	if(mario.startClimb()){
		for(int i = 0; i < Ladder.size(); i++){
			if(marHitBox.intersects(Ladder.get(i))){
				mario.setClimb(true);
			}



		if(mario.getDownLadder()){
			for(int x = 0; x < LadderEnd.size(); x++){
				if(marHitBox.intersects(LadderEnd.get(x))){
					mario.setClimb(true);
				}
		}
	}

		if(mario.getDownLadder()){
			for(int x = 0; x < LadderEnd.size(); x++){
				if(marHitBox.intersects(LadderEndDown.get(x))){
					mario.setClimb(false);
				}

			}
		}





}



}
}
}

