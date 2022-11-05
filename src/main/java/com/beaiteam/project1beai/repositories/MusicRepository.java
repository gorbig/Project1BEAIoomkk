package com.beaiteam.project1beai.repositories;

import com.beaiteam.project1beai.entities.DbUser;
import com.beaiteam.project1beai.entities.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {
}
