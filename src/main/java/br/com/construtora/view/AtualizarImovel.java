/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.view;

import br.com.construtora.controller.ImovelController;
import br.com.construtora.model.Endereco;
import br.com.construtora.model.Imovel;
import br.com.construtora.util.MensagemUtilImovel;
import br.com.construtora.util.MensagemUtilUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Lacerda
 */
public class AtualizarImovel extends javax.swing.JDialog {

    Imovel imovel = new Imovel();
    ImovelController imovelControl = new ImovelController();

    /**
     * Creates new form AtualizarImovel
     */
    public AtualizarImovel(java.awt.Frame parent, boolean modal) {
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
        tfid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbprocurar = new javax.swing.JButton();
        jblimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbatualizar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfcodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tftamanho = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfpreco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbandamento = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taespecificacao = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbcidade = new javax.swing.JComboBox();
        tfcep = new javax.swing.JFormattedTextField();
        tfrua = new javax.swing.JTextField();
        tfbairro = new javax.swing.JTextField();
        sccomplemento = new javax.swing.JScrollPane();
        tacomplemento = new javax.swing.JTextArea();
        tfuf = new javax.swing.JTextField();
        tfnumero = new javax.swing.JTextField();
        tfantcep = new javax.swing.JTextField();
        tfantcidade = new javax.swing.JTextField();
        tfantandamento = new javax.swing.JTextField();
        jlidende = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SD Construtora - Atualizar");
        setMaximumSize(new java.awt.Dimension(810, 635));
        setMinimumSize(new java.awt.Dimension(810, 635));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(810, 635));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Informe o ID: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 80, 170, 15);
        getContentPane().add(tfid);
        tfid.setBounds(200, 70, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ATUALIZAR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 10, 100, 15);

        jbprocurar.setBackground(new java.awt.Color(255, 255, 255));
        jbprocurar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Lacerda\\Downloads\\SD Azul\\pro.png")); // NOI18N
        jbprocurar.setText(" Procurar");
        jbprocurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbprocurarActionPerformed(evt);
            }
        });
        getContentPane().add(jbprocurar);
        jbprocurar.setBounds(320, 70, 140, 30);

        jblimpar.setBackground(new java.awt.Color(255, 255, 255));
        jblimpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Lacerda\\Downloads\\SD Azul\\lix.png")); // NOI18N
        jblimpar.setText("Limpar Campos");
        jblimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparActionPerformed(evt);
            }
        });
        getContentPane().add(jblimpar);
        jblimpar.setBounds(460, 70, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Dados: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 70, 15);

        jbatualizar.setBackground(new java.awt.Color(255, 255, 255));
        jbatualizar.setForeground(new java.awt.Color(0, 255, 0));
        jbatualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Lacerda\\Downloads\\SD Azul\\up.png")); // NOI18N
        jbatualizar.setText("Atualizar");
        jbatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbatualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbatualizar);
        jbatualizar.setBounds(560, 530, 110, 40);

        jbcancelar.setBackground(new java.awt.Color(255, 255, 255));
        jbcancelar.setForeground(new java.awt.Color(255, 0, 0));
        jbcancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Lacerda\\Downloads\\SD Azul\\fe.png")); // NOI18N
        jbcancelar.setText("Cancelar");
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbcancelar);
        jbcancelar.setBounds(670, 530, 110, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Endereço: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 110, 120, 15);

        jLabel6.setText("Código do Imóvel: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 150, 110, 14);

        tfcodigo.setEditable(false);
        tfcodigo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tfcodigo);
        tfcodigo.setBounds(150, 140, 100, 30);

        jLabel5.setText("Tamanho: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 200, 100, 14);

        tftamanho.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tftamanho);
        tftamanho.setBounds(150, 190, 70, 30);

        jLabel7.setText("M²");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 200, 13, 14);

        jLabel8.setText("Preço: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 250, 70, 14);

        tfpreco.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tfpreco);
        tfpreco.setBounds(150, 240, 90, 30);

        jLabel9.setText("R$");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 250, 50, 14);

        jLabel10.setText("Andamento de Obra ATUAL:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 300, 170, 14);

        jLabel11.setText("NOVO Andamento de Obra:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 350, 180, 14);

        cbandamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "Inicial - Planejamento", "Construção", "Acabamento", "Final - Pronta" }));
        cbandamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbandamentoActionPerformed(evt);
            }
        });
        getContentPane().add(cbandamento);
        cbandamento.setBounds(200, 340, 150, 30);

        jLabel12.setText("Especificação: ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 390, 100, 14);

        taespecificacao.setColumns(20);
        taespecificacao.setForeground(new java.awt.Color(255, 0, 0));
        taespecificacao.setRows(5);
        jScrollPane1.setViewportView(taespecificacao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 390, 210, 96);

        jLabel13.setText("CEP ATUAL:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(310, 150, 100, 14);

        jLabel14.setText("NOVO CEP:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(310, 200, 90, 14);

        jLabel15.setText("Rua: ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(310, 250, 90, 14);

        jLabel16.setText("Bairro: ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(440, 290, 120, 20);

        jLabel17.setText("Complemento: ");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(400, 340, 120, 14);

        jLabel18.setText("Cidade ATUAL: ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(530, 150, 120, 14);

        jLabel19.setText("NOVA Cidade: ");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(530, 200, 100, 14);

        jLabel20.setText("UF: ");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(580, 250, 70, 14);

        jLabel21.setText("Nº:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(690, 250, 50, 14);

        cbcidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "Pombal", "São Bentinho", "Cajazeirinhas", "São Domingos" }));
        getContentPane().add(cbcidade);
        cbcidade.setBounds(620, 190, 140, 30);

        try {
            tfcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfcep);
        tfcep.setBounds(390, 190, 80, 30);

        tfrua.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tfrua);
        tfrua.setBounds(390, 240, 150, 30);

        tfbairro.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tfbairro);
        tfbairro.setBounds(510, 290, 140, 30);

        tacomplemento.setColumns(20);
        tacomplemento.setForeground(new java.awt.Color(255, 0, 0));
        tacomplemento.setRows(5);
        sccomplemento.setViewportView(tacomplemento);

        getContentPane().add(sccomplemento);
        sccomplemento.setBounds(510, 340, 140, 96);

        tfuf.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tfuf);
        tfuf.setBounds(620, 240, 30, 30);

        tfnumero.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tfnumero);
        tfnumero.setBounds(730, 240, 30, 30);

        tfantcep.setEditable(false);
        tfantcep.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tfantcep);
        tfantcep.setBounds(390, 140, 80, 30);

        tfantcidade.setEditable(false);
        tfantcidade.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tfantcidade);
        tfantcidade.setBounds(620, 140, 140, 30);

        tfantandamento.setEditable(false);
        tfantandamento.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tfantandamento);
        tfantandamento.setBounds(200, 290, 150, 30);

        jlidende.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jlidende);
        jlidende.setBounds(390, 100, 80, 30);

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felipe Lacerda\\Downloads\\SD Azul\\cad.jpg")); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbprocurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbprocurarActionPerformed
        String senha = new String(tfid.getText());

        try {
            imovel = imovelControl.procurarImovelSenha(senha);
        } catch (Exception ex) {
            Logger.getLogger(Atualizar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_ERRO_PROCURARIMO),MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_ERRO), JOptionPane.ERROR_MESSAGE);
        }
        if (imovel.getIdImovel().equals(senha)) {
            tfcodigo.setText(imovel.getIdImovel());

            String tamanho = String.valueOf(imovel.getTamanho());
            tftamanho.setText(tamanho);
            String preco = String.valueOf(imovel.getPreco());
            tfpreco.setText(preco);
            tfantandamento.setText(imovel.getAndamentoObra());
            taespecificacao.setText(imovel.getEspecificacao());

            String id = String.valueOf(imovel.getEnderecoImovel().getId());
            jlidende.setText(id);
            tfantcep.setText(imovel.getEnderecoImovel().getCep());
            tfantcidade.setText(imovel.getEnderecoImovel().getCidade());
            tfrua.setText(imovel.getEnderecoImovel().getRua());
            tfbairro.setText(imovel.getEnderecoImovel().getBairro());
            tfuf.setText(imovel.getEnderecoImovel().getUf());
            tfnumero.setText(imovel.getEnderecoImovel().getNumero());
            tacomplemento.setText(imovel.getEnderecoImovel().getComplemento());
        } else {
            JOptionPane.showMessageDialog(null, MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_ERRO_PROCURARIMO),MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_ERRO), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbprocurarActionPerformed

    private void jblimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparActionPerformed
        tfid.setText("");
        tfcodigo.setText("");
        tftamanho.setText("");
        tfpreco.setText("");
        tfantandamento.setText("");
        cbandamento.setSelectedItem("SELECIONE");
        taespecificacao.setText("");
        tfantcep.setText("");
        tfcep.setText("");
        tfantcidade.setText("");
        cbcidade.setSelectedItem("SELECIONE");
        tfrua.setText("");
        tfbairro.setText("");
        tfuf.setText("");
        tfnumero.setText("");
        tacomplemento.setText("");
    }//GEN-LAST:event_jblimparActionPerformed

    private void jbatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbatualizarActionPerformed
        Endereco ende = new Endereco();

        imovel.setIdImovel(tfid.getText());

        Double tamanho = Double.valueOf(tftamanho.getText());
        imovel.setTamanho(tamanho);

        Double preco = Double.valueOf(tfpreco.getText());
        imovel.setPreco(preco);

        if (!cbandamento.getSelectedItem().equals("SELECIONE")) {      
            imovel.setAndamentoObra((String) cbandamento.getSelectedItem());
        }
        imovel.setEspecificacao(taespecificacao.getText());

        Long idEnde = Long.valueOf(jlidende.getText());
        ende.setId(idEnde);
        if (!tfcep.getText().equals("  .   -   ")) {
            ende.setCep(tfcep.getText());
        }else{
            ende.setCep(tfantcep.getText());
        }
        ende.setUf(tfuf.getText());
        ende.setNumero(tfnumero.getText());
        if (!cbcidade.getSelectedItem().equals("SELECIONE")) {
            ende.setCidade((String) cbcidade.getSelectedItem());
        }else{
            ende.setCidade(tfantcidade.getText());
        }
        ende.setRua(tfrua.getText());
        ende.setBairro(tfbairro.getText());
        ende.setComplemento(tacomplemento.getText());
        imovel.setEnderecoImovel(ende);
        try {
            imovelControl.atualizarImovel(imovel);
            JOptionPane.showMessageDialog(null,MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_SUCESSO_EDITARIMO));
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(AtualizarImovel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbatualizarActionPerformed

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null,MensagemUtilUsuario.getValor(MensagemUtilUsuario.MSG_CANCEL),MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_CANCEL), JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        }
    }//GEN-LAST:event_jbcancelarActionPerformed

    private void cbandamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbandamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbandamentoActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AtualizarImovel dialog = new AtualizarImovel(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cbandamento;
    private javax.swing.JComboBox cbcidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbatualizar;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jblimpar;
    private javax.swing.JButton jbprocurar;
    private javax.swing.JLabel jlidende;
    private javax.swing.JScrollPane sccomplemento;
    private javax.swing.JTextArea tacomplemento;
    private javax.swing.JTextArea taespecificacao;
    private javax.swing.JTextField tfantandamento;
    private javax.swing.JTextField tfantcep;
    private javax.swing.JTextField tfantcidade;
    private javax.swing.JTextField tfbairro;
    private javax.swing.JFormattedTextField tfcep;
    private javax.swing.JTextField tfcodigo;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfnumero;
    private javax.swing.JTextField tfpreco;
    private javax.swing.JTextField tfrua;
    private javax.swing.JTextField tftamanho;
    private javax.swing.JTextField tfuf;
    // End of variables declaration//GEN-END:variables
}