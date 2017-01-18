package com.usaa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.usaa.entity.Member;
import com.usaa.repo.MemberRepository;

/**
 * Created by rustidog
 */
@RestController
public class SearchController {
	@Autowired
	private MemberRepository repo;

    @RequestMapping(value="/findByMemberNumber/{memberNum}", method=RequestMethod.GET)
    public Member findByMemberNumber(@PathVariable String memberNum) {
        Member member = repo.findOne(memberNum); //repo.findByMemberNumber(memberNum);
        return member;
    }
    
    @RequestMapping("/findAll")
    public List<Member> findAll() {
    	return repo.findAll();
    }
}
