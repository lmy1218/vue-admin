package com.lmy.vueadmin.service.impl;
/**
 * @Project vue-admin
 * @Package com.lmy.vueadmin.service.impl
 * @author Administrator
 * @date 2020/8/12 17:06
 * @version V1.0
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmy.vueadmin.dto.PageResult;
import com.lmy.vueadmin.entity.Easyuser;
import com.lmy.vueadmin.mapper.EasyuserMapper;
import com.lmy.vueadmin.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lmy
 * @ClassName UserServiceImpl
 * @Description 用户业务类
 * @date 2020/8/12 17:06
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private EasyuserMapper easyuserMapper;


    @Override
    public Easyuser findUserByUsernameAndPassword(String username, String password) {
        return easyuserMapper.selectUserByUsernameAndPassword(username, password);
    }

    @Override
    public PageResult<Easyuser> findUserList(String search, Integer page, Integer size) {
        // 初始化分页参数
        PageHelper.startPage(page, size);
        // 查询
        List<Easyuser> userList = easyuserMapper.selectUsersBySearch(search);
        // 解析结果
        PageInfo<Easyuser> info = new PageInfo<>(userList);
        // 组装结果
        PageResult<Easyuser> pageResult = new PageResult<>();
        pageResult.setList(info.getList());
        pageResult.setTotal(info.getTotal());
        return pageResult;
    }

    @Override
    public int editState(Integer id, Boolean state) {
        return easyuserMapper.updateState(id, state);
    }
}

