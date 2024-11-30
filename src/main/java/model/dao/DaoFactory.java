package model.dao;

import java.util.List;

public class DaoFactory {

    public static CedulaDaoJDBC novoContatoDao() throws Exception {
        return new CedulaDaoJDBC();
    }

}
