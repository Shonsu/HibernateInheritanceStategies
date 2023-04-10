package pl.shonsu.inheritancestrategies.joined.model;

import jakarta.persistence.*;

@Entity
@Table(name = "J_Filed")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class FieldJ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(name = "`key`")
    private String key;
    private String label;
    private String controlType;

    protected FieldJ() {
    }

    public FieldJ(Long id, String key, String label, String controlType) {
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
