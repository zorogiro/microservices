package com.bugBusters.service;

import com.bugBusters.model.User;

public interface MailService {

	void sendVerificationToken(String token, User user);
}
