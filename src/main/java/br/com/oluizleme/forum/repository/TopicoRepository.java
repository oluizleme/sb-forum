package br.com.oluizleme.forum.repository;

import br.com.oluizleme.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
