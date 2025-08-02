package com.example.CanteenManagemetSystem.Controller;

import com.example.CanteenManagemetSystem.Model.Users;
import com.example.CanteenManagemetSystem.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return usersService.saveUser(user);
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable int id) {
        return usersService.getUserById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Users updateUser(@PathVariable int id, @RequestBody Users user) {
        return usersService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        usersService.deleteUser(id);
        return "User deleted with id: " + id;
    }
}
