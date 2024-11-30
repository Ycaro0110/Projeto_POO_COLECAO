package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Cedula;


public class CedulaDaoJDBC implements InterfaceDao<Cedula> {

    private Connection conn;

    public void CedulaDaoJDBC() throws SQLException {
        this.conn = ConnFactory.getConnection();
    }

    @Override
    public void incluir(Cedula entidade) throws Exception {

        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO cedula(nome,valor,descricao,foto,status) VALUES(?,?,?,?) ");
            ps.setString(1, entidade.getNome());
            ps.setInt(2, entidade.getId());
            ps.setString(3, entidade.getFoto());
            ps.setBoolean(4, entidade.isStatus());
            ps.execute();


        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        @Override
        public void editar(Cedula entidade) throws Exception {

            try {
                PreparedStatement ps = conn.prepareStatement(
                        "UPDATE Contato SET nome=?, valor=?, descricao=? foto=? status? WHERE id=?");
                ps.setString(1, entidade.getNome());
                ps.setInt(2, entidade.getValor());
                ps.setString(2, entidade.getDescricao());
                ps.setBoolean(3, entidade.isStatus());
                ps.setInt(4, entidade.getId());
                ps.execute();
            } finally {
                if (conn != null) {
                    conn.close();
                }
            }

        }

        @Override
        public void excluir (Cedula entidade) throws Exception {

            try {
                PreparedStatement ps = conn.prepareStatement(
                        "DELETE FROM Contato WHERE id=?");
                ps.setInt(1, entidade.getId());
                ps.execute();
            } finally {
                if (conn != null) {
                    conn.close();
                }
            }
        }

        @Override
        public Cedula pesquisarPorId ( int id) throws Exception {
            return null;
        }

        @Override
        public List<Cedula> listar () throws Exception {
            return List.of();
        }
    }
