package com.lmy.vueadmin.controller;
/**
 * @Project vue-admin
 * @Package com.lmy.vueadmin.controller
 * @author Administrator
 * @date 2020/8/12 16:37
 * @version V1.0
 */

import com.lmy.vueadmin.dto.PageResult;
import com.lmy.vueadmin.dto.QueryInfo;
import com.lmy.vueadmin.entity.Easyuser;
import com.lmy.vueadmin.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lmy
 * @ClassName UserController
 * @Description 用户控制器
 * @date 2020/8/12 16:37
 **/
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    /**
     * 登录
     * @param easyuser
     * @return
     */
    @RequestMapping("/login")
    public ResponseEntity<Easyuser> login(@RequestBody Easyuser easyuser) {
        if (easyuser == null) {
            log.info("用户参数为空");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        log.info(easyuser.toString());
        Easyuser user = userServiceImpl.findUserByUsernameAndPassword(easyuser.getUsername(), easyuser.getPassword());
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        user.setPassword("");
        return ResponseEntity.ok(user);
    }

    /**
     * 分页查询用户
     * @param queryInfo
     * @return
     */
    @RequestMapping("/getUserList")
    public ResponseEntity<PageResult<Easyuser>> getUserList(QueryInfo queryInfo) {
        log.info("分页查询");
        queryInfo.init();
        PageResult<Easyuser> pageResult = userServiceImpl.findUserList(queryInfo.getSearch(), queryInfo.getPage(), queryInfo.getSize());
        return ResponseEntity.ok(pageResult);
    }

    /**
     * 修改状态
     * @param id
     * @param state
     * @return
     */
    @RequestMapping("editState")
    public ResponseEntity<Void> editState(@RequestParam("id") Integer id, @RequestParam("state") Boolean state) {
            int index = userServiceImpl.editState(id, state);
            if (index != 1) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping("addUser")
    public ResponseEntity<Void> addUser(@RequestBody Easyuser user) {
        int index = userServiceImpl.addUser(user);
        if (index != 1) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

    /**
     * 用户删除
     * @param id
     * @return
     */
    @RequestMapping("deleteUser")
    public ResponseEntity<Void> deleteUser(Integer id) {
        log.info("删除用户");
        int index = userServiceImpl.deleteUser(id);
        if (index != 1) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok().build();
    }

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    @RequestMapping("findUserById")
    public ResponseEntity<Easyuser> findUserById(Integer id) {
        log.info("根据ID查询用户信息");
        Easyuser user = userServiceImpl.getUserById(id);
        if (user == null) {
            log.info("未查询到用户!");
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }



    @RequestMapping("editUser")
    public ResponseEntity<Void> editUser(@RequestBody Easyuser easyuser) {
        log.info("修改用户信息");
        int index = userServiceImpl.editUser(easyuser);
        if (index != 1) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok().build();
    }

}
