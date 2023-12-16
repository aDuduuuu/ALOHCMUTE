package hcmute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcmute.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
}