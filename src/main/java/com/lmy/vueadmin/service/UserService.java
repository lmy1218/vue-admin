package com.lmy.vueadmin.service;

import com.lmy.vueadmin.dto.PageResult;
import com.lmy.vueadmin.entity.Easyuser;

/**
 * @author Administrator
 * @version V1.0
 * @Project vue-admin
 * @Package com.lmy.vueadmin.service
 * @date 2020/8/12 17:06
 */
public interface UserService {

    Easyuser findUserByUsernameAndPassword(String username, String password);

    PageResult<Easyuser> findUserList(String search, Integer page, Integer size);

    int editState(Integer id, Boolean state);

    int addUser(Easyuser user);

    int deleteUser(Integer id);

    Easyuser getUserById(Integer id);

    int editUser(Easyuser easyuser);
}
