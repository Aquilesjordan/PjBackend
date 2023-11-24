import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
