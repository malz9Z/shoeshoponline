package com.thungashoe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thungashoe.domain.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
