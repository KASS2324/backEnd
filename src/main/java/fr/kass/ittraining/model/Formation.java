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
    private String description;

    @NotBlank
    private String duree;

    @NotBlank
    private String ville;

    @Column(name = "detail", columnDefinition = "VARCHAR(10000)")
    private String detail;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
            name="formation_attributs",
            joinColumns = @JoinColumn(name = "id_formation"),
            inverseJoinColumns = @JoinColumn(name="id_attributs")
    )
    private List<Attributs> attributs = new ArrayList<Attributs>();
}
