package br.com.oluizleme.forum.controller;

import br.com.oluizleme.forum.controller.dto.TopicoDTO;
import br.com.oluizleme.forum.modelo.Curso;
import br.com.oluizleme.forum.modelo.Topico;
import br.com.oluizleme.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDTO> lista(){
       List<Topico> topicos = topicoRepository.findAll();
        return TopicoDTO.converter(topicos);
    }
}
