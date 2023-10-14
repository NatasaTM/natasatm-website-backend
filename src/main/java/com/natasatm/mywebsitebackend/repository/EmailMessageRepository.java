package com.natasatm.mywebsitebackend.repository;

import com.natasatm.mywebsitebackend.model.EmailMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailMessageRepository extends JpaRepository<EmailMessage,Long> {
}
