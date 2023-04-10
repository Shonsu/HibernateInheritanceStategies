package pl.shonsu.inheritancestrategies.joined.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "J_DropDownField")
public class DropDownFieldJ extends FieldJ {

    @OneToMany
    @JoinColumn(name = "drop_down_field_id")
    List<FieldOptionJ> options;

    public DropDownFieldJ() {
        super();
    }

    public DropDownFieldJ(Long id, String key, String label, String controlType, List<FieldOptionJ> options) {
        super(id, key, label, controlType);
        this.options = options;
    }

    public List<FieldOptionJ> getOptions() {
        return options;
    }
}
