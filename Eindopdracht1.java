package eindopdracht;

import java.io.File;
import javax.swing.JFileChooser;                                                //imports
import java.awt.*;
import java.util.*;

/**
 *
 * @author ruben kollen
 */
public class Eindopdracht1 extends javax.swing.JFrame {
JFileChooser fileChooser;
ArrayList<Virus> Viruslijst = new ArrayList();                               //aanmaken van een lijst die bestaat uit Virussen
    /**
     * Creates new form Eindopdracht1
     */
    public Eindopdracht1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super Coole virus zoeker van Rubahn");
        setBackground(new java.awt.Color(255, 0, 0));
        setMinimumSize(new java.awt.Dimension(753, 523));
        setResizable(false);
        setSize(new java.awt.Dimension(753, 523));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Browse een bestand:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 12, 123, 24));

        jTextField1.setBackground(new java.awt.Color(0, 255, 0));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 15, 418, -1));

        jLabel2.setText("Viral Classification:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 73, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 255, 0));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "ssDNA viruses", "dsDNA viruses", "ssRNA viruses", "dsRNA viruses" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 68, 437, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 12, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 48, 729, -1));

        jLabel3.setText("Host Name 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 116, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(0, 255, 0));
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setMaximumSize(new java.awt.Dimension(31, 24));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 163, -1));

        jComboBox3.setBackground(new java.awt.Color(0, 255, 0));
        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setMaximumSize(new java.awt.Dimension(31, 24));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 163, -1));

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ID");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 176, -1, -1));

        jRadioButton3.setText("Aantal Hosts");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setText("Sorteren op:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 161, -1, -1));

        jLabel5.setText("Viruslijst 1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jLabel6.setText("Viruslijst 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        jLabel7.setText("OvereenKomst tussen viruslijst 1&2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 294, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 68, 73, -1));

        jLabel8.setText("Host Name 2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 116, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 289, 12));

        jTextArea1.setBackground(new java.awt.Color(0, 255, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setMaximumSize(new java.awt.Dimension(160, 75));
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 184, -1, -1));

        jTextArea2.setBackground(new java.awt.Color(0, 255, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setMaximumSize(new java.awt.Dimension(160, 75));
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 184, -1, -1));

        jTextArea3.setBackground(new java.awt.Color(0, 255, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 315, 172, -1));

        jRadioButton2.setText("Classificatie");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 289, 12));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel9.setForeground(Color.red);                                   // de eerste button, wordt gebruikt voor het inlezen van het bestand, en aanmaken van een viruslijst.
        jLabel9.setText("Data wordt geladen. . .");                         //update bericht
        fileChooser = new JFileChooser();
        File selectedFile;
        int reply = fileChooser.showOpenDialog(this);                       //openen van bestand doormiddel van een filechoser
        selectedFile = fileChooser.getSelectedFile();
        jTextField1.setText(""+selectedFile);
        String PATHWAY = selectedFile.toString();
        
        Viruslijst = VirusLogica.inlezen(PATHWAY);                          //het aanroepen van het lezen van het geopende bestand
        ArrayList<String> Check = new ArrayList();                          //het aanmaken van een checklist, zodat er geen duplicaties in de combobox voorkomen
        Viruslijst.sort(Comparator.comparing(Virus::getVirus_Hosts));       //het filteren van de viruslijst zodat de combo boxen van laag naar hoog staan
        for (int i = 0; Viruslijst.size()>i;i++){                           //for loop voor het vullen van de comboboxen
        String hostname = Viruslijst.get(i).getHost_Name();                 // hostnaam en hostid uit de viruslijst halen voor het vullen van de combobox
        String hostID = Viruslijst.get(i).getVirus_Hosts();
        
        if (Check.contains(hostname) == false){
            Check.add(hostname);
            jComboBox2.addItem(hostID +"("+hostname+")");
            jComboBox3.addItem(hostID +"("+hostname+")");
        }        
        }
        jLabel9.setText("Bestand laden is compleet");                      //update bericht
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton3.setSelected(false);                                  // het deselecteren van de radio buttons als de 1e wordt ingedrukt
        jRadioButton2.setSelected(false);
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1.setText("");                                           //tweede knop, wordt gebruikt als update knop. gebruikt de aangevraagde parameters en laat het resultaat zien
        jTextArea2.setText("");                                           
        jTextArea3.setText("");                                          // het leeg maken van de 3 textarea's zodat hij elke keer gereset wordt.
        jLabel10.setText("Data wordt geupdate . . .");                   //update bericht
        
        String Selected_Classification =String.valueOf(jComboBox1.getSelectedItem());
        String Selected_Host1 = String.valueOf(jComboBox2.getSelectedItem());
        String[] stukken = Selected_Host1.split("[(]");
        String hostid = stukken[0];
        String Selected_Host2 = String.valueOf(jComboBox3.getSelectedItem());          //het verkrijgen van de hostID's door de combobox te splitten op haakjes
        String[] stukken2= Selected_Host2.split("[(]");
        String hostid2 = stukken2[0];
        ArrayList <String> Check = new ArrayList();                                   //tweede check list, zodat gekeken kan worden naar overeenkomsten
        
        if (jRadioButton1.isSelected()){
            Viruslijst.sort(Comparator.comparing(Virus::getVirus_Hosts));             // ID radio button groep, compare wordt aangeroepen in virus om te sorteren
        }
        if (jRadioButton2.isSelected()){
            Collections.sort(Viruslijst);                                             // Classificatie radio button groep, compare wordt aan geroepen in virus om te sorteren
        }
        
        if (jRadioButton3.isSelected()){
            Collections.sort(Viruslijst, new Comparator<Virus>(){                   // aantal host radio button, de virus lijst wordt overnieuw gescant, en het aantal host wordt geteld.
            @Override                                                               //vervolgens wordt er gekeken welke de meeste hosts heeft, en wordt  hierop gesorteerd.
            public int compare(Virus k1, Virus k2){
                ArrayList<Integer> IDLijst = new ArrayList();
                for (Virus temp:Viruslijst){
                    IDLijst.add(Integer.valueOf(temp.getVirus_Hosts()));
                }
                Integer ID1 = Integer.valueOf(k1.getVirus_Hosts());
                Integer ID2 = Integer.valueOf(k2.getVirus_Hosts());
                Integer Frequentie1 = Collections.frequency(IDLijst, ID1);
                k1.setGetal(Frequentie1);
                Integer Frequentie2 = Collections.frequency(IDLijst, ID1);
                k2.setGetal(Frequentie2);
                int TrueFalseGelijk = k1.getGetal().compareTo(k2.getGetal());
                
                if (TrueFalseGelijk==0){
                    k1.setGetal(0);
                    k2.setGetal(0);
                    System.out.println(k1);
                    System.out.println(k2);
                }
                 if (TrueFalseGelijk>0){
                    k1.setGetal(1);
                    k2.setGetal(-1);
                    System.out.println(k1);
                    System.out.println(k2);
                 }
                 if (TrueFalseGelijk<0){
                    k1.setGetal(-1);
                    k2.setGetal(1);
                    System.out.println(k1);
                    System.out.println(k2);
                }
                 else return 0;
                 return k1.getGetal().compareTo(k2.getGetal());
            }
                   
            });
            
        }
        
        for (int i = 0; Viruslijst.size()>i;i++){                            // het verwerken van de geselecteerde host uit de eerste combo box, wordt gezocht in de viruslijst. en geplaats in eerste textarea
            if(hostid.equals(Viruslijst.get(i).getVirus_Hosts())&&(Viruslijst.get(i).getVirus_Classificatie()).contains(Selected_Classification)||hostid.equals(Viruslijst.get(i).getVirus_Hosts())&&(Selected_Classification.equals("None"))){
                jTextArea1.append(Viruslijst.get(i).getVirus_Id()+"("+Viruslijst.get(i).getVirus_Name()+")\n");
                Check.add(Viruslijst.get(i).getVirus_Id());                 // Gevonden virus wordt in check lijst gedaan om te kijken naar overeenkomsten.
            }
        }
        for (int i = 0; Viruslijst.size()>i;i++){                           // het verwerken van de geselecteerde host uit de tweede combo box, wordt gezocht in viruslijst, en geplaats in tweede textarea
            if(hostid2.equals(Viruslijst.get(i).getVirus_Hosts())&&(Viruslijst.get(i).getVirus_Classificatie()).contains(Selected_Classification)||hostid2.equals(Viruslijst.get(i).getVirus_Hosts())&&(Selected_Classification.equals("None"))){
                jTextArea2.append(Viruslijst.get(i).getVirus_Id()+"("+Viruslijst.get(i).getVirus_Name()+")\n");
                if (Check.contains(Viruslijst.get(i).getVirus_Id())){                                                   //er wordt gekeken of het gevonden virus in de checklijst staat, als dit zo is
                    jTextArea3.append(Viruslijst.get(i).getVirus_Id()+"("+Viruslijst.get(i).getVirus_Name()+")\n");     // wordt het virus toegevoed in de overeenkomst kolom
                    
                }
            }
        }
        jLabel10.setText("Data is geupdated");                              //update bericht
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // Kan niet weggehaald worden, is aangemaakt door designer
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jRadioButton1.setSelected(false);                                // het deselecteren van de radio buttons als de 3e wordt ingedrukt
        jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // Kan niet weggehaald worden, is aangemaakt door designer
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton3.setSelected(false);                               // het deselecteren van de radio buttons als de 2e wordt ingedrukt
        jRadioButton1.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed


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
            java.util.logging.Logger.getLogger(Eindopdracht1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eindopdracht1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eindopdracht1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eindopdracht1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                                          // main class waar de gui wordt aangeroepen, en visible wordt
                new Eindopdracht1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
