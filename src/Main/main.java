package Main;

import Forms.Principal;
import java.io.IOException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class main
{
  public main() {}
  
  public static void main(String[] args)
    throws UnsupportedAudioFileException, IOException
  {
    new Principal().setVisible(true);
  }
}
