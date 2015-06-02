package br.com.construtora.daojdbc;

import br.com.construtora.Interface.IAdministradorDao;
import br.com.construtora.Interface.IClienteDao;
import br.com.construtora.Interface.IContratoDao;
import br.com.construtora.Interface.IImovelDao;

public class FactoryDao {

    public static IClienteDao createClienteDao() {
        return new ClienteDaoJDBC();
    }

    public static IImovelDao createImovelDao() {
        return new ImovelDaoJDBC();
    }

    public static IAdministradorDao createAdmDao() {
        return new AdministradorDaoJDBC();
    }

    public static IContratoDao createContratoDao() {
        return new ContratoDaoJDBC();
    }
}
