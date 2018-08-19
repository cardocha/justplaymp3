package Forms;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JLabel;

public class frmBugReport extends javax.swing.JDialog
{
  private JButton jButton1;
  private JButton jButton2;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField tbEmail;
  private javax.swing.JTextArea textBug;
  
  public frmBugReport(java.awt.Frame parent, boolean modal)
  {
    super(parent, modal);
    initComponents();
    setLocationRelativeTo(null);
    jLabel3.setText("");
    jLabel3.setVisible(false);
  }
  







  private void initComponents()
  {
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    textBug = new javax.swing.JTextArea();
    jButton1 = new JButton();
    jButton2 = new JButton();
    jLabel1 = new JLabel();
    tbEmail = new javax.swing.JTextField();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    
    setDefaultCloseOperation(2);
    setTitle("Just Play MP3! - Informe um bug");
    
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "O que aconteceu ?", 0, 0, new java.awt.Font("Agency FB", 1, 14)));
    
    textBug.setColumns(20);
    textBug.setRows(5);
    jScrollPane1.setViewportView(textBug);
    
    jButton1.setText("Enviar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        frmBugReport.this.jButton1ActionPerformed(evt);
      }
      
    });
    jButton2.setText("Cancela");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        frmBugReport.this.jButton2ActionPerformed(evt);
      }
      
    });
    jLabel1.setText("Seu email");
    
    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10));
    
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, -1, 360, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(tbEmail)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(40, 40, 40).addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)).addComponent(jLabel3, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton2).addGap(4, 4, 4).addComponent(jButton1))).addContainerGap()));
    





















    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, -2, 76, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(tbEmail, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1).addComponent(jButton2)).addComponent(jLabel2)).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(jLabel3, -1, -1, 32767)))));
    





















    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -1, -1, 32767).addContainerGap()));
    





    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -2, -1, -2).addContainerGap(21, 32767)));
    






    setBounds(0, 0, 428, 238);
  }
  
  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    dispose();
  }
  
  
  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
  {
      // Will be removed in the future
  }
  





  public static void main(String[] args)
  {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        frmBugReport dialog = new frmBugReport(new javax.swing.JFrame(), true);
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
