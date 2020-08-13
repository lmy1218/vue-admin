package com.lmy.vueadmin.dto;
/**
 * @Project vue-admin
 * @Package com.lmy.vueadmin.dto
 * @author Administrator
 * @date 2020/8/13 17:12
 * @version V1.0
 */

import lombok.Data;

import java.util.List;

/**
 * @author Lmy
 * @ClassName PageResult
 * @Description 分页数据返回接口
 * @date 2020/8/13 17:12
 **/
@Data
public class PageResult<T> {
    // 总条数
    private Long total;
    // 数据
    private List<T> list;

}
