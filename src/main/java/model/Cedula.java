package model;

public class Cedula {
    private int id;
    private String nome;
    private int valor;
    private String descricao;
    private String foto;
    private boolean status;
    private String pais;

    public Cedula() {
    }

    public Cedula(String nome, int valor, String descricao, boolean status, String foto) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.status = status;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
