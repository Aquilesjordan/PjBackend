@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pontuacao;
    
    @ManyToOne
    private Jogo jogo;
    
    @ManyToOne
    private Jogador jogador;
    
    // outros atributos e métodos getters/setters
}
