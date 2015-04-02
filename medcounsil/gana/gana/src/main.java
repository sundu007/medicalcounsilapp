
import java.awt.Color;


public class main extends javax.swing.JFrame {
public main() 
{
 initComponents();
}
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 242, 242));
        setBounds(new java.awt.Rectangle(0, 0, 1365, 770));
        setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 24)); // NOI18N
        jButton1.setText("PORTFOLIO");
        jButton1.setForeground(Color.green);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 24)); // NOI18N
        jButton2.setText("STATUS");
        jButton2.setForeground(Color.green);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });


        jButton3.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 24)); // NOI18N
        jButton3.setText("COUNSELLING");
        jButton3.setForeground(Color.green);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
            }
            });

        jLabel1.setFont(new java.awt.Font("WenQuanYi Micro Hei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(199, 202, 121));
        jLabel1.setText("MBBS COUNSELLING");
        jLabel1.setForeground(Color.BLUE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 562, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(431, 431, 431))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(533, 533, 533))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(575, 575, 575))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(550, 550, 550))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(132, 132, 132)
                .addComponent(jButton1)
                .addGap(69, 69, 69)
                .addComponent(jButton3)
                .addGap(65, 65, 65)
                .addComponent(jButton2)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
        new Gana().setVisible(true);
    }                                        
     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
    {                                        
         new selsst().setVisible(true);
    }                    
      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
         new coun().setVisible(true);
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
     java.awt.EventQueue.invokeLater(new Runnable() 
     {
            public void run() 
            {
                new main().setVisible(true);
            }
      });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   

  
}

