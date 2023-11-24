@Service
public class DesenvolvedoraService {

    @Autowired
    private DesenvolvedoraRepository desenvolvedoraRepository;

    public List<Desenvolvedora> getAllDesenvolvedoras() {
        return desenvolvedoraRepository.findAll();
    }

    public Desenvolvedora getDesenvolvedoraById(Long id) {
        return desenvolvedoraRepository.findById(id).orElse(null);
    }

    // outros métodos como createDesenvolvedora, updateDesenvolvedora, deleteDesenvolvedora, etc.
}
