package com.beaiteam.project1beai.help;

import com.beaiteam.project1beai.entities.DbUser;
import com.beaiteam.project1beai.entities.Music;
import com.beaiteam.project1beai.repositories.MusicRepository;
import com.beaiteam.project1beai.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component

public class ContentForUsers implements ContentInterface{




    @Override
    public String getMusikI() {
        return "DeSpasito";
    }
}
