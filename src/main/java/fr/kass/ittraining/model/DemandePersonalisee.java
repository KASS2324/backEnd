package fr.kass.ittraining.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DemandePersonalisee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String typeDemande;

    @NotBlank
    private String demande;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user; // fabrique user_id

}
