package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class musteriGirisi_SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_goruntule;

    @FXML
    private Button btn_satinAl;

    @FXML
    private ImageView image_arac;

    @FXML
    private ImageView image_kullanici;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> tbl_durum;

    @FXML
    private TableColumn<?, ?> tbl_fiyat;

    @FXML
    private TableColumn<?, ?> tbl_id;

    @FXML
    private TableColumn<?, ?> tbl_marka;

    @FXML
    private TableColumn<?, ?> tbl_model;

    @FXML
    private Label txt_ad;

    @FXML
    private Label txt_soyad;

    @FXML
    private Label txt_soyad1;

    @FXML
    void btn_goruntule_click(ActionEvent event) {

    }

    @FXML
    void btn_satinAl_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_goruntule != null : "fx:id=\"btn_goruntule\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert btn_satinAl != null : "fx:id=\"btn_satinAl\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert image_arac != null : "fx:id=\"image_arac\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert image_kullanici != null : "fx:id=\"image_kullanici\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert tbl_durum != null : "fx:id=\"tbl_durum\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert tbl_fiyat != null : "fx:id=\"tbl_fiyat\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert tbl_id != null : "fx:id=\"tbl_id\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert tbl_marka != null : "fx:id=\"tbl_marka\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert tbl_model != null : "fx:id=\"tbl_model\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert txt_ad != null : "fx:id=\"txt_ad\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert txt_soyad != null : "fx:id=\"txt_soyad\" was not injected: check your FXML file 'musteriGirisi.fxml'.";
        assert txt_soyad1 != null : "fx:id=\"txt_soyad1\" was not injected: check your FXML file 'musteriGirisi.fxml'.";

    }

}
