import javax.persistence.*;

@Entity
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    
    @ManyToOne
    private Plataforma plataforma;
    
    @ManyToOne
    private Desenvolvedora desenvolvedora;
    
    @OneToMany(mappedBy = "jogo")
    private List<Avaliacao> avaliacoes;
    
    // outros atributos e métodos getters/setters
}
