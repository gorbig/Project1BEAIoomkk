package com.beaiteam.project1beai.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Music extends BaseEntity{
    @Id
    @SequenceGenerator(
            name = "music_sequence",
            sequenceName = "music_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "music_sequence")
    Long id;

    String musicName;
    @OneToOne
    DbUser dbUser;

}
