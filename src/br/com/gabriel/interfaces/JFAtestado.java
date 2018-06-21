/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.interfaces;

import br.com.gabriel.objetos.Atestado;
import br.com.gabriel.objetos.Consulta;
import br.com.gabriel.singleton.SAtestado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SATC
 */
public class JFAtestado extends javax.swing.JFrame {

    Atestado a;
    Consulta c;

    /**
     * Creates new form Atestado
     */
    public JFAtestado() {
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

        jLCadastrodeAtestado = new javax.swing.JLabel();
        jPCadastroAtestado = new javax.swing.JPanel();
        jLDataInicioAtestado = new javax.swing.JLabel();
        jLDataFimAtestado = new javax.swing.JLabel();
        jTFDataInicioAtestado = new javax.swing.JTextField();
        jTFDataFimAtestado = new javax.swing.JTextField();
        jLQuantidadeDias = new javax.swing.JLabel();
        jTFQuantidadeDias = new javax.swing.JTextField();
        jBCadastrarAtestado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLCadastrodeAtestado.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLCadastrodeAtestado.setText("Cadastro de Atestado");

        jPCadastroAtestado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLDataInicioAtestado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLDataInicioAtestado.setText("Data Início do Atestado:");

        jLDataFimAtestado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLDataFimAtestado.setText("Data Fim do Atestado:");

        jTFDataInicioAtestado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFDataFimAtestado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLQuantidadeDias.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLQuantidadeDias.setText("Quantidade de dias:");

        jTFQuantidadeDias.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTFQuantidadeDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFQuantidadeDiasActionPerformed(evt);
            }
        });

        jBCadastrarAtestado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBCadastrarAtestado.setText("Cadastrar");
        jBCadastrarAtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarAtestadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCadastroAtestadoLayout = new javax.swing.GroupLayout(jPCadastroAtestado);
        jPCadastroAtestado.setLayout(jPCadastroAtestadoLayout);
        jPCadastroAtestadoLayout.setHorizontalGroup(
            jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroAtestadoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDataInicioAtestado)
                    .addComponent(jLDataFimAtestado)
                    .addComponent(jLQuantidadeDias))
                .addGap(27, 27, 27)
                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFDataInicioAtestado)
                    .addComponent(jTFDataFimAtestado)
                    .addComponent(jTFQuantidadeDias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastrarAtestado)
                .addContainerGap())
        );
        jPCadastroAtestadoLayout.setVerticalGroup(
            jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroAtestadoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataInicioAtestado)
                    .addComponent(jTFDataInicioAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataFimAtestado)
                    .addComponent(jTFDataFimAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantidadeDias)
                    .addComponent(jTFQuantidadeDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroAtestadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastrarAtestado)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLCadastrodeAtestado)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPCadastroAtestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCadastrodeAtestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCadastroAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFQuantidadeDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFQuantidadeDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFQuantidadeDiasActionPerformed

    private void jBCadastrarAtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarAtestadoActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date DataInicioAtestado = new Date();
        Date DataFimAtestado = new Date();
        try {
            DataInicioAtestado = sdf.parse(this.jTFDataInicioAtestado.getText());
        } catch (ParseException ex) {
            Logger.getLogger(JFAtestado.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DataFimAtestado = sdf.parse(this.jTFDataFimAtestado.getText());
        } catch (ParseException ex) {
            Logger.getLogger(JFAtestado.class.getName()).log(Level.SEVERE, null, ex);
        }
        int QuantidadeDias = Integer.parseInt(this.jTFQuantidadeDias.getText());
        a = new Atestado(DataInicioAtestado, DataFimAtestado, c, QuantidadeDias);
        SAtestado.getInstance().getAtestados().add(a);
    }//GEN-LAST:event_jBCadastrarAtestadoActionPerformed

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
            java.util.logging.Logger.getLogger(JFAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAtestado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarAtestado;
    private javax.swing.JLabel jLCadastrodeAtestado;
    private javax.swing.JLabel jLDataFimAtestado;
    private javax.swing.JLabel jLDataInicioAtestado;
    private javax.swing.JLabel jLQuantidadeDias;
    private javax.swing.JPanel jPCadastroAtestado;
    private javax.swing.JTextField jTFDataFimAtestado;
    private javax.swing.JTextField jTFDataInicioAtestado;
    private javax.swing.JTextField jTFQuantidadeDias;
    // End of variables declaration//GEN-END:variables
}
