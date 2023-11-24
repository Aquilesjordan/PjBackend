import javax.persistence.*;
import java.util.List;

@Entity
public class Plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "plataforma")
    private List<Jogo> jogos;

    // outros atributos e métodos getters/setters
}
