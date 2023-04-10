package pl.shonsu.inheritancestrategies.tableperclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.shonsu.inheritancestrategies.tableperclass.model.Field;

public interface FieldRepository extends JpaRepository<Field, Long> {
}