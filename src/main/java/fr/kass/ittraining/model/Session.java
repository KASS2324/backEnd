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
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String dateStartSession;

    @NotBlank
    private String dateEndSession;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Formation formation;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
            name="session_user",
            joinColumns = @JoinColumn(name = "id_session"),
            inverseJoinColumns = @JoinColumn(name="id_user")
    )
    private List<User> users = new ArrayList<User>();

}
