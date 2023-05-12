package org.example.parking.member.controller;


import org.example.parking.common.exception.BusinessException;
import org.example.parking.common.protocol.Result;
import org.example.parking.member.entity.Member;
import org.example.parking.member.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * <p>
 * 会员信息 前端控制器
 * </p>
 *
 * @author 作者
 * @since 2023-05-09
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private IMemberService memberService;

    @PostMapping("/sendMsgCode")
    public Result<String> sendMsgCode(@RequestParam String phone) {
        memberService.sendMsgCode(phone);
        return Result.success("发送成功");
    }

    @PostMapping("/login")
    public Result<Member> login(
            @RequestParam String phone,
            @RequestParam String code
    ) {
        return Result.success(memberService.login(phone, code));
    }
}
