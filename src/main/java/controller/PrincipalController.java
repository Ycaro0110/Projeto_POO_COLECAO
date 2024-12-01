package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import model.Cedula;
import model.dao.CedulaDaoJDBC;
import model.dao.ConnFactory;
import model.dao.DaoFactory;

public class PrincipalController {

    @FXML
    private Button Adicionar;

    @FXML
    private TextField inpDescricao;

    @FXML
    private TextField inpFoto;

    @FXML
    private TextField inpNome;

    @FXML
    private TextField inpValor;

    @FXML
    private CheckBox inpStatus;


    public boolean isChecked() {
        return inpStatus.isSelected();
    }

    public void btnAdicionar(ActionEvent actionEvent) throws Exception {

        Cedula c = new Cedula();
        c.setNome(inpNome.getText());
        c.setDescricao(inpDescricao.getText());
        c.setValor(Integer.parseInt(inpValor.getText()));
        c.setFoto(inpFoto.getText());
        c.setStatus(isChecked());
        CedulaDaoJDBC dao = DaoFactory.novaCedulaDao();
        dao.incluir(c);


    }
}
