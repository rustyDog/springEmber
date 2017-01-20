package com.usaa.repo;

import org.springframework.stereotype.Repository;

import com.usaa.entity.Member;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface MemberRepository extends MongoRepository<Member, String>{
	
	public List<Member> findByMemberNumber(String memberNumber);
	public List<Member> findByFirstNameOrLastNameOrEmailOrDobOrHomePhone(String firstName, String lastName, String email, String dob, String homePhone);

}
