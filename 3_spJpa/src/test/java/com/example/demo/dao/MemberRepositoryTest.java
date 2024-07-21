package com.example.demo.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {
	@Autowired
	MemberRepository mrs;
	
	//@Test
	public void add()
	{
		mrs.save(new Member("n19", "u19", "p19", "a19", "191919"));
		System.out.println("add success");
	}
	
	//@Test
	public void selectMemberTest()
	{
		//List<Member> l = mrs.selectMember("u1", "p1");
		List<Member> l = mrs.selectUsername("u2");
		if(l.size()!=0)
		{
			System.out.println(l);
		}
	}
	
	
}
