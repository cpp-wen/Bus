/**
 * @program school-bus
 * @description: NoPayRequest
 * @author: mf
 * @create: 2020/03/15 16:17
 */

package com.stylefeng.guns.rest.order.dto;

import com.stylefeng.guns.rest.common.AbstractRequest;
import lombok.Data;

@Data
public class NoPayRequest extends AbstractRequest {
    private Long userId;
    // 当前页
    private Long currentPage;
    // 每页数量
    private Long pageSize;
}
