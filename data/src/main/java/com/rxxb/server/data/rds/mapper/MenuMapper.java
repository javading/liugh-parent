package com.rxxb.server.data.rds.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rxxb.server.data.rds.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liugh123
 * @since 2018-05-03
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> findMenuByRoleCode(@Param("roleCode") String roleCode);
}
