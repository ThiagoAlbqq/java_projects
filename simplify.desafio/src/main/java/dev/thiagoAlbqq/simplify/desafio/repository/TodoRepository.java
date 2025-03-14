package dev.thiagoAlbqq.simplify.desafio.repository;

import dev.thiagoAlbqq.simplify.desafio.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
