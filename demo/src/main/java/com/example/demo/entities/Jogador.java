import javax.persistence.*;
import java.util.List;

@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nickname;

    @OneToMany(mappedBy = "jogador")
    private List<Avaliacao> avaliacoes;

    // outros atributos e métodos getters/setters
}
