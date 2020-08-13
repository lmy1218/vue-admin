package com.lmy.vueadmin.service;

import com.lmy.vueadmin.entity.Mainmenu;

import java.util.List;

/**
 * @author Administrator
 * @version V1.0
 * @Project vue-admin
 * @Package com.lmy.vueadmin.service
 * @date 2020/8/12 22:27
 */
public interface MenuService {

    List<Mainmenu> getMenus();
}
