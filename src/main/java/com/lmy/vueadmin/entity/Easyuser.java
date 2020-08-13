package com.lmy.vueadmin.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Easyuser)实体类
 *
 * @author makejava
 * @since 2020-08-12 15:38:57
 */
@Data
public class Easyuser implements Serializable {
    private static final long serialVersionUID = 358155146278180331L;
    /**
     * 主键
     */
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String role;

    private Boolean state;

}