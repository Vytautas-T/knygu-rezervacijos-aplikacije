package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Rezervacijos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int kiekis;

    private Date data;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "vartotojas_rezervacije",
            joinColumns = @JoinColumn( name = "rezervacije_id"),
            inverseJoinColumns = @JoinColumn(name = "vartotojas_id")
    )
    private Set<Vartotojei> vartotojoRezervuotaKnyga;

    public Rezervacijos() {
    }

    public Rezervacijos(int id, int kiekis, Date data, Set<Vartotojei> vartotojoRezervuotaKnyga) {
        this.id = id;
        this.kiekis = kiekis;
        this.data = data;
        this.vartotojoRezervuotaKnyga = vartotojoRezervuotaKnyga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Set<Vartotojei> getVartotojoRezervuotaKnyga() {
        return vartotojoRezervuotaKnyga;
    }

    public void setVartotojoRezervuotaKnyga(Set<Vartotojei> vartotojoRezervuotaKnyga) {
        this.vartotojoRezervuotaKnyga = vartotojoRezervuotaKnyga;
    }

    @Override
    public String toString() {
        return "Rezervacijos{" +
                "id=" + id +
                ", kiekis=" + kiekis +
                ", data=" + data +
                ", rezervuotaKnyga=" + vartotojoRezervuotaKnyga +
                '}';
    }
}
