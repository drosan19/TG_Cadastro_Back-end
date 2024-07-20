package fatec.cadastro_tg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec.cadastro_tg.entity.Cadastro;
import fatec.cadastro_tg.repository.CadastroRepository;

@Service

public class CadastroService {

    @Autowired
    private CadastroRepository cadastroRepo;


    public List<Cadastro> listarTodos () {
        return cadastroRepo.findAll();
    }
    
    public Cadastro novoCadastro(Cadastro cadastro) {
        return cadastroRepo.save(cadastro);
    }

    public Optional <Cadastro> buscaId( Long id){
        return cadastroRepo.findById(id);
    }

    
    public Cadastro atualizarNota(Long id, float novaNota) {
        Optional<Cadastro> cadastroOptional = cadastroRepo.findById(id);
        if (cadastroOptional.isPresent()) {
            Cadastro cadastro = cadastroOptional.get();
            cadastro.setNota(novaNota);
            return cadastroRepo.save(cadastro);
        } else {
            throw new RuntimeException("Cadastro não encontrado com id: " + id);
        }
    }

   
}
