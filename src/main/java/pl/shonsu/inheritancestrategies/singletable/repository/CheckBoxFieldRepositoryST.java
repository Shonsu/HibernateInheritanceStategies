package pl.shonsu.inheritancestrategies.singletable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.shonsu.inheritancestrategies.singletable.model.CheckBoxFieldST;

@RepositoryRestResource
public interface CheckBoxFieldRepositoryST extends JpaRepository<CheckBoxFieldST, Long> {
}