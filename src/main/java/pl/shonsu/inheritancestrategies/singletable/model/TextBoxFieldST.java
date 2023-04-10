package pl.shonsu.inheritancestrategies.singletable.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("TextBox")
public class TextBoxFieldST extends FieldST {

    private String type;

    public TextBoxFieldST() {
        super();
    }

    public TextBoxFieldST(Long id, String key, String label, String controlType, String type) {
        super(id, key, label, controlType);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
