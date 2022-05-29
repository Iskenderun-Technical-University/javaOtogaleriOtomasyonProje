package application;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class girisEkrani_SampleController {

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
    	Alert alert=new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Otogaleri Otomasyonu");
    	alert.setHeaderText("Çýkýþ");
    	alert.setContentText("Çýkmak istediðinizden emin misiniz?");
    	
    	ButtonType buton1=new ButtonType("Evet");
    	ButtonType buton2=new ButtonType("Hayýr");
    	alert.getButtonTypes().setAll(buton1,buton2);
    	Optional<ButtonType> sonuc=alert.showAndWait();
    	
    	if(sonuc.get()==buton1) {
    		System.out.println("Evet butonuna týklayýnca");
    	}
    	else if(sonuc.get()==buton2) {
    		System.out.println("Hayýr butonuna týklayýnca");	
    	}

    }

    @FXML
    void btn_iletisim_click(ActionEvent event) {
    	Alert alert=new Alert(AlertType.INFORMATION);
    	alert.setTitle("Otogaleri Otomasyonu");
    	alert.setHeaderText("Ýletiþim Bilgileri");
    	alert.setContentText("Telefon: 0540 500 00 80 "+"     "+
    	"Mail: nyucel.mdbf19@iste.edu.tr");
    	
    	
    	alert.showAndWait();
    	
    	

    }

    @FXML
    void btn_musteriGirisi_click(ActionEvent event) {
    	   try {
   	    	Parent root = FXMLLoader.load(getClass().getResource("musteriGirisEkran.fxml"));
               Stage stage = new Stage();
               Scene scene = new Scene(root);
          
               scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
               stage.setScene(scene);
               stage.show();
   	    	
   	    }catch(Exception e) {
   	    	
   	    }

    }

    @FXML
    void btn_personelGirisi_click(ActionEvent event) {
    	    try {
    	    	Parent root = FXMLLoader.load(getClass().getResource("personelGirisEkrani.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
           
                scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
                stage.setScene(scene);
                stage.show();
    	    	
    	    }catch(Exception e) {
    	    	
    	    }
    	
    	    

    }

    @FXML
    void initialize() {
        assert btn_cikis != null : "fx:id=\"btn_cikis\" was not injected: check your FXML file 'girisEkrani.fxml'.";
        assert btn_iletisim != null : "fx:id=\"btn_iletisim\" was not injected: check your FXML file 'girisEkrani.fxml'.";
        assert btn_musteriGirisi != null : "fx:id=\"btn_musteriGirisi\" was not injected: check your FXML file 'girisEkrani.fxml'.";
        assert btn_personelGirisi != null : "fx:id=\"btn_personelGirisi\" was not injected: check your FXML file 'girisEkrani.fxml'.";

    }

}
