@RestController
@RequestMapping("/api/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping
    public List<Avaliacao> getAllAvaliacoes() {
        return avaliacaoService.getAllAvaliacoes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Avaliacao> getAvaliacaoById(@PathVariable Long id) {
        Avaliacao avaliacao = avaliacaoService.getAvaliacaoById(id);
        return ResponseEntity.ok(avaliacao);
    }

    // outros métodos como createAvaliacao, updateAvaliacao, deleteAvaliacao, etc.
}
