package br.com.oluizleme.forum.controller.form;

import br.com.oluizleme.forum.modelo.Curso;
import br.com.oluizleme.forum.modelo.Topico;
import br.com.oluizleme.forum.repository.CursoRepository;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class TopicoForm {
    @NotNull @NotEmpty @Min(5)
    private String titulo;
    @NotNull @NotEmpty @Min(10)
    private String mensagem;
    @NotNull @NotEmpty
    private String nomeCurso;


    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
