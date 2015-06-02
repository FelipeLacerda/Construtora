/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.view;

import br.com.construtora.model.Usuario;
import br.com.construtora.util.MensagemUtilUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Lacerda
 */
public class CadastrarUsuario extends javax.swing.JDialog {

    private Usuario usuario = new Usuario();

    public CadastrarUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    CadastrarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        tflogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfsenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        tfconfirmar = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SD Construtora - Cadastrar Usuário");
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Lacerda\\Downloads\\SD Azul\\adc2.png")); // NOI18N
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(270, 50, 110, 111);

        jLabel1.setText("Login: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 190, 70, 14);
        getContentPane().add(tflogin);
        tflogin.setBounds(210, 190, 190, 30);

        jLabel2.setText("Senha: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 230, 60, 14);
        getContentPane().add(tfsenha);
        tfsenha.setBounds(210, 230, 190, 30);

        jLabel3.setText("Confirmar senha: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 270, 130, 14);
        getContentPane().add(tfconfirmar);
        tfconfirmar.setBounds(210, 270, 190, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/construtora/view/Confirmar.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 350, 140, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/construtora/view/cancel.gif"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 350, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CADASTRAR USUÁRIO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 10, 240, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Lacerda\\Downloads\\SD Azul\\cadmenor.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 640, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String senha1 = new String(this.tfsenha.getPassword());
        String senha2 = new String(this.tfconfirmar.getPassword());

        if (senha1.equals(senha2)) {
            int resp = JOptionPane.showConfirmDialog(null,MensagemUtilUsuario.getValor(MensagemUtilUsuario.MSG_CAD),MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_CAD), JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                usuario.setLogin(tflogin.getText());
            usuario.setSenha(senha2);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null,MensagemUtilUsuario.getValor(MensagemUtilUsuario.MSG_ERRO_SALVARCLI),MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_ERRO), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null,MensagemUtilUsuario.getValor(MensagemUtilUsuario.MSG_CANCEL),MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_CANCEL), JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarUsuario dialog = new CadastrarUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPasswordField tfconfirmar;
    private javax.swing.JTextField tflogin;
    private javax.swing.JPasswordField tfsenha;
    // End of variables declaration//GEN-END:variables
}