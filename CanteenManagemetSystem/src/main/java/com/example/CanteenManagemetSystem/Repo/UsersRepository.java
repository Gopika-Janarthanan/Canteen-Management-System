package com.example.CanteenManagemetSystem.Repo;

import com.example.CanteenManagemetSystem.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    // Optional: custom query methods like findByEmail() can go here
}
