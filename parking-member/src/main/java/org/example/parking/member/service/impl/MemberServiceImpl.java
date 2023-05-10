package org.example.parking.member.service.impl;

import org.example.parking.member.entity.Member;
import org.example.parking.member.mapper.MemberMapper;
import org.example.parking.member.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员信息 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2023-05-09
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

}
