/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.interfaces;

import br.com.gabriel.objetos.Pessoa;
import br.com.gabriel.singleton.SPaciente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SATC
 */
public class JFResponsavel extends javax.swing.JFrame {

    Pessoa r;

    /**
     * Creates new form JFResponsavel
     */
    public JFResponsavel() {
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

        jPResponsavel = new javax.swing.JPanel();
        jLNomeResponsavel = new javax.swing.JLabel();
        jLCPFResponsavel = new javax.swing.JLabel();
        jLRGResponsavel = new javax.swing.JLabel();
        jTFNomeResponsavel = new javax.swing.JTextField();
        jTFCPFResponsavel = new javax.swing.JTextField();
        jTFRGResponsavel = new javax.swing.JTextField();
        jLSexoResponsavel = new javax.swing.JLabel();
        jLDatadeNascimentoResponsavel = new javax.swing.JLabel();
        jLEstadoCivilResponsavel = new javax.swing.JLabel();
        jLTelefoneResponsavel = new javax.swing.JLabel();
        jLEnderecoResponsavel = new javax.swing.JLabel();
        jTFEnderecoResponsavel = new javax.swing.JTextField();
        jTFTelefoneResponsavel = new javax.swing.JTextField();
        jTFEstadoCivilResponsavel = new javax.swing.JTextField();
        jTFDatadeNascimentoResponsavel = new javax.swing.JTextField();
        jTFSexoResponsavel = new javax.swing.JTextField();
        jBCadastroResponsavel = new javax.swing.JButton();
        jLCadastroDoResponsavel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPResponsavel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLNomeResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLNomeResponsavel.setText("Nome:");

        jLCPFResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLCPFResponsavel.setText("CPF:");

        jLRGResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLRGResponsavel.setText("RG:");

        jTFNomeResponsavel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFCPFResponsavel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFRGResponsavel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLSexoResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLSexoResponsavel.setText("Sexo: M ou F");

        jLDatadeNascimentoResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLDatadeNascimentoResponsavel.setText("Data de Nascimento:");

        jLEstadoCivilResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLEstadoCivilResponsavel.setText("Estado Civil:");

        jLTelefoneResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLTelefoneResponsavel.setText("Telefone:");

        jLEnderecoResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLEnderecoResponsavel.setText("Endereço:");

        jTFEnderecoResponsavel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFTelefoneResponsavel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFEstadoCivilResponsavel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFDatadeNascimentoResponsavel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFSexoResponsavel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jBCadastroResponsavel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBCadastroResponsavel.setText("Cadastrar");
        jBCadastroResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroResponsavelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPResponsavelLayout = new javax.swing.GroupLayout(jPResponsavel);
        jPResponsavel.setLayout(jPResponsavelLayout);
        jPResponsavelLayout.setHorizontalGroup(
            jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPResponsavelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastroResponsavel)
                .addContainerGap())
            .addGroup(jPResponsavelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNomeResponsavel)
                    .addComponent(jLCPFResponsavel)
                    .addComponent(jLRGResponsavel)
                    .addComponent(jLEnderecoResponsavel))
                .addGap(18, 18, 18)
                .addGroup(jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFEnderecoResponsavel)
                    .addComponent(jTFRGResponsavel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFNomeResponsavel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFCPFResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDatadeNascimentoResponsavel)
                    .addComponent(jLSexoResponsavel)
                    .addComponent(jLTelefoneResponsavel)
                    .addComponent(jLEstadoCivilResponsavel))
                .addGap(18, 18, 18)
                .addGroup(jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTFDatadeNascimentoResponsavel)
                    .addComponent(jTFEstadoCivilResponsavel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFTelefoneResponsavel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFSexoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPResponsavelLayout.setVerticalGroup(
            jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResponsavelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPResponsavelLayout.createSequentialGroup()
                        .addGroup(jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNomeResponsavel)
                            .addComponent(jTFNomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTelefoneResponsavel))
                        .addGap(18, 18, 18)
                        .addGroup(jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCPFResponsavel)
                            .addComponent(jTFCPFResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLRGResponsavel)
                            .addComponent(jTFRGResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEnderecoResponsavel)
                            .addComponent(jTFEnderecoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPResponsavelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLEstadoCivilResponsavel)
                        .addGap(18, 18, 18)
                        .addComponent(jLDatadeNascimentoResponsavel)
                        .addGap(18, 18, 18)
                        .addComponent(jLSexoResponsavel))
                    .addComponent(jTFTelefoneResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPResponsavelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jTFEstadoCivilResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFDatadeNascimentoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFSexoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jBCadastroResponsavel)
                .addContainerGap())
        );

        jLCadastroDoResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLCadastroDoResponsavel.setText("Cadastro do Responsável");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPResponsavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLCadastroDoResponsavel)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCadastroDoResponsavel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastroResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroResponsavelActionPerformed
        dispose();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String NomeResponsavel, CPFResponsavel, RGResponsavel, EnderecoResponsavel, TelefoneResponsavel, EstadoCivilResponsavel;
        Date DataDeNascimentoResponsavel = new Date();
        NomeResponsavel = this.jTFNomeResponsavel.getText();
        CPFResponsavel = this.jTFCPFResponsavel.getText();
        RGResponsavel = this.jTFRGResponsavel.getText();
        EnderecoResponsavel = this.jTFEnderecoResponsavel.getText();
        TelefoneResponsavel = this.jTFEnderecoResponsavel.getText();
        EstadoCivilResponsavel = this.jTFEstadoCivilResponsavel.getText();
        try {
            DataDeNascimentoResponsavel = sdf.parse(this.jTFDatadeNascimentoResponsavel.getText());
        } catch (ParseException ex) {
            Logger.getLogger(JFPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        char SexoResponsavel = this.jTFSexoResponsavel.getText().toUpperCase().charAt(0);
        r = new Pessoa(NomeResponsavel, CPFResponsavel, RGResponsavel, EnderecoResponsavel, TelefoneResponsavel, EstadoCivilResponsavel, DataDeNascimentoResponsavel, SexoResponsavel) {
            };
        SPaciente.getInstance().getResponsavel().add(r);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCadastroResponsavelActionPerformed

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
            java.util.logging.Logger.getLogger(JFResponsavel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFResponsavel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFResponsavel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFResponsavel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFResponsavel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastroResponsavel;
    private javax.swing.JLabel jLCPFResponsavel;
    private javax.swing.JLabel jLCadastroDoResponsavel;
    private javax.swing.JLabel jLDatadeNascimentoResponsavel;
    private javax.swing.JLabel jLEnderecoResponsavel;
    private javax.swing.JLabel jLEstadoCivilResponsavel;
    private javax.swing.JLabel jLNomeResponsavel;
    private javax.swing.JLabel jLRGResponsavel;
    private javax.swing.JLabel jLSexoResponsavel;
    private javax.swing.JLabel jLTelefoneResponsavel;
    private javax.swing.JPanel jPResponsavel;
    private javax.swing.JTextField jTFCPFResponsavel;
    private javax.swing.JTextField jTFDatadeNascimentoResponsavel;
    private javax.swing.JTextField jTFEnderecoResponsavel;
    private javax.swing.JTextField jTFEstadoCivilResponsavel;
    private javax.swing.JTextField jTFNomeResponsavel;
    private javax.swing.JTextField jTFRGResponsavel;
    private javax.swing.JTextField jTFSexoResponsavel;
    private javax.swing.JTextField jTFTelefoneResponsavel;
    // End of variables declaration//GEN-END:variables
}
