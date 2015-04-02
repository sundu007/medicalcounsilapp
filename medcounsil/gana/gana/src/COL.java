
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muthuviji
 */
public class COL extends javax.swing.JFrame {
static int rank;
int avai,cnt=0,id=0;
String com;
    /**
     * Creates new form COL
     */
    public COL(int nm) throws SQLException, ClassNotFoundException {
                rank = nm;

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() throws SQLException, ClassNotFoundException {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JLabel();
        //jTextField1.disable();
        jTextField2 = new javax.swing.JLabel();
        //jTextField2.disable();
        jTextField3 = new javax.swing.JLabel();
        //jTextField3.disable();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1365, 770));

        jLabel1.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 36)); // NOI18N
        jLabel1.setText("COLLEGE SELECTION\n");
        jLabel1.setForeground(Color.blue);

        jLabel2.setText("NAME");
        jLabel2.setForeground(Color.magenta);

        jLabel3.setText("COMMUNITY");
        jLabel3.setForeground(Color.magenta);

        jLabel4.setText("RANK");
        jLabel4.setForeground(Color.magenta);
        
        try
         {
          
            Connection conn=null;
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            conn=DriverManager.getConnection(url,"system","7890");
            Statement stmt = conn.createStatement();
           // int rank= Integer.parseInt(jTextField1.getText());
            ResultSet rs=stmt.executeQuery("select name,comm,rank from gana where rank="+rank);
            if(rs.next())
            {
             jTextField1.setText(rs.getString(1));
             jTextField1.setForeground(Color.blue);
             com=rs.getString(2);
             jTextField2.setText(rs.getString(2));
             jTextField2.setForeground(Color.blue);
             jTextField3.setText(rs.getString(3));
             jTextField3.setForeground(Color.blue);
            }
            
         }    
    catch(SQLException se)
        {
            JOptionPane.showMessageDialog(null,se);
            System.out.println(se);
        }
    catch (Exception e)
        {
            System.out.println(""+e);
         }

       
        jLabel5.setText("COLLEGE NAME");
        jLabel5.setForeground(Color.magenta);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MADRAS MEDICAL COLLEGE,CHENNAI", "PRAKASH MEDICAL COLLEGE,CHENNAI", "TANJAVUR MEDICAL COLLEGE,TANJAVUR", "COIMBATORE MEDICAL COLLEGE,COIMBATORE", "RAMAKRISHNA MEDICAL COLLEGE,CHENNAI", "VINAYAKA MISSION MEDICAL COLLEGE,SALEM", "SARAWASTHI MEDICAL COLLEGE,SALEM", "SONA MEDICAL COLLEGE,SALEM", "NANDHA MEDICAL COLLEGE,ERODE", "VELLALAR MEDICAL COLLEGE,ERODE", "JKKN MEDICAL COLLEGE,ERODE", "SSN MEDICAL COLLEGE,CHENNAI" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("CHECK AVAILABILITY");
        jButton1.setBackground(Color.green);
        jButton1.setForeground(Color.blue);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 36)); // NOI18N
        jLabel6.setText("AVAILABILITY");
        jLabel6.setForeground(Color.blue);
        jLabel6.setToolTipText("");

        jLabel7.setText("COLLEGE NAME");
        jLabel7.setForeground(Color.magenta);

      

        jLabel8.setText("AVAILABILITY");
        jLabel8.setForeground(Color.magenta);

        

        jButton2.setText("CONFIRM");
        jButton2.setBackground(Color.green);
        jButton2.setForeground(Color.blue);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(COL.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(COL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jButton3.setText("BACK");
        jButton3.setBackground(Color.green);
        jButton3.setForeground(Color.blue);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(519, 519, 519)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addGap(64, 64, 64)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(112, 112, 112))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {                                         
     try
         {
          
            Connection conn=null;
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            conn=DriverManager.getConnection(url,"system","7890");
            Statement stmt = conn.createStatement();
            try
            {
//                int n=jComboBox1.getSelectedIndex();
            String cn= (String)jComboBox1.getSelectedItem();
            
           ResultSet rs=stmt.executeQuery("select "+com+",cid from college where collegename='"+cn+"'");
           jTextField4.setText(cn);
           jTextField4.setForeground(Color.blue);
           if(rs.next())
           {
               avai=rs.getInt(1);
               
               id=rs.getInt(2);
               
           }
           else
           {
                System.out.println("Available");
           }
           rs=stmt.executeQuery("select count(cid) from status where cid = "+id+" and comm = '"+com+"'");
           if(rs.next())
           {
               cnt=rs.getInt(1);
//                avai=rs.getInt(1);
//                System.out.println(""+avai);
               avai -=cnt;
           }
           
           jTextField5.setText(""+avai);
               jTextField5.setForeground(Color.blue);
            }
            catch (SQLException e) 
            {
           System.out.println(e);    
            }
            
  }
catch(SQLException se)
{
    JOptionPane.showMessageDialog(null,se);
    System.out.println(se);
}
catch (Exception e)
{
    System.out.println(""+e);
}

    }                                        

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException 
    {
      try
         {
          int id = 0,i=0;
            Connection conn=null;
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            conn=DriverManager.getConnection(url,"system","7890");
            Statement stmt = conn.createStatement();
             String cn= (String)jComboBox1.getSelectedItem();
               ResultSet rs=stmt.executeQuery("select cid from college where collegename='"+cn+"'");
              if(rs.next())
              {
                  id=Integer.parseInt(rs.getString(1));
              }
             int r= Integer.parseInt(jTextField3.getText());
          try
          {
              if(avai==0)
              {
                   JOptionPane.showMessageDialog(null,"*****SORRY THERE IS NO AVAILABILITY OF SEAT**********");
                  
              }
              else
              {
              String sql="insert into status values("+id+","+r+",'"+com+"')";
              stmt.executeUpdate(sql);
              //System.out.println(avai);
             // String sq="update college set availability=availability-1 where cid="+id;
              //stmt.executeUpdate(sq);
              JOptionPane.showMessageDialog(null,"**********CONGURALATION YOU HAVE SUCESSFULLY TAKEN SEAT **********");
              new coun().setVisible(true);
          } 
          }
           catch(SQLException se)
            {
               JOptionPane.showMessageDialog(null,"***********YOU ALREADY TAKEN SEAT **********"); 
          new coun().setVisible(true);
            }     
          
    }
     
       catch (Exception e) 
            {
           System.out.println(e);    
            }
    }

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new coun().setVisible(true);
        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(COL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new COL(rank).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(COL.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(COL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jTextField1,jTextField2, jTextField3,jTextField4,jTextField5;
    
    // End of variables declaration                   
}

