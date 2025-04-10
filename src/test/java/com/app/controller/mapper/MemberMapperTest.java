package com.app.controller.mapper;

import com.app.controller.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberMapperTest {
    @Autowired
    MemberMapper memberMapper;
    @Autowired
    private MemberVO memberVO;

    //    회원가입 테스트
    @Test
    public void insert() {
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("test5678@gmail.com");
        memberVO.setMemberPassword("1234");
        memberVO.setMemberName("장보고");
        
        memberMapper.insert(memberVO);
    }
//    로그인 테스트
    @Test
    public void select() {
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("test5678@gmail.com");
        memberVO.setMemberPassword("1234");
        memberVO.setMemberName("장보고");

//        memberMapper.select(memberVO)
//                .map(MemberVO::toString)
//                .ifPresent(log::info);
        memberMapper.select(memberVO)
                .map((member) -> memberVO.toString())
                .ifPresent((member) -> {
                    log.info("{}", member);
                });
    }
}
