/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.viewAdm;

import br.com.construtora.controller.AdmController;
import br.com.construtora.model.Administrador;
import br.com.construtora.model.Contato;
import br.com.construtora.model.Endereco;
import br.com.construtora.model.Usuario;
import br.com.construtora.util.MensagemUtilAdm;
import br.com.construtora.util.MensagemUtilUsuario;
import br.com.construtora.view.CadastrarUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Lacerda
 */
public class CadastrarAdm extends javax.swing.JDialog {

    private Administrador adm = new Administrador();
    private AdmController admControl = new AdmController();
    private Usuario usuario = new Usuario();
    private String login;
    private String senha;

    /**
     * Creates new form CadastrarAdm
     */
    public CadastrarAdm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Administrador getAdm() {
        return adm;
    }

    public void setAdm(Administrador adm) {
        this.adm = adm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbcadusuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfcpf = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfcep = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfnumero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfrua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfbairro = new javax.swing.JTextField();
        cbcidade = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tacomplemento = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfcelular = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        cbuf = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SD Construtora - Cadastrar");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setModal(true);
        setName("dialogCadAdm"); // NOI18N
        setPreferredSize(new java.awt.Dimension(810, 635));
        getContentPane().setLayout(null);

        jbcadusuario.setBackground(new java.awt.Color(255, 255, 255));
        jbcadusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cont+.png"))); // NOI18N
        jbcadusuario.setText("Cadastrar Usuário");
        jbcadusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcadusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jbcadusuario);
        jbcadusuario.setBounds(40, 70, 250, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Dados: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 130, 120, 15);

        jLabel3.setText("Nome: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 160, 90, 14);
        getContentPane().add(tfnome);
        tfnome.setBounds(120, 150, 340, 30);

        jLabel4.setText("CPF: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 200, 70, 14);

        try {
            tfcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfcpf);
        tfcpf.setBounds(120, 190, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Endereço: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 240, 90, 15);

        jLabel5.setText("CEP: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 270, 70, 14);

        try {
            tfcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfcep);
        tfcep.setBounds(120, 260, 80, 30);

        jLabel6.setText("UF: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 270, 30, 14);

        jLabel7.setText("Nº");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 270, 20, 14);
        getContentPane().add(tfnumero);
        tfnumero.setBounds(320, 260, 30, 30);

        jLabel8.setText("Cidade: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 310, 90, 14);

        jLabel9.setText("Rua: ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 350, 80, 14);
        getContentPane().add(tfrua);
        tfrua.setBounds(120, 340, 230, 30);

        jLabel10.setText("Bairro: ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 390, 80, 20);
        getContentPane().add(tfbairro);
        tfbairro.setBounds(120, 380, 130, 30);

        cbcidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "Pombal", "São Bentinho", "Cajazeirinhas", "São Domingos" }));
        getContentPane().add(cbcidade);
        cbcidade.setBounds(120, 300, 170, 30);

        jLabel11.setText("Complemento: ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 430, 120, 14);

        tacomplemento.setColumns(20);
        tacomplemento.setRows(5);
        jScrollPane1.setViewportView(tacomplemento);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 420, 200, 70);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/V.gif"))); // NOI18N
        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 530, 130, 40);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/X.gif"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(400, 530, 130, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Contato: ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(390, 240, 110, 15);

        jLabel13.setText("Celular: ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(390, 270, 70, 14);

        try {
            tfcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfcelular);
        tfcelular.setBounds(470, 260, 140, 30);

        jLabel14.setText("E-mail: ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(390, 310, 80, 14);
        getContentPane().add(tfemail);
        tfemail.setBounds(470, 300, 230, 30);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adm1.jpg"))); // NOI18N
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(670, 60, 100, 100);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CADASTRAR ADMINISTRADOR");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(290, 10, 250, 17);

        cbuf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "PB" }));
        getContentPane().add(cbuf);
        cbuf.setBounds(240, 260, 50, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cad.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcadusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcadusuarioActionPerformed
        CadastrarUsuario cadUsuario = new CadastrarUsuario(null, true);
        cadUsuario.setVisible(true);
        login = cadUsuario.getUsuario().getLogin();
        senha = cadUsuario.getUsuario().getSenha();
    }//GEN-LAST:event_jbcadusuarioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, MensagemUtilUsuario.getValor(MensagemUtilUsuario.MSG_CANCEL), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_CANCEL), JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Usuario usu = new Usuario();
        usu.setLogin(login);
        usu.setSenha(senha);
        adm.setUsuarioAdm(usu);

        adm.setNomeAdm(tfnome.getText());
        adm.setCpfAdm(tfcpf.getText());

        Endereco endereco = new Endereco();
        endereco.setCep(tfcep.getText());
        endereco.setUf((String) cbuf.getSelectedItem());
        endereco.setNumero(tfnumero.getText());
        endereco.setCidade((String) cbcidade.getSelectedItem());
        endereco.setRua(tfrua.getText());
        endereco.setBairro(tfbairro.getText());
        endereco.setComplemento(tacomplemento.getText());
        adm.setEnderecoAdm(endereco);

        Contato contato = new Contato();
        contato.setCelular(tfcelular.getText());
        contato.setEmail(tfemail.getText());
        adm.setContatoAdm(contato);

        try {
            int resp = JOptionPane.showConfirmDialog(null, MensagemUtilUsuario.getValor(MensagemUtilUsuario.MSG_CAD), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_CAD), JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                admControl.salvarAdm(adm);
                JOptionPane.showMessageDialog(null, MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_SUCESSO_SALVARADM));
                dispose();
            }
        } catch (Exception ex) {
            Logger.getLogger(CadastrarAdm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_ERRO_SALVARADM), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_ERRO), JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(CadastrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarAdm dialog = new CadastrarAdm(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cbcidade;
    private javax.swing.JComboBox cbuf;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbcadusuario;
    private javax.swing.JTextArea tacomplemento;
    private javax.swing.JTextField tfbairro;
    private javax.swing.JFormattedTextField tfcelular;
    private javax.swing.JFormattedTextField tfcep;
    private javax.swing.JFormattedTextField tfcpf;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfnumero;
    private javax.swing.JTextField tfrua;
    // End of variables declaration//GEN-END:variables
}
