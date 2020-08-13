package com.lmy.vueadmin.mapper;

import com.lmy.vueadmin.entity.Mainmenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 * @version V1.0
 * @Project vue-admin
 * @Package com.lmy.vueadmin.mapper
 * @date 2020/8/12 15:42
 */
@Mapper
public interface MainmenuMapper {

    List<Mainmenu> getMenus();
}
