package pl.shonsu.inheritancestrategies.joined.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.shonsu.inheritancestrategies.joined.model.DropDownFieldJ;

@RepositoryRestResource
public interface DropDownFieldRepositoryJ extends JpaRepository<DropDownFieldJ, Long> {
}