@RestController
@RequestMapping("/api/plataformas")
public class PlataformaController {

    @Autowired
    private PlataformaService plataformaService;

    @GetMapping
    public List<Plataforma> getAllPlataformas() {
        return plataformaService.getAllPlataformas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plataforma> getPlataformaById(@PathVariable Long id) {
        Plataforma plataforma = plataformaService.getPlataformaById(id);
        return ResponseEntity.ok(plataforma);
    }

    // outros métodos como createPlataforma, updatePlataforma, deletePlataforma, etc.
}
