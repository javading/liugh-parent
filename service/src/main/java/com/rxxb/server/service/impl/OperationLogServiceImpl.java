package com.rxxb.server.data.service.impl;

import com.rxxb.server.data.rds.entity.OperationLog;
import com.rxxb.server.data.rds.mapper.OperationLogMapper;
import com.rxxb.server.data.service.IOperationLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志 服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2018-05-08
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

}
