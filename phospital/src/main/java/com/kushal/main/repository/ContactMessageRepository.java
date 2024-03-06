package com.kushal.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kushal.main.entity.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}

