import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public List<Jogo> getAllJogos() {
        return jogoRepository.findAll();
    }

    public Jogo getJogoById(Long id) {
        return jogoRepository.findById(id).orElse(null);
    }

    public Jogo createJogo(Jogo jogo) {
        return jogoRepository.save(jogo);
    }

    // outros métodos como updateJogo, deleteJogo, etc.
}
