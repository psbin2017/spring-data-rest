package com.repositories.rest.repository;

import com.repositories.rest.domain.Member;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MemberRepository
 */
public interface MemberRepository extends JpaRepository<Member, Integer> {

}