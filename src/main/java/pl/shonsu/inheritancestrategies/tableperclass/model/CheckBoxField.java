package pl.shonsu.inheritancestrategies.tableperclass.model;

import jakarta.persistence.Entity;

@Entity
public class CheckBoxField extends Field {
    private String test;

    public CheckBoxField() {
        super();
    }

    public CheckBoxField(Long id, String key, String label, String controlType, String test) {
        super(id, key, label, controlType);
        this.test = test;
    }

    public String getTest() {
        return test;
    }
}
