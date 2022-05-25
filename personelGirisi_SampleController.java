package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class personelGirisi_SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_ekle;

    @FXML
    private Button btn_goruntule1;

    @FXML
    private Button btn_goruntule11;

    @FXML
    private Button btn_satinAl;

    @FXML
    private ImageView image_personel;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> tbl_aracDurum;

    @FXML
    private TableColumn<?, ?> tbl_aracFiyat;

    @FXML
    private TableColumn<?, ?> tbl_aracId;

    @FXML
    private TableColumn<?, ?> tbl_aracMarka;

    @FXML
    private TableColumn<?, ?> tbl_aracModel;

    @FXML
    private TextField txt_aracDurum;

    @FXML
    private TextField txt_aracFiyat;

    @FXML
    private TextField txt_aracId;

    @FXML
    private TextField txt_aracMarka;

    @FXML
    private TextField txt_aracModel;

    @FXML
    private Label txt_personelAd;

    @FXML
    private Label txt_personelSoyad;

    @FXML
    private Label txt_personelSoyad1;

    @FXML
    void btn_ekle_click(ActionEvent event) {

    }

    @FXML
    void btn_guncelle_click(ActionEvent event) {

    }

    @FXML
    void btn_listele_click(ActionEvent event) {

    }

    @FXML
    void btn_sil_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_ekle != null : "fx:id=\"btn_ekle\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert btn_goruntule1 != null : "fx:id=\"btn_goruntule1\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert btn_goruntule11 != null : "fx:id=\"btn_goruntule11\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert btn_satinAl != null : "fx:id=\"btn_satinAl\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert image_personel != null : "fx:id=\"image_personel\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert tbl_aracDurum != null : "fx:id=\"tbl_aracDurum\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert tbl_aracFiyat != null : "fx:id=\"tbl_aracFiyat\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert tbl_aracId != null : "fx:id=\"tbl_aracId\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert tbl_aracMarka != null : "fx:id=\"tbl_aracMarka\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert tbl_aracModel != null : "fx:id=\"tbl_aracModel\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert txt_aracDurum != null : "fx:id=\"txt_aracDurum\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert txt_aracFiyat != null : "fx:id=\"txt_aracFiyat\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert txt_aracId != null : "fx:id=\"txt_aracId\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert txt_aracMarka != null : "fx:id=\"txt_aracMarka\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert txt_aracModel != null : "fx:id=\"txt_aracModel\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert txt_personelAd != null : "fx:id=\"txt_personelAd\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert txt_personelSoyad != null : "fx:id=\"txt_personelSoyad\" was not injected: check your FXML file 'personelGirisi.fxml'.";
        assert txt_personelSoyad1 != null : "fx:id=\"txt_personelSoyad1\" was not injected: check your FXML file 'personelGirisi.fxml'.";

    }

}
