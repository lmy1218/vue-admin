package com.lmy.vueadmin.service.impl;
/**
 * @Project vue-admin
 * @Package com.lmy.vueadmin.service.impl
 * @author Administrator
 * @date 2020/8/12 22:27
 * @version V1.0
 */

import com.lmy.vueadmin.entity.Mainmenu;
import com.lmy.vueadmin.mapper.MainmenuMapper;
import com.lmy.vueadmin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lmy
 * @ClassName MenuServiceImpl
 * @Description 菜单业务类
 * @date 2020/8/12 22:27
 **/
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MainmenuMapper mainmenuMapper;


    @Override
    public List<Mainmenu> getMenus() {
        return mainmenuMapper.getMenus();
    }
}
