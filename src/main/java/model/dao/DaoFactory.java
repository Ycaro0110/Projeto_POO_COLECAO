package model.dao;

import java.util.List;

public class DaoFactory {

    public static CedulaDaoJDBC novaCedulaDao() throws Exception {
        return new CedulaDaoJDBC();
    }

}
