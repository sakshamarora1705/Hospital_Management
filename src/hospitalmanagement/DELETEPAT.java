/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DELETEPAT.java
 *
 * Created on Jan 26, 2017, 7:01:13 PM
 */

package hospitalmanagement;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author win7
 */
public class DELETEPAT extends javax.swing.JFrame {

    /** Creates new form DELETEPAT */
    public DELETEPAT() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 16));
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("                                    DELETE PATIENT RECORDS   ");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-5, 0, 540, 30);

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 16));
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("                                 PLEASE ENTER PATIENT'S ID");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 30, 530, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 102));
        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 15));
        jLabel3.setText("        PAT_ID");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 70, 150, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 102));
        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 15));
        jLabel4.setText("   FIRST NAME");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 130, 130, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 102));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 15));
        jLabel5.setText("    LAST NAME");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 190, 130, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 15));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 70, 200, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 15));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 135, 200, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 15));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(300, 190, 200, 30);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 350, 90, 29);

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14));
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 350, 100, 29);

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 350, 90, 29);

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(420, 350, 90, 29);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(300, 250, 200, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 102));
        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 15));
        jLabel7.setText("      DISEASE");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 250, 130, 30);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(300, 310, 200, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 102));
        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 15));
        jLabel8.setText("        GENDER");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(84, 304, 140, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/doctor-patient.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 530, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
PATIENTS obj3= new PATIENTS();
obj3.setVisible(true);
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
EXIT obj18= new EXIT();
obj18.setVisible(true);
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
       {
        Class.forName("java.sql.DriverManager");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL","root","12345");
        Statement stmt=con.createStatement();
        String patid;
        patid=jTextField1.getText();



String query="Select FIRST_NAME, LAST_NAME, DISEASE, GENDER from PATIENT where PATIENT_ID='"+patid+"';" ;
stmt.execute(query);
ResultSet rs=stmt.executeQuery(query);
if (rs.next())
{
    String fname=rs.getString("FIRST_NAME");
    String lname=rs.getString("LAST_NAME");
    String disease=rs.getString("DISEASE");
    String gender=rs.getString("GENDER");


    jTextField2.setText(fname);
    jTextField3.setText(lname);
    jTextField4.setText(disease);
    jTextField5.setText(gender);



}


       }
catch (Exception e)
{
    JOptionPane.showMessageDialog(this,e.getMessage());
}
    disAllow();
    }

public void disAllow()
{
  jTextField2.setEditable(false);
  jTextField3.setEditable(false);
  jTextField4.setEditable(false);
  jTextField5.setEditable(false);
          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{
    Class.forName("java.sql.DriverManager");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL","root","12345");
        Statement upStat=con.createStatement();
            int res=JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO DELETE THE RECORD ?");
            if(res==JOptionPane.YES_OPTION) {

                String patid=jTextField1.getText(),contact=jTextField4.getText(), city=jTextField5.getText();
                upStat.execute("delete from PATIENT where PATIENT_ID='"+patid+"'");

                JOptionPane.showMessageDialog(null, "RECORD IS UPDATED IN THE DATABASE");
                upStat.close();

                jTextField1.setText(null);
                jTextField2.setText(null);
                jTextField3.setText(null);
                jTextField4.setText(null);
                jTextField5.setText(null);


                    }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }    // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DELETEPAT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}
