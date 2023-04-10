package pl.shonsu.inheritancestrategies.joined.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.shonsu.inheritancestrategies.joined.model.FieldJ;

public interface FieldRepositoryJ extends JpaRepository<FieldJ, Long> {
}