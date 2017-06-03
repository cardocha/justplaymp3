package Main;

import Forms.frmMain;
import java.io.IOException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class main
{
  public main() {}
  
  public static void main(String[] args)
    throws UnsupportedAudioFileException, IOException
  {
    new frmMain().setVisible(true);
  }
}
