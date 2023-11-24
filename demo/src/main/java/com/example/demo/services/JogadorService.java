import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public List<Jogador> getAllJogadores() {
        return jogadorRepository.findAll();
    }

    public Jogador getJogadorById(Long id) {
        return jogadorRepository.findById(id).orElse(null);
    }

    // outros métodos como createJogador, updateJogador, deleteJogador, etc.
}
