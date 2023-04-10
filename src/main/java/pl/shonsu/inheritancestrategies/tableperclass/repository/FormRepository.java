package pl.shonsu.inheritancestrategies.tableperclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.shonsu.inheritancestrategies.tableperclass.model.Form;

@RepositoryRestResource
public interface FormRepository extends JpaRepository<Form, Long> {
}