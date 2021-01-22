package bukualamat.view;

import bukualamat.BukuAlamat;
import bukualamat.model.DataPersonal;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewBukuAlamatController {
    
    @FXML
    private TableView<DataPersonal> tabelPerson;
    
    @FXML
    private TableColumn<DataPersonal,String> KolomNamaDepan;

    @FXML
    private TableColumn<DataPersonal,String> KolomNamaBelakang;

    @FXML
    private Label labelNamaDepan;

    @FXML
    private Label labelNamaBelakang;

    @FXML
    private Label labelAlamat;

    @FXML
    private Label LabelKota;

    @FXML
    private Label labelNohp;
    
    private BukuAlamat kelasUtama;
    
    public ViewBukuAlamatController(){
    }
    
    @FXML
    private void initialize(){
        KolomNamaDepan.setCellValueFactory(celldata->celldata.getValue().NamadepanProperty());
        KolomNamaBelakang.setCellValueFactory(celldata->celldata.getValue().NamabelakangProperty());
        
    }
    public void setkelasUtama(BukuAlamat bukualamat){
        this.kelasUtama= bukualamat;
        
        tabelPerson.setItems(kelasUtama.getDataPersonal());
    }

}