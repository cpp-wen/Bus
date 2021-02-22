/**
 * @program school-bus
 * @description: PayRequset
 * @author: mf
 * @create: 2020/03/19 21:02
 */

package com.stylefeng.guns.rest.alipay.dto;

import com.stylefeng.guns.rest.common.AbstractRequest;
import lombok.Data;

@Data
public class PayRequset extends AbstractRequest {
    private Long userId;
    private String payPassword;
    private Double totalMoney; // 直接传钱， 感觉不安全
}
