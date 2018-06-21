/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.interfaces;

import br.com.gabriel.objetos.Enfermeira;
import br.com.gabriel.objetos.Paciente;
import br.com.gabriel.objetos.Triagem;
import br.com.gabriel.singleton.STriagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class JFTriagem extends javax.swing.JFrame {

    Triagem t;
    Enfermeira e;
    Paciente p;

    /**
     * Creates new form Triagem
     */
    public JFTriagem() {
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

        jLTriagem = new javax.swing.JLabel();
        jPTriagem = new javax.swing.JPanel();
        jLEnfermeiraTriagem = new javax.swing.JLabel();
        jLPacienteTriagem = new javax.swing.JLabel();
        jLPressaoTriagem = new javax.swing.JLabel();
        jLSintomaTriagem = new javax.swing.JLabel();
        jLTemperaturaTriagem = new javax.swing.JLabel();
        jTFEnfermeiraTriagem = new javax.swing.JTextField();
        jTFPacienteTriagem = new javax.swing.JTextField();
        jTFPressaoTriagem = new javax.swing.JTextField();
        jTFSintomaTriagem = new javax.swing.JTextField();
        jTFTemperaturaTriagem = new javax.swing.JTextField();
        jLPesoTriagem = new javax.swing.JLabel();
        jLAlturaTriagem = new javax.swing.JLabel();
        jLAlergiasTriagem = new javax.swing.JLabel();
        jTFPesoTriagem = new javax.swing.JTextField();
        jTFAlturaTriagem = new javax.swing.JTextField();
        jTFAlergiasTriagem = new javax.swing.JTextField();
        jBCadastrarTriagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLTriagem.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLTriagem.setText("Triagem");

        jPTriagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLEnfermeiraTriagem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLEnfermeiraTriagem.setText("Enfermeira:");

        jLPacienteTriagem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLPacienteTriagem.setText("Paciente:");

        jLPressaoTriagem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLPressaoTriagem.setText("Pressão:");

        jLSintomaTriagem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLSintomaTriagem.setText("Sintoma:");

        jLTemperaturaTriagem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLTemperaturaTriagem.setText("Temperatura:");

        jTFEnfermeiraTriagem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFPacienteTriagem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFPressaoTriagem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFSintomaTriagem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFTemperaturaTriagem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLPesoTriagem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLPesoTriagem.setText("Peso:");

        jLAlturaTriagem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLAlturaTriagem.setText("Altura:");

        jLAlergiasTriagem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLAlergiasTriagem.setText("Alergias:");

        jTFPesoTriagem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFAlturaTriagem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTFAlergiasTriagem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jBCadastrarTriagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBCadastrarTriagem.setText("Cadastrar");
        jBCadastrarTriagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarTriagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPTriagemLayout = new javax.swing.GroupLayout(jPTriagem);
        jPTriagem.setLayout(jPTriagemLayout);
        jPTriagemLayout.setHorizontalGroup(
            jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTriagemLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPacienteTriagem)
                    .addComponent(jLEnfermeiraTriagem)
                    .addComponent(jLPressaoTriagem)
                    .addComponent(jLSintomaTriagem))
                .addGap(32, 32, 32)
                .addGroup(jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFPacienteTriagem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFPressaoTriagem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFSintomaTriagem)
                    .addComponent(jTFEnfermeiraTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPTriagemLayout.createSequentialGroup()
                        .addComponent(jLPesoTriagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFPesoTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTriagemLayout.createSequentialGroup()
                        .addComponent(jLAlergiasTriagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFAlergiasTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTriagemLayout.createSequentialGroup()
                        .addComponent(jLAlturaTriagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFAlturaTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTriagemLayout.createSequentialGroup()
                        .addComponent(jLTemperaturaTriagem)
                        .addGap(18, 18, 18)
                        .addComponent(jTFTemperaturaTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTriagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastrarTriagem)
                .addContainerGap())
        );
        jPTriagemLayout.setVerticalGroup(
            jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTriagemLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPTriagemLayout.createSequentialGroup()
                        .addGroup(jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEnfermeiraTriagem)
                            .addComponent(jTFEnfermeiraTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPesoTriagem)
                            .addComponent(jTFPesoTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPacienteTriagem)
                            .addComponent(jTFPacienteTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLAlturaTriagem))
                        .addGap(18, 18, 18)
                        .addGroup(jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPressaoTriagem)
                            .addComponent(jTFPressaoTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLSintomaTriagem)
                            .addComponent(jTFSintomaTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTemperaturaTriagem)
                            .addComponent(jTFTemperaturaTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPTriagemLayout.createSequentialGroup()
                        .addComponent(jTFAlturaTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFAlergiasTriagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLAlergiasTriagem))
                        .addGap(46, 46, 46)))
                .addComponent(jBCadastrarTriagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPTriagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLTriagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLTriagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarTriagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarTriagemActionPerformed
        String Pressao = this.jTFPressaoTriagem.getText();
        float Temperatura = Float.parseFloat(this.jTFTemperaturaTriagem.getText());
        String Sintoma = this.jTFSintomaTriagem.getText();
        List<String> Alergias = new ArrayList<>();
        float Peso = Float.parseFloat(this.jTFPesoTriagem.getText());
        float Altura = Float.parseFloat(this.jTFAlturaTriagem.getText());
        t = new Triagem(e, p, Pressao, Sintoma, Temperatura, Peso, Altura, Alergias);
        STriagem.getInstance().getTriagem().add(t);
    }//GEN-LAST:event_jBCadastrarTriagemActionPerformed

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
            java.util.logging.Logger.getLogger(JFTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFTriagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFTriagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarTriagem;
    private javax.swing.JLabel jLAlergiasTriagem;
    private javax.swing.JLabel jLAlturaTriagem;
    private javax.swing.JLabel jLEnfermeiraTriagem;
    private javax.swing.JLabel jLPacienteTriagem;
    private javax.swing.JLabel jLPesoTriagem;
    private javax.swing.JLabel jLPressaoTriagem;
    private javax.swing.JLabel jLSintomaTriagem;
    private javax.swing.JLabel jLTemperaturaTriagem;
    private javax.swing.JLabel jLTriagem;
    private javax.swing.JPanel jPTriagem;
    private javax.swing.JTextField jTFAlergiasTriagem;
    private javax.swing.JTextField jTFAlturaTriagem;
    private javax.swing.JTextField jTFEnfermeiraTriagem;
    private javax.swing.JTextField jTFPacienteTriagem;
    private javax.swing.JTextField jTFPesoTriagem;
    private javax.swing.JTextField jTFPressaoTriagem;
    private javax.swing.JTextField jTFSintomaTriagem;
    private javax.swing.JTextField jTFTemperaturaTriagem;
    // End of variables declaration//GEN-END:variables
}
