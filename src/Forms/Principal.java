package Forms;

import Entities.Music;
import TableModel.MusicModel;
import Utils.Time;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.TableColumn;
import javazoom.jl.player.Player;

public class Principal extends javax.swing.JFrame
{
  public Principal()
  {
    initComponents();
    setLocationRelativeTo(null);
    tbPlayListAtual.setModel(modeloMusicas);
    setLayoutTabela();
    lbTituloTocando.setText("Selecionado:");
    lbTocandoAgora.setText("Nenhum");
    lbAutor.setText("Nenhum");
    slider1.setValue(0);
    btstop.setEnabled(false);
    fc.setMultiSelectionEnabled(true);
    jcSalvaLista.setMultiSelectionEnabled(false);
    jcSalvaLista.setApproveButtonText("Salvar");
    if (tbPlayListAtual.getRowCount() > 0)
    {
      btSalvaListaAtual.setEnabled(true);
      btExcluiListaAtual.setEnabled(true);
      btMistura.setEnabled(true);
    }
    else
    {
      btSalvaListaAtual.setEnabled(false);
      btExcluiListaAtual.setEnabled(false);
      btMistura.setEnabled(false);
    }
    setIconImage(new ImageIcon(getClass().getResource("/Icones/AppIcon.png")).getImage());
  }
  






  public void StopMusica() {}
  






