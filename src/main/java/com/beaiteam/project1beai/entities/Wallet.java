package com.beaiteam.project1beai.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
@Data
@Entity
@Table
@NoArgsConstructor
public class Wallet extends BaseEntity{

        @Id
        @SequenceGenerator(
                name = "wallet_sequence",
                sequenceName = "wallet_sequence",
                allocationSize = 1
        )
        @GeneratedValue(strategy = GenerationType.SEQUENCE,
                generator = "wallet_sequence")
        private Long id;
        


        private String address;


        private double cash;

        private String password;



}
