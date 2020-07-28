package pl.beginner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.beginner.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
