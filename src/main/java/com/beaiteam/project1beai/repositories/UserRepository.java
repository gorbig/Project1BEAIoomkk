package com.beaiteam.project1beai.repositories;

import com.beaiteam.project1beai.entities.DbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<DbUser, Long> {
    DbUser findDbUserByEmail(String email);
}
