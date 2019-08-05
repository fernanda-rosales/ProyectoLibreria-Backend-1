package mx.edu.uacm.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.uacm.security.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
