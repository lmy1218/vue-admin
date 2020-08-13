package com.lmy.vueadmin.dto;
/**
 * @Project vue-admin
 * @Package com.lmy.vueadmin.dto
 * @author Administrator
 * @date 2020/8/13 17:31
 * @version V1.0
 */

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Lmy
 * @ClassName QueryInfo
 * @Description 查询接收类
 * @date 2020/8/13 17:31
 **/
@Data
public class QueryInfo {
    // 页码
    private Integer page;
    // 每页条目数
    private Integer size;
    // 搜索字段
    private String search;

    public void init() {
        if (page == null || page <= 0) {
            page = 1;
        }

        if (size == null || size <= 0) {
            size = 6;
        }

        if (StringUtils.isBlank(search)) {
            search = null;
        }
    }

}
