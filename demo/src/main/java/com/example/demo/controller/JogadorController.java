@RestController
@RequestMapping("/api/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public List<Jogador> getAllJogadores() {
        return jogadorService.getAllJogadores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogador> getJogadorById(@PathVariable Long id) {
        Jogador jogador = jogadorService.getJogadorById(id);
        return ResponseEntity.ok(jogador);
    }

    // outros métodos como createJogador, updateJogador, deleteJogador, etc.
}
