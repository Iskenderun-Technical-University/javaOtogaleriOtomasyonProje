package application;

import java.net.URL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.IsteMySQL.Util.VeirtabaniUtil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.sql.*;

public class musteriAnaEkran_SampleController {
	private static final String String = null;



	public musteriAnaEkran_SampleController(){
		baglanti=VeirtabaniUtil.Baglan();
	}

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_ara;

    @FXML
    private Button btn_ayarlar;

    @FXML
    private Button btn_cikis;

    @FXML
    private Button btn_goruntule;

    @FXML
    private Button btn_guncelle;

    @FXML
    private Button btn_satinAl;

    @FXML
    private ImageView image_kullanici;

	    @FXML
	    private TableView<Kayitlar_arac> table;

	    @FXML
	    private TableColumn<Kayitlar_arac, Integer> tbl_durum;

	    @FXML
	    private TableColumn<Kayitlar_arac, Integer> tbl_id;

	    @FXML
	    private TableColumn<Kayitlar_arac, String> tbl_marka;

	    @FXML
	    private TableColumn<Kayitlar_arac, String> tbl_model;

	    @FXML
	    private TableColumn<Kayitlar_arac, String> tbl_vites;

	    @FXML
	    private TableColumn<Kayitlar_arac, String> tbl_yakit;

	    @FXML
	    private TableColumn<Kayitlar_arac, Integer> tbl_yil;
	    @FXML
	    private TableColumn<Kayitlar_arac, String> tbl_kasaTipi;

	    @FXML
	    private TableColumn<Kayitlar_arac, Integer> tbl_km;
	    @FXML
	    private TableColumn<Kayitlar_arac, Integer> tbl_fiyat;

	    @FXML
	    private Label txt_ad;

	    @FXML
	    private TextField txt_ara;

	    @FXML
	    private TextField txt_durum;

	    @FXML
	    private TextField txt_fiyat;

	    @FXML
	    private TextField txt_id;

	    @FXML
	    private TextField txt_kasaTipi;

	    @FXML
	    private TextField txt_km;

	    @FXML
	    private TextField txt_marka;

	    @FXML
	    private TextField txt_model;

	    @FXML
	    private Label txt_sifre;

	    @FXML
	    private TextField txt_vites;

	    @FXML
	    private TextField txt_yakit;

	    @FXML
	    private TextField txt_yil;


    

	Connection baglanti=null;
	PreparedStatement sorguIfadesi=null;
	ResultSet getirilen=null;
	String sql;
	
  
    
    public void DegerleriGetir(TableView tablo) {
    	sql="select*from arac";
    	ObservableList<Kayitlar_arac>kayitlarliste=FXCollections.observableArrayList();
    	try {
    		sorguIfadesi=baglanti.prepareStatement(sql);
    	    ResultSet getirilen=sorguIfadesi.executeQuery();
    	    
    	    while(getirilen.next())
    	    {
    	    	kayitlarliste.add(new Kayitlar_arac(getirilen.getInt("aId"),getirilen.getString("marka"),getirilen.getString("model"), getirilen.getInt("durum"), getirilen.getInt("yil"), getirilen.getString("yakit"), getirilen.getString("vites"), getirilen.getInt("km"), getirilen.getString("kasaTipi"), getirilen.getInt("fiyat")));
    	    	
    	    }
    	    tbl_id.setCellValueFactory(new PropertyValueFactory<>("aId"));
    		tbl_marka.setCellValueFactory(new PropertyValueFactory<>("marka"));
    		tbl_model.setCellValueFactory(new PropertyValueFactory<>("model"));
    		tbl_durum.setCellValueFactory(new PropertyValueFactory<>("durum"));
    		tbl_yil.setCellValueFactory(new PropertyValueFactory<>("yil"));
    		tbl_yakit.setCellValueFactory(new PropertyValueFactory<>("yakit"));
    		tbl_vites.setCellValueFactory(new PropertyValueFactory<>("vites"));
    		tbl_km.setCellValueFactory(new PropertyValueFactory<>("km"));
    		tbl_kasaTipi.setCellValueFactory(new PropertyValueFactory<>("kasaTipi"));
    		tbl_fiyat.setCellValueFactory(new PropertyValueFactory<>("fiyat"));
    		table.setItems(kayitlarliste);
    	    
    	
    	}catch(Exception e) {
    		System.out.println(e.getMessage().toString());
    		
    	}
    		
    	
    }

    @FXML
    void btn_ara_click(ActionEvent event) {

    }

    @FXML
    void btn_ayarlar_click(ActionEvent event) {

    }

    @FXML
    void btn_cikis_click(ActionEvent event) {

    }

    @FXML
    void btn_goruntule_click(ActionEvent event) {

    }

    @FXML
    void btn_satinAl_click(ActionEvent event) {

    }

    @FXML
    void btn_guncelle_click(ActionEvent event) {
    	DegerleriGetir(table);
    	
    }

    @FXML
    void table_mause_click(MouseEvent event) {
    	Kayitlar_arac kayit=new Kayitlar_arac();
    	kayit=(Kayitlar_arac) table.getItems().get(table.getSelectionModel().getSelectedIndex());
    	txt_id.setText(String.valueOf(kayit.getAId()));
    	txt_marka.setText(kayit.getMarka());
    	txt_model.setText(kayit.getModel());
    	txt_durum.setText(String.valueOf(kayit.getDurum()));
    	txt_yil.setText(String.valueOf(kayit.getYil()));
    	txt_yakit.setText(kayit.getYakit());
    	txt_vites.setText(kayit.getVites());
    	txt_km.setText(String.valueOf(kayit.getKm()));
    	txt_kasaTipi.setText(kayit.getKasaTipi());
    	txt_fiyat.setText(String.valueOf(kayit.getFiyat()));
    	
    	

    }

    @FXML
    void initialize() {
    	DegerleriGetir(table);
    	
 

    }
}
