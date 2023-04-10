package pl.shonsu.inheritancestrategies.joined.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "J_CheckBoxField")
public class CheckBoxFieldJ extends FieldJ {
    private String test;

    public CheckBoxFieldJ() {
        super();
    }

    public CheckBoxFieldJ(Long id, String key, String label, String controlType, String test) {
        super(id, key, label, controlType);
        this.test = test;
    }

    public String getTest() {
        return test;
    }
}
