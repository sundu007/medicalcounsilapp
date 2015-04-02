
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class coun extends javax.swing.JFrame
{
    int rank = 0;
    public coun() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")                       
    private void initComponents() 
    {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(210, 8, 156));
        setBounds(new java.awt.Rectangle(0, 0, 1365, 770));
        setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 9, 191));
        jLabel1.setText("COUNSELLING");
        jLabel1.setForeground(Color.blue);

        jLabel2.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 24)); // NOI18N
        jLabel2.setText("RANK");
        jLabel2.setForeground(Color.magenta);
        
        jButton1.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 18)); // NOI18N
        jButton1.setLabel("BACK");
        jButton1.setBackground(Color.green);
        jButton1.setForeground(Color.blue);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
                  jButton1ActionPerformed(evt);
              }
        });

        jButton2.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 18)); // NOI18N
        jButton2.setLabel("NEXT");
        jButton2.setBackground(Color.green);
        jButton2.setForeground(Color.blue);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(coun.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(coun.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

  
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(499, 499, 499)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 607, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(423, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>   
                      

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException
    {
        try
         {
          
            Connection conn=null;
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            conn=DriverManager.getConnection(url,"system","7890");
            Statement stmt = conn.createStatement();
            try {
             rank= Integer.parseInt(jTextField1.getText());
                         ResultSet rs=stmt.executeQuery("select * from gana where rank="+rank);  
            if(rs.next())
                new COL(rank).setVisible(true);
            else
                JOptionPane.showMessageDialog(null,"rank given is not exist");


            }
            catch (Exception e) {
JOptionPane.showMessageDialog(null, "Please do not leave fields empty");
                
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
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
     {
         new main().setVisible(true);
     }
    public static void main(String args[])
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(coun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(coun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(coun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(coun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coun().setVisible(true);
            }
        });
    }                  
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;                  
}

