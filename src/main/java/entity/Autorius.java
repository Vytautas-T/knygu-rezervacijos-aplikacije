package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Autorius {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String vardas;

    private String pavarde;

    private String aprasymas;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "knygos_autorius",
            joinColumns = @JoinColumn(name = "autoriaus_id"),
            inverseJoinColumns = @JoinColumn(name = "knygos_id")
    )
    private Set<Knygos> autoriausKnyga;

    public Autorius() {
    }

    public Autorius(int id, String vardas, String pavarde, String aprasymas, Set<Knygos> autoriausKnyga) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.aprasymas = aprasymas;
        this.autoriausKnyga = autoriausKnyga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(String aprasymas) {
        this.aprasymas = aprasymas;
    }

    public Set<Knygos> getAutoriausKnyga() {
        return autoriausKnyga;
    }

    public void setAutoriausKnyga(Set<Knygos> autoriausKnyga) {
        this.autoriausKnyga = autoriausKnyga;
    }

    @Override
    public String toString() {
        return "Autorius{" +
                "id=" + id +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", aprasymas='" + aprasymas + '\'' +
                ", autoriausKnyga=" + autoriausKnyga +
                '}';
    }
}
