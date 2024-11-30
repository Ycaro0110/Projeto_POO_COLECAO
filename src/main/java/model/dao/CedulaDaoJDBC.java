package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import model.Cedula;

public class CedulaDaoJDBC implements InterfaceDao {

    private Connection conn;


    public CedulaDaoJDBC() throws Exception{
        this.conn = ConnFactory.getConnection();
    }
    @Override
    public void incluir(Object entidade) throws Exception {

        try {

            PreparedStatement ps = conn.prepareStatement(
              "INSERT INTO cedula(nome,valor,descricao,foto,status) VALUES(?,?,?,? "
            );
            ps.setInt(1, Cedula.getId);

        } finally {

        }
    }

    @Override
    public void editar(Object entidade) throws Exception {

    }

    @Override
    public void excluir(Object entidade) throws Exception {

    }

    @Override
    public Object pesquisarPorId(int id) throws Exception {
        return null;
    }

    @Override
    public List listar() throws Exception {
        return List.of();
    }
}
