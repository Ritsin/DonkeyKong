import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioInputStream;

public class Audio
{

private Clip clip;

    public static void main(String[] args)
    {

    }

   public void AudioStart(String location, boolean b, boolean c){

       try{
           File soundFile = new File(location);
		   AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( soundFile );
		   clip = AudioSystem.getClip();
		   clip.open(audioInputStream);

       }
       catch(IOException | LineUnavailableException | UnsupportedAudioFileException error){
           System.out.println(error);
       }

       if(b)
       clip.start();

       if(!b)
       clip.stop();

		if(c && b){
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		clip.start();
		}
		if(c && !b){
				clip.loop(Clip.LOOP_CONTINUOUSLY);
				clip.stop();
		}






}
}