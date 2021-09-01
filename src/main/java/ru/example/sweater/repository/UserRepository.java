package ru.example.sweater.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.sweater.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
