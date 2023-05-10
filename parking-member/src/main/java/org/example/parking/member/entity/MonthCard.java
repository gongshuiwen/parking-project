package org.example.parking.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 会员月卡信息
 * </p>
 *
 * @author 作者
 * @since 2023-05-09
 */

@Data
@TableName("month_card")
@ApiModel(value = "MonthCard对象", description = "会员月卡信息")
public class MonthCard implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty("会员卡号")
    private String cardNo;

    @ApiModelProperty("有效期起始")
    private String start;

    @ApiModelProperty("有效期截止")
    private String ends;

    @ApiModelProperty("会员编号")
    private String memberId;
}
