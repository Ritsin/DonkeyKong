import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Font;
import javax.swing.*;
import java.awt.BorderLayout;
import java.util.concurrent.TimeUnit;




public class Game extends JPanel implements KeyListener {

	private JPanel panel;


	boolean gamerunning = true;
    BufferedImage image;
	Mario mario = new Mario();
	Ladder ladder = new Ladder(mario);
	BuildGame buildG = new BuildGame();
	DK dk = new DK(mario);
	Barrel bar = new Barrel(dk);
	Audio aud = new Audio();
	Audio aud2 = new Audio();

	Timer timer = new Timer();
	int roar = 0;

	BufferedImage Pauline;
	BufferedImage Star;

	boolean restart = false;
	boolean Win = false;
	boolean star = true;
	boolean norm = true;

	boolean playStar = false;
	boolean play = true;
	boolean first = true;


	ArrayList<EnemyBarrel> EnemyBarrels = new ArrayList<EnemyBarrel>();
	ArrayList<Rectangle> stepD = new ArrayList<Rectangle>();

	Rectangle PaulineRect = new Rectangle(150,85,20,40);

	boolean move = false;


    public Game() {

		Rectangle rect1 = new Rectangle(500,190,50,30);
		stepD.add(rect1);
		Rectangle rect2 = new Rectangle(450,190,50,25);
		stepD.add(rect2);
		Rectangle rect3 = new Rectangle(400,190,50,20);
		stepD.add(rect3);
		Rectangle rect4 = new Rectangle(350,190,50,20);
		stepD.add(rect4);


        setFocusable(true);

        JFrame frame = new JFrame("DK");
        frame.setSize(700, 700);
        frame.add(this);

        frame.setVisible(true);
		 panel = new JPanel();
        addKeyListener(this);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





        try {

            image = ImageIO.read(new File("D:\\_Mario\\Images\\Black.jpg"));

        } catch (Exception e) {
			System.out.println("d");
        }



		buildG.setUpArrays();


		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				dk.setThrow(true);
				//System.out.println(dk.getThrow());
				EnemyBarrel ba = new EnemyBarrel(bar);
				EnemyBarrels.add(ba);

			}
		}, 3000,3000);

		timer.scheduleAtFixedRate(new TimerTask() {
					public void run() {
					dk.setThrow(false);
						dk.resetAnim();
						//System.out.println(dk.getThrow());

					}
		},2000,2000);



		/*
		 panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0), "restart");
				panel.getActionMap().put("restart", new AbstractAction() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Restart();
					}
        });

		add(panel, BorderLayout.CENTER);
		*/



		RunGame();






		if(!gamerunning){
			Restart();
		}


    }


    public void paintComponent(Graphics g) {
		//System.out.println(gamerunning);
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(image, 0, 0, null);



		//g.drawRect(500,500,20,17);
		if(star)
		try{
		Star = ImageIO.read(new File("D:\\_Mario\\Images\\Star.png"));
		}catch(Exception e){
		System.out.println("Star image not found");
		}


		if(!star)
		try{
		Star = ImageIO.read(new File("D:\\_Mario\\Images\\Black.jpg"));
		}catch(Exception e){
		System.out.println("Black image not found");
		}

		g.drawImage(Star,500,500,null);

		try{
			Pauline = ImageIO.read(new File("D:\\_Mario\\Images\\Pauline_Sprite.png"));
			}catch(Exception e){
				System.out.println("Pauline image not found");
		}







		//g.drawRect(150,85,20,40);

		//for(int i = 0; i < EnemyBarrels.size(); i++){
		//g.drawRect((int)EnemyBarrels.get(i).getHitBox().getX(),(int)EnemyBarrels.get(i).getHitBox().getY(),(int)EnemyBarrels.get(i).getHitBox().getWidth(),(int)EnemyBarrels.get(i).getHitBox().getHeight());
		//}

		buildG.paint(g2d);
		dk.paint(g2d);
		ladder.paint(g2d);

		for(int i = 0; i < EnemyBarrels.size(); i++){
			EnemyBarrels.get(i).paint(g2d);
		}




		bar.paint(g2d);
		mario.paint(g2d);
		//g2d.drawRect((int)mario.getMarX(),(int)mario.getMarY(),30,40);
		g.drawImage(Pauline,150,80,null);


		if(Win){
			g.setColor(Color.WHITE);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
			g.drawString("You Win!", 100, 400);


		}




    }

	public void Restart(){
		//System.out.println("Restart()");
		CleanUp();
		Mario marioNew = new Mario();
		mario = marioNew;
		roar = 0;
		Barrel barNew = new Barrel(dk);
		bar = barNew;
		Ladder ladderNew = new Ladder(mario);
		ladder = ladderNew;
		dk.setNorm(true);
		star = true;
		first = true;
		playStar = false;
		norm = true;
		gamerunning = true;
		restart = true;
		Win = false;
		repaint();
		RunGame();

	}

	public void CleanUp(){
		EnemyBarrels.clear();
	}


    public void keyPressed(KeyEvent e) {


        mario.keyPressed(e);
    }

    public void keyReleased(KeyEvent e) {
        mario.keyReleased(e);
    }

    public void keyTyped(KeyEvent e) {
        //not used
    }


	public void RunGame(){

		while(gamerunning){

			if(play){
				aud2.AudioStart("Theme.wav",true,false);
				play = false;
			}




			if(!mario.getAlive()){
				mario.setDeath(true);
				mario.setDeath1(true);

				if(mario.getGG()){
					gamerunning = false;
				}

			}

			if(!gamerunning && restart)
				Restart();

			Rectangle marHitBox = new Rectangle ((int)mario.getMarX(),(int)mario.getMarY(),30,41);

			roar++;
			if(roar < 150){
			dk.roar();
			}else{
				if(roar == 150){
				move = true;
				dk.resetAnim();
				dk.setOilanim(true);
				}
				dk.dropOil();
				dk.setNorm(true);
			}

			if(dk.getOil()){
				bar.FireBarrel(marHitBox,mario);

			}


			if(move)
			mario.move();

			mario.Update();



			Rectangle Star = new Rectangle(500,500,20,17);
			if(Star.intersects(marHitBox)){
				star = false;
				norm = false;
				if(first){
					playStar = true;
					first = false;
				}

				timer.schedule(new TimerTask(){
					public void run(){
						if(!star && !norm){
						setNorm(true);
						System.out.println("asd");
						}

					}
				},7000);


			}



			if(playStar){
			aud.AudioStart("Inv.wav",true,false);
			playStar = false;
			}
			//System.out.println(star);
			//System.out.println("X: "+mario.getMarX());
			//System.out.println("Y: "+mario.getMarY());



			 int num = 0;



			for(int i = 0; i < EnemyBarrels.size(); i++){
				EnemyBarrels.get(i).InBounds();
				EnemyBarrels.get(i).move(mario);
				EnemyBarrels.get(i).GoDownLadder(EnemyBarrels.get(i).getHitBox());
				EnemyBarrels.get(i).HeightSet();

				if(norm){
				EnemyBarrels.get(i).HitMario(marHitBox,EnemyBarrels.get(i).getHitBox(),mario);
				}
			}



			if(marHitBox.intersects(PaulineRect)){
				Win = true;

				try{
				TimeUnit.SECONDS.sleep(2);
				}catch(Exception e){
					System.out.println("Time Error");
				}

				gamerunning = false;


			}



			buildG.StepUpDown(marHitBox, mario);
			ladder.checkIntersect(marHitBox);
			dk.chechHit(marHitBox);



			if(mario.getMarX() >= 650)
				mario.setMarX(650);

			if(mario.getMarX() <= 0)
				mario.setMarX(0);

			if(mario.getMarY() >= 650)
				mario.setMarY(650);

			if(mario.getMarY() <= 0)
				mario.setMarY(0);


			repaint();

			try {

				Thread.sleep(5);

			} catch (Exception e) {
			}

        }
	}


	public void setNorm(boolean b){
		norm = b;
	}






public static void main(String args[]){
	Game game = new Game();
}













}