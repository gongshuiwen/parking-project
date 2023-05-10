package org.example.parking.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.parking.member.entity.MonthCard;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 会员月卡信息 Mapper 接口
 * </p>
 *
 * @author 作者
 * @since 2023-05-09
 */
@Mapper
public interface MonthCardMapper extends BaseMapper<MonthCard> {

}
