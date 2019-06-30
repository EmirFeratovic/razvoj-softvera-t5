package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorisnikTest {

    @Test
    void setPrezime() {
        Korisnik k = new Korisnik();
        k.setPrezime("Feratovic");
        assertEquals("Feratovic", k.getPrezime());
    }
    @Test
    void setUsername() {
        Korisnik k = new Korisnik();
        k.setUsername("eferatovic1");
        assertEquals("eferatovic1", k.getUsername());
    }


    @Test
    void setPassword() {
        Korisnik k = new Korisnik();
        k.setUsername("eferatovic1");
        assertEquals("eferatovic1", k.getUsername());
    }

    @Test
    void toStringTest() {
        Korisnik k = new Korisnik();
        k.setIme("Faris");
        k.setPrezime("Bazdar");
        assertEquals("Faris Bazdar", k.toString());


    }

}