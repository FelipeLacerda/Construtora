package br.com.construtora.util;

import br.com.construtora.facade.Facade;
import br.com.construtora.model.Cliente;
import br.com.construtora.Interface.IFacade;
import br.com.construtora.model.Administrador;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) throws Exception {

        Administrador a = new Administrador();
        Cliente c = new Cliente();
        /*
         Contato cont = new Contato();
         cont.setCelular("99849489");
         cont.setEmail("JordaoLacerda@ffm.com.br");

         c.setContatoCli(cont);

         Endereco ende = new Endereco();
         ende.setNumero("56");
         ende.setRua("Antonio Santo");
         ende.setBairro("Pereiros");
         ende.setCidade("Pombal");
         ende.setCep("58840-000");
         ende.setComplemento("Pr�ximo a cozinha comunit�ria.");

         c.setEnderecoCli(ende);

         c.setNomeCli("Jord�o");
         java.util.Date data;
         data = DateUtil.stringToDate("17/09/1994");
         c.setDataNascimento(data);

         Usuario usuario = new Usuario();
         usuario.setLogin("JordaoLAcerda");
         usuario.setSenha("654321");
         c.setUsuarioCli(usuario);
         c.setCpfCli("444.333.222-11");
         */
        IFacade fachada = new Facade();
        //fachada.facadeInserirCliente(c);
        //fachada.facadeListarClientes();
        //String senha = ("123");
        // c = fachada.facadeProcurarClienteSenha(senha);
        // System.out.print("Espere.. ");
        //System.out.print(c.getNomeCli() + c.getCpfCli() + c.getDataNascimento() + c.getUsuarioCli().getLogin() + c.getUsuarioCli().getSenha());
        List<Administrador> lista = new ArrayList<Administrador>();
        lista = fachada.facadeListarAdministradores();
        System.out.println(lista);
    }

}
