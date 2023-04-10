package pl.shonsu.inheritancestrategies.joined.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "J_Form")
public class FormJ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String formName;
    @OneToMany
    @JoinTable(name = "J_FieldForm",
            joinColumns = {@JoinColumn(name = "form_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "field_id", referencedColumnName = "id")})
    private List<FieldJ> fieldJS = new ArrayList<>();

    public FormJ() {
    }

    public FormJ(Long id, String formName, List<FieldJ> fieldJS) {
        this.id = id;
        this.formName = formName;
        this.fieldJS = fieldJS;
    }

    public List<FieldJ> getFields() {
        return fieldJS;
    }

    public Long getId() {
        return id;
    }

    public String getFormName() {
        return formName;
    }

}
