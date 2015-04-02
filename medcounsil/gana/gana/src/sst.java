
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class sst extends javax.swing.JFrame {

public sst()
{
        initComponents();
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JLabel();
        //jTextField2.disable();
        jTextField3 = new javax.swing.JLabel();
        //jTextField3.disable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JLabel();
       // jTextField5.disable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 242, 242));
        setBounds(new java.awt.Rectangle(0, 0, 1365, 770));
        setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 18)); // NOI18N

        jLabel1.setText("   RANK");
        jLabel1.setForeground(Color.red);

        jButton1.setText("SUBMIT");
        jButton1.setForeground(Color.blue);
        jButton1.setBackground(Color.green);
         jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try { 
                    jButton1ActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(sst.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(sst.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jLabel2.setText("NAME");
        jLabel2.setForeground(Color.magenta);

        jLabel3.setText("COUNSELLING TIME");
jLabel3.setForeground(Color.magenta);
        jLabel4.setText("COUNSELLING DATE");
jLabel4.setForeground(Color.magenta);
        jButton2.setText("BACK");
        jButton2.setForeground(Color.blue);
        jButton2.setBackground(Color.green);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt); 
            }
        });

        jLabel5.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 109, 33));
        jLabel5.setText("STATUS");
jLabel5.setForeground(Color.blue);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(589, 589, 589))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(520, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(417, 417, 417))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                        .addGap(392, 392, 392))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(604, 604, 604))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addGap(25, 25, 25)
                .addComponent(jButton2)
                .addGap(111, 111, 111))
        );

        pack();
    }// </editor-fold>                        

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
{                                         
        // TODO add your handling code here:
        new selsst().setVisible(true);
}                      
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException
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
            int rank= Integer.parseInt(jTextField1.getText());
            ResultSet rs=stmt.executeQuery("select name,cdate,ctime from gana where rank="+rank);
            if(rs.next())
            {
             jTextField2.setText(rs.getString(1));
             jTextField2.setForeground(Color.red);
             jTextField5.setText(rs.getString(2));
             jTextField5.setForeground(Color.red);
             jTextField3.setText(rs.getString(3));
             jTextField3.setForeground(Color.red);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"rank given is not exist");
            }
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
public static void main(String args[])
{
    java.awt.EventQueue.invokeLater(new Runnable()
    {
            public void run() 
            {
                new sst().setVisible(true);
            }
     });
}

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jTextField2,jTextField3,jTextField5;
  
    // End of variables declaration                   
}

