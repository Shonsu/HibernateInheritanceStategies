package pl.shonsu.inheritancestrategies.singletable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.shonsu.inheritancestrategies.singletable.model.FieldST;

public interface FieldRepositoryST extends JpaRepository<FieldST, Long> {
}