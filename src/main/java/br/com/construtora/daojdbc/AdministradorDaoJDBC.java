package br.com.construtora.daojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.construtora.model.Administrador;
import br.com.construtora.Interface.IAdministradorDao;
import br.com.construtora.model.Contato;
import br.com.construtora.model.Endereco;
import br.com.construtora.model.Usuario;
import br.com.construtora.util.ConnectionFactory;
import br.com.construtora.util.MensagemUtilAdm;
import java.util.ArrayList;

public class AdministradorDaoJDBC implements IAdministradorDao {

    private Connection con;
    private int idEndereco;
    private int idContato;
    private int senhaUsuario;
    Administrador admin = new Administrador();
    Usuario usuario = new Usuario();
    Endereco endereco = new Endereco();
    Contato contato = new Contato();

    public void inserir(Administrador a) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String insertUsuario = "INSERT INTO USUARIO (USUARIO_LOGIN,USUARIO_SENHA) VALUES(?,?)";
            String insertEndereco = "INSERT INTO ENDERECO (ENDERECO_NUMERO,ENDERECO_RUA,ENDERECO_BAIRRO,ENDERECO_CIDADE,ENDERECO_COMPLEMENTO,ENDERECO_CEP,ENDERECO_UF) VALUES (?,?,?,?,?,?,?)";
            String insertContato = "INSERT INTO CONTATO (CONTATO_EMAIL,CONTATO_CELULAR) VALUES (?,?)";
            String insertAdm = "INSERT INTO ADMINISTRADOR (ADM_NOME,ADM_CPF,ADM_ENDERECO,ADM_CONTATO,ADM_USU) VALUES (?,?,?,?,?)";

            PreparedStatement st = con.prepareStatement(insertUsuario,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, a.getUsuarioAdm().getLogin());
            st.setString(2, a.getUsuarioAdm().getSenha());

            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();

            while (rs.next()) {
                senhaUsuario = rs.getInt(1);
            }

            st = con.prepareStatement(insertEndereco,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, a.getEnderecoAdm().getNumero());
            st.setString(2, a.getEnderecoAdm().getRua());
            st.setString(3, a.getEnderecoAdm().getBairro());
            st.setString(4, a.getEnderecoAdm().getCidade());
            st.setString(5, a.getEnderecoAdm().getBairro());
            st.setString(6, a.getEnderecoAdm().getCep());
            st.setString(7, a.getEnderecoAdm().getUf());

            st.executeUpdate();

            rs = st.getGeneratedKeys();

            while (rs.next()) {
                idEndereco = rs.getInt(1);
            }

            st = con.prepareStatement(insertContato,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, a.getContatoAdm().getEmail());
            st.setString(2, a.getContatoAdm().getCelular());

            st.executeUpdate();

            rs = st.getGeneratedKeys();

            while (rs.next()) {
                idContato = rs.getInt(1);
            }

            st = con.prepareStatement(insertAdm);

            st.setString(1, a.getNomeAdm());
            st.setString(2, a.getCpfAdm());
            st.setInt(3, idEndereco);
            st.setInt(4, idContato);
            st.setInt(5, senhaUsuario);

            st.executeUpdate();
            st.close();

