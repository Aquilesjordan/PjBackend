@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public List<Avaliacao> getAllAvaliacoes() {
        return avaliacaoRepository.findAll();
    }

    public Avaliacao getAvaliacaoById(Long id) {
        return avaliacaoRepository.findById(id).orElse(null);
    }

    // outros métodos como createAvaliacao, updateAvaliacao, deleteAvaliacao, etc.
}
