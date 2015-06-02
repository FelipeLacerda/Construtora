package br.com.construtora.daojdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.construtora.model.Imovel;
import br.com.construtora.Interface.IImovelDao;
import br.com.construtora.model.Endereco;
import br.com.construtora.util.ConnectionFactory;
import br.com.construtora.util.MensagemUtilImovel;

public class ImovelDaoJDBC implements IImovelDao {

    private Connection con;
    private int idEndereco;
    Endereco endereco = new Endereco();
    Imovel imovel = new Imovel();

    public void inserir(Imovel i) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String insertEndereco = "INSERT INTO ENDERECO (ENDERECO_NUMERO,ENDERECO_RUA,ENDERECO_BAIRRO,ENDERECO_CIDADE,ENDERECO_COMPLEMENTO,ENDERECO_CEP,ENDERECO_UF) VALUES (?,?,?,?,?,?,?)";
            String insertImovel = "INSERT INTO IMOVEL (IMOVEL_ID,IMOVEL_TAMANHO,IMOVEL_PRECO,IMOVEL_ESPECIFICACAO,IMOVEL_ANDAMENTO,IMOVEL_ENDERECO) VALUES (?,?,?,?,?,?)";

            PreparedStatement st = con.prepareStatement(insertEndereco,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, i.getEnderecoImovel().getNumero());
            st.setString(2, i.getEnderecoImovel().getRua());
            st.setString(3, i.getEnderecoImovel().getBairro());
            st.setString(4, i.getEnderecoImovel().getCidade());
            st.setString(5, i.getEnderecoImovel().getBairro());
            st.setString(6, i.getEnderecoImovel().getCep());
            st.setString(7, i.getEnderecoImovel().getUf());

            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();

            while (rs.next()) {
                idEndereco = rs.getInt(1);
            }

            st = con.prepareStatement(insertImovel);

            st.setString(1, i.getIdImovel());
            st.setDouble(2, i.getTamanho());
            st.setDouble(3, i.getPreco());
            st.setString(4, i.getEspecificacao());
            st.setString(5, i.getAndamentoObra());
            st.setInt(6, idEndereco);

            st.executeUpdate();

