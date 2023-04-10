package pl.shonsu.inheritancestrategies.singletable.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@DiscriminatorValue("DropDown")
public class DropDownFieldST extends FieldST {

    @OneToMany
    @JoinColumn(name = "drop_down_field_id")
    List<FieldOptionST> options;

    public DropDownFieldST() {
        super();
    }

    public DropDownFieldST(Long id, String key, String label, String controlType, List<FieldOptionST> options) {
        super(id, key, label, controlType);
        this.options = options;
    }

    public List<FieldOptionST> getOptions() {
        return options;
    }
}
