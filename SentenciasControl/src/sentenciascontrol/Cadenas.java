/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

/**
 *
 * @author Armando J. López L.
 */
public class Cadenas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadenas
     */
    public Cadenas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lEncabezado = new javax.swing.JLabel();
        lInstruc = new javax.swing.JLabel();
        lEjer1 = new javax.swing.JLabel();
        bRealizar1 = new javax.swing.JButton();
        tfCadena = new javax.swing.JTextField();
        lEjer2 = new javax.swing.JLabel();
        bRealizar2 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        bRealizar3 = new javax.swing.JButton();
        tfCaracter = new javax.swing.JTextField();
        lEjer4 = new javax.swing.JLabel();
        tfSubcadena1 = new javax.swing.JTextField();
        bRealizar4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        bRealizar5 = new javax.swing.JButton();
        tfSubcadena2 = new javax.swing.JTextField();
        lEjer6 = new javax.swing.JLabel();
        tfSubcadena3 = new javax.swing.JTextField();
        bRealizar6 = new javax.swing.JButton();
        lInstruc1 = new javax.swing.JLabel();
        lEjer7 = new javax.swing.JLabel();
        tfSubcadena4 = new javax.swing.JTextField();
        bRealizar7 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Operaciones con cadenas");

        lEncabezado.setText("La salida de cada operación deberá ser mostrada mediante cuadros de diálogo");

        lInstruc.setText("Con la cadena digitada a continuación");

        lEjer1.setText("1. Calcule su longitud");

        bRealizar1.setText("Realizar");
        bRealizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar1ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Imprima cada caracter de la cadena por separado");

        bRealizar2.setText("Realizar");
        bRealizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar2ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Calcule la moda del caracter");

        bRealizar3.setText("Realizar");
        bRealizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Verifique si la siguiente subcadena existe");

        bRealizar4.setText("Realizar");
        bRealizar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar4ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Concatene la cadena dada con");

        bRealizar5.setText("Realizar");
        bRealizar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar5ActionPerformed(evt);
            }
        });

        lEjer6.setText("6. Verifique si la siguiente cadena es mayor");

        bRealizar6.setText("Realizar");
        bRealizar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar6ActionPerformed(evt);
            }
        });

        lInstruc1.setText("realice:");

        lEjer7.setText("7. Compare con la siguiente cadena");

        bRealizar7.setText("Realizar");
        bRealizar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lEncabezado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lInstruc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lInstruc1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer1)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer3)
                        .addGap(4, 4, 4)
                        .addComponent(tfCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRealizar3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lEjer4)
                                .addGap(4, 4, 4)
                                .addComponent(tfSubcadena1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lEjer2)
                                .addGap(3, 3, 3)
                                .addComponent(bRealizar2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRealizar4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer5)
                        .addGap(2, 2, 2)
                        .addComponent(tfSubcadena2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRealizar5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer6)
                        .addGap(4, 4, 4)
                        .addComponent(tfSubcadena3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRealizar6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer7)
                        .addGap(4, 4, 4)
                        .addComponent(tfSubcadena4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRealizar7)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEncabezado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lInstruc)
                    .addComponent(tfCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lInstruc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer1)
                    .addComponent(bRealizar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer2)
                    .addComponent(bRealizar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer3)
                    .addComponent(bRealizar3)
                    .addComponent(tfCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer4)
                    .addComponent(bRealizar4)
                    .addComponent(tfSubcadena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer5)
                    .addComponent(bRealizar5)
                    .addComponent(tfSubcadena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer6)
                    .addComponent(bRealizar6)
                    .addComponent(tfSubcadena3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer7)
                    .addComponent(bRealizar7)
                    .addComponent(tfSubcadena4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRealizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRealizar1ActionPerformed

    private void bRealizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRealizar2ActionPerformed

    private void bRealizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRealizar3ActionPerformed

    private void bRealizar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRealizar4ActionPerformed

    private void bRealizar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRealizar5ActionPerformed

    private void bRealizar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRealizar6ActionPerformed

    private void bRealizar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRealizar7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRealizar1;
    private javax.swing.JButton bRealizar2;
    private javax.swing.JButton bRealizar3;
    private javax.swing.JButton bRealizar4;
    private javax.swing.JButton bRealizar5;
    private javax.swing.JButton bRealizar6;
    private javax.swing.JButton bRealizar7;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer6;
    private javax.swing.JLabel lEjer7;
    private javax.swing.JLabel lEncabezado;
    private javax.swing.JLabel lInstruc;
    private javax.swing.JLabel lInstruc1;
    private javax.swing.JTextField tfCadena;
    private javax.swing.JTextField tfCaracter;
    private javax.swing.JTextField tfSubcadena1;
    private javax.swing.JTextField tfSubcadena2;
    private javax.swing.JTextField tfSubcadena3;
    private javax.swing.JTextField tfSubcadena4;
    // End of variables declaration//GEN-END:variables
}
