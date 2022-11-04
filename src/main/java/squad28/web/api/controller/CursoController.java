package squad28.web.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import squad28.web.api.CursoRepository;
import squad28.web.api.modelo.Curso;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private CursoRepository repository;

    @GetMapping("/cursos")
    public List<Curso> getCursos() {
        List<Curso> cursos = repository.findAll();
        return cursos;
    }

    @PostMapping("/cursos")
    public Curso postCurso(@RequestBody Curso curso){
        Curso cursoSalvo = repository.save(curso);
        return cursoSalvo;
    }

    @PatchMapping("/cursos/{id}")
    public Curso updateCurso(@PathVariable("id") String id, @RequestBody Curso request){
        return repository.findById(id)
                .map(curso -> {
                    curso.setTitulo(request.getTitulo());
                    curso.setDescricao(request.getDescricao());
                    curso.setImagem(request.getImagem());
                    curso.setEstaAtivo(request.getEstaAtivo());
                    curso.setOrigemConteudo(request.getOrigemConteudo());
                    curso.setUrlConteudo(request.getUrlConteudo());
                    return repository.save(curso);
                })
                .orElseGet(() -> {
                    request.setId(id);
                    return repository.save(request);
                });
    }

    @DeleteMapping("/cursos/{id}")
    public String deleteCurso(@PathVariable("id") String id){
        String mensagem ;
        try {
            repository.deleteById(id);
            mensagem = "Curso deletado com sucesso";
        } catch (Exception e) {
            mensagem = "Erro ao deletar curso";
        }
        return mensagem;
    }

}
