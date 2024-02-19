package dev.xp4.article.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.xp4.article.persistence.entity.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {
}
