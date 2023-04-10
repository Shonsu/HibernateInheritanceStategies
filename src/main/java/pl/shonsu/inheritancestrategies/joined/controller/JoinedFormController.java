package pl.shonsu.inheritancestrategies.joined.controller;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;
import pl.shonsu.inheritancestrategies.joined.model.CheckBoxFieldJ;
import pl.shonsu.inheritancestrategies.joined.model.FieldJ;
import pl.shonsu.inheritancestrategies.joined.model.FormJ;
import pl.shonsu.inheritancestrategies.joined.model.TextBoxFieldJ;
import pl.shonsu.inheritancestrategies.joined.repository.FieldRepositoryJ;
import pl.shonsu.inheritancestrategies.joined.repository.FormRepositoryJ;

import java.util.List;

@RequestMapping("/joined")
@RestController
class JoinedFormController {
    private final FormRepositoryJ formRepositoryJ;
    private final FieldRepositoryJ fieldRepositoryJ;

    public JoinedFormController(FormRepositoryJ formRepositoryJ, FieldRepositoryJ fieldRepositoryJ) {
        this.formRepositoryJ = formRepositoryJ;
        this.fieldRepositoryJ = fieldRepositoryJ;
    }

    @PostMapping
    @Transactional
    void createForm() {
        FieldJ fieldJ = new TextBoxFieldJ(null, "key", "label", "controltype", "text");
        FieldJ fieldJ2 = new CheckBoxFieldJ(null, "key", "label", "controltype", "checkbox");
        List<FieldJ> fieldJS = fieldRepositoryJ.saveAll(List.of(fieldJ, fieldJ2));
        FormJ formJ = new FormJ(null, "test form", fieldJS);
        formJ = formRepositoryJ.save(formJ);
    }

    @GetMapping("/{id}")
    FormJ getForm(@PathVariable Long id){
        return formRepositoryJ.findById(id).orElseThrow();
    }
}
