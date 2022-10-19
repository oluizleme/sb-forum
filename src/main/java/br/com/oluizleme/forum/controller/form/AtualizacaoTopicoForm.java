package br.com.oluizleme.forum.controller.form;

import br.com.oluizleme.forum.modelo.Topico;
import br.com.oluizleme.forum.repository.TopicoRepository;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Data
public class AtualizacaoTopicoForm {

    @NotNull
    @NotEmpty
    private String titulo;
    @NotNull @NotEmpty
    private String mensagem;
    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getReferenceById(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);
        return topico;
    }
}
