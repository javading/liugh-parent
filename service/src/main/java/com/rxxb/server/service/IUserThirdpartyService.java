package com.rxxb.server.data.service;

import com.rxxb.server.data.rds.entity.User;
import com.rxxb.server.data.rds.entity.UserThirdparty;
import com.rxxb.server.data.rds.model.ThirdPartyUser;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 第三方用户表 服务类
 * </p>
 *
 * @author liugh123
 * @since 2018-07-27
 */
public interface IUserThirdpartyService extends IService<UserThirdparty> {

    User insertThirdPartyUser(ThirdPartyUser param, String password)throws Exception;

}
