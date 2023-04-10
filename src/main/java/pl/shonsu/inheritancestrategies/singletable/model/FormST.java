package pl.shonsu.inheritancestrategies.singletable.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ST_Form")
public class FormST {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String formName;
    @OneToMany
    @JoinTable(name = "ST_FieldForm",
            joinColumns = {@JoinColumn(name = "form_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "field_id", referencedColumnName = "id")})
    private List<FieldST> fieldSTS = new ArrayList<>();

    public FormST() {
    }

    public FormST(Long id, String formName, List<FieldST> fieldSTS) {
        this.id = id;
        this.formName = formName;
        this.fieldSTS = fieldSTS;
    }

    public List<FieldST> getFields() {
        return fieldSTS;
    }

    public Long getId() {
        return id;
    }

    public String getFormName() {
        return formName;
    }

}
