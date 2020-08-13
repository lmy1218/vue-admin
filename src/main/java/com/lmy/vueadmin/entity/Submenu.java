package com.lmy.vueadmin.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Submenu)实体类
 *
 * @author makejava
 * @since 2020-08-12 15:39:01
 */
@Data
public class Submenu implements Serializable {
    private static final long serialVersionUID = 222521362454371244L;

    private Integer id;

    private String title;

    private String path;

    private String icon;

    private Integer mid;
}