package br.com.construtora.daojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.construtora.model.Cliente;
import br.com.construtora.model.Contato;
import br.com.construtora.model.Endereco;
import br.com.construtora.Interface.IClienteDao;
import br.com.construtora.model.Usuario;
import br.com.construtora.util.ConnectionFactory;
import br.com.construtora.util.MensagemUtilCliente;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDaoJDBC implements IClienteDao {

    private Connection con;
    private int idEndereco;
    private int idContato;
    private int senhaUsuario;
    Cliente cli = new Cliente();
    Usuario usuario = new Usuario();
    Endereco endereco = new Endereco();
    Contato contato = new Contato();

    public Cliente getPorId(Long id) {
        try {

            con = ConnectionFactory.getConnection();

            String selectSql = "SELECT * FROM CLIENTE c, USUARIO u, ENDERECO e, CONTATO co WHERE c.CLIENTE_ENDERECO = e.ENDERECO_ID AND c.CLIENTE_CONTATO = co.CONTATO_ID AND c.CLIENTE_USU = u.USUARIO_SENHA AND c.CLIENTE_ID=?;";

            PreparedStatement st = con.prepareStatement(selectSql);

            st.setLong(1, id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                usuario.setLogin(rs.getString("usuario_login"));
                usuario.setSenha(rs.getString("usuario_senha"));
                cli.setUsuarioCli(usuario);

                endereco.setId(rs.getLong("endereco_id"));
                endereco.setRua(rs.getString("endereco_rua"));
                endereco.setBairro(rs.getString("endereco_bairro"));
                endereco.setCidade(rs.getString("endereco_cidade"));
                endereco.setCep(rs.getString("endereco_cep"));
                endereco.setComplemento(rs.getString("endereco_complemento"));
                endereco.setUf(rs.getString("endereco_uf"));
                endereco.setNumero(rs.getString("endereco_numero"));
                cli.setEnderecoCli(endereco);

                contato.setId(rs.getLong("contato_id"));
                contato.setCelular(rs.getString("contato_celular"));
                contato.setEmail(rs.getString("contato_email"));
                cli.setContatoCli(contato);

                cli.setIdCli(rs.getLong("cliente_id"));
                cli.setNomeCli(rs.getString("cliente_nome"));
                cli.setCpfCli(rs.getString("cliente_cpf"));
                cli.setDataNascimento(rs.getDate("cliente_data_nascimento"));
            }
            rs.close();
            st.close();
            con.close();
            System.out.println(MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_SUCESSO_PROCURARCLI));
            return cli;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Cliente getPorSenha(String senha) {
        try {

            con = ConnectionFactory.getConnection();

            String selectSql = "SELECT * FROM CLIENTE c, USUARIO u, ENDERECO e, CONTATO co WHERE c.CLIENTE_ENDERECO = e.ENDERECO_ID AND c.CLIENTE_CONTATO = co.CONTATO_ID AND c.CLIENTE_USU = u.USUARIO_SENHA AND u.USUARIO_SENHA=?;";

            PreparedStatement st = con.prepareStatement(selectSql);

            st.setString(1, senha);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                usuario.setLogin(rs.getString("usuario_login"));
                usuario.setSenha(rs.getString("usuario_senha"));
                cli.setUsuarioCli(usuario);

                endereco.setId(rs.getLong("endereco_id"));
                endereco.setRua(rs.getString("endereco_rua"));
                endereco.setBairro(rs.getString("endereco_bairro"));
                endereco.setCidade(rs.getString("endereco_cidade"));
                endereco.setCep(rs.getString("endereco_cep"));
                endereco.setComplemento(rs.getString("endereco_complemento"));
                endereco.setUf(rs.getString("endereco_uf"));
                endereco.setNumero(rs.getString("endereco_numero"));
                cli.setEnderecoCli(endereco);

                contato.setId(rs.getLong("contato_id"));
                contato.setCelular(rs.getString("contato_celular"));
                contato.setEmail(rs.getString("contato_email"));
                cli.setContatoCli(contato);

                cli.setIdCli(rs.getLong("cliente_id"));
                cli.setNomeCli(rs.getString("cliente_nome"));
                cli.setCpfCli(rs.getString("cliente_cpf"));
                cli.setDataNascimento(rs.getDate("cliente_data_nascimento"));
            }
            rs.close();
            st.close();
            con.close();
            System.out.println(MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_SUCESSO_PROCURARCLI));
            return cli;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void inserir(Cliente c) throws ExceptionDao {

        try {

            con = ConnectionFactory.getConnection();

            String insertUsuario = "INSERT INTO USUARIO (USUARIO_LOGIN,USUARIO_SENHA) VALUES(?,?)";
            String insertEndereco = "INSERT INTO ENDERECO (ENDERECO_NUMERO,ENDERECO_RUA,ENDERECO_BAIRRO,ENDERECO_CIDADE,ENDERECO_COMPLEMENTO,ENDERECO_CEP, ENDERECO_UF) VALUES (?,?,?,?,?,?,?)";
            String insertContato = "INSERT INTO CONTATO (CONTATO_EMAIL,CONTATO_CELULAR) VALUES (?,?)";
            String insertCliente = "INSERT INTO CLIENTE (CLIENTE_NOME,CLIENTE_CPF,CLIENTE_DATA_NASCIMENTO,CLIENTE_ENDERECO,CLIENTE_CONTATO,CLIENTE_USU) VALUES (?,?,?,?,?,?)";

            PreparedStatement st = con.prepareStatement(insertUsuario,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, c.getUsuarioCli().getLogin());
            st.setString(2, c.getUsuarioCli().getSenha());

            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();

            while (rs.next()) {
                senhaUsuario = rs.getInt(1);
            }

            st = con.prepareStatement(insertEndereco,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, c.getEnderecoCli().getNumero());
            st.setString(2, c.getEnderecoCli().getRua());
            st.setString(3, c.getEnderecoCli().getBairro());
            st.setString(4, c.getEnderecoCli().getCidade());
            st.setString(5, c.getEnderecoCli().getComplemento());
            st.setString(6, c.getEnderecoCli().getCep());
            st.setString(7, c.getEnderecoCli().getUf());

            st.executeUpdate();

            rs = st.getGeneratedKeys();

            while (rs.next()) {
                idEndereco = rs.getInt(1);
            }

            st = con.prepareStatement(insertContato,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, c.getContatoCli().getEmail());
            st.setString(2, c.getContatoCli().getCelular());

            st.executeUpdate();

            rs = st.getGeneratedKeys();

            while (rs.next()) {
                idContato = rs.getInt(1);
            }

            st = con.prepareStatement(insertCliente);

            st.setString(1, c.getNomeCli());
            st.setString(2, c.getCpfCli());

            java.sql.Date dataDB = new java.sql.Date(c.getDataNascimento().getTime());

            st.setDate(3, dataDB);

            st.setInt(4, idEndereco);
            st.setInt(5, idContato);
            st.setInt(6, senhaUsuario);

            st.executeUpdate();
            st.close();

            System.out.println(MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_SUCESSO_SALVARCLI));

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_ERRO_SALVARCLI));
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void editar(Cliente c) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String updateCliente = "UPDATE CLIENTE SET CLIENTE_NOME=?,CLIENTE_CPF=?,CLIENTE_DATA_NASCIMENTO=?,CLIENTE_ENDERECO=?,CLIENTE_CONTATO=?,CLIENTE_USU=? WHERE CLIENTE_ID=?";
            String updateEndereco = "UPDATE ENDERECO SET ENDERECO_NUMERO=?,ENDERECO_RUA=?,ENDERECO_BAIRRO=?,ENDERECO_CIDADE=?,ENDERECO_COMPLEMENTO=?,ENDERECO_CEP=?,ENDERECO_UF=? WHERE ENDERECO_ID=?";
            String updateContato = "UPDATE CONTATO SET CONTATO_EMAIL=?,CONTATO_CELULAR=? WHERE CONTATO_ID=?";
            String updateUsuario = "UPDATE USUARIO SET USUARIO_SENHA=?,USUARIO_LOGIN=? WHERE USUARIO_SENHA=?";

            PreparedStatement st = con.prepareStatement(updateUsuario, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, c.getUsuarioCli().getSenha());
            st.setString(2, c.getUsuarioCli().getLogin());
            st.setString(3, c.getUsuarioCli().getSenha());
            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()) {
                senhaUsuario = rs.getInt(1);
            }

            st = con.prepareStatement(updateEndereco, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, c.getEnderecoCli().getNumero());
            st.setString(2, c.getEnderecoCli().getRua());
            st.setString(3, c.getEnderecoCli().getBairro());
            st.setString(4, c.getEnderecoCli().getCidade());
            st.setString(5, c.getEnderecoCli().getComplemento());
            st.setString(6, c.getEnderecoCli().getCep());
            st.setString(7, c.getEnderecoCli().getUf());
            st.setLong(8, c.getEnderecoCli().getId());
            st.executeUpdate();

            rs = st.getGeneratedKeys();
            while (rs.next()) {
                idEndereco = rs.getInt(1);
            }

            st = con.prepareStatement(updateContato, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, c.getContatoCli().getEmail());
            st.setString(2, c.getContatoCli().getCelular());
            st.setLong(3, c.getContatoCli().getId());
            st.executeUpdate();

            rs = st.getGeneratedKeys();
            while (rs.next()) {
                idContato = rs.getInt(1);
            }

            st = con.prepareStatement(updateCliente, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, c.getNomeCli());
            st.setString(2, c.getCpfCli());
            java.sql.Date dataDB = new java.sql.Date(c.getDataNascimento().getTime());
            st.setDate(3, dataDB);
            st.setInt(4, idEndereco);
            st.setInt(5, idContato);
            st.setInt(6, senhaUsuario);
            st.setLong(7, c.getIdCli());
            st.executeUpdate();

            System.out.println(MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_SUCESSO_EDITARCLI));

            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_ERRO_EDITARCLI));
        }

    }

    public void remover(Cliente c) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String deleteUsu = "DELETE FROM USUARIO WHERE USUARIO_SENHA=?";
            String deleteCont = "DELETE FROM CONTATO WHERE CONTATO_ID=?";
            String deleteEnd = "DELETE FROM ENDERECO WHERE ENDERECO_ID=?";
            String deleteCliente = "DELETE FROM CLIENTE WHERE CLIENTE_ID=?";

            PreparedStatement st = con.prepareStatement(deleteCliente);
            st.setLong(1, c.getIdCli());
            st.executeUpdate();

            st = con.prepareStatement(deleteCont);
            st.setLong(1, c.getContatoCli().getId());
            st.executeUpdate();

            st = con.prepareStatement(deleteEnd);
            st.setLong(1, c.getEnderecoCli().getId());
            st.executeUpdate();

            st = con.prepareStatement(deleteUsu);
            st.setString(1, c.getUsuarioCli().getSenha());
            st.executeUpdate();

            st.close();
            con.close();
            System.out.println(MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_SUCESSO_REMOVERCLI));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_ERRO_REMOVERCLI));
        }

    }

    public List<Cliente> listar() throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            List<Cliente> clientes = new ArrayList<Cliente>();

            String selectSql = "SELECT * FROM CLIENTE c, USUARIO u, ENDERECO e, CONTATO co WHERE c.CLIENTE_ENDERECO = e.ENDERECO_ID AND c.CLIENTE_CONTATO = co.CONTATO_ID AND c.CLIENTE_USU = u.USUARIO_SENHA;";

            PreparedStatement st = con.prepareStatement(selectSql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                Usuario usu = new Usuario();
                Endereco ende = new Endereco();
                Contato cont = new Contato();

                cliente.setIdCli(rs.getLong("cliente_id"));
                cliente.setNomeCli(rs.getString("cliente_nome"));
                cliente.setCpfCli(rs.getString("cliente_cpf"));
                cliente.setDataNascimento(rs.getDate("cliente_data_nascimento"));

                usu.setLogin(rs.getString("usuario_login"));
                usu.setSenha(rs.getString("usuario_senha"));
                cliente.setUsuarioCli(usu);

                cont.setId(rs.getLong("contato_id"));
                cont.setCelular(rs.getString("contato_celular"));
                cont.setEmail(rs.getString("contato_email"));
                cliente.setContatoCli(cont);

                ende.setId(rs.getLong("endereco_id"));
                ende.setRua(rs.getString("endereco_rua"));
                ende.setBairro(rs.getString("endereco_bairro"));
                ende.setCidade(rs.getString("endereco_cidade"));
                ende.setCep(rs.getString("endereco_cep"));
                ende.setComplemento(rs.getString("endereco_complemento"));
                ende.setUf(rs.getString("endereco_uf"));
                ende.setNumero(rs.getString("endereco_numero"));
                cliente.setEnderecoCli(ende);

                clientes.add(cliente);
            }
            st.close();
            con.close();
            System.out.println(MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_SUCESSO_LISTARCLI));
            return clientes;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilCliente.getValor(MensagemUtilCliente.MSG_ERRO_LISTARCLI));
        }

    }
}
