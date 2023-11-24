import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public List<Jogo> getAllJogos() {
        return jogoService.getAllJogos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogo> getJogoById(@PathVariable Long id) {
        Jogo jogo = jogoService.getJogoById(id);
        return ResponseEntity.ok(jogo);
    }

    @PostMapping
    public ResponseEntity<Jogo> createJogo(@RequestBody Jogo jogo) {
        Jogo novoJogo = jogoService.createJogo(jogo);
        return new ResponseEntity<>(novoJogo, HttpStatus.CREATED);
    }

    // outros métodos como updateJogo, deleteJogo, etc.
}
