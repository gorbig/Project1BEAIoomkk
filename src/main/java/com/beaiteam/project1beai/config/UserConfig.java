//package com.beaiteam.project1beai.config;
//
//import com.beaiteam.project1beai.entities.DbUser;
//import com.beaiteam.project1beai.repositories.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//@Configuration
//public class UserConfig {
//
//
//    CommandLineRunner commandLineRunner(UserRepository repository){
//        return args -> {
//            DbUser Mira = new DbUser(
//                    1L,
//                    "Mira",
//                    21,
//                    "adjdkakl@gmail.com"
//
//            );
//
//            DbUser Dina = new DbUser(
//                    2L,
//                    "Dina",
//                    29,
//                    "dina@gmail.com"
//
//            );
//         repository.saveAll(
//                 List.of(Mira,Dina)
//         );
//
//        };
//    }
//}
