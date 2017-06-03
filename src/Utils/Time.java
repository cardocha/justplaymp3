package Utils;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javazoom.jl.player.Player;



public class Time
  extends Thread
{
  JLabel lbtempo;
  JLabel img;
  Player player;
  Long duration;
  JSlider slider;
  Boolean stopFlag;
  
  public Boolean getStopFlag()
  {
    return stopFlag;
  }
  
  public void setStopFlag(Boolean stopFlag) {
    this.stopFlag = stopFlag;
  }
  
  public Time(Boolean stopFlag) {
    this.stopFlag = stopFlag;
  }
  
  public Time()
  {
    stopFlag = Boolean.valueOf(true);
  }
  
  public Time(JLabel tempo, Player player, Long duration, JSlider slider, JLabel img)
  {
    lbtempo = tempo;
    this.player = player;
    this.duration = duration;
    this.slider = slider;
    stopFlag = Boolean.valueOf(false);
    this.img = img;
  }
  

  public void run()
  {
    SimpleDateFormat dt = new SimpleDateFormat("HH:mm:ss");
    Calendar cad = Calendar.getInstance();
    cad.clear();
    Date data = new Date(cad.getTime().getTime());
    

    Integer index = Integer.valueOf(2);
    slider.setMaximum(duration.intValue());
    while (!stopFlag.booleanValue())
    {
      System.out.println(stopFlag);
      cad.clear();
      Integer value = Integer.valueOf(player.getPosition() / 1000);
      cad.add(13, value.intValue());
      slider.setValue(value.intValue());
      data.setTime(cad.getTime().getTime());
      lbtempo.setText(dt.format(data));
      

      img.setIcon(new ImageIcon(getClass().getResource("/Icones/sp" + index + ".png")));
      Integer localInteger1 = index;Integer localInteger2 = index = Integer.valueOf(index.intValue() + 1);
      if (index.intValue() > 5) {
        index = Integer.valueOf(2);
      }
      
      try
      {
        Thread.sleep(200L);
      } catch (Exception ex) {} }
    System.out.println(stopFlag);
    slider.setValue(0);
    lbtempo.setText("00:00:00");
    img.setIcon(new ImageIcon(getClass().getResource("/Icones/sp1.png")));
  }
}
