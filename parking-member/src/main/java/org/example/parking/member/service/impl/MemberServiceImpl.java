package org.example.parking.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.parking.common.exception.BusinessException;
import org.example.parking.member.entity.Member;
import org.example.parking.member.mapper.MemberMapper;
import org.example.parking.member.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Random;

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

    private static final Duration MSG_CODE_DURATION = Duration.ofMinutes(10);
    private static final Random MSG_CODE_RANDOM = new Random();
    private static final String MSG_CODE_PREFIX = "MSG_CODE:";

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Override
    public void sendMsgCode(String phone) {
        String code = String.format("%06d", MSG_CODE_RANDOM.nextInt(1000000));
        redisTemplate.opsForValue().set(MSG_CODE_PREFIX + phone, code, MSG_CODE_DURATION);

        // TODO: 调用发送短信接口
    }

    @Override
    public Member login(String phone, String code) {
        return null;
    }
}
