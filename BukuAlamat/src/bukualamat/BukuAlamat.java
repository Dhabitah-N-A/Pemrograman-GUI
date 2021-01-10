/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class BukuAlamat extends Application {
    
    private Stage stageAplikasi;
    private BorderPane rootAplikasi;

    @Override
    public void start(Stage PrimaryStage){
       this.stageAplikasi = PrimaryStage;
       this.stageAplikasi.setTitle("BUKU ALAMAT");
       
       initGUIkerangka();
        try {
            initViewBukuAlamat();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    private void initGUIkerangka() {
        
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(BukuAlamat.class.getResource("view/GuiKerangka.fxml"));
            try {
                rootAplikasi = (BorderPane)loader.load();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            
            Scene sceneAplikasi = new Scene(rootAplikasi);
            
            stageAplikasi.setScene(sceneAplikasi);
            stageAplikasi.show();
            
    }

    private void initViewBukuAlamat() throws IOException {
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(BukuAlamat.class.getResource("view/BukuAlamat.fxml"));
       AnchorPane guiIsi = (AnchorPane)loader.load();
       rootAplikasi.setCenter(guiIsi);
    }
}
