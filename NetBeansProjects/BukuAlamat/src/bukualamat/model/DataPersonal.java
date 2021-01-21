/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Asus
 */
public class DataPersonal {

    private StringProperty Namadepan = new SimpleStringProperty();
    private StringProperty Namabelakang = new SimpleStringProperty();
    private StringProperty Alamat = new SimpleStringProperty();
    private StringProperty Kotakabupaten = new SimpleStringProperty();
    private StringProperty NoHp = new SimpleStringProperty();

    public DataPersonal() {
        
    }
    public DataPersonal(String Namadepan, String Namabelakang) {
          this.Namadepan = new SimpleStringProperty(Namadepan);
          this.Namabelakang = new SimpleStringProperty(Namabelakang);
          this.Alamat = new SimpleStringProperty("Suatu Alamat");
          this.Kotakabupaten = new SimpleStringProperty("Suatu KOta");
          this.NoHp = new SimpleStringProperty("000090909");
     }

    
    
    public String getNoHp() {
        return NoHp.get();
    }

    public void setNoHp(String value) {
        NoHp.set(value);
    }

    public StringProperty NoHpProperty() {
        return NoHp;
    }
    

    public String getKotakabupaten() {
        return Kotakabupaten.get();
    }

    public void setKotakabupaten(String value) {
        Kotakabupaten.set(value);
    }

    public StringProperty KotakabupatenProperty() {
        return Kotakabupaten;
    }
    

    public String getAlamat() {
        return Alamat.get();
    }

    public void setAlamat(String value) {
        Alamat.set(value);
    }

    public StringProperty AlamatProperty() {
        return Alamat;
    }
    

    public String getNamabelakang() {
        return Namabelakang.get();
    }

    public void setNamabelakang(String value) {
        Namabelakang.set(value);
    }

    public StringProperty NamabelakangProperty() {
        return Namabelakang;
    }
    

    public String getNamadepan() {
        return Namadepan.get();
    }

    public void setNamadepan(String value) {
        Namadepan.set(value);
    }

    public StringProperty NamadepanProperty() {
        return Namadepan;
    }
    
    
}
