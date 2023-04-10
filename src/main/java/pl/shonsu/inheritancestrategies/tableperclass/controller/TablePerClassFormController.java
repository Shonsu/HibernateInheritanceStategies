package pl.shonsu.inheritancestrategies.tableperclass.controller;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;
import pl.shonsu.inheritancestrategies.tableperclass.model.CheckBoxField;
import pl.shonsu.inheritancestrategies.tableperclass.model.Field;
import pl.shonsu.inheritancestrategies.tableperclass.model.Form;
import pl.shonsu.inheritancestrategies.tableperclass.model.TextBoxField;
import pl.shonsu.inheritancestrategies.tableperclass.repository.FieldRepository;
import pl.shonsu.inheritancestrategies.tableperclass.repository.FormRepository;

import java.util.List;

@RequestMapping("/tableperclass")
@RestController
class TablePerClassFormController {
    private final FormRepository formRepository;
    private final FieldRepository fieldRepository;

    public TablePerClassFormController(FormRepository formRepository, FieldRepository fieldRepository) {
        this.formRepository = formRepository;
        this.fieldRepository = fieldRepository;
    }

    @PostMapping
    @Transactional
    void createForm() {
        Field field = new TextBoxField(null, "key", "label", "controltype", "text");
        Field field2 = new CheckBoxField(null, "key", "label", "controltype", "checkbox");
        List<Field> fields = fieldRepository.saveAll(List.of(field, field2));
        Form form = new Form(null, "test form", fields);
        form = formRepository.save(form);
    }

    @GetMapping("/{id}")
    Form getForm(@PathVariable Long id){
        return formRepository.findById(id).orElseThrow();
    }
}
