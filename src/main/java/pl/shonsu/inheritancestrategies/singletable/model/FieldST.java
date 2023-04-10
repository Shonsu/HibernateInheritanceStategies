package pl.shonsu.inheritancestrategies.singletable.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ST_Filed")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Field_Type")
public abstract class FieldST {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(name = "`key`")
    private String key;
    private String label;
    private String controlType;

    protected FieldST() {
    }

    public FieldST(Long id, String key, String label, String controlType) {
        this.id = id;
        this.key = key;
        this.label = label;
        this.controlType = controlType;
    }

    public Long getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getLabel() {
        return label;
    }

    public String getControlType() {
        return controlType;
    }

}
