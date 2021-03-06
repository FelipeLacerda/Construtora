/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.view;

import br.com.construtora.controller.ImovelController;
import br.com.construtora.model.Imovel;
import br.com.construtora.util.MensagemUtilImovel;
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
public class ListarImovel extends javax.swing.JDialog {

    Imovel imovel = new Imovel();
    ImovelController imovelControl = new ImovelController();

    /**
     * Creates new form ListarImovel
     */
    public ListarImovel(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        jblistar = new javax.swing.JButton();
        jblimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdados = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SD Construtora - Listar");
        setMaximumSize(new java.awt.Dimension(810, 420));
        setMinimumSize(new java.awt.Dimension(810, 420));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(810, 420));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTAR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 10, 110, 17);

        jblistar.setBackground(new java.awt.Color(255, 255, 255));
        jblistar.setText("  Listar");
        jblistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblistarActionPerformed(evt);
            }
        });
        getContentPane().add(jblistar);
        jblistar.setBounds(10, 50, 130, 30);

        jblimpar.setBackground(new java.awt.Color(255, 255, 255));
        jblimpar.setText(" Limpar Tabela");
        jblimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparActionPerformed(evt);
            }
        });
        getContentPane().add(jblimpar);
        jblimpar.setBounds(140, 50, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Dados: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 140, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Endereço: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 90, 150, 15);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 310, 120, 30);

        tbdados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tamanho:", "Preço:", "Especificação:", "Andamento da Obra:", "Nº:", "Rua:", "Bairro:", "Cidade:", "Complemento:", "CEP:", "UF:"
            }
        ));
        jScrollPane1.setViewportView(tbdados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 780, 190);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jblimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparActionPerformed
        DefaultTableModel modeloTableDados = (DefaultTableModel) tbdados.getModel();

        while (modeloTableDados.getRowCount() > 0) {
            modeloTableDados.removeRow(0);
        }
    }//GEN-LAST:event_jblimparActionPerformed

    private void jblistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblistarActionPerformed
        DefaultTableModel modeloTableDados = (DefaultTableModel) tbdados.getModel();

        List<Imovel> imoveis = new ArrayList<Imovel>();
        try {
            imoveis = imovelControl.listarImoveis();
        } catch (Exception ex) {
            Logger.getLogger(ListarImovel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_ERRO_LISTARIMO), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_ERRO), JOptionPane.ERROR_MESSAGE);

        }
        if (imoveis == null) {
            JOptionPane.showMessageDialog(null, MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_ERRO_LISTARIMO), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_ERRO), JOptionPane.ERROR_MESSAGE);
        } else {

            while (modeloTableDados.getRowCount() > 0) {
                modeloTableDados.removeRow(0);
            }

            for (Imovel i : imoveis) {
                modeloTableDados.addRow(new Object[]{
                    i.getTamanho(), i.getPreco(), i.getEspecificacao(), i.getAndamentoObra(), i.getEnderecoImovel().getId(), i.getEnderecoImovel().getNumero(), i.getEnderecoImovel().getRua(), i.getEnderecoImovel().getBairro(), i.getEnderecoImovel().getComplemento(), i.getEnderecoImovel().getCidade(), i.getEnderecoImovel().getCep(), i.getEnderecoImovel().getUf()
                });

            }
        }
    }//GEN-LAST:event_jblistarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListarImovel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarImovel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarImovel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarImovel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarImovel dialog = new ListarImovel(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jblimpar;
    private javax.swing.JButton jblistar;
    private javax.swing.JTable tbdados;
    // End of variables declaration//GEN-END:variables
}
