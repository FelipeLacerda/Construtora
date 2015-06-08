/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.construtora.relatorio;

import br.com.construtora.model.Imovel;
import br.com.construtora.util.MensagemUtilRelatorio;
import br.com.construtora.util.MensagemUtilUsuario;
import static groovy.ui.text.FindReplaceUtility.dispose;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Felipe Lacerda
 */
public class ImovelRelatorio {

    private String local;

    public ImovelRelatorio() {
        this.local = "C:/Users/Felipe Lacerda/Documents/NetBeansProjects/MavenConstrututora/src/main/resources/relatorio/ImovelRelatorio.jrxml";
    }

    public void imprimirRelatorio(List<Imovel> imoveis) throws JRException {
        try {
            JasperReport report = JasperCompileManager.compileReport(local);
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(imoveis));
            JasperViewer.viewReport(print, false);
            JasperExportManager.exportReportToPdfFile(print, "C:/Users/Felipe Lacerda/Documents/NetBeansProjects/MavenConstrututora/src/main/resources/relatorio/RelatorioImoveis.pdf");

            JOptionPane.showMessageDialog(null, MensagemUtilRelatorio.getValor(MensagemUtilRelatorio.MSG_SUCESSO));
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(ImovelRelatorio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, MensagemUtilRelatorio.getValor(MensagemUtilRelatorio.MSG_ERRO), MensagemUtilUsuario.getValor(MensagemUtilUsuario.CABE_ERRO), JOptionPane.ERROR_MESSAGE);
        }

    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
