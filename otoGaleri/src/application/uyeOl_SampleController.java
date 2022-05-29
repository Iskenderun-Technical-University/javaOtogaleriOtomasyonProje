package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.IsteMySQL.Util.VeirtabaniUtil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.sql.*;

public class uyeOl_SampleController {
	Connection baglanti=null;
	PreparedStatement sorguIfadesi=null;
	ResultSet getirilen=null;
	String sql;
	public uyeOl_SampleController(){
		baglanti=VeirtabaniUtil.Baglan();
	}
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchor_tum;

    @FXML
    private AnchorPane anchor_yan;

    @FXML
    private Button btn_uyeOl;

    @FXML
    private Button btn_yanEkranGetir;

    @FXML
    private ImageView image;

    @FXML
    private ImageView image2;

    @FXML
    private TextField txt_ad;

    @FXML
    private TextField txt_kullaniciAdi;

    @FXML
    private TextField txt_sifre;

    @FXML
    private TextField txt_soyad;

    @FXML
    void btn_uyeOl_click(ActionEvent event) {
    	sql="insert into login(kullanici_adi,sifre) values (?,?,?)";
    	
    	try {
    		sorguIfadesi=baglanti.prepareStatement(sql);
    		
    		sorguIfadesi.setString(1,txt_kullaniciAdi.getText().trim());
    		sorguIfadesi.setString(2,txt_sifre.getText().trim());
    		sorguIfadesi.executeUpdate();
    		
    		
    		
    		
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage().toString());
    		
    	}
    	

    }

    @FXML
    void btn_yanEkranGetir_click(ActionEvent event) {
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
    void initialize() {
        assert anchor_tum != null : "fx:id=\"anchor_tum\" was not injected: check your FXML file 'uyeOl.fxml'.";
        assert anchor_yan != null : "fx:id=\"anchor_yan\" was not injected: check your FXML file 'uyeOl.fxml'.";
        assert btn_uyeOl != null : "fx:id=\"btn_uyeOl\" was not injected: check your FXML file 'uyeOl.fxml'.";
        assert btn_yanEkranGetir != null : "fx:id=\"btn_yanEkranGetir\" was not injected: check your FXML file 'uyeOl.fxml'.";
        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'uyeOl.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'uyeOl.fxml'.";
        assert txt_ad != null : "fx:id=\"txt_ad\" was not injected: check your FXML file 'uyeOl.fxml'.";
        assert txt_kullaniciAdi != null : "fx:id=\"txt_kullaniciAdi\" was not injected: check your FXML file 'uyeOl.fxml'.";
        assert txt_sifre != null : "fx:id=\"txt_sifre\" was not injected: check your FXML file 'uyeOl.fxml'.";
        assert txt_soyad != null : "fx:id=\"txt_soyad\" was not injected: check your FXML file 'uyeOl.fxml'.";

    }

}

