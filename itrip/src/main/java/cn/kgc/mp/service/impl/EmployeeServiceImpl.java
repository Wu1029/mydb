package cn.kgc.mp.service.impl;

import cn.kgc.mp.entity.Employee;
import cn.kgc.mp.mapper.EmployeeMapper;
import cn.kgc.mp.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jie
 * @since 2020-04-10
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
