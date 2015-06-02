package br.com.construtora.daojdbc;

import br.com.construtora.Interface.IContratoDao;
import br.com.construtora.model.Administrador;
import br.com.construtora.model.Cliente;
import br.com.construtora.model.Contrato;
import br.com.construtora.model.Imovel;
import br.com.construtora.util.ConnectionFactory;
import br.com.construtora.util.MensagemUtilContrato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe Lacerda
 */
public class ContratoDaoJDBC implements IContratoDao {

    private Connection con;

    Imovel imo = new Imovel();
    ImovelDaoJDBC imoDao = new ImovelDaoJDBC();

    Administrador adm = new Administrador();
    AdministradorDaoJDBC admDao = new AdministradorDaoJDBC();

    Cliente cliente = new Cliente();
    ClienteDaoJDBC cliDao = new ClienteDaoJDBC();

    Contrato contrato = new Contrato();

    public void inserir(Contrato c) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String insertContrato = "INSERT INTO CONTRATO (CERTIFICACAO_CLI,CERTIFICACAO_ADM,CERTIFICACAO_IMO,CONTRATO_CLI,CONTRATO_ADM,CONTRATO_IMO,) VALUES (?,?,?,?,?,?)";

            PreparedStatement st = con.prepareStatement(insertContrato,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, contrato.isCertificacaoCli());
            st.setString(2, contrato.isCertificacaoAdm());
            st.setString(3, contrato.isCertificacaoImo());
            st.setString(4, contrato.getCliente().getUsuarioCli().getSenha());
            st.setString(5, contrato.getAdmin().getUsuarioAdm().getSenha());
            st.setString(6, contrato.getImovel().getIdImovel());

            st.executeUpdate();
            st.close();

            System.out.println(MensagemUtilContrato.getValor(MensagemUtilContrato.MSG_SUCESSO_SALVARCONT));

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilContrato.getValor(MensagemUtilContrato.MSG_ERRO_SALVARCONT));
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContratoDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void editar(Contrato c) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String updateContrato = "UPDATE CONTRATO SET CERTIFICACAO_CLI=?,CERTIFICACAO_ADM=?,CERTIFICACAO_IMO=? WHERE CONTRATO_ID=?;";

            PreparedStatement st = con.prepareStatement(updateContrato, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, c.isCertificacaoCli());
            st.setString(2, c.isCertificacaoAdm());
            st.setString(3, c.isCertificacaoImo());
            st.setLong(4, c.getIdContrato());
            st.executeUpdate();

            System.out.println(MensagemUtilContrato.getValor(MensagemUtilContrato.MSG_SUCESSO_EDITARCONT));

            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilContrato.getValor(MensagemUtilContrato.MSG_ERRO_EDITARCONT));
        }
    }

    public void remover(Contrato c) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String deleteCont = "DELETE FROM CONTRATO WHERE CONTRATO_ID=?";

            PreparedStatement st = con.prepareStatement(deleteCont);

            st = con.prepareStatement(deleteCont);
            st.setLong(1, c.getIdContrato());
            st.executeUpdate();

            st.close();
            con.close();
            System.out.println(MensagemUtilContrato.getValor(MensagemUtilContrato.MSG_SUCESSO_REMOVERCONT));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilContrato.getValor(MensagemUtilContrato.MSG_ERRO_REMOVERCONT));
        }
    }

    public List<Contrato> listar() throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            List<Contrato> contratos = new ArrayList<Contrato>();

            String selectSql = "SELECT * FROM CONTRATO co, CLIENTE c, ADMINISTRADOR a, IMOVEL i WHERE co.CONTRATO_CLI = c.CLIENTE_ID AND co.CONTRATO_ADM = a.ADM_ID AND co.CONTRATO_IMO = i.IMOVEL_ID;";

            PreparedStatement st = con.prepareStatement(selectSql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                Contrato cont = new Contrato();
                Cliente cli = new Cliente();
                Administrador admin = new Administrador();
                Imovel imov = new Imovel();

                cont.setIdContrato(rs.getLong("contrato_id"));
                cont.setCertificacaoCli(rs.getString("certificacao_cli"));
                cont.setCertificacaoAdm(rs.getString("certificacao_adm"));
                cont.setCertificacaoImo(rs.getString("certificacao_imo"));

                cli.setIdCli(rs.getLong("cliente_id"));
                cli.setNomeCli(rs.getString("cliente_nome"));
                cli.setCpfCli(rs.getString("cliente_cpf"));
                cont.setCliente(cli);
                
                admin.setIdAdm(rs.getLong("adm_id"));
                admin.setNomeAdm(rs.getString("adm_nome"));
                admin.setCpfAdm(rs.getString("adm_cpf"));
                cont.setAdmin(admin);
                
                imov.setIdImovel(rs.getString("imovel_id"));
                imov.setTamanho(rs.getDouble("imovel_tamanho"));
                imov.setPreco(rs.getDouble("imovel_preco"));
                imov.setEspecificacao(rs.getString("imovel_especificacao"));
                imov.setAndamentoObra(rs.getString("imovel_andamento"));
                cont.setImovel(imov);

                contratos.add(cont);
            }
            st.close();
            con.close();
            System.out.println(MensagemUtilContrato.getValor(MensagemUtilContrato.MSG_SUCESSO_LISTARCONT));
            return contratos;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilContrato.getValor(MensagemUtilContrato.MSG_ERRO_LISTARCONT));
        }
    }

    public Contrato getPorId(Long id) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String selectSql = "SELECT * "
                    + "FROM CONTRATO con, CLIENTE c, ADMINISTRADOR a, IMOVEL i, USUARIO u, ENDERECO e, CONTATO co "
                    + "WHERE con.CONTRATO_CLIENTE = c.CLIENTE_ID "
                    + "AND con.CONTRATO_ADM = ADM_ID"
                    + "AND con.CONTRATO_IMOVEL = i.IMOVEL_ID "
                    /*+ "AND c.CLIENTE_ENDERECO = e.ENDERECO_ID "
                     + "AND c.CLIENTE_CONTATO = co.CONTATO_ID "
                     + "AND c.CLIENTE_USU = u.USUARIO_SENHA "
                     + "AND a.ADM_ENDERECO = e.ENDERECO_ID "
                     + "AND a.ADM_CONTATO = co.CONTATO_ID "
                     + "AND a.ADM_USU = u.USUARIO_SENHA "
                     + "AND i.IMOVEL_ENDERECO = e.ENDERECO_ID "*/
                    + "AND con.CONTRATO_ID=?;";

            PreparedStatement st = con.prepareStatement(selectSql);

            st.setLong(1, id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                Long idCli = contrato.getCliente().getIdCli();
                contrato.setCliente(cliDao.getPorId(idCli));

                Long idAdm = contrato.getAdmin().getIdAdm();
                contrato.setAdmin(admDao.getPorId(idAdm));

                String idImo = contrato.getImovel().getIdImovel();
                contrato.setImovel(imoDao.getPorSenha(idImo));

                contrato.setCertificacaoCli(rs.getString("certificacao_cli"));
                contrato.setCertificacaoAdm(rs.getString("certificacao_adm"));
                contrato.setCertificacaoImo(rs.getString("certificacao_imo"));
            }
            rs.close();
            st.close();
            con.close();
            System.out.println(MensagemUtilContrato.getValor(MensagemUtilContrato.MSG_SUCESSO_PROCURARCONT));
            return contrato;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
