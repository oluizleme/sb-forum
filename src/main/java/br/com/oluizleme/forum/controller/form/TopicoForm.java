package br.com.oluizleme.forum.controller.form;

import br.com.oluizleme.forum.modelo.Curso;
import br.com.oluizleme.forum.modelo.Topico;
import br.com.oluizleme.forum.repository.CursoRepository;
import lombok.Data;

@Data
public class TopicoForm {

    private String titulo;
    private String mensagem;
    private String nomeCurso;


    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
