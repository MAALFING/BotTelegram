/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcoladistanze;

import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.acos;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAALFING
 */
public class FrameCitta extends javax.swing.JFrame {

    List<Citta> vett;
    List<Persona> vettP;

    /**
     * Creates new form FrameCitta
     */
    
    public FrameCitta() {
        initComponents();
    }
    public FrameCitta(List<Persona> vettP ) {
        initComponents();
        vett= new ArrayList();
        this.vettP=vettP;
        for (int i = 0; i < vettP.size(); i++) {
            jComboBox3.addItem(vettP.get(i).nome);
        }
//        vett.add(new Persona("Atrio Rosso", 45.687191, 9.179684, 248));
//        vett.add(new Persona("Atrio Arancione", 45.687761, 9.181209, 249));
//        vett.add(new Persona("Atrio Giallo", 45.688070, 9.180375, 250));

        Citta cesano = new Citta( 45.628422, 9.147266, 199, "Cesano Maderno", "MB");
        Citta lentate = new Citta(45.678392, 9.121913, 246, "Lentate sul Seveso", "MB");
        Citta merone = new Citta(45.781997, 9.245975, 282, "Merone", "CO");
        Citta cantu = new Citta(45.739494, 9.129151, 356, "Cantù", "CO");
        Citta cermenate = new Citta(45.699956, 9.081864, 295, "Cermenate", "CO");
        Citta lambrugo = new Citta(45.758497, 9.241119, 280, "Lambrugo", "CO");
        Citta cabiate = new Citta(45.676197, 9.165897, 233, "Cabiate", "CO");
        Citta arosio = new Citta(45.716444, 9.208069, 292, "Arosio", "CO");
        Citta mariano = new Citta(45.698269, 9.177166, 250, "Mariano Comense", "CO");
        Citta meda = new Citta(45.665657, 9.159286, 224, "Meda", "MB");
        Citta lazzate = new Citta(45.671987, 9.085402, 256, "Lazzate", "MB");
        Citta como = new Citta(45.811460, 9.083120, 200, "Como", "CO");
        Citta monza = new Citta(45.583567, 9.273384, 162, "Monza", "MB");
        Citta milano = new Citta(45.463051, 9.190698, 119, "Milano", "MI");
        
        vett.add(new Citta(45.644558, 9.137517, 207, "Seveso", "MB"));
        vett.add(new Citta(45.656426, 9.130201, 227, "Barlassina", "MB"));
        vett.add(new Citta(45.649633, 9.205331, 223, "Seregno", "MB"));
        vett.add(new Citta(45.699376, 9.209769, 266, "Giussano", "MB"));
        vett.add(new Citta(45.676416, 9.237258, 255, "Carate Brianza", "MB"));
        vett.add(new Citta(45.617084, 9.211466, 195, "Desio", "MB"));
        vett.add(new Citta(45.610263, 9.147243, 187, "Bovisio Masciago", "MB"));
        vett.add(new Citta(45.598318, 9.119451, 181, "Limbiate", "MB"));
        
        vett.add(new Citta(45.616513, 9.079509, 205, "Solaro", "MI"));
        vett.add(new Citta(45.597322, 9.078326, 192, "Cesate", "MI"));
        vett.add(new Citta(45.578087, 9.120701, 169, "Senago", "MI"));
        vett.add(new Citta(45.564401, 9.167043, 159, "Paderno Dugnano", "MI"));
        vett.add(new Citta(45.556018, 9.214373, 151, "Cinisello Balsamo", "MI"));
        vett.add(new Citta(45.531899, 9.226524, 137, "Sesto San Giovanni", "MI"));
        vett.add(new Citta(45.551212, 9.186082, 150, "Cusano Milanino", "MI"));
        vett.add(new Citta(45.597799, 9.043104, 205, "Caronno Pertusella", "VA"));
        vett.add(new Citta(45.625472, 9.037368, 191, "Saronno", "VA"));
        vett.add(new Citta(45.616513, 9.079509, 209, "Solaro", "MI"));
        
        
        vett.add(cesano);
        vett.add(lentate);
        vett.add(merone);
        vett.add(cantu);
        vett.add(cermenate);
        vett.add(lambrugo);
        vett.add(cabiate);
        vett.add(arosio);
        vett.add(mariano);
        vett.add(meda);
        vett.add(lazzate);
        vett.add(como);
        vett.add(monza);
        vett.add(milano);
        
        
        
        
        
        

        for (int i = 0; i < vett.size(); i++) {
            jComboBox1.addItem(vett.get(i).nome);
            vett.get(i).lat = (vett.get(i).lat * PI) / 180;
            vett.get(i).lon = (vett.get(i).lon * PI) / 180;
        }

        for (int i = 0; i < vett.size(); i++) {
            jComboBox2.addItem(vett.get(i).nome);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jButton1.setText("Calcola distanza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Da uno a molti");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox1.setText("Ordina");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton3.setText("Da uno a città");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 231, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(42, 42, 42)
                                .addComponent(jCheckBox1))
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Citta P1 = null, P2 = null;
        for (int i = 0; i < vett.size(); i++) {
            if (jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).toString().equals(vett.get(i).nome)) {
                P1 = vett.get(i);
            }
        }