            st.close();
            con.close();
            System.out.println(MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_SUCESSO_SALVARIMO));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_ERRO_SALVARIMO));
        }

    }

    public void editar(Imovel i) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String updateEndereco = "UPDATE ENDERECO SET ENDERECO_NUMERO=?,ENDERECO_RUA=?,ENDERECO_BAIRRO=?,ENDERECO_CIDADE=?,ENDERECO_COMPLEMENTO=?,ENDERECO_CEP=?,ENDERECO_UF=? WHERE ENDERECO_ID=?";
            String updateImovel = "UPDATE IMOVEL SET IMOVEL_ID=?,IMOVEL_TAMANHO=?, IMOVEL_PRECO=?,IMOVEL_ESPECIFICACAO=?,IMOVEL_ANDAMENTO=?,IMOVEL_ENDERECO=? WHERE IMOVEL_ID=?";

            PreparedStatement st = con.prepareStatement(updateEndereco, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, i.getEnderecoImovel().getNumero());
            st.setString(2, i.getEnderecoImovel().getRua());
            st.setString(3, i.getEnderecoImovel().getBairro());
            st.setString(4, i.getEnderecoImovel().getCidade());
            st.setString(5, i.getEnderecoImovel().getComplemento());
            st.setString(6, i.getEnderecoImovel().getCep());
            st.setString(7, i.getEnderecoImovel().getUf());
            st.setLong(8, i.getEnderecoImovel().getId());
            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();
            while (rs.next()) {
                idEndereco = rs.getInt(1);
            }

            st = con.prepareStatement(updateImovel, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, i.getIdImovel());
            st.setDouble(2, i.getTamanho());
            st.setDouble(3, i.getPreco());
            st.setString(4, i.getEspecificacao());
            st.setString(5, i.getAndamentoObra());
            st.setInt(6, idEndereco);
            st.setString(7, i.getIdImovel());
            st.executeUpdate();

            System.out.println(MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_SUCESSO_EDITARIMO));
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_ERRO_EDITARIMO));
        }

    }

    public void remover(Imovel i) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String deleteEnd = "DELETE FROM ENDERECO WHERE ENDERECO_ID=?";
            String deleteImovel = "DELETE FROM IMOVEL WHERE IMOVEL_ID=?";

            PreparedStatement st = con.prepareStatement(deleteImovel);
            st.setString(1, i.getIdImovel());
            st.executeUpdate();

            st = con.prepareStatement(deleteEnd);
            st.setLong(1, i.getEnderecoImovel().getId());
            st.executeUpdate();

            st.close();
            con.close();
            System.out.println(MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_SUCESSO_REMOVERIMO));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_ERRO_REMOVERIMO));
        }

    }

    public List<Imovel> listar() throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            List<Imovel> imoveis = new ArrayList<Imovel>();

            String selectSql = "SELECT * FROM IMOVEL i,ENDERECO e WHERE i.IMOVEL_ENDERECO = e.ENDERECO_ID;";

            PreparedStatement st = con.prepareStatement(selectSql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                Endereco ende = new Endereco();
                Imovel imo = new Imovel();

                imo.setIdImovel(rs.getString("imovel_id"));
                imo.setAndamentoObra(rs.getString("imovel_andamento"));
                imo.setEspecificacao(rs.getString("imovel_especificacao"));
                imo.setPreco(rs.getDouble("imovel_preco"));
                imo.setTamanho(rs.getDouble("imovel_tamanho"));

                ende.setId(rs.getLong("endereco_id"));
                ende.setRua(rs.getString("endereco_rua"));
                ende.setBairro(rs.getString("endereco_bairro"));
                ende.setCidade(rs.getString("endereco_cidade"));
                ende.setCep(rs.getString("endereco_cep"));
                ende.setComplemento(rs.getString("endereco_complemento"));
                ende.setUf(rs.getString("endereco_uf"));
                ende.setNumero(rs.getString("endereco_numero"));
                imo.setEnderecoImovel(ende);

                imoveis.add(imo);
            }
            st.close();
            con.close();
            System.out.println(MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_SUCESSO_LISTARIMO));
            return imoveis;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ExceptionDao(MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_ERRO_LISTARIMO));
        }
    }

    public Imovel getPorSenha(String senha) throws ExceptionDao {
        try {

            con = ConnectionFactory.getConnection();

            String selectSql = "SELECT * FROM IMOVEL i, ENDERECO e WHERE i.IMOVEL_ENDERECO = e.ENDERECO_ID AND i.IMOVEL_ID=?;";

            PreparedStatement st = con.prepareStatement(selectSql);

            st.setString(1, senha);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                endereco.setId(rs.getLong("endereco_id"));
                endereco.setBairro(rs.getString("endereco_bairro"));
                endereco.setCep(rs.getString("endereco_cep"));
                endereco.setCidade(rs.getString("endereco_cidade"));
                endereco.setComplemento(rs.getString("endereco_complemento"));
                endereco.setNumero(rs.getString("endereco_numero"));
                endereco.setRua(rs.getString("endereco_rua"));
                endereco.setUf(rs.getString("endereco_uf"));
                imovel.setEnderecoImovel(endereco);

                imovel.setIdImovel(rs.getString("imovel_id"));
                imovel.setAndamentoObra(rs.getString("imovel_andamento"));
                imovel.setEspecificacao(rs.getString("imovel_especificacao"));
                imovel.setPreco(rs.getDouble("imovel_preco"));
                imovel.setTamanho(rs.getDouble("imovel_tamanho"));
            }
            rs.close();
            st.close();
            con.close();
            System.out.println(MensagemUtilImovel.getValor(MensagemUtilImovel.MSG_SUCESSO_PROCURARIMO));
            return imovel;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
