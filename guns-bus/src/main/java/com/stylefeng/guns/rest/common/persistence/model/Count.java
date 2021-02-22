package com.stylefeng.guns.rest.common.persistence.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 场次表
 * </p>
 *
 * @author Maifeng
 * @since 2020-03-01
 */
@TableName("sb_count")
@Data
public class Count extends Model<Count> {

    private static final long serialVersionUID=1L;

      /**
     * 主键编号
     */
    @TableId(value = "uuid")
    private Long uuid;

      /**
     * 班车id
     */
      private Long busId;

      /**
     * 开始时间
     */
      private String beginTime;

      /**
     * 结束时间
     */
      private String endTime;

      /**
     * 0：沙河；1：清水河；2：沙河到清水河；3：清水河到沙河
     */
      private String busStatus;

      /**
     * 价格
     */
      private Double price;

      /**
     * 已选座位
     */
      private String selectedSeats;

      /**
     * 0:未满；1:已满
     */
      private String seatStatus;

    /**
     * 出入日期
     */
    private String beginDate;
    /**
     * 修改时间
     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
//    private LocalDateTime updateTime;

}
