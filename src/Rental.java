import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class Rental extends javax.swing.JFrame 
{
    public Rental() {
        initComponents();
        jDateChooser1.setDateFormatString("yyyy/MM/dd");
        
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jDateChooser1.setEnabled(false);
    }
    
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    PreparedStatement pst2;
    
    PreparedStatement pst3;
    PreparedStatement pst4;
    
    
    ResultSet rs;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 18, 49));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rental", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 231, 202))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 18, 49));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buy", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 231, 202))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 231, 202));
        jLabel6.setText("Customer ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 51));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 170, 30));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 231, 202));
        jLabel2.setText("Car ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 51));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 231, 202));
        jLabel5.setText("Price");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 170, 30));

        jButton1.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 231, 202));
        jButton1.setText("Add");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 231, 202)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 150, 50));

        jButton2.setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 231, 202));
        jButton2.setText("Cancel");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 231, 202)));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 150, 50));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 231, 202));
        jLabel9.setText("Date");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 170, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 231, 202));
        jLabel3.setText("Customer Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 48));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 170, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 170, 30));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 40, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String car_id = jTextField4.getText();
        String cust_id = jTextField1.getText();
        
        String fee = jTextField3.getText();
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(jDateChooser1.getDate());
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con  = DriverManager.getConnection("jdbc:mysql://localhost/rent","root","");
            
            pst3 = con.prepareStatement("insert into rental(car_id, cust_id, fee, date) values(?,?,?,?)");
            pst3.setString(1, car_id);
            pst3.setString(2, cust_id);
            pst3.setString(3, fee);
            pst3.setString(4, date);
            pst3.executeUpdate();
            
            pst4 = con.prepareStatement("update reg set available='No' where car_no=?");
            pst4.setString(1, car_id);
            pst4.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Success");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String cust_id = jTextField1.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con  = DriverManager.getConnection("jdbc:mysql://localhost/rent","root","");
                pst2 = con.prepareStatement("select * from customer where cust_id=?");
                pst2.setString(1, cust_id);
                rs = pst2.executeQuery();

                if(rs.next() == false)
                {
                    JOptionPane.showMessageDialog(this, "Customer Number not found");
                }
                else
                {
                    String avail = rs.getString("name");
                    jTextField2.setText(avail.trim());
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
       String car_id = jTextField4.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con  = DriverManager.getConnection("jdbc:mysql://localhost/rent","root","");
            pst1 = con.prepareStatement("select * from reg where car_no=?");
            pst1.setString(1, car_id);
            rs = pst1.executeQuery();

            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Car not found");
            }
            else
            {
                String avail = rs.getString("available");
                jTextField5.setText(avail.trim());
                if(avail.equals("Yes"))
                {
                    jTextField1.setEnabled(true);
                    jTextField2.setEnabled(true);
                    jTextField3.setEnabled(true);
                    jDateChooser1.setEnabled(true);
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CarReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
