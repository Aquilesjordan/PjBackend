@Service
public class PlataformaService {

    @Autowired
    private PlataformaRepository plataformaRepository;

    public List<Plataforma> getAllPlataformas() {
        return plataformaRepository.findAll();
    }

    public Plataforma getPlataformaById(Long id) {
        return plataformaRepository.findById(id).orElse(null);
    }

    // outros métodos como createPlataforma, updatePlataforma, deletePlataforma, etc.
}
