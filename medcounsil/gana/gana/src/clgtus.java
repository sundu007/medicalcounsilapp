
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class clgtus extends javax.swing.JFrame {
    int avai,cnt=0,id=0;
    String com;

    public clgtus()
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("COLLEGE STATUS");
        jLabel1.setForeground(Color.blue);

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setText("COLLEGE NAME");
        jLabel2.setForeground(Color.magenta);

        jComboBox1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MADRAS MEDICAL COLLEGE,CHENNAI", "PRAKASH MEDICAL COLLEGE,CHENNAI", "TANJAVUR MEDICAL COLLEGE,TANJAVUR", "COIMBATORE MEDICAL COLLEGE,COIMBATORE", "RAMAKRISHNA MEDICAL COLLEGE,CHENNAI", "VINAYAKA MISSION MEDICAL COLLEGE,SALEM", "SARAWASTHI MEDICAL COLLEGE,SALEM", "SONA MEDICAL COLLEGE,SALEM", "NANDHA MEDICAL COLLEGE,ERODE", "VELLALAR MEDICAL COLLEGE,ERODE", "JKKN MEDICAL COLLEGE,ERODE", "SSN MEDICAL COLLEGE,CHENNAI" }));
        
        jButton1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton1.setText("submit");
        jButton1.setBackground(Color.green);
        jButton1.setForeground(Color.blue);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setText("COLLEGE NAME");
        jLabel3.setForeground(Color.magenta);

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setText("AVAILABILITY");
        jLabel5.setForeground(Color.magenta);

        jButton2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBackground(Color.green);
        jButton2.setForeground(Color.blue);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setText("COMMUNITY");
        jLabel7.setForeground(Color.magenta);

        jComboBox2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OC", "BC", "MBC", "SC/ST" }));
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(578, 578, 578)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(477, 477, 477)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(632, 632, 632)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(645, 645, 645)
                        .addComponent(jButton1)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(215, 215, 215))
        );

        pack();
    }// </editor-fold>                                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 System.out.println("hi");
         try
         {
            Connection conn=null;
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            conn=DriverManager.getConnection(url,"system","7890");
            Statement stmt = conn.createStatement();
            String cn= (String)jComboBox1.getSelectedItem();
           com=(String)jComboBox2.getSelectedItem();
           System.out.println(com);
           ResultSet rs=stmt.executeQuery("select "+com+",cid from college where collegename='"+cn+"'");
           jLabel4.setText(cn);
           jLabel4.setForeground(Color.blue);
           if(rs.next())
           {
               avai=rs.getInt(1);
               System.out.println("Available"+avai);
               id=rs.getInt(2);
               System.out.println("clg id:"+id);
           }
           rs=stmt.executeQuery("select count(cid) from status where cid = "+id+" and comm = '"+com+"'");
           if(rs.next())
           {
               cnt=rs.getInt(1);
//                avai=rs.getInt(1);
//                System.out.println(""+avai);     
           }
           avai -=cnt;
           jLabel6.setText(""+avai);
           jLabel6.setForeground(Color.blue);
            
            
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      new selsst().setVisible(true);
    }                                         
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(clgtus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clgtus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clgtus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clgtus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clgtus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration                   
}
