package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class giris_SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_cikis;

    @FXML
    private Button btn_iletisim;

    @FXML
    private Button btn_musteriGirisi;

    @FXML
    private Button btn_personelGirisi;

    @FXML
    void btn_cikis_click(ActionEvent event) {

    }

    @FXML
    void btn_iletisim_click(ActionEvent event) {

    }

    @FXML
    void btn_musteriGirisi_click(ActionEvent event) {

    }

    @FXML
    void btn_personelGirisi_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_cikis != null : "fx:id=\"btn_cikis\" was not injected: check your FXML file 'giris.fxml'.";
        assert btn_iletisim != null : "fx:id=\"btn_iletisim\" was not injected: check your FXML file 'giris.fxml'.";
        assert btn_musteriGirisi != null : "fx:id=\"btn_musteriGirisi\" was not injected: check your FXML file 'giris.fxml'.";
        assert btn_personelGirisi != null : "fx:id=\"btn_personelGirisi\" was not injected: check your FXML file 'giris.fxml'.";

    }

}
