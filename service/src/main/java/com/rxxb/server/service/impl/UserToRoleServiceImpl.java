package com.rxxb.server.data.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.rxxb.server.data.rds.entity.UserToRole;
import com.rxxb.server.data.rds.mapper.UserToRoleMapper;
import com.rxxb.server.data.service.IUserToRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rxxb.server.data.util.ComUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2018-05-03
 */
@Service
public class UserToRoleServiceImpl extends ServiceImpl<UserToRoleMapper, UserToRole> implements IUserToRoleService {

    @Override
//    @Cacheable(value = "UserToRole",keyGenerator="wiselyKeyGenerator")
    public UserToRole selectByUserNo(String userNo) {
        EntityWrapper<UserToRole> ew = new EntityWrapper<>();
        ew.where("user_no={0}", userNo);
        List<UserToRole> userToRoleList = this.selectList(ew);
        return ComUtil.isEmpty(userToRoleList)? null: userToRoleList.get(0);
    }
}
