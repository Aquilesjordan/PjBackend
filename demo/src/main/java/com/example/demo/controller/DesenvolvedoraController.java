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
