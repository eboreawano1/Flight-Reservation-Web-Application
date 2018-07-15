package com.ebore.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebore.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findByEmail(String email);

}
