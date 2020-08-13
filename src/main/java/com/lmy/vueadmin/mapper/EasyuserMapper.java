package com.lmy.vueadmin.mapper;

import com.lmy.vueadmin.entity.Easyuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @version V1.0
 * @Project vue-admin
 * @Package com.lmy.vueadmin.mapper
 * @date 2020/8/12 15:42
 */
@Mapper
public interface EasyuserMapper {
    // 根据用户名和密码获取用户信息
    Easyuser selectUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    List<Easyuser> selectUsersBySearch(@Param("search") String search);

    int updateState(@Param("id") Integer id, @Param("state") Boolean state);
}
