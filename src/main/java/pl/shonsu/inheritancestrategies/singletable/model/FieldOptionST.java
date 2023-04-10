package pl.shonsu.inheritancestrategies.singletable.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ST_FieldOption")
class FieldOptionST {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(name = "`key`")
    private String key;
    @Column(name = "`value`")
    private String value;

    public Long getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
