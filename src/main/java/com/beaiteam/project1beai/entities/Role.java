package com.beaiteam.project1beai.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
public class Role extends BaseEntity implements GrantedAuthority {

    private String role;

    public Role(long id, String role) {
        this.setId(id);
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return getRole();
    }
}
