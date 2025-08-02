package com.example.CanteenManagemetSystem.Service;

import com.example.CanteenManagemetSystem.Model.Users;
import com.example.CanteenManagemetSystem.Repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public Users saveUser(Users user) {
        return usersRepository.save(user);
    }

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public Optional<Users> getUserById(int id) {
        return usersRepository.findById(id);
    }

    public void deleteUser(int id) {
        usersRepository.deleteById(id);
    }

    public Users updateUser(int id, Users userDetails) {
        Optional<Users> optionalUser = usersRepository.findById(id);
        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            user.setPassword(userDetails.getPassword());
            user.setRole(userDetails.getRole());
            return usersRepository.save(user);
        } else {
            return null;
        }
    }
}
