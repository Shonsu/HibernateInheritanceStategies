package pl.shonsu.inheritancestrategies.tableperclass.model;

import jakarta.persistence.Entity;

@Entity
public class TextBoxField extends Field {

    private String type;

    public TextBoxField() {
        super();
    }

    public TextBoxField(Long id, String key, String label, String controlType,String type) {
        super(id, key, label, controlType);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