  private void initComponents()
  {
    jPanel1 = new JPanel();
    btAddmusica = new JButton();
    btRemoveMusica = new JButton();
    btMistura = new JButton();
    jPanel2 = new JPanel();
    btplay = new JButton();
    btstop = new JButton();
    jPanel5 = new JPanel();
    lbTituloTocando = new JLabel();
    lbTocandoAgora = new JLabel();
    slider1 = new JSlider();
    lbtempoDecorrido = new JLabel();
    lbAnime = new JLabel();
    lbtituloAutor = new JLabel();
    lbAutor = new JLabel();
    pnPrograma = new JPanel();
    jButton2 = new JButton();
    jButton3 = new JButton();
    btAnteriorMusica = new JButton();
    btProximaMusica = new JButton();
    jPanel4 = new JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbPlayListAtual = new JTable();
    jPanel3 = new JPanel();
    btSalvaListaAtual = new JButton();
    btImportaListaAtual = new JButton();
    btExcluiListaAtual = new JButton();
    
    setDefaultCloseOperation(3);
    setTitle("Just Play MP3!");
    
    jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Opções - Musicas", 0, 0, new Font("Agency FB", 1, 14)));
    jPanel1.setToolTipText("Opções Musicas");
    jPanel1.setLayout(new java.awt.GridLayout(1, 0));
    
    btAddmusica.setFont(new Font("Agency FB", 1, 14));
    btAddmusica.setIcon(new ImageIcon(getClass().getResource("/Icones/AddMusica.png")));
    btAddmusica.setText("Adcionar");
    btAddmusica.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.btAddmusicaActionPerformed(evt);
      }
    });
    jPanel1.add(btAddmusica);
    
    btRemoveMusica.setFont(new Font("Agency FB", 1, 14));
    btRemoveMusica.setIcon(new ImageIcon(getClass().getResource("/Icones/removeMusica.png")));
    btRemoveMusica.setText("Remover");
    btRemoveMusica.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.btRemoveMusicaActionPerformed(evt);
      }
    });
    jPanel1.add(btRemoveMusica);
    
    btMistura.setFont(new Font("Agency FB", 1, 14));
    btMistura.setIcon(new ImageIcon(getClass().getResource("/Icones/misturar.png")));
    btMistura.setText("Misturar");
    btMistura.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.btMisturaActionPerformed(evt);
      }
    });
    jPanel1.add(btMistura);
    
    jPanel2.setBorder(BorderFactory.createTitledBorder(null, "Player", 0, 0, new Font("Agency FB", 1, 14)));
    jPanel2.setToolTipText("Tocando agora");
    
    btplay.setFont(new Font("Agency FB", 1, 14));
    btplay.setIcon(new ImageIcon(getClass().getResource("/Icones/play.png")));
    btplay.setText("Play");
    btplay.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.btplayActionPerformed(evt);
      }
      
    });
    btstop.setFont(new Font("Agency FB", 1, 14));
    btstop.setIcon(new ImageIcon(getClass().getResource("/Icones/stop.png")));
    btstop.setText("Stop");
    btstop.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.btstopActionPerformed(evt);
      }
      
    });
    jPanel5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
    jPanel5.setBorder(BorderFactory.createEtchedBorder());
    
    lbTituloTocando.setFont(new Font("Agency FB", 1, 14));
    lbTituloTocando.setText("Tocando:");
    
    lbTocandoAgora.setFont(new Font("Agency FB", 1, 14));
    lbTocandoAgora.setText("jLabel2");
    
    slider1.setBackground(new java.awt.Color(255, 255, 255));
    
    lbtempoDecorrido.setText("00:00:00");
    
    lbAnime.setIcon(new ImageIcon(getClass().getResource("/Icones/sp1.png")));
    
    lbtituloAutor.setFont(new Font("Agency FB", 1, 14));
    lbtituloAutor.setText("Autor:");
    
    lbAutor.setFont(new Font("Agency FB", 1, 14));
    lbAutor.setText("jLabel2");
    
    GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addComponent(slider1, -2, 0, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(lbtempoDecorrido, -2, 54, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(lbAnime, -2, 40, -2).addGap(25, 25, 25)).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup().addComponent(lbtituloAutor).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(lbAutor, -1, -1, 32767)).addGroup(GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup().addComponent(lbTituloTocando).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(lbTocandoAgora, -2, 182, -2))).addContainerGap(-1, 32767)))));
    






















    jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lbTocandoAgora).addComponent(lbTituloTocando)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lbAutor).addComponent(lbtituloAutor)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, 32767).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(slider1, GroupLayout.Alignment.TRAILING, -2, 34, -2).addComponent(lbAnime, GroupLayout.Alignment.TRAILING, -2, 43, -2).addComponent(lbtempoDecorrido, GroupLayout.Alignment.TRAILING, -2, 34, -2))));
    
















    pnPrograma.setBorder(BorderFactory.createTitledBorder(null, "Sobre", 0, 0, new Font("Agency FB", 1, 14)));
    
    jButton2.setIcon(new ImageIcon(getClass().getResource("/Icones/Sobre.png")));
    jButton2.setToolTipText("Sobre o programa");
    jButton2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.jButton2ActionPerformed(evt);
      }
      
    });
    jButton3.setIcon(new ImageIcon(getClass().getResource("/Icones/bug.png")));
    jButton3.setToolTipText("Informe um bug");
    jButton3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.jButton3ActionPerformed(evt);
      }
      
    });
    GroupLayout pnProgramaLayout = new GroupLayout(pnPrograma);
    pnPrograma.setLayout(pnProgramaLayout);
    pnProgramaLayout.setHorizontalGroup(pnProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jButton2, -2, 35, -2).addComponent(jButton3, -2, 0, 32767));
    



    pnProgramaLayout.setVerticalGroup(pnProgramaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnProgramaLayout.createSequentialGroup().addComponent(jButton2).addGap(31, 31, 31).addComponent(jButton3, -1, -1, 32767)));
    






    btAnteriorMusica.setIcon(new ImageIcon(getClass().getResource("/Icones/anterior.png")));
    btAnteriorMusica.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.btAnteriorMusicaActionPerformed(evt);
      }
      
    });
    btProximaMusica.setIcon(new ImageIcon(getClass().getResource("/Icones/proxima.png")));
    btProximaMusica.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.btProximaMusicaActionPerformed(evt);
      }
      
    });
    GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(btAnteriorMusica, -2, 0, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btProximaMusica, -2, 43, -2)).addComponent(btplay, -1, 100, 32767).addComponent(btstop, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel5, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(pnPrograma, -2, -1, -2)));
    













    jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(pnPrograma, -2, 117, -2).addGroup(jPanel2Layout.createSequentialGroup().addComponent(btplay, -2, 36, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(btstop, -2, 34, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(btAnteriorMusica, -2, 24, 32767).addComponent(btProximaMusica, -2, 0, 32767)))).addGap(0, 0, 32767)).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jPanel5, -2, -1, -2).addContainerGap(-1, 32767)));
    


















    jPanel4.setBorder(BorderFactory.createTitledBorder(null, "Musicas", 0, 0, new Font("Agency FB", 1, 14)));
    
    tbPlayListAtual.setAutoCreateRowSorter(true);
    tbPlayListAtual.setBorder(BorderFactory.createEtchedBorder());
    tbPlayListAtual.setFont(new Font("Century Gothic", 1, 10));
    tbPlayListAtual.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
    









    tbPlayListAtual.setAutoResizeMode(4);
    tbPlayListAtual.setSelectionMode(0);
    tbPlayListAtual.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent evt) {
        Principal.this.tbPlayListAtualMouseClicked(evt);
      }
      
      public void mouseEntered(MouseEvent evt) { Principal.this.tbPlayListAtualMouseEntered(evt);
      }
    });
    jScrollPane1.setViewportView(tbPlayListAtual);
    
    jPanel3.setBorder(BorderFactory.createTitledBorder(null, "Opções Listas", 0, 0, new Font("Agency FB", 1, 14)));
    jPanel3.setLayout(new java.awt.GridLayout(1, 0));
    
    btSalvaListaAtual.setFont(new Font("Agency FB", 1, 14));
    btSalvaListaAtual.setIcon(new ImageIcon(getClass().getResource("/Icones/addLista.png")));
    btSalvaListaAtual.setText("Salvar lista");
    btSalvaListaAtual.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.btSalvaListaAtualActionPerformed(evt);
      }
    });
    jPanel3.add(btSalvaListaAtual);
    
    btImportaListaAtual.setFont(new Font("Agency FB", 1, 14));
    btImportaListaAtual.setIcon(new ImageIcon(getClass().getResource("/Icones/importarLista.png")));
    btImportaListaAtual.setText("Importar lista");
    btImportaListaAtual.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.btImportaListaAtualActionPerformed(evt);
      }
    });
    jPanel3.add(btImportaListaAtual);
    
    btExcluiListaAtual.setFont(new Font("Agency FB", 1, 14));
    btExcluiListaAtual.setIcon(new ImageIcon(getClass().getResource("/Icones/LimparLista.png")));
    btExcluiListaAtual.setText("Limpar lista");
    btExcluiListaAtual.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Principal.this.btExcluiListaAtualActionPerformed(evt);
      }
    });
    jPanel3.add(btExcluiListaAtual);
    
    GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, -2, 0, 32767).addComponent(jPanel3, -1, 425, 32767));
    



    jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jScrollPane1, -1, 172, 32767).addGap(18, 18, 18).addComponent(jPanel3, -2, 64, -2).addGap(7, 7, 7)));
    







    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(jPanel4, -1, -1, 32767).addComponent(jPanel2, -1, -1, 32767)).addContainerGap()));
    








    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jPanel2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel4, -1, -1, 32767).addGap(16, 16, 16)));
    









    pack();
  }
  

  public void setLayoutTabela()
  {
    tbPlayListAtual.getColumnModel().getColumn(0).setPreferredWidth(150);
    tbPlayListAtual.getColumnModel().getColumn(1).setPreferredWidth(100);
    tbPlayListAtual.getColumnModel().getColumn(2).setPreferredWidth(70);
    tbPlayListAtual.setRowSorter(null);
  }
  

  private void btAddmusicaActionPerformed(ActionEvent evt)
  {
    if (fc.showOpenDialog(jPanel1) == 0) {
      try
      {
        File[] files = fc.getSelectedFiles();
        
        for (int i = 0; i < files.length; i++)
        {

          javax.sound.sampled.AudioFileFormat baseFileFormat = javax.sound.sampled.AudioSystem.getAudioFileFormat(files[i]);
          

          if ((baseFileFormat instanceof org.tritonus.share.sampled.file.TAudioFileFormat))
          {
            Music musica = new Music();
            
            Map properties = ((org.tritonus.share.sampled.file.TAudioFileFormat)baseFileFormat).properties();
            String key = "title";
            String val = (String)properties.get(key);
            
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
            
            musica.setPath(files[i].getAbsolutePath());
            
            modeloMusicas.addMusica(musica);
          }
          
        }
        

      }
      catch (Exception ex)
      {
        System.out.println(ex.getMessage());
      }
    }
    

    if (tbPlayListAtual.getRowCount() > 0)
    {
      btSalvaListaAtual.setEnabled(true);
      btExcluiListaAtual.setEnabled(true);
      btMistura.setEnabled(true);

    }
    else
    {
      btMistura.setEnabled(false);
      btSalvaListaAtual.setEnabled(false);
      btExcluiListaAtual.setEnabled(false);
    }
  }
  
  private void btRemoveMusicaActionPerformed(ActionEvent evt) {
    Integer linha = Integer.valueOf(tbPlayListAtual.getSelectedRow());
    if (linha.intValue() > -1)
    {

      if ((lbTocandoAgora.getText().equals(modeloMusicas.getMusica(linha.intValue()).getNome().toString())) && (lbTituloTocando.getText().equals("Tocando:")))
      {


        stop = Boolean.valueOf(true);
        tempo.setStopFlag(Boolean.valueOf(true));
        btstop.setEnabled(false);
        player.close();
        btplay.setEnabled(true);
        btMistura.setEnabled(true);
        
        lbTituloTocando.setText("Selecionado:");
        lbAutor.setText("Nenhum");
        lbTocandoAgora.setText("Nenhum");
      }
      


      modeloMusicas.removeMusica(linha.intValue());
      
      if (tbPlayListAtual.getRowCount() > 0)
      {
        btSalvaListaAtual.setEnabled(true);
        btExcluiListaAtual.setEnabled(true);
        btMistura.setEnabled(true);
      }
      else
      {
        btMistura.setEnabled(false);
        btSalvaListaAtual.setEnabled(false);
        btExcluiListaAtual.setEnabled(false);
      }
    }
  }
  


  private void btMisturaActionPerformed(ActionEvent evt)
  {
    modeloMusicas.mistura();
    if (tbPlayListAtual.getSelectedRow() > -1)
    {
      lbTituloTocando.setText("Selecionado:");
      lbAutor.setText(modeloMusicas.getMusica(tbPlayListAtual.getSelectedRow()).getAutor());
      lbTocandoAgora.setText(modeloMusicas.getMusica(tbPlayListAtual.getSelectedRow()).getNome());
    }
  }
  

  private void tbPlayListAtualMouseEntered(MouseEvent evt) {}
  

  private void tbPlayListAtualMouseClicked(MouseEvent evt)
  {
    Integer linha = Integer.valueOf(tbPlayListAtual.getSelectedRow());
    if (linha.intValue() > -1)
    {
      if (tempo.getStopFlag().booleanValue() == true)
      {
        lbTocandoAgora.setText(modeloMusicas.getMusica(linha.intValue()).getNome());
        lbAutor.setText(modeloMusicas.getMusica(linha.intValue()).getAutor());
      }
    }
    if (evt.getClickCount() == 2)
    {
      if (!lbTituloTocando.getText().equals("Tocando:")) {
        btplayActionPerformed(null);
      }
      else {
        stop = Boolean.valueOf(true);
        tempo.setStopFlag(stop);
        player.close();
        btplayActionPerformed(null);
      }
    }
  }
  
  private void btSalvaListaAtualActionPerformed(ActionEvent evt)
  {
    Music musica = new Music();
    if (jcSalvaLista.showOpenDialog(jPanel1) == 0)
    {
      musica.serializaListaMusicas(modeloMusicas.getAsArrayList(), jcSalvaLista.getSelectedFile().getAbsolutePath() + ".dat");
    }
  }
  

  private void btExcluiListaAtualActionPerformed(ActionEvent evt)
  {
    if (tbPlayListAtual.getRowCount() > 0)
    {

      if (lbTituloTocando.getText().equals("Tocando:"))
      {

        if (javax.swing.JOptionPane.showConfirmDialog(null, "A lista esta em execução\nDeseja interrompe- la?", "Confirmação", 0, 2, new ImageIcon(getClass().getResource("/Icones/dadoerro.png"))) == 0)
        {



          stop = Boolean.valueOf(true);
          tempo.setStopFlag(Boolean.valueOf(true));
          btstop.setEnabled(false);
          player.close();
          btplay.setEnabled(true);
          
          lbTituloTocando.setText("Selecionado:");
          lbAutor.setText("Nenhum");
          lbTocandoAgora.setText("Nenhum");
          modeloMusicas.limpar();
          btMistura.setEnabled(false);
          btSalvaListaAtual.setEnabled(false);
          btExcluiListaAtual.setEnabled(false);
        }
      }
      else {
        modeloMusicas.limpar();
        lbTituloTocando.setText("Selecionado:");
        lbAutor.setText("Nenhum");
        lbTocandoAgora.setText("Nenhum");
        btMistura.setEnabled(false);
        btSalvaListaAtual.setEnabled(false);
        btExcluiListaAtual.setEnabled(false);
      }
    }
  }
  



  private void btImportaListaAtualActionPerformed(ActionEvent evt)
  {
    Music musica = new Music();
    
    if (jcImportaLista.showOpenDialog(jPanel1) == 0)
    {
      java.util.ArrayList<Music> musicas = musica.deserializaListaMusicas(jcImportaLista.getSelectedFile().getAbsolutePath());
      if (lbTituloTocando.getText().equals("Tocando:"))
      {

        if (javax.swing.JOptionPane.showConfirmDialog(null, "A lista esta em execução\nDeseja interrompe- la?", "Confirmação", 0, 2, new ImageIcon(getClass().getResource("/Icones/dadoerro.png"))) == 0)
        {



          stop = Boolean.valueOf(true);
          player.close();
          
          modeloMusicas = new MusicModel(musicas);
          tbPlayListAtual.setModel(modeloMusicas);
          lbTituloTocando.setText("Selecionado:");
          lbTocandoAgora.setText("Nenhum");
          lbAutor.setText("Nenhum");
          btplay.setEnabled(true);
          btstop.setEnabled(false);
          btMistura.setEnabled(true);
          btSalvaListaAtual.setEnabled(true);
          btExcluiListaAtual.setEnabled(true);
          setLayoutTabela();
        }
      }
      else
      {
        modeloMusicas = new MusicModel(musicas);
        tbPlayListAtual.setModel(modeloMusicas);
        lbTituloTocando.setText("Selecionado:");
        lbTocandoAgora.setText("Nenhum");
        lbAutor.setText("Nenhum");
        btplay.setEnabled(true);
        btstop.setEnabled(false);
        setLayoutTabela();
      }
    }
  }
  

  private void btProximaMusicaActionPerformed(ActionEvent evt)
  {
    if (tbPlayListAtual.getRowCount() > 0)
    {
      if (lbTituloTocando.getText().equals("Tocando:"))
      {
        if (line.intValue() < tbPlayListAtual.getRowCount() - 1)
          player.close();
        btplay.setEnabled(false);
        btstop.setEnabled(true);
      }
    }
  }
  
  private void btAnteriorMusicaActionPerformed(ActionEvent evt) {
    if (tbPlayListAtual.getRowCount() > 0)
    {
      if (lbTituloTocando.getText().equals("Tocando:"))
      {
        if (line.intValue() > 0)
        {
          Integer localInteger1 = line;Integer localInteger2 = this.line = Integer.valueOf(line.intValue() - 1);
          volta = Boolean.valueOf(true);
          player.close();
          btplay.setEnabled(false);
          btstop.setEnabled(true);
        }
      }
    }
  }
  
  private void jButton3ActionPerformed(ActionEvent evt) {
    new frmBugReport(this, rootPaneCheckingEnabled).setVisible(true);
  }
  
  private void jButton2ActionPerformed(ActionEvent evt) {
    new frmAbout(this, rootPaneCheckingEnabled).setVisible(true);
  }
  
  private void btstopActionPerformed(ActionEvent evt) {
    if (tbPlayListAtual.getSelectedRow() == -1)
    {
      lbTocandoAgora.setText("Nenhum");
      lbAutor.setText("Nenhum");
    }
    else
    {
      lbAutor.setText(modeloMusicas.getValueAt(tbPlayListAtual.getSelectedRow(), 1).toString());
      lbTocandoAgora.setText(modeloMusicas.getValueAt(tbPlayListAtual.getSelectedRow(), 0).toString());
    }
    stop = Boolean.valueOf(true);
    tempo.setStopFlag(stop);
    player.close();
    btplay.setEnabled(true);
    btstop.setEnabled(false);
    btMistura.setEnabled(true);
    lbTituloTocando.setText("Selecionado:");
  }
  
  private void btplayActionPerformed(ActionEvent evt)
  {
    final Integer linha = Integer.valueOf(tbPlayListAtual.getSelectedRow());
    if (linha.intValue() > -1)
    {

      new Thread()
      {
        public void run()
        {
          line = linha;
          stop = Boolean.valueOf(false);
          while ((!stop.booleanValue()) && (line.intValue() < modeloMusicas.getRowCount())) {
            try
            {
              player = new Player(new java.io.FileInputStream(new File(modeloMusicas.getMusica(line.intValue()).getPath())));
              
              lbtempoDecorrido.setText(String.valueOf(player.getPosition()));
              tempo = new Time(lbtempoDecorrido, player, modeloMusicas.getMusica(line.intValue()).getTempo(), slider1, lbAnime);
              
              tempo.start();
              tbPlayListAtual.setRowSelectionInterval(line.intValue(), line.intValue());
              lbTituloTocando.setText("Tocando:");
              lbAutor.setText(modeloMusicas.getMusica(line.intValue()).getAutor());
              lbTocandoAgora.setText(modeloMusicas.getMusica(line.intValue()).getNome());
              
              player.play();
              player.close();
              tempo.setStopFlag(Boolean.valueOf(true));
              Integer localInteger1;
              if (volta.booleanValue()) {
                volta = Boolean.valueOf(false);
              } else {
                localInteger1 = line;Integer localInteger2 = Principal.this.line = Integer.valueOf(line.intValue() + 1);
              }
              if (line.intValue() == modeloMusicas.getRowCount())
              {
                Integer linhaSelecionada = Integer.valueOf(tbPlayListAtual.getSelectedRow());
                if (linhaSelecionada.intValue() > -1)
                {
                  lbTituloTocando.setText("Selecionado:");
                  lbAutor.setText(modeloMusicas.getMusica(tbPlayListAtual.getSelectedRow()).getAutor());
                  lbTocandoAgora.setText(modeloMusicas.getMusica(tbPlayListAtual.getSelectedRow()).getNome());
                }
                else
                {
                  lbTituloTocando.setText("Selecionado:");
                  lbAutor.setText("Nenhum");
                  lbTocandoAgora.setText("Nenhum");
                }
                
              }
            }
            catch (Exception ex)
            {
              System.out.println(ex.getMessage());
            }
          }
        }
      }.start();
      btMistura.setEnabled(false);
      btplay.setEnabled(false);
      btstop.setEnabled(true);
    }
  }
  
  MusicModel modeloMusicas = new MusicModel();
  JFileChooser fc = new JFileChooser();
  JFileChooser jcSalvaLista = new JFileChooser();
  JFileChooser jcImportaLista = new JFileChooser();
  Player player;
  Boolean volta = Boolean.valueOf(false);
  Boolean stop = Boolean.valueOf(false);
  Time tempo = new Time();
  
  Integer line;
  
  javax.sound.sampled.FloatControl volCtrl;
  private JButton btAddmusica;
  private JButton btAnteriorMusica;
  private JButton btExcluiListaAtual;
  private JButton btImportaListaAtual;
  private JButton btMistura;
  
  public static void main(String[] args)
  {
 
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Principal().setVisible(true);
      }
    });
  }
  
  private JButton btProximaMusica;
  private JButton btRemoveMusica;
  private JButton btSalvaListaAtual;
  private JButton btplay;
  private JButton btstop;
  private JButton jButton2;
  private JButton jButton3;
  private JPanel jPanel1;
  private JPanel jPanel2;
  private JPanel jPanel3;
  private JPanel jPanel4;
  private JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private JLabel lbAnime;
  private JLabel lbAutor;
  private JLabel lbTituloTocando;
  private JLabel lbTocandoAgora;
  private JLabel lbtempoDecorrido;
  private JLabel lbtituloAutor;
  private JPanel pnPrograma;
  private JSlider slider1;
  private JTable tbPlayListAtual;
}
