package com.beaiteam.project1beai.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class DbUser extends BaseEntity{

    @Column(unique = true)
    private String email;

    private String password;

    private String username;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
}
