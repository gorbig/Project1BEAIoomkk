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
public class DbUser{

    @Id
    @SequenceGenerator(
            name = "dbUser_sequence",
            sequenceName = "dbUser_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "student_sequence")
    private Long id;
    private String name;
    private int age;
    private String email;
    private String lvlOfFollow;
    @OneToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;

    @OneToOne
    @JoinColumn(name = "music_id")
    Music music;

//
//    @ManyToMany(fetch = FetchType.EAGER)
//    private List<Role> roles;

}
