import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/desenvolvedoras")
public class DesenvolvedoraController {

    @Autowired
    private DesenvolvedoraService desenvolvedoraService;

    @GetMapping
    public List<Desenvolvedora> getAllDesenvolvedoras() {
        return desenvolvedoraService.getAllDesenvolvedoras();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Desenvolvedora> getDesenvolvedoraById(@PathVariable Long id) {
        Desenvolvedora desenvolvedora = desenvolvedoraService.getDesenvolvedoraById(id);
        return ResponseEntity.ok(desenvolvedora);
    }

    // outros métodos como createDesenvolvedora, updateDesenvolvedora, deleteDesenvolvedora, etc.
}