            con.close();
            System.out.println(MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_SUCESSO_SALVARADM));

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_ERRO_SALVARADM));
        }

    }

    public void editar(Administrador a) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String updateAdm = "UPDATE ADMINISTRADOR SET ADM_NOME=?,ADM_CPF=?,ADM_ENDERECO=?,ADM_CONTATO=?,ADM_USU=? WHERE ADM_ID=?";
            String updateEndereco = "UPDATE ENDERECO SET ENDERECO_NUMERO=?,ENDERECO_RUA=?,ENDERECO_BAIRRO=?,ENDERECO_CIDADE=?,ENDERECO_COMPLEMENTO=?,ENDERECO_CEP=?,ENDERECO_UF=? WHERE ENDERECO_ID=?";
            String updateContato = "UPDATE CONTATO SET CONTATO_EMAIL=?,CONTATO_CELULAR=? WHERE CONTATO_ID=?";
            String updateUsuario = "UPDATE USUARIO SET USUARIO_SENHA=?,USUARIO_LOGIN=? WHERE USUARIO_SENHA=?";

            PreparedStatement st = con.prepareStatement(updateUsuario, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, a.getUsuarioAdm().getSenha());
            st.setString(2, a.getUsuarioAdm().getLogin());
            st.setString(3, a.getUsuarioAdm().getSenha());
            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()) {
                senhaUsuario = rs.getInt(1);
            }

            st = con.prepareStatement(updateEndereco, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, a.getEnderecoAdm().getNumero());
            st.setString(2, a.getEnderecoAdm().getRua());
            st.setString(3, a.getEnderecoAdm().getBairro());
            st.setString(4, a.getEnderecoAdm().getCidade());
            st.setString(5, a.getEnderecoAdm().getComplemento());
            st.setString(6, a.getEnderecoAdm().getCep());
            st.setString(7, a.getEnderecoAdm().getUf());
            st.setLong(8, a.getEnderecoAdm().getId());
            st.executeUpdate();

            rs = st.getGeneratedKeys();
            while (rs.next()) {
                idEndereco = rs.getInt(1);
            }

            st = con.prepareStatement(updateContato, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, a.getContatoAdm().getEmail());
            st.setString(2, a.getContatoAdm().getCelular());
            st.setLong(3, a.getContatoAdm().getId());
            st.executeUpdate();

            rs = st.getGeneratedKeys();
            while (rs.next()) {
                idContato = rs.getInt(1);
            }

            st = con.prepareStatement(updateAdm, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, a.getNomeAdm());
            st.setString(2, a.getCpfAdm());
            //java.sql.Date dataDB = new java.sql.Date(c.getDataNascimento().getTime());
            //st.setDate(3, dataDB);
            st.setInt(3, idEndereco);
            st.setInt(4, idContato);
            st.setInt(5, senhaUsuario);
            st.setLong(6, a.getIdAdm());
            st.executeUpdate();

            System.out.println(MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_SUCESSO_EDITARADM));

            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_ERRO_EDITARADM));
        }

    }

    public void remover(Administrador a) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String deleteUsu = "DELETE FROM USUARIO WHERE USUARIO_SENHA=?";
            String deleteCont = "DELETE FROM CONTATO WHERE CONTATO_ID=?";
            String deleteEnd = "DELETE FROM ENDERECO WHERE ENDERECO_ID=?";
            String deleteAdm = "DELETE FROM ADMINISTRADOR WHERE ADM_ID=?";

            PreparedStatement st = con.prepareStatement(deleteAdm);
            st.setLong(1, a.getIdAdm());
            st.executeUpdate();

            st = con.prepareStatement(deleteUsu);
            st.setString(1, a.getUsuarioAdm().getSenha());
            st.executeUpdate();

            st = con.prepareStatement(deleteCont);
            st.setLong(1, a.getContatoAdm().getId());
            st.executeUpdate();

            st = con.prepareStatement(deleteEnd);
            st.setLong(1, a.getEnderecoAdm().getId());
            st.executeUpdate();

            st.close();
            con.close();
            System.out.println(MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_SUCESSO_REMOVERADM));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_ERRO_REMOVERADM));
        }
    }

    public List<Administrador> listar() throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            List<Administrador> adms = new ArrayList<Administrador>();

            String selectAdm = "SELECT * FROM administrador a, usuario u, endereco e, contato c WHERE a.ADM_USU = u.USUARIO_SENHA AND a.ADM_ENDERECO = e.ENDERECO_ID AND a.ADM_CONTATO = c.CONTATO_ID";

            PreparedStatement st = con.prepareStatement(selectAdm);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                Administrador adm = new Administrador();
                Usuario usu = new Usuario();
                Endereco ende = new Endereco();
                Contato cont = new Contato();

                adm.setIdAdm(rs.getInt("adm_id"));
                adm.setNomeAdm(rs.getString("adm_nome"));
                adm.setCpfAdm(rs.getString("adm_cpf"));

                usu.setLogin(rs.getString("usuario_login"));
                usu.setSenha(rs.getString("usuario_senha"));
                adm.setUsuarioAdm(usu);

                cont.setId(rs.getLong("contato_id"));
                cont.setCelular(rs.getString("contato_celular"));
                cont.setEmail(rs.getString("contato_email"));
                adm.setContatoAdm(cont);

                ende.setId(rs.getLong("endereco_id"));
                ende.setRua(rs.getString("endereco_rua"));
                ende.setBairro(rs.getString("endereco_bairro"));
                ende.setCidade(rs.getString("endereco_cidade"));
                ende.setNumero(rs.getString("endereco_numero"));
                ende.setComplemento(rs.getString("endereco_complemento"));
                ende.setCep(rs.getString("endereco_cep"));
                ende.setUf(rs.getString("endereco_uf"));
                adm.setEnderecoAdm(ende);

                adms.add(adm);
            }
            st.close();
            con.close();
            System.out.println(MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_SUCESSO_LISTARADM));
            return adms;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_ERRO_LISTARADM));
        }
    }

    public Administrador getPorSenha(String senha) {
        try {

            con = ConnectionFactory.getConnection();

            String selectSql = "SELECT * FROM ADMINISTRADOR a, USUARIO u, ENDERECO e, CONTATO co WHERE a.ADM_ENDERECO = e.ENDERECO_ID AND a.ADM_CONTATO = co.CONTATO_ID AND a.ADM_USU = u.USUARIO_SENHA AND u.USUARIO_SENHA=?;";

            PreparedStatement st = con.prepareStatement(selectSql);

            st.setString(1, senha);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                usuario.setLogin(rs.getString("usuario_login"));
                usuario.setSenha(rs.getString("usuario_senha"));
                admin.setUsuarioAdm(usuario);

                endereco.setId(rs.getLong("endereco_id"));
                endereco.setRua(rs.getString("endereco_rua"));
                endereco.setBairro(rs.getString("endereco_bairro"));
                endereco.setCidade(rs.getString("endereco_cidade"));
                endereco.setCep(rs.getString("endereco_cep"));
                endereco.setComplemento(rs.getString("endereco_complemento"));
                endereco.setUf(rs.getString("endereco_uf"));
                endereco.setNumero(rs.getString("endereco_numero"));
                admin.setEnderecoAdm(endereco);

                contato.setId(rs.getLong("contato_id"));
                contato.setCelular(rs.getString("contato_celular"));
                contato.setEmail(rs.getString("contato_email"));
                admin.setContatoAdm(contato);

                admin.setIdAdm(rs.getInt("adm_id"));
                admin.setNomeAdm(rs.getString("adm_nome"));
                admin.setCpfAdm(rs.getString("adm_cpf"));
            }
            rs.close();
            st.close();
            con.close();
            System.out.println(MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_SUCESSO_PROCURARADM));
            return admin;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public Administrador getPorId(Long id) {
        try {

            con = ConnectionFactory.getConnection();

            String selectSql = "SELECT * FROM ADMINISTRADOR a, USUARIO u, ENDERECO e, CONTATO co WHERE a.ADM_ENDERECO = e.ENDERECO_ID AND a.ADM_CONTATO = co.CONTATO_ID AND a.ADM_USU = u.USUARIO_SENHA AND a.ADM_ID=?;";

            PreparedStatement st = con.prepareStatement(selectSql);

            st.setLong(1, id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                usuario.setLogin(rs.getString("usuario_login"));
                usuario.setSenha(rs.getString("usuario_senha"));
                admin.setUsuarioAdm(usuario);

                endereco.setId(rs.getLong("endereco_id"));
                endereco.setRua(rs.getString("endereco_rua"));
                endereco.setBairro(rs.getString("endereco_bairro"));
                endereco.setCidade(rs.getString("endereco_cidade"));
                endereco.setCep(rs.getString("endereco_cep"));
                endereco.setComplemento(rs.getString("endereco_complemento"));
                endereco.setUf(rs.getString("endereco_uf"));
                endereco.setNumero(rs.getString("endereco_numero"));
                admin.setEnderecoAdm(endereco);

                contato.setId(rs.getLong("contato_id"));
                contato.setCelular(rs.getString("contato_celular"));
                contato.setEmail(rs.getString("contato_email"));
                admin.setContatoAdm(contato);

                admin.setIdAdm(rs.getInt("adm_id"));
                admin.setNomeAdm(rs.getString("adm_nome"));
                admin.setCpfAdm(rs.getString("adm_cpf"));
            }
            rs.close();
            st.close();
            con.close();
            System.out.println(MensagemUtilAdm.getValor(MensagemUtilAdm.MSG_SUCESSO_PROCURARADM));
            return admin;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
