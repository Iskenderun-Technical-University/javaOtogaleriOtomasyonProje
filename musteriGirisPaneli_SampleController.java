package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class musteriGirisPaneli_SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_girisYap;

    @FXML
    private Button btn_uyeOl;

    @FXML
    private TextField txt_kullaniciAdi;

    @FXML
    private TextField txt_sifre;

    @FXML
    void btn_girisYap_click(ActionEvent event) {

    }

    @FXML
    void btn_uyeOl_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_girisYap != null : "fx:id=\"btn_girisYap\" was not injected: check your FXML file 'musteriGirisPaneli.fxml'.";
        assert btn_uyeOl != null : "fx:id=\"btn_uyeOl\" was not injected: check your FXML file 'musteriGirisPaneli.fxml'.";
        assert txt_kullaniciAdi != null : "fx:id=\"txt_kullaniciAdi\" was not injected: check your FXML file 'musteriGirisPaneli.fxml'.";
        assert txt_sifre != null : "fx:id=\"txt_sifre\" was not injected: check your FXML file 'musteriGirisPaneli.fxml'.";

    }

}
