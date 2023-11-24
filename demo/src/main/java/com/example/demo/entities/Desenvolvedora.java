@Entity
public class Desenvolvedora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    
    @OneToMany(mappedBy = "desenvolvedora")
    private List<Jogo> jogos;
    
    // outros atributos e métodos getters/setters
}
