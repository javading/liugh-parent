package com.rxxb.server.data.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rxxb.server.data.rds.entity.InfoToUser;
import com.rxxb.server.data.rds.mapper.InfoToUserMapper;
import com.rxxb.server.data.service.IInfoToUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户电话关系表 服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2018-10-29
 */
@Service
public class InfoToUserServiceImpl extends ServiceImpl<InfoToUserMapper, InfoToUser> implements IInfoToUserService {

}
