package pl.shonsu.inheritancestrategies.singletable.controller;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;
import pl.shonsu.inheritancestrategies.singletable.model.CheckBoxFieldST;
import pl.shonsu.inheritancestrategies.singletable.model.FieldST;
import pl.shonsu.inheritancestrategies.singletable.model.FormST;
import pl.shonsu.inheritancestrategies.singletable.model.TextBoxFieldST;
import pl.shonsu.inheritancestrategies.singletable.repository.FieldRepositoryST;
import pl.shonsu.inheritancestrategies.singletable.repository.FormRepositoryST;

import java.util.List;

@RequestMapping("/singletable")
@RestController
class SingleTableFormController {
    private final FormRepositoryST formRepositoryST;
    private final FieldRepositoryST fieldRepositoryST;

    public SingleTableFormController(FormRepositoryST formRepositoryST, FieldRepositoryST fieldRepositoryST) {
        this.formRepositoryST = formRepositoryST;
        this.fieldRepositoryST = fieldRepositoryST;
    }

    @PostMapping
    @Transactional
    void createForm() {
        FieldST fieldST = new TextBoxFieldST(null, "key", "label", "controltype", "text");
        FieldST fieldST2 = new CheckBoxFieldST(null, "key", "label", "controltype", "checkbox");
        List<FieldST> fieldSTS = fieldRepositoryST.saveAll(List.of(fieldST, fieldST2));
        FormST formST = new FormST(null, "test form", fieldSTS);
        formST = formRepositoryST.save(formST);
    }

    @GetMapping("/{id}")
    FormST getForm(@PathVariable Long id){
        return formRepositoryST.findById(id).orElseThrow();
    }
}
