package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Knygos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String pavadinimas;

    private int PuslapiuSait;

    private String aprasymas;

    private String turinys;

    private int kiekis;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "knygos_kategorijos",
            joinColumns = @JoinColumn(name = "knygos_id"),
            inverseJoinColumns = @JoinColumn(name = "kategorijos_id")
    )
    Set<Knygos> KnygosKategorijos;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "knygos_autorius",
            joinColumns = @JoinColumn(name = "knygos_id"),
            inverseJoinColumns = @JoinColumn(name = "autoriaus_id")
    )
    private Set<Knygos> knygosAutorius;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "vartotojo_knygos",
            joinColumns = @JoinColumn( name = "knygos_id"),
            inverseJoinColumns = @JoinColumn(name = "vartotojas_id")
    )
    private Set<Knygos> KnygosMekstamosVartotojo;
    public Knygos() {
    }

    public Knygos(int id, String pavadinimas, int puslapiuSait, String aprasymas, String turinys, int kiekis, Set<Knygos> knygosKategorijos, Set<Knygos> knygosAutorius, Set<Knygos> knygosMekstamosVartotojo) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        PuslapiuSait = puslapiuSait;
        this.aprasymas = aprasymas;
        this.turinys = turinys;
        this.kiekis = kiekis;
        KnygosKategorijos = knygosKategorijos;
        this.knygosAutorius = knygosAutorius;
        KnygosMekstamosVartotojo = knygosMekstamosVartotojo;
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

    public int getPuslapiuSait() {
        return PuslapiuSait;
    }

    public void setPuslapiuSait(int puslapiuSait) {
        PuslapiuSait = puslapiuSait;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public String getTurinys() {
        return turinys;
    }

    public void setTurinys(String turinys) {
        this.turinys = turinys;
    }

    public Set<Knygos> getKnygosKategorijos() {
        return KnygosKategorijos;
    }

    public void setKnygosKategorijos(Set<Knygos> knygosKategorijos) {
        KnygosKategorijos = knygosKategorijos;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public Set<Knygos> getKnygosAutorius() {
        return knygosAutorius;
    }

    public void setKnygosAutorius(Set<Knygos> knygosAutorius) {
        this.knygosAutorius = knygosAutorius;
    }

    public Set<Knygos> getKnygosMekstamosVartotojo() {
        return KnygosMekstamosVartotojo;
    }

    public void setKnygosMekstamosVartotojo(Set<Knygos> knygosMekstamosVartotojo) {
        KnygosMekstamosVartotojo = knygosMekstamosVartotojo;
    }

    @Override
    public String toString() {
        return "Knygos{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", PuslapiuSait=" + PuslapiuSait +
                ", aprasymas='" + aprasymas + '\'' +
                ", turinys='" + turinys + '\'' +
                ", KnygosKategorijos=" + KnygosKategorijos +
                '}';
    }
}
