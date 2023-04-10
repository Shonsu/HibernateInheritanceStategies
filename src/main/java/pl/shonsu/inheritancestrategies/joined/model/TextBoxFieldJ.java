package pl.shonsu.inheritancestrategies.joined.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "J_TextBoxField")
public class TextBoxFieldJ extends FieldJ {

    private String type;

    public TextBoxFieldJ() {
        super();
    }

    public TextBoxFieldJ(Long id, String key, String label, String controlType, String type) {
        super(id, key, label, controlType);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