        for (int i = 0; i < vett.size(); i++) {
            if (jComboBox2.getItemAt(jComboBox2.getSelectedIndex()).toString().equals(vett.get(i).nome)) {
                P2 = vett.get(i);
            }
        }

        jLabel1.setText(CD(P1, P2) + " km");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Citta P1 = null;
        for (int i = 0; i < vett.size(); i++) {
            if (jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).toString().equals(vett.get(i).nome)) {
                P1 = vett.get(i);
            }
        }

        if (!jCheckBox1.isSelected()) {
            jTextArea1.setText("");
            for (int i = 0; i < vett.size(); i++) {
                jTextArea1.setText(jTextArea1.getText() + vett.get(i).nome + ": " + CD(P1, vett.get(i)) + " km\n");

            }
        } else {
            List<Citta> tmp = vett;
            for (int i = 0; i < tmp.size() - 1; i++) {
                for (int j = 0; j < tmp.size() - i - 1; j++) {
                    if (Float.parseFloat(CD(P1, tmp.get(j))) > Float.parseFloat(CD(P1, tmp.get(j + 1)))) {
                        //swap arr[j+1] and arr[j]
                        Citta temp = tmp.get(j);
                        tmp.set(j, tmp.get(j + 1));
                        tmp.set(j + 1, temp);
                    }
                }
            }

            jTextArea1.setText("");
            for (int i = 0; i < tmp.size(); i++) {
                jTextArea1.setText(jTextArea1.getText() + tmp.get(i).nome + ": " + CD(P1, tmp.get(i)) + " km\n");

            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    public String CD(Citta P1, Citta P2) {
        double Dz = 0;

        Dz = 6372 * (acos(sin(P1.lat) * sin(P2.lat) + cos(P1.lat) * cos(P2.lat) * cos(abs(P1.lon - P2.lon))));
        Dz = Math.ceil(Dz * 1000.0) / 1000.0;
        return Double.toString(Dz);
    }
    
    public String CD(Persona P1, Citta P2) {
        double Dz = 0;

        Dz = 6372 * (acos(sin(P1.lat) * sin(P2.lat) + cos(P1.lat) * cos(P2.lat) * cos(abs(P1.lon - P2.lon))));
        Dz = Math.ceil(Dz * 1000.0) / 1000.0;
        return Double.toString(Dz);
    }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        List<Citta> tmp = vett;

        Persona P1 = null;
        for (int i = 0; i < vettP.size(); i++) {
            if (jComboBox3.getItemAt(jComboBox3.getSelectedIndex()).toString().equals(vettP.get(i).nome)) {
                P1 = vettP.get(i);
            }
        }

        if (jCheckBox1.isSelected()) {
            for (int i = 0; i < tmp.size() - 1; i++) {
                for (int j = 0; j < tmp.size() - i - 1; j++) {
                    if (Float.parseFloat(CD(P1, tmp.get(j))) > Float.parseFloat(CD(P1, tmp.get(j + 1)))) {
                        //swap arr[j+1] and arr[j]
                        Citta temp = tmp.get(j);
                        tmp.set(j, tmp.get(j + 1));
                        tmp.set(j + 1, temp);
                    }
                }
            }

            jTextArea1.setText("");
            for (int i = 0; i < tmp.size(); i++) {
                jTextArea1.setText(jTextArea1.getText() + tmp.get(i).nome + ": " + CD(P1, tmp.get(i)) + " km\n");

            }
        } else {
            jTextArea1.setText("");
            for (int i = 0; i < vett.size(); i++) {
                jTextArea1.setText(jTextArea1.getText() + vett.get(i).nome + ": " + CD(P1, vett.get(i)) + " km\n");

            }
        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Persona P1 = null;
        Citta C1 = null;
        for (int i = 0; i < vettP.size(); i++) {
            if (jComboBox3.getItemAt(jComboBox3.getSelectedIndex()).toString().equals(vettP.get(i).nome)) {
                P1 = vettP.get(i);
            }
        }

        if (!jCheckBox1.isSelected()) {
            jTextArea1.setText("");
            for (int i = 0; i < vett.size(); i++) {
                jTextArea1.setText(jTextArea1.getText() + vett.get(i).nome + ": " + CD(P1, vett.get(i)) + " km\n");

            }
        } else {
            List<Citta> tmp = vett;
            for (int i = 0; i < tmp.size() - 1; i++) {
                for (int j = 0; j < tmp.size() - i - 1; j++) {
                    if (Float.parseFloat(CD(P1, tmp.get(j))) > Float.parseFloat(CD(P1, tmp.get(j + 1)))) {
                        //swap arr[j+1] and arr[j]
                        Citta temp = tmp.get(j);
                        tmp.set(j, tmp.get(j + 1));
                        tmp.set(j + 1, temp);
                    }
                }
            }

            jTextArea1.setText("");
            for (int i = 0; i < tmp.size(); i++) {
                jTextArea1.setText(jTextArea1.getText() + tmp.get(i).nome + ": " + CD(P1, tmp.get(i)) + " km\n");

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCitta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCitta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCitta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCitta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCitta().setVisible(true);
            }/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
             */

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
