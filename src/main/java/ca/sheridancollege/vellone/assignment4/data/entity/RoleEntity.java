package ca.sheridancollege.vellone.assignment4.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "role")
public class RoleEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_name", unique = true, nullable = false)
    private String roleName = "";

    @ManyToMany(mappedBy="roles")
    private List<UserEntity> users;

    public RoleEntity() {
    }
}
