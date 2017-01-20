package com.usaa.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.usaa.entity.Member;
import com.usaa.repo.MemberRepository;
import com.usaa.utils.MemberConstants;

/**
 * Created by rustidog
 */
@RestController
public class SearchController {
	@Autowired
	private MemberRepository repo;

	@CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/members/{memberNum}", method=RequestMethod.GET)
    public Member findByMemberNumber(@PathVariable String memberNum, HttpServletRequest request) {
        Member member = repo.findOne(memberNum); 
        request.getSession().setAttribute(MemberConstants.MEMBER_SEARCH_RESULT, member);
        return member;
    }
    
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping("/findAll")
    public List<Member> findAll() {
    	return repo.findAll();
    }
    
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/getSearchResult")
	public Member getSearchResult(HttpServletRequest request) {
		return (Member)request.getSession().getAttribute(MemberConstants.MEMBER_SEARCH_RESULT);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/searchForMember/firstName={firstName}/lastName={lastName}/email={email}/dob={dob}/homePhone={homePhone}")
	public List<Member> searchForMember(@PathVariable(required=false) String firstName, @PathVariable(required=false) String lastName,
			@PathVariable(required=false) String email, @PathVariable(required=false) String dob, @PathVariable(required=false) String homePhone) {
		if (dob!=null && !dob.isEmpty())
			dob = dob.replaceAll("-", "/");
		return repo.findByFirstNameOrLastNameOrEmailOrDobOrHomePhone(firstName, lastName, email, dob, homePhone);
	}
	
	/*@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/searchForMember/firstName={firstName}/lastName={lastName}/dob={dob}/email={email}")//&lastName={lastName}&email={email}&dob={dob}&homePhone={homePhone}")
	public List<Member> searchForMember(@PathVariable(required=false) String firstName, @PathVariable(required=false) String lastName) {
		return repo.findByFirstNameOrLastNameOrEmailOrDobOrHomePhone(firstName, lastName, "", "", "");
	}*/
}
