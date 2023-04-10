package pl.shonsu.inheritancestrategies.tableperclass.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class DropDownField extends Field {

    @OneToMany
    @JoinColumn(name = "drop_down_field_id")
    List<FieldOption> options;

    public DropDownField() {
        super();
    }

    public DropDownField(Long id, String key, String label, String controlType, List<FieldOption> options) {
        super(id, key, label, controlType);
        this.options = options;
    }

    public List<FieldOption> getOptions() {
        return options;
    }
}
