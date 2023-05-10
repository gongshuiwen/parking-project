package org.example.parking.member.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 会员车辆
 * </p>
 *
 * @author 作者
 * @since 2023-05-09
 */
@Data
@ApiModel(value = "Vehicle对象", description = "会员车辆")
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty("会员编号")
    private String memberId;

    @ApiModelProperty("车牌号")
    private String plateNo;

    @ApiModelProperty("车辆型号")
    private String vehicleInf;
}
