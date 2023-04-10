package pl.shonsu.inheritancestrategies.singletable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.shonsu.inheritancestrategies.singletable.model.TextBoxFieldST;

@RepositoryRestResource
public interface TextBoxFieldRepositoryST extends JpaRepository<TextBoxFieldST,Long> {
}
