package Utils;

import Entidades.Musica;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class frmProgresso extends javax.swing.JDialog
{
  Integer capacidadeBarraProgresso;
  File[] musicas;
  ArrayList<Musica> modeloMusicas;
  private JProgressBar barraprogresso;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JPanel jPanel1;
  private JLabel lbAcao;
  
  public frmProgresso(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
    setLocationRelativeTo(null);
    modeloMusicas = new ArrayList();
    capacidadeBarraProgresso = Integer.valueOf(0);
  }
  
  public File[] getMusicas() {
    return musicas;
  }
  
  public void setMusicas(File[] musicas) {
    this.musicas = new File[musicas.length];
    this.musicas = musicas;
  }
  
  public ArrayList<Musica> getModeloMusicas() {
    return modeloMusicas;
  }
  
  public void setModeloMusicas(ArrayList<Musica> modeloMusicas) {
    this.modeloMusicas = modeloMusicas;
  }
  


  public void addMusicas()
  {
    try
    {
      barraprogresso.setMaximum(musicas.length);
      
      for (int i = 0; i < musicas.length; i++)
      {

        javax.sound.sampled.AudioFileFormat baseFileFormat = javax.sound.sampled.AudioSystem.getAudioFileFormat(musicas[i]);
        

        if ((baseFileFormat instanceof org.tritonus.share.sampled.file.TAudioFileFormat))
        {
          Musica musica = new Musica();
          
          Map properties = ((org.tritonus.share.sampled.file.TAudioFileFormat)baseFileFormat).properties();
          String key = "title";
          String val = (String)properties.get(key);
          lbAcao.setText("Adcionando " + val + ".mp3");
          musica.setNome(val);
          
          key = "author";
          val = (String)properties.get(key);
          musica.setAutor(val);
          
          key = "album";
          val = (String)properties.get(key);
          musica.setAlbum(val);
          
          key = "duration";
          Long valLong = (Long)properties.get(key);
          musica.setTempo(Long.valueOf(valLong.longValue() / 1000000L));
          
          musica.setPath(musicas[i].getAbsolutePath());
          
          modeloMusicas.add(musica);
          
          barraprogresso.setValue(i);
        }
        
      }
    }
    catch (Exception ex)
    {
      System.out.println(ex.getMessage());
    }
  }
  
  public Integer getCapacidadeBarraProgresso()
  {
    return capacidadeBarraProgresso;
  }
  
  public void setCapacidadeBarraProgresso(Integer capacidadeBarraProgresso) {
    this.capacidadeBarraProgresso = capacidadeBarraProgresso;
  }
  
  public JLabel getLbAcao() {
    return lbAcao;
  }
  
  public void setLbAcao(JLabel lbAcao) {
    this.lbAcao = lbAcao;
  }
  
  public void setValueProgresso(Integer valor) {
    barraprogresso.setValue(valor.intValue());
  }
  
  public void setMaximunValue(Integer valor)
  {
    barraprogresso.setMaximum(valor.intValue());
  }
  







  private void initComponents()
  {
    jPanel1 = new JPanel();
    barraprogresso = new JProgressBar();
    jLabel2 = new JLabel();
    lbAcao = new JLabel();
    jLabel1 = new JLabel();
    
    setDefaultCloseOperation(2);
    
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Progresso da ação", 0, 0, new java.awt.Font("Agency FB", 1, 14)));
    
    jLabel2.setFont(new java.awt.Font("Agency FB", 1, 14));
    jLabel2.setText("Ação:");
    
    lbAcao.setText("Ação");
    
    jLabel1.setFont(new java.awt.Font("Agency FB", 1, 14));
    jLabel1.setText("Carregando...");
    
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lbAcao)).addComponent(jLabel1).addComponent(barraprogresso, -2, 365, -2)).addContainerGap()));
    











    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(barraprogresso, -2, 22, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(lbAcao)).addGap(22, 22, 22)));
    












    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
    





    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -2, 108, 32767).addContainerGap()));
    






    setBounds(0, 0, 433, 168);
  }
  






  public static void main(String[] args)
  {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        frmProgresso dialog = new frmProgresso(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter()
        {
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }
}
