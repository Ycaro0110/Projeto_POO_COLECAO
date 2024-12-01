package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cedula;


public class CedulaDaoJDBC implements InterfaceDao<Cedula> {

    private Connection conn;

    public CedulaDaoJDBC() throws SQLException {
        this.conn = ConnFactory.getConnection();
    }

    @Override
    public void incluir(Cedula entidade) throws Exception {

        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO cedula(nome,valor,descricao,foto,status) VALUES(?,?,?,?,?) ");
            ps.setString(1, entidade.getNome());
            ps.setInt(2, entidade.getValor());
            ps.setString(3, entidade.getDescricao());
            ps.setString(4, entidade.getFoto());
            ps.setBoolean(5, entidade.isStatus());

            ps.execute();


        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    @Override
    public void editar(Cedula entidade) throws Exception {

        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE Cedula SET nome=?, valor=?, descricao=?, foto=?,pais=? status=? WHERE id=? ");
            ps.setString(1, entidade.getNome());
            ps.setInt(2, entidade.getValor());
            ps.setString(3, entidade.getDescricao());
            ps.setString(4, entidade.getFoto());
            ps.setBoolean(5, entidade.isStatus());
            ps.setString(6, entidade.getPais());
            ps.setInt(7, entidade.getId());
            ps.execute();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

    }

    @Override
    public void excluir(Cedula entidade) throws Exception {

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
    public Cedula pesquisarPorId(int id) throws Exception {

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement("SELECT * FROM Cedula WHERE id= ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Cedula c = new Cedula();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setValor(rs.getInt("valor"));
                c.setDescricao(rs.getString("descricao"));
                c.setFoto(rs.getString("foto"));
                c.setPais(rs.getString("pais"));
                c.setStatus(rs.getBoolean("status"));


                return c;
            } else {
                return null;
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

    }

    @Override
    public List<Cedula> listar() throws Exception {

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM Cedula");
            rs = ps.executeQuery();
            List<Cedula> lista = new ArrayList<>();
            while (rs.next()) {
                Cedula c = new Cedula();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setValor(rs.getInt("valor"));
                c.setDescricao(rs.getString("descricao"));
                c.setFoto(rs.getString("foto"));
                c.setPais(rs.getString("pais"));
                c.setStatus(rs.getBoolean("status"));
                lista.add(c);
            }
            return lista;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

    }
}



