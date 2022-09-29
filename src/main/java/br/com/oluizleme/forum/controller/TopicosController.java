package br.com.oluizleme.forum.controller;

import br.com.oluizleme.forum.controller.dto.TopicoDTO;
import br.com.oluizleme.forum.modelo.Curso;
import br.com.oluizleme.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDTO> lista(){
        Topico topico = new Topico("Dúvida Curso Spring Rest API", "Dúvida com Spring", new Curso("Spring", "Programação"));
        return TopicoDTO.converter(List.of(topico));
    }
}
