package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Vartotojei {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String passward;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "vartotojas_knygos",
            joinColumns = @JoinColumn( name = "vartotojas_id"),
            inverseJoinColumns = @JoinColumn(name = "knygos_id")
    )
    private Set<Vartotojei> vartotojoMegstamosKnygos;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "vartotojas_rezervacije",
            joinColumns = @JoinColumn( name = "vartotojas_id"),
            inverseJoinColumns = @JoinColumn(name = "rezervacije_id")
    )
    private Set<Vartotojei> vartotojoRezervacije;

    public Vartotojei() {
    }


}
