package fr.kass.ittraining.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nom;

    @NotBlank
    private String prenom;

    private String entreprise;

    //@NotBlank
    private String telephones;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password; // revoir et à hasher  avec sécurité et inscription au site

    @NotBlank
    private String role; // peut faire en enum plus tard

    @ManyToMany(mappedBy = "users")
    private List<Session> sessions = new ArrayList<Session>();

    @OneToMany(mappedBy = "user")
    private List<DemandePersonalisee> demandes= new ArrayList<>();


}
