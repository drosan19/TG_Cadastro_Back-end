package fatec.cadastro_tg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.cadastro_tg.entity.Cadastro;



public interface CadastroRepository extends JpaRepository < Cadastro, Long>{
    
}
