package Forms;

import javax.swing.GroupLayout.SequentialGroup;

public class frmAbout extends javax.swing.JDialog {
  private javax.swing.JButton btOk;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  
  public frmAbout(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    setLocationRelativeTo(null);
  }
  







  private void initComponents()
  {
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    btOk = new javax.swing.JButton();
    
    setDefaultCloseOperation(2);
    setTitle("Just Play MP3! - Sobre");
    
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sobre", 0, 0, new java.awt.Font("Agency FB", 1, 14)));
    
    jLabel1.setFont(new java.awt.Font("Agency FB", 0, 14));
    jLabel1.setText("Versão");
    
    jLabel2.setFont(new java.awt.Font("Agency FB", 0, 14));
    jLabel2.setText("Desenvolvedor:");
    
    jLabel5.setText("Luciano Cardoso - lupearljam@gmail.com");
    
    jLabel6.setText("1.0");
    
    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/AppIcon.png")));
    
    jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18));
    jLabel9.setText("Just Play Mp3!");
    
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGap(144, 144, 144).addComponent(jLabel3)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel8, -2, 128, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5, -1, 234, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel6)).addComponent(jLabel9)).addGap(0, 0, 32767))))).addContainerGap()));
    























    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel9).addGap(9, 9, 9).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(jLabel6)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(jLabel5))).addComponent(jLabel8, -2, 111, -2)).addGap(38, 38, 38).addComponent(jLabel3).addContainerGap(-1, 32767)));
    


















    btOk.setText("Ok");
    btOk.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        frmAbout.this.btOkActionPerformed(evt);
      }
      
    });
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(213, 213, 213).addComponent(btOk)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -2, -1, -2))).addContainerGap(-1, 32767)));
    










    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -2, 134, -2).addGap(63, 63, 63).addComponent(btOk).addContainerGap(-1, 32767)));
    








    setBounds(0, 0, 498, 194);
  }
  
  private void btOkActionPerformed(java.awt.event.ActionEvent evt) {
    dispose();
  }
  






  public static void main(String[] args)
  {
    


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        frmAbout dialog = new frmAbout(new javax.swing.JFrame(), true);
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
