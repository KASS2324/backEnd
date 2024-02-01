package fr.kass.ittraining.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private String categorie;

    @NotBlank
    private String theme;

    @NotBlank
    private String sousTheme;

    @NotBlank
    private String prix;

    @NotBlank
    private String description;

    @NotBlank
    private String duree;

    @NotBlank
    private String ville;
}
