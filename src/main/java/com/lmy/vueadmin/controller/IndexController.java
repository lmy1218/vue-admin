package com.lmy.vueadmin.controller;
/**
 * @Project vue-admin
 * @Package com.lmy.vueadmin.controller
 * @author Administrator
 * @date 2020/8/7 16:55
 * @version V1.0
 */

import com.lmy.vueadmin.entity.Mainmenu;
import com.lmy.vueadmin.mapper.MainmenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lmy
 * @ClassName IndexController
 * @Description 测试控制器
 * @date 2020/8/7 16:55
 **/
@RestController
public class IndexController {

    @Autowired
    private MainmenuMapper mainmenuMapper;

    @RequestMapping("index")
    public List<Mainmenu> index() {
        return  mainmenuMapper.getMenus();
    }

}
