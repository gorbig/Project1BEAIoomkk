package com.beaiteam.project1beai.services;

import com.beaiteam.project1beai.entities.DbUser;
import com.beaiteam.project1beai.help.ContentForUsers;
import com.beaiteam.project1beai.help.ContentForVIP;
import com.beaiteam.project1beai.help.ContentInterface;
import com.beaiteam.project1beai.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

//    @Override
//    public DbUser getUser(String email) {
//        return userRepository.findDbUserByEmail(email);
//    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        DbUser dbUser = userRepository.findDbUserByEmail(email);
//        if(Objects.nonNull(dbUser))
//            return new User(dbUser.getEmail(), dbUser.getPassword(), dbUser.getRoles());
        return null;
    }


@Override
public List<DbUser> getUser()
{
        return userRepository.findAll();

}

    @Override
    public void addNewUser(DbUser dbUser) throws IllegalAccessException {
        Optional<DbUser> newuser = userRepository.findDbUserByEmail(dbUser.getEmail());
        if(newuser.isPresent()){
            throw new IllegalAccessException("Email taken");
        }
        userRepository.save(dbUser);
    }

    @Override
    public void delete(Long userId) throws IllegalAccessException {
        boolean newuser = userRepository.existsById(userId);
        if(!newuser){
            throw new IllegalAccessException("User with id :"+ userId+" not found");
        }

        userRepository.deleteById(userId);
    }



    @Override
    public void buyNewSub(String email) throws IllegalAccessException {
        Optional<DbUser> newuser = userRepository.findDbUserByEmail(email);
        if(newuser.isPresent()){
            throw new IllegalAccessException("Email taken");
        }
        DbUser user = new DbUser();
        double howCash = newuser.get().getWallet().getCash();

        if(howCash>20) {
            System.out.println("you have successfully purchased a VIP ");
            user.setLvlOfFollow("VIP");
        userRepository.save(user);
        }
        else {
            System.out.println("Fail,there is not enough money in your wallet");
        }

    }

    @Override
    public List<String> getContent(DbUser dbUser) throws IllegalAccessException {
        ContentInterface for_User = new ContentForUsers();
        ContentInterface for_Vip = new ContentForVIP(for_User);

        Optional<DbUser> newuser = userRepository.findDbUserByEmail(dbUser.getEmail());
        List<String> arr = new ArrayList<>();
        if(newuser.isEmpty()){
            throw new IllegalAccessException("User not found");
        }
        if(newuser.get().getLvlOfFollow() != "VIP")
        {
            arr.add(for_User.getMusikI());
           return arr;
        }

        arr.add(for_Vip.getMusikI());
        return arr;


    }

//    @Override
//    public List<String> getContentServ(DbUser dbUser) {
//        Optional<DbUser> newuser = userRepository.findDbUserByEmail(dbUser.getEmail());
//        if(newuser.get().getLvlOfFollow()=="VIP"){
//            return
//        }
//    }


}
