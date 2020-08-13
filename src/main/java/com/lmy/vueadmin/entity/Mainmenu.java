package com.lmy.vueadmin.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (Mainmenu)实体类
 *
 * @author makejava
 * @since 2020-08-12 15:39:01
 */
@Data
public class Mainmenu implements Serializable {
    private static final long serialVersionUID = 176546592253641076L;

    private Integer id;

    private String title;

    private String path;

    private String icon;

    private List<Submenu> sList;

}