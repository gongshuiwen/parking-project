package org.example.parking.member.service.impl;

import org.example.parking.member.entity.Vehicle;
import org.example.parking.member.mapper.VehicleMapper;
import org.example.parking.member.service.IVehicleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员车辆 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2023-05-09
 */
@Service
public class VehicleServiceImpl extends ServiceImpl<VehicleMapper, Vehicle> implements IVehicleService {

}
