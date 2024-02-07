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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Centre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nomCentre;

    @NotBlank
    private String adresse;

    @NotBlank
    private int codePostal;

    @NotBlank
    private String ville;

    @ManyToMany(mappedBy = "centres")
    private List<Formation> formations = new ArrayList<Formation>();



}
