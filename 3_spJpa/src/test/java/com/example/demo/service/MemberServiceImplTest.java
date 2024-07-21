package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Member;
import com.example.demo.service.impl.MemberServiceImpl;

@SpringBootTest
public class MemberServiceImplTest {
	@Autowired
	MemberServiceImpl msi;
	
	//@Test
	public void addTest()
	{
		Member m = new Member("n15", "u15", "p15", "a15", "151515");
		msi.addMember(m);
		System.out.println("add success");
	}
	
	//@Test
	public void LoginMemberTest()
	{
		System.out.println(msi.LoginMember("u1", "p1"));
	}
	
	//@Test
	public void selectUsernameTest()
	{
		System.out.println(msi.selectUsername("u0"));
	}
	@Test
	public void updateMemberTest()
	{
		msi.updateMember(20, "n20", "a20");
		System.out.println("update success");
	}
	
}
