package fr.kass.ittraining.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nom;

    @NotBlank
    private String prix;

    @NotBlank
    private String description; // limiter nombre de caractères maximal

    @NotBlank
    private String details;

    @NotBlank
    private String duree; // à voir si uniquement en heures

    @ManyToOne
    private Categorie categorie;

    @ManyToMany
    @JoinTable(
            name="formation_centre",
            joinColumns = @JoinColumn(name="id_formation"),
            inverseJoinColumns = @JoinColumn(name="id_centre")
    )
    List<Centre> centres= new ArrayList<Centre>();

    @ManyToMany
    @JoinTable(
            name="formation_theme",
            joinColumns = @JoinColumn(name="id_formation"),
            inverseJoinColumns = @JoinColumn(name="id_theme")
    )
    List<Theme> themes= new ArrayList<Theme>();

    @ManyToMany
    @JoinTable(
            name="formation_soustheme",
            joinColumns = @JoinColumn(name="id_formation"),
            inverseJoinColumns = @JoinColumn(name="id_soustheme")
    )
    List<Soustheme> sousthemes= new ArrayList<Soustheme>();

}
