/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.view;

import br.com.construtora.controller.AdmController;
import br.com.construtora.controller.ClienteController;
import br.com.construtora.model.Administrador;
import br.com.construtora.model.Cliente;
import br.com.construtora.util.MensagemUtilAdm;
import br.com.construtora.util.MensagemUtilCliente;
import br.com.construtora.util.MensagemUtilUsuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe Lacerda
 */
public class Listar extends javax.swing.JDialog {

    Cliente cliente = new Cliente();
    ClienteController clienteControl = new ClienteController();
    Administrador adm = new Administrador();
    AdmController admControl = new AdmController();

    /**
     * Creates new form Listar
     */
    public Listar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        cblistar = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jblimpar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SD Construtora - Listar");
        setMaximumSize(new java.awt.Dimension(810, 420));
        setMinimumSize(new java.awt.Dimension(810, 420));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(810, 420));
        getContentPane().setLayout(null);

        cblistar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cblistar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "Cliente", "Administrador", "Imóvel" }));
        cblistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cblistarActionPerformed(evt);
            }
        });
        getContentPane().add(cblistar);
        cblistar.setBounds(10, 50, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTAR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 10, 100, 17);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("  Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 50, 130, 30);

        tbdados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Login: ", "Nome: ", "CPF: ", "Data Nascimento: ", "Nº: ", "Rua: ", "Bairro: ", "Cidade: ", "CEP:", "Complemento: ", "UF:", "Celular:", "E-mail:"
            }
        ));
        jScrollPane1.setViewportView(tbdados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 780, 190);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Dados:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 80, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Contato:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(660, 90, 130, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Endereço: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 90, 100, 15);

        jblimpar.setBackground(new java.awt.Color(255, 255, 255));
        jblimpar.setText(" Limpar Tabela");
        jblimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparActionPerformed(evt);
            }
        });
        getContentPane().add(jblimpar);
        jblimpar.setBounds(260, 50, 130, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 313, 120, 30);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modeloTableDados = (DefaultTableModel) tbdados.getModel();

        String resp = (String) cblistar.getSelectedItem();

        if (resp.equals("Cliente")) {
            List<Cliente> clientes = new ArrayList<Cliente>();
            try {
                clientes = clienteControl.listarClientes();
            } catch (Exception ex) {
                Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_ERRO_LISTARCLI), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_ERRO), JOptionPane.ERROR_MESSAGE);

            }
            if (clientes == null) {
                JOptionPane.showMessageDialog(null, MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_ERRO_LISTARCLI), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_OBG), JOptionPane.ERROR_MESSAGE);
            } else {

                while (modeloTableDados.getRowCount() > 0) {
                    modeloTableDados.removeRow(0);
                }

                for (Cliente c : clientes) {
                    modeloTableDados.addRow(new Object[]{
                        c.getUsuarioCli().getLogin(), c.getNomeCli(), c.getCpfCli(), c.getDataNascimento(),
                        c.getEnderecoCli().getNumero(), c.getEnderecoCli().getRua(), c.getEnderecoCli().getBairro(),
                        c.getEnderecoCli().getCidade(), c.getEnderecoCli().getCep(), c.getEnderecoCli().getComplemento(),
                        c.getEnderecoCli().getUf(), c.getContatoCli().getCelular(), c.getContatoCli().getEmail()
                    });
                }
            }
        } else if (resp.equals("Administrador")) {
            List<Administrador> adms = new ArrayList<Administrador>();
            try {
                adms = admControl.listarAdm();
            } catch (Exception ex) {
                Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_ERRO_LISTARADM), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_ERRO), JOptionPane.ERROR_MESSAGE);

            }
            if (adms == null) {
                JOptionPane.showMessageDialog(null, MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_ERRO_LISTARADM), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_OBG), JOptionPane.ERROR_MESSAGE);
            } else {

                while (modeloTableDados.getRowCount() > 0) {
                    modeloTableDados.removeRow(0);
                }

                for (Administrador a : adms) {
                    modeloTableDados.addRow(new Object[]{
                        a.getUsuarioAdm().getLogin(), a.getNomeAdm(), a.getCpfAdm(), a.getEnderecoAdm().getNumero(),
                        a.getEnderecoAdm().getRua(), a.getEnderecoAdm().getBairro(), a.getEnderecoAdm().getCidade(),
                        a.getEnderecoAdm().getCep(), a.getEnderecoAdm().getComplemento(), a.getEnderecoAdm().getUf(),
                        a.getContatoAdm().getCelular(), a.getContatoAdm().getEmail()
                    });
                }
            }
        }/* else if (resp.equals("Imóvel")) {
         dispose();
         ListarImovel listarImovel = new ListarImovel(null, true);
         listarImovel.setVisible(true);
         }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jblimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparActionPerformed
        DefaultTableModel modeloTableDados = (DefaultTableModel) tbdados.getModel();

        while (modeloTableDados.getRowCount() > 0) {
            modeloTableDados.removeRow(0);
        }
    }//GEN-LAST:event_jblimparActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cblistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cblistarActionPerformed
        String resp = (String) cblistar.getSelectedItem();
        if (resp.equals("Imóvel")) {
            dispose();
            ListarImovel listarImovel = new ListarImovel(null, true);
            listarImovel.setVisible(true);
        }
    }//GEN-LAST:event_cblistarActionPerformed

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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Listar dialog = new Listar(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cblistar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jblimpar;
    private javax.swing.JTable tbdados;
    // End of variables declaration//GEN-END:variables
}
