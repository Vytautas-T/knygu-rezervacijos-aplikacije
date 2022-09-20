package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Kategorijos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    String pavadinimas;

    String aprasymas;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "knygos_kategorijos",
            joinColumns = @JoinColumn(name = "kategorijos_id"),
            inverseJoinColumns = @JoinColumn(name = "knygos_id")
    )
    Set<Kategorijos> kategorijeKnygoje;

    public Kategorijos() {
    }

    public Kategorijos(int id, String pavadinimas, String aprasymas, Set<Kategorijos> kategorijeKnygoje) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.aprasymas = aprasymas;
        this.kategorijeKnygoje = kategorijeKnygoje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public Set<Kategorijos> getKategorijeKnygoje() {
        return kategorijeKnygoje;
    }

    public void setKategorijeKnygoje(Set<Kategorijos> kategorijeKnygoje) {
        this.kategorijeKnygoje = kategorijeKnygoje;
    }

    @Override
    public String toString() {
        return "Kategorijos{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", aprasymas='" + aprasymas + '\'' +
                ", kategorijeKnygoje=" + kategorijeKnygoje +
                '}';
    }
}
