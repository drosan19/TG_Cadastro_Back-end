package fatec.cadastro_tg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fatec.cadastro_tg.entity.Cadastro;
import fatec.cadastro_tg.service.CadastroService;

@RestController
@RequestMapping(value = "/cadastro")
@CrossOrigin

public class CadastroController {

    @Autowired
    private CadastroService service;


    // Listar

    @GetMapping
    public List<Cadastro> listarTodos(){
        return service.listarTodos();
    }
    

    // Cadastrar

    @PostMapping
    private Cadastro novoCadastro(@RequestBody Cadastro cadastro) {
        return service.novoCadastro(cadastro);
    }


    // Buscar

    @GetMapping(value = "{id}")
    public Optional<Cadastro> aa(@PathVariable("id") Long id){
        return service.buscaId(id);
    }

    @PutMapping("/{id}/nota")
    public Cadastro atualizarNota(@PathVariable Long id, @RequestParam float novaNota) {
        return service.atualizarNota(id, novaNota);
    }

    
}
