package com.lmy.vueadmin.controller;
/**
 * @Project vue-admin
 * @Package com.lmy.vueadmin.controller
 * @author Administrator
 * @date 2020/8/12 22:26
 * @version V1.0
 */

import com.lmy.vueadmin.entity.Mainmenu;
import com.lmy.vueadmin.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lmy
 * @ClassName MenuController
 * @Description 菜单控制器
 * @date 2020/8/12 22:26
 **/
@RestController
@Slf4j
public class MenuController {

    @Autowired
    private MenuService menuServiceImpl;

    /**
     * 获取菜单信息
     * @return
     */
    @RequestMapping("/getMenu")
    public ResponseEntity<List<Mainmenu>> getAllMenus() {
        log.info("查询菜单");
        List<Mainmenu> menus = menuServiceImpl.getMenus();
        if (CollectionUtils.isEmpty(menus)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(menus);
    }

}
