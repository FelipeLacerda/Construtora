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
import br.com.construtora.relatorio.AdmRelatorio;
import br.com.construtora.util.ConfigFactoryUtil;
import br.com.construtora.util.MensagemUtilAdm;
import br.com.construtora.util.MensagemUtilUsuario;
import br.com.construtora.view.ClienteAll;
import br.com.construtora.view.Listar;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Felipe Lacerda
 */
public class AdmAll extends javax.swing.JDialog {

    private AdmController admControl = new AdmController();
    private DefaultTableModel modeloTableDados;
    private DefaultTableModel modeloTableEnde;
    private DefaultTableModel modeloTableCont;

    /**
     * Creates new form AllAdm
     */
    public AdmAll(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        listarAdms(true);
        comboCidade(tbende, tbende.getColumnModel().getColumn(5));
        comboUf(tbende, tbende.getColumnModel().getColumn(8));
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
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdados = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbende = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbcont = new javax.swing.JTable();
        jbeditcli = new javax.swing.JButton();
        jbcadcli = new javax.swing.JToggleButton();
        jbexcli = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SD Construtora - Opções");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(812, 635));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OPÇÕES ADMINISTRADOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 10, 230, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Dados:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 50, 90, 15);

        tbdados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Adm:", "Login:", "Senha:", "Nome:", "CPF:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbdados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 800, 120);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Endereço:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 200, 120, 15);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("*Para EDITAR o dados dê DOIS cliques em sua linha!");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(250, 50, 330, 14);

        tbende.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Adm:", "ID End:", "Nº:", "Rua:", "Bairro:", "Cidade:", "CEP:", "Complemento:", "UF:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbende);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(0, 220, 800, 120);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Contato: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 350, 100, 15);

        tbcont.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Adm:", "ID Cont:", "E-mail:", "Celular:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbcont);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(0, 370, 800, 120);

        jbeditcli.setBackground(new java.awt.Color(255, 255, 255));
        jbeditcli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbeditcli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/up.png"))); // NOI18N
        jbeditcli.setText(" Atualizar");
        jbeditcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeditcliActionPerformed(evt);
            }
        });
        getContentPane().add(jbeditcli);
        jbeditcli.setBounds(380, 490, 140, 40);

        jbcadcli.setBackground(new java.awt.Color(255, 255, 255));
        jbcadcli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbcadcli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cont+.png"))); // NOI18N
        jbcadcli.setText("Cadastrar");
        jbcadcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcadcliActionPerformed(evt);
            }
        });
        getContentPane().add(jbcadcli);
        jbcadcli.setBounds(520, 490, 140, 40);

        jbexcli.setBackground(new java.awt.Color(255, 255, 255));
        jbexcli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbexcli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lix2.png"))); // NOI18N
        jbexcli.setText(" Excluir");
        jbexcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbexcliActionPerformed(evt);
            }
        });
        getContentPane().add(jbexcli);
        jbexcli.setBounds(660, 490, 140, 40);

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fe.png"))); // NOI18N
        jToggleButton1.setText("  Sair");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(340, 550, 130, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.jpg"))); // NOI18N
        jButton1.setText("Gerar Relatório");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 490, 140, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cad.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbeditcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeditcliActionPerformed
        Administrador adm = editarAdm();
        try {
            admControl.atualizarAdm(adm);
            listarAdms(true);
        } catch (Exception ex) {
            Logger.getLogger(ClienteAll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbeditcliActionPerformed

    private void comboCidade(JTable tabela, TableColumn coluna) {
        String cidade[] = {"Pombal", "São Bentinho", "Cajazeirinhas", "São Domingos"};
        JComboBox combo = new JComboBox(cidade);
        coluna.setCellEditor(new DefaultCellEditor(combo));
    }

    private void comboUf(JTable tabela, TableColumn coluna) {
        String cidade[] = {"PB", "PE", "CE", "RN"};
        JComboBox combo = new JComboBox(cidade);
        coluna.setCellEditor(new DefaultCellEditor(combo));
    }

    private void limparSelecao(JTable tableA, JTable tableB) {
        tableA.clearSelection();
        tableB.clearSelection();
    }

    private Administrador editarAdm() {
        Administrador adm = new Administrador();
        Usuario usu = new Usuario();
        Endereco ende = new Endereco();
        Contato cont = new Contato();

        int linhaCont = tbcont.getSelectedRow();
        int linhaEnd = tbende.getSelectedRow();
        int linha = tbdados.getSelectedRow();

        int soma = (linha + linhaCont + linhaEnd);

        if (soma > -3) {
            if (linhaCont > -1) {
                linha = linhaCont;
                linhaEnd = linhaCont;

                limparSelecao(tbdados, tbende);

                cont.setId((Long) tbcont.getValueAt(linhaCont, 1));
                cont.setEmail((String) tbcont.getValueAt(linhaCont, 2));
                cont.setCelular((String) tbcont.getValueAt(linhaCont, 3));
                adm.setContatoAdm(cont);

                ende.setId((Long) tbende.getValueAt(linhaEnd, 1));
                ende.setNumero((String) tbende.getValueAt(linhaEnd, 2));
                ende.setRua((String) tbende.getValueAt(linhaEnd, 3));
                ende.setBairro((String) tbende.getValueAt(linhaEnd, 4));
                ende.setCidade((String) tbende.getValueAt(linhaEnd, 5));
                ende.setCep((String) tbende.getValueAt(linhaEnd, 6));
                ende.setComplemento((String) tbende.getValueAt(linhaEnd, 7));
                ende.setUf((String) tbende.getValueAt(linhaEnd, 8));
                adm.setEnderecoAdm(ende);

                usu.setLogin((String) tbdados.getValueAt(linha, 1));
                usu.setSenha((String) tbdados.getValueAt(linha, 2));
                adm.setUsuarioAdm(usu);

                adm.setIdAdm((Long) tbdados.getValueAt(linha, 0));
                adm.setNomeAdm((String) tbdados.getValueAt(linha, 3));
                adm.setCpfAdm((String) tbdados.getValueAt(linha, 4));
                //adm.setDataNascimento((Date) tbdados.getValueAt(linha, 5));
            }

            if (linhaEnd > -1) {
                linhaCont = linhaEnd;
                linha = linhaEnd;

                limparSelecao(tbdados, tbcont);

                cont.setId((Long) tbcont.getValueAt(linhaCont, 1));
                cont.setEmail((String) tbcont.getValueAt(linhaCont, 2));
                cont.setCelular((String) tbcont.getValueAt(linhaCont, 3));
                adm.setContatoAdm(cont);

                ende.setId((Long) tbende.getValueAt(linhaEnd, 1));
                ende.setNumero((String) tbende.getValueAt(linhaEnd, 2));
                ende.setRua((String) tbende.getValueAt(linhaEnd, 3));
                ende.setBairro((String) tbende.getValueAt(linhaEnd, 4));
                ende.setCidade((String) tbende.getValueAt(linhaEnd, 5));
                ende.setCep((String) tbende.getValueAt(linhaEnd, 6));
                ende.setComplemento((String) tbende.getValueAt(linhaEnd, 7));
                ende.setUf((String) tbende.getValueAt(linhaEnd, 8));
                adm.setEnderecoAdm(ende);

                usu.setLogin((String) tbdados.getValueAt(linha, 1));
                usu.setSenha((String) tbdados.getValueAt(linha, 2));
                adm.setUsuarioAdm(usu);

                adm.setIdAdm((Long) tbdados.getValueAt(linha, 0));
                adm.setNomeAdm((String) tbdados.getValueAt(linha, 3));
                adm.setCpfAdm((String) tbdados.getValueAt(linha, 4));
                //adm.setDataNascimento((Date) tbdados.getValueAt(linha, 5));
            }

            if (linha > -1) {
                linhaCont = linha;
                linhaEnd = linha;

                limparSelecao(tbcont, tbende);

                cont.setId((Long) tbcont.getValueAt(linhaCont, 1));
                cont.setEmail((String) tbcont.getValueAt(linhaCont, 2));
                cont.setCelular((String) tbcont.getValueAt(linhaCont, 3));
                adm.setContatoAdm(cont);

                ende.setId((Long) tbende.getValueAt(linhaEnd, 1));
                ende.setNumero((String) tbende.getValueAt(linhaEnd, 2));
                ende.setRua((String) tbende.getValueAt(linhaEnd, 3));
                ende.setBairro((String) tbende.getValueAt(linhaEnd, 4));
                ende.setCidade((String) tbende.getValueAt(linhaEnd, 5));
                ende.setCep((String) tbende.getValueAt(linhaEnd, 6));
                ende.setComplemento((String) tbende.getValueAt(linhaEnd, 7));
                ende.setUf((String) tbende.getValueAt(linhaEnd, 8));
                adm.setEnderecoAdm(ende);

                usu.setLogin((String) tbdados.getValueAt(linha, 1));
                usu.setSenha((String) tbdados.getValueAt(linha, 2));
                adm.setUsuarioAdm(usu);

                adm.setIdAdm((Long) tbdados.getValueAt(linha, 0));
                adm.setNomeAdm((String) tbdados.getValueAt(linha, 3));
                adm.setCpfAdm((String) tbdados.getValueAt(linha, 4));
                //adm.setDataNascimento((Date) tbdados.getValueAt(linha, 5));
            }
        } else {
            JOptionPane.showMessageDialog(null, ConfigFactoryUtil.getValor(ConfigFactoryUtil.ERROLINHA),
                    MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_ERRO),
                    JOptionPane.ERROR_MESSAGE);
        }
        return adm;
    }

    public void listarAdms(Boolean resposta) {
        modeloTableDados = (DefaultTableModel) tbdados.getModel();
        modeloTableEnde = (DefaultTableModel) tbende.getModel();
        modeloTableCont = (DefaultTableModel) tbcont.getModel();

        if (resposta == true) {
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
                        a.getIdAdm(), a.getUsuarioAdm().getLogin(),
                        a.getUsuarioAdm().getSenha(), a.getNomeAdm(),
                        a.getCpfAdm()});
                }

                while (modeloTableEnde.getRowCount() > 0) {
                    modeloTableEnde.removeRow(0);
                }

                for (Administrador a : adms) {
                    modeloTableEnde.addRow(new Object[]{
                        a.getIdAdm(), a.getEnderecoAdm().getId(), a.getEnderecoAdm().getNumero(),
                        a.getEnderecoAdm().getRua(), a.getEnderecoAdm().getBairro(), a.getEnderecoAdm().getCidade(),
                        a.getEnderecoAdm().getCep(), a.getEnderecoAdm().getComplemento(), a.getEnderecoAdm().getUf()
                    });
                }

                while (modeloTableCont.getRowCount() > 0) {
                    modeloTableCont.removeRow(0);
                }

                for (Administrador a : adms) {
                    modeloTableCont.addRow(new Object[]{
                        a.getIdAdm(), a.getContatoAdm().getId(), a.getContatoAdm().getEmail(), a.getContatoAdm().getCelular()
                    });
                }
            }
        }
    }

    private void jbcadcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcadcliActionPerformed
        CadastrarAdm cadAdm = new CadastrarAdm(null, true);
        cadAdm.setVisible(true);
        listarAdms(true);
    }//GEN-LAST:event_jbcadcliActionPerformed

    private void jbexcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbexcliActionPerformed
        Administrador adm = editarAdm();
        int resposta = JOptionPane.showConfirmDialog(null, MensagemUtilUsuario.getValor(MensagemUtilUsuario.MSG_REM), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_REM), JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            try {
                admControl.removerAdm(adm);
                listarAdms(true);
            } catch (Exception ex) {
                Logger.getLogger(AdmAll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbexcliActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<Administrador> adms = new ArrayList<Administrador>();
        try {
            adms = admControl.listarAdm();
        } catch (Exception ex) {
            Logger.getLogger(AdmAll.class.getName()).log(Level.SEVERE, null, ex);
        }
        AdmRelatorio admRel = new AdmRelatorio();
        try {
            admRel.imprimirRelatorio(adms);
        } catch (JRException ex) {
            Logger.getLogger(AdmAll.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(AdmAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdmAll dialog = new AdmAll(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jbcadcli;
    private javax.swing.JButton jbeditcli;
    private javax.swing.JToggleButton jbexcli;
    private javax.swing.JTable tbcont;
    private javax.swing.JTable tbdados;
    private javax.swing.JTable tbende;
    // End of variables declaration//GEN-END:variables
}
