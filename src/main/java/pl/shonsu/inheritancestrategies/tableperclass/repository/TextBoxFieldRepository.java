package pl.shonsu.inheritancestrategies.tableperclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.shonsu.inheritancestrategies.tableperclass.model.TextBoxField;

@RepositoryRestResource
public interface TextBoxFieldRepository extends JpaRepository<TextBoxField,Long> {
}
