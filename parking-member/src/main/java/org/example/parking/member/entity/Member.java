package org.example.parking.member.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 会员信息
 * </p>
 *
 * @author 作者
 * @since 2023-05-09
 */

@Data
@ApiModel(value = "Member对象", description = "会员信息")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("生日")
    private String birth;

    @ApiModelProperty("姓名")
    private String fullName;
}
