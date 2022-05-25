package application;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_cikis;

    @FXML
    private Button btn_hakkinda;

    @FXML
    private Button btn_iletisim;

    @FXML
    void btn_cikis_click(ActionEvent event) {

    }

    @FXML
    void btn_hakkinda_click(ActionEvent event) {

    }

    @FXML
    void btn_iletisim_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_cikis != null : "fx:id=\"btn_cikis\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btn_hakkinda != null : "fx:id=\"btn_hakkinda\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btn_iletisim != null : "fx:id=\"btn_iletisim\" was not injected: check your FXML file 'Sample.fxml'.";

    }

}
