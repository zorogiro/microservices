package com.bugBusters.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bugBusters.model.User;
import com.bugBusters.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

	VerificationToken findByToken(String token);

	VerificationToken findByUser(User user);
}
