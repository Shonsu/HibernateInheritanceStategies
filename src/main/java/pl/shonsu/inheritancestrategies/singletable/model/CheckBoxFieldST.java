package pl.shonsu.inheritancestrategies.singletable.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CheckBox")
public class CheckBoxFieldST extends FieldST {
    private String test;

    public CheckBoxFieldST() {
        super();
    }

    public CheckBoxFieldST(Long id, String key, String label, String controlType, String test) {
        super(id, key, label, controlType);
        this.test = test;
    }

    public String getTest() {
        return test;
    }
}
