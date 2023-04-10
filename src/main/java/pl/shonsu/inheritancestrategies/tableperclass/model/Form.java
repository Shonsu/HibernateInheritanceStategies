package pl.shonsu.inheritancestrategies.tableperclass.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Form")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String formName;
    @OneToMany
    @JoinTable(name = "FieldForm",
            joinColumns = {@JoinColumn(name = "form_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "field_id", referencedColumnName = "id")})
    private List<Field> fields = new ArrayList<>();

    public Form() {
    }

    public Form(Long id, String formName, List<Field> fields) {
        this.id = id;
        this.formName = formName;
        this.fields = fields;
    }

    public List<Field> getFields() {
        return fields;
    }

    public Long getId() {
        return id;
    }

    public String getFormName() {
        return formName;
    }

}
