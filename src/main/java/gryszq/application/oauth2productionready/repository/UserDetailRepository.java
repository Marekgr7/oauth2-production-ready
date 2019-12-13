package gryszq.application.oauth2productionready.repository;

import gryszq.application.oauth2productionready.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String name);

}
