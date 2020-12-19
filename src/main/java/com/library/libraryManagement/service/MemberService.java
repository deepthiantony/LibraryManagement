package com.library.libraryManagement.service;

import com.library.libraryManagement.model.Member;
import com.library.libraryManagement.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public Member addMemberService(String name,String mailId,String address) {
        Member newMember=new Member();
        newMember.setEmailId(mailId);
        newMember.setMemberName(name);
        newMember.setMemberAddress(address);
        return memberRepository.save(newMember);
    }
}
