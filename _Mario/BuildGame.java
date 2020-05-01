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

public class BuildGame{


ArrayList<Rectangle> bricks = new ArrayList<Rectangle>();
ArrayList<Rectangle> stepD = new ArrayList<Rectangle>();
ArrayList<Rectangle> jump = new ArrayList<Rectangle>();
BufferedImage block;


public void setUpArrays(){
	//Lvl1
	Rectangle brks1 = new Rectangle (00,632,450,20);
	bricks.add(brks1);
	Rectangle StepD1 = new Rectangle (00,600,450,30);
	stepD.add(StepD1);
	Rectangle Jump1 = new Rectangle (00,590,450,30);
	jump.add(Jump1);

	Rectangle brks2 = new Rectangle (450,627,50,20);
	bricks.add(brks2);
	Rectangle StepD2 = new Rectangle (450,600,50,20);
	stepD.add(StepD2);
	Rectangle Jump2 = new Rectangle (450,590,50,20);
	jump.add(Jump2);

	Rectangle brks3 = new Rectangle (500,622,50,20);
	bricks.add(brks3);
	Rectangle StepD3 = new Rectangle (500,600,50,20);
	stepD.add(StepD3);
	Rectangle Jump3 = new Rectangle (500,590,50,20);
	jump.add(Jump3);

	Rectangle brks4 = new Rectangle (550,617,50,20);
	bricks.add(brks4);
	Rectangle StepD4 = new Rectangle (550,600,50,20);
	stepD.add(StepD4);
	Rectangle Jump4 = new Rectangle (550,590,50,20);
	jump.add(Jump4);

	Rectangle brks5 = new Rectangle (600,612,90,20);
	bricks.add(brks5);
	Rectangle StepD5 = new Rectangle (600,600,90,20);
	stepD.add(StepD5);
	Rectangle Jump5 = new Rectangle (600,590,90,20);
	jump.add(Jump5);
	//End of Lvl 1

	//Lvl2
	Rectangle brks6 = new Rectangle (00,550,350,5);
	bricks.add(brks6);
	Rectangle StepD6 = new Rectangle (00,540,350,5);
	stepD.add(StepD6);
	Rectangle Jump6 = new Rectangle (00,530,350,5);
	jump.add(Jump6);

	Rectangle brks7 = new Rectangle (350,552,50,5);
	bricks.add(brks7);
	Rectangle StepD7 = new Rectangle (350,540,50,10);
	stepD.add(StepD7);
	Rectangle Jump7 = new Rectangle (350,530,50,10);
	jump.add(Jump7);

	Rectangle brks8 = new Rectangle (400,555,50,5);
	bricks.add(brks8);
	Rectangle StepD8 = new Rectangle (400,540,50,10);
	stepD.add(StepD8);
	Rectangle Jump8 = new Rectangle (400,525,50,10);
	jump.add(Jump8);

	Rectangle brks9 = new Rectangle (450,558,50,5);
	bricks.add(brks9);
	Rectangle StepD9 = new Rectangle (450,540,50,10);
	stepD.add(StepD9);
	Rectangle Jump9 = new Rectangle (450,520,50,10);
	jump.add(Jump9);

	Rectangle brks10 = new Rectangle (500,563,50,5);
	bricks.add(brks10);
	Rectangle StepD10 = new Rectangle (500,540,50,10);
	stepD.add(StepD10);
	Rectangle Jump10 = new Rectangle (500,515,50,10);
	jump.add(Jump10);
	//End of Lvl 2

	//Lvl3
	Rectangle brks11 = new Rectangle (332,470,350,5);
	bricks.add(brks11);
	Rectangle StepD11 = new Rectangle (332,460,350,5);
	stepD.add(StepD11);
	Rectangle Jump11 = new Rectangle (332,450,350,5);
	jump.add(Jump11);


	Rectangle brks12 = new Rectangle (282,475,50,5);
	bricks.add(brks12);
	Rectangle StepD12 = new Rectangle (282,460,50,5);
	stepD.add(StepD12);
	Rectangle Jump12 = new Rectangle (282,450,50,5);
	jump.add(Jump12);

	Rectangle brks13 = new Rectangle (232,480,50,5);
	bricks.add(brks13);
	Rectangle StepD13 = new Rectangle (232,460,50,5);
	stepD.add(StepD13);
	Rectangle Jump13 = new Rectangle (232,450,50,5);
	jump.add(Jump13);

	Rectangle brks14 = new Rectangle (182,485,50,5);
	bricks.add(brks14);
	Rectangle StepD14 = new Rectangle (182,460,50,5);
	stepD.add(StepD14);
	Rectangle Jump14 = new Rectangle (182,450,50,5);
	jump.add(Jump14);

	Rectangle brks15 = new Rectangle (132,490,50,5);
	bricks.add(brks15);
	Rectangle StepD15 = new Rectangle (132,460,50,5);
	stepD.add(StepD15);
	Rectangle Jump15 = new Rectangle (132,450,50,5);
	jump.add(Jump15);
	//End of Lvl 3

	//Lvl4
	Rectangle brks16 = new Rectangle (00,385,350,5);
	bricks.add(brks16);
	Rectangle StepD16 = new Rectangle (00,375,350,5);
	stepD.add(StepD16);
	Rectangle Jump16 = new Rectangle (00,365,350,5);
	jump.add(Jump16);


	Rectangle brks17 = new Rectangle (350,387,50,5);
	bricks.add(brks17);
	Rectangle StepD17 = new Rectangle (350,375,50,5);
	stepD.add(StepD17);
	Rectangle Jump17 = new Rectangle (350,365,50,5);
	jump.add(Jump17);

	Rectangle brks18 = new Rectangle (400,390,50,5);
	bricks.add(brks18);
	Rectangle StepD18 = new Rectangle (400,375,50,5);
	stepD.add(StepD18);
	Rectangle Jump18 = new Rectangle (400,365,50,5);
	jump.add(Jump18);

	Rectangle brks19 = new Rectangle (450,393,50,5);
	bricks.add(brks19);
	Rectangle StepD19 = new Rectangle (450,375,50,5);
	stepD.add(StepD19);
	Rectangle Jump19 = new Rectangle (450,365,50,5);
	jump.add(Jump19);

	Rectangle brks20 = new Rectangle (500,398,50,5);
	bricks.add(brks20);
	Rectangle StepD20 = new Rectangle (500,375,50,5);
	stepD.add(StepD20);
	Rectangle Jump20 = new Rectangle (500,365,50,5);
	jump.add(Jump20);
	//End of Lvl 4

	//Lvl5
	Rectangle brks21 = new Rectangle (332,290,350,5);
	bricks.add(brks21);
	Rectangle StepD21 = new Rectangle (332,280,350,5);
	stepD.add(StepD21);
	Rectangle Jump21 = new Rectangle (332,270,350,5);
	jump.add(Jump21);

	Rectangle brks22 = new Rectangle (282,295,50,5);
	bricks.add(brks22);
	Rectangle StepD22 = new Rectangle (282,280,50,5);
	stepD.add(StepD22);
	Rectangle Jump22 = new Rectangle (282,270,50,5);
	jump.add(Jump22);

	Rectangle brks23 = new Rectangle (232,300,50,5);
	bricks.add(brks23);
	Rectangle StepD23 = new Rectangle (232,280,50,5);
	stepD.add(StepD23);
	Rectangle Jump23 = new Rectangle (232,270,50,5);
	jump.add(Jump23);

	Rectangle brks24 = new Rectangle (182,305,50,5);
	bricks.add(brks24);
	Rectangle StepD24 = new Rectangle (182,280,50,5);
	stepD.add(StepD24);
	Rectangle Jump24 = new Rectangle (182,270,50,5);
	jump.add(Jump24);

	Rectangle brks25 = new Rectangle (132,310,50,5);
	bricks.add(brks25);
	Rectangle StepD25 = new Rectangle (132,280,50,5);
	stepD.add(StepD25);
	Rectangle Jump25 = new Rectangle (132,270,50,5);
	jump.add(Jump25);
	//End of Lvl 5

		//Lvl6
	Rectangle brks26 = new Rectangle (00,200,350,5);
	bricks.add(brks26);
	Rectangle StepD26 = new Rectangle (00,190,350,5);
	stepD.add(StepD26);
	Rectangle Jump26 = new Rectangle (00,180,350,5);
	jump.add(Jump26);

	Rectangle brks27 = new Rectangle (350,205,50,5);
	bricks.add(brks27);
	Rectangle StepD27 = new Rectangle (350,190,50,5);
	stepD.add(StepD27);
	Rectangle Jump27 = new Rectangle (350,180,50,5);
	jump.add(Jump27);

	Rectangle brks28 = new Rectangle (400,210,50,5);
	bricks.add(brks28);
	Rectangle StepD28 = new Rectangle (400,190,50,5);
	stepD.add(StepD28);
	Rectangle Jump28 = new Rectangle (400,180,50,5);
	jump.add(Jump28);


	Rectangle brks29 = new Rectangle (450,215,50,5);
	bricks.add(brks29);
	Rectangle StepD29 = new Rectangle (450,190,50,5);
	stepD.add(StepD29);
	Rectangle Jump29 = new Rectangle (450,180,50,5);
	jump.add(Jump29);

	Rectangle brks30 = new Rectangle (500,220,50,5);
	bricks.add(brks30);
	Rectangle StepD30 = new Rectangle (500,190,50,5);
	stepD.add(StepD30);
	Rectangle Jump30 = new Rectangle (500,180,50,5);
	jump.add(Jump30);
	//End of Lvl 6

	//Lvl 7
	Rectangle brks31 = new Rectangle (150,125,200,5);
	bricks.add(brks31);
	Rectangle StepD31 = new Rectangle (150,115,200,5);
	stepD.add(StepD31);
	Rectangle Jump31 = new Rectangle (150,105,200,5);
	jump.add(Jump31);

	//End of Lvl 7

}


public void paint(Graphics g2d) {

try{
block = ImageIO.read(new File("D:\\_Mario\\Images\\Block.png"));
}catch(Exception e){
System.out.println("Bricks image not found");
}

/*
	//Hit Boxes Start

	//Step Up Lvl1

	g2d.drawRect(00,632,450,20);
	g2d.drawRect(450,627,50,20);
	g2d.drawRect(500,622,50,20);
	g2d.drawRect(550,617,50,20);
	g2d.drawRect(600,612,90,20);


	//Step Down Lvl1

	g2d.drawRect(00,600,450,30);
	g2d.drawRect(450,600,50,20);
	g2d.drawRect(500,600,50,20);
	g2d.drawRect(550,600,50,20);
	g2d.drawRect(600,600,90,20);

	//Jump Lvl 1
	g2d.drawRect(00,590,450,30);
	g2d.drawRect(450,590,50,20);
	g2d.drawRect(500,590,50,20);
	g2d.drawRect(550,590,50,20);
	g2d.drawRect(600,590,90,20);

	//Step Up Lvl2

	g2d.drawRect(00,550,350,5);
	g2d.drawRect(350,552,50,5);
	g2d.drawRect(400,555,50,5);
	g2d.drawRect(450,558,50,5);
	g2d.drawRect(500,563,50,5);



	//Step Down Lvl2

	g2d.drawRect(00,540,350,5);
	g2d.drawRect(350,540,50,10);
	g2d.drawRect(400,540,50,10);
	g2d.drawRect(450,540,50,10);
	g2d.drawRect(500,540,50,10);

	//Jump LVl2
	g2d.drawRect(00,530,350,5);
	g2d.drawRect(350,530,50,10);
	g2d.drawRect(400,530,50,10);
	g2d.drawRect(450,520,50,10);
	g2d.drawRect(500,515,50,10);



	//Step Up Lvl3

	g2d.drawRect(332,470,350,5);
	g2d.drawRect(282,475,50,5);
	g2d.drawRect(232,480,50,5);
	g2d.drawRect(182,485,50,5);
	g2d.drawRect(132,490,50,5);



	//Step Down Lvl3

	g2d.drawRect(332,460,350,5);
	g2d.drawRect(282,460,50,5);
	g2d.drawRect(232,460,50,5);
	g2d.drawRect(182,460,50,5);
	g2d.drawRect(132,460,50,5);

	//Jump Lvl 3
	g2d.drawRect(332,450,350,5);
	g2d.drawRect(282,450,50,5);
	g2d.drawRect(232,450,50,5);
	g2d.drawRect(182,450,50,5);
	g2d.drawRect(132,450,50,5);


	//Step Up Lvl4

	g2d.drawRect(00,385,350,5);
	g2d.drawRect(350,387,50,5);
	g2d.drawRect(400,390,50,5);
	g2d.drawRect(450,393,50,5);
	g2d.drawRect(500,398,50,5);




	//Step Down Lvl4

	g2d.drawRect(00,375,350,5);
	g2d.drawRect(350,375,50,10);
	g2d.drawRect(400,375,50,10);
	g2d.drawRect(450,375,50,10);
	g2d.drawRect(500,375,50,10);

	//Jump Lvl 4
	g2d.drawRect(00,365,350,5);
	g2d.drawRect(350,365,50,10);
	g2d.drawRect(400,365,50,10);
	g2d.drawRect(450,365,50,10);
	g2d.drawRect(500,365,50,10);


	//Step Up Lvl5

	g2d.drawRect(332,290,350,5);
	g2d.drawRect(282,295,50,5);
	g2d.drawRect(232,300,50,5);
	g2d.drawRect(182,305,50,5);
	g2d.drawRect(132,310,50,5);


	//Step Down Lvl5

	g2d.drawRect(332,280,350,5);
	g2d.drawRect(282,280,50,5);
	g2d.drawRect(232,280,50,5);
	g2d.drawRect(182,280,50,5);
	g2d.drawRect(132,280,50,5);

	//Jump Lvl 5
	g2d.drawRect(332,270,350,5);
	g2d.drawRect(282,270,50,5);
	g2d.drawRect(232,270,50,5);
	g2d.drawRect(182,270,50,5);
	g2d.drawRect(132,270,50,5);


	//Step Up LVL6

	g2d.drawRect(00,200,350,5);
	g2d.drawRect(350,205,50,5);
	g2d.drawRect(400,210,50,5);
	g2d.drawRect(450,215,50,5);
	g2d.drawRect(500,220,50,5);



	//Step Down Lvl6

	g2d.drawRect(00,190,350,5);
	g2d.drawRect(350,190,50,5);
	g2d.drawRect(400,190,50,5);
	g2d.drawRect(450,190,50,5);
	g2d.drawRect(500,190,50,5);

	//Jump Lvl 6
	g2d.drawRect(00,180,350,5);
	g2d.drawRect(350,180,50,5);
	g2d.drawRect(400,180,50,5);
	g2d.drawRect(450,180,50,5);
	g2d.drawRect(500,180,50,5);


	//Step up Lvl 7

	g2d.drawRect(150,125,200,5);

	//Step Down Lvl 7
	g2d.drawRect(150,115,200,5);

	//Jump Lvl 7
	g2d.drawRect(150,105,200,5);

	//Hit Boxes End

*/


	//Drawing of Blocks
	//Level 1
	g2d.drawImage(block,0,632,null);
	g2d.drawImage(block,50,632,null);
	g2d.drawImage(block,100,632,null);
	g2d.drawImage(block,150,632,null);
	g2d.drawImage(block,200,632,null);
	g2d.drawImage(block,250,632,null);
	g2d.drawImage(block,300,632,null);
	g2d.drawImage(block,350,632,null);
	g2d.drawImage(block,400,632,null);
	g2d.drawImage(block,450,627,null);
	g2d.drawImage(block,500,622,null);
	g2d.drawImage(block,550,617,null);
	g2d.drawImage(block,600,612,null);
	g2d.drawImage(block,650,612,null);
	//End of Level 1

	//Level 2
	g2d.drawImage(block,0,550,null);
	g2d.drawImage(block,50,550,null);
	g2d.drawImage(block,100,550,null);
	g2d.drawImage(block,150,550,null);
	g2d.drawImage(block,200,550,null);
	g2d.drawImage(block,250,550,null);
	g2d.drawImage(block,300,550,null);
	g2d.drawImage(block,350,552,null);
	g2d.drawImage(block,400,555,null);
	g2d.drawImage(block,450,557,null);
	g2d.drawImage(block,500,562,null);
	//End of Level 2

	//Level 3
	g2d.drawImage(block,132,490,null);
	g2d.drawImage(block,182,485,null);
	g2d.drawImage(block,232,480,null);
	g2d.drawImage(block,282,475,null);
	g2d.drawImage(block,332,470,null);
	g2d.drawImage(block,382,470,null);
	g2d.drawImage(block,432,470,null);
	g2d.drawImage(block,482,470,null);
	g2d.drawImage(block,532,470,null);
	g2d.drawImage(block,582,470,null);
	g2d.drawImage(block,632,470,null);
	//End of Level 3

	//Level 4
	g2d.drawImage(block,00,385,null);
	g2d.drawImage(block,50,385,null);
	g2d.drawImage(block,100,385,null);
	g2d.drawImage(block,150,385,null);
	g2d.drawImage(block,200,385,null);
	g2d.drawImage(block,250,385,null);
	g2d.drawImage(block,300,385,null);
	g2d.drawImage(block,350,387,null);
	g2d.drawImage(block,400,390,null);
	g2d.drawImage(block,450,392,null);
	g2d.drawImage(block,500,397,null);
	//End of Level 4

	//Level 5
	g2d.drawImage(block,132,310,null);
	g2d.drawImage(block,182,305,null);
	g2d.drawImage(block,232,300,null);
	g2d.drawImage(block,282,295,null);
	g2d.drawImage(block,332,290,null);
	g2d.drawImage(block,382,290,null);
	g2d.drawImage(block,432,290,null);
	g2d.drawImage(block,482,290,null);
	g2d.drawImage(block,532,290,null);
	g2d.drawImage(block,582,290,null);
	g2d.drawImage(block,632,290,null);
	//End of Level 5

	//Level 6
	g2d.drawImage(block,00,200,null);
	g2d.drawImage(block,50,200,null);
	g2d.drawImage(block,100,200,null);
	g2d.drawImage(block,150,200,null);
	g2d.drawImage(block,200,200,null);
	g2d.drawImage(block,250,200,null);
	g2d.drawImage(block,300,200,null);
	g2d.drawImage(block,350,205,null);
	g2d.drawImage(block,400,210,null);
	g2d.drawImage(block,450,215,null);
	g2d.drawImage(block,500,220,null);
	//End of Level 6

	//Level 7
	g2d.drawImage(block,150,125,null);
	g2d.drawImage(block,200,125,null);
	g2d.drawImage(block,250,125,null);
	g2d.drawImage(block,300,125,null);
	//End of Level 7

}


public void StepUpDown(Rectangle marHitBox, Mario mario){


	//Step Up
	for(int i = 0; i < bricks.size(); i++){
		if(marHitBox.intersects(bricks.get(i)) && !mario.getClimb() && marHitBox.intersects(jump.get(i)) && !mario.getJump()){

			mario.setMarY((int)bricks.get(i).getY()-40);
			mario.setVeloY(0f);
			mario.setOnGround(true);

		}



	}
	//Step Down
	for(int i = 0; i < stepD.size(); i++){
		if(marHitBox.intersects(stepD.get(i)) && !mario.getClimb() && marHitBox.intersects(jump.get(i)) && !mario.getJump()){
			mario.setMarY((int)bricks.get(i).getY()-40);
			mario.setVeloY(0f);
			mario.setOnGround(true);

		}

	}













	}








}