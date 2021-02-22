package com.stylefeng.guns.rest.common.persistence.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Maifeng
 * @since 2020-03-01
 */
@TableName("sb_user")
@Data
public class User extends Model<User> {

    private static final long serialVersionUID=1L;

      /**
     * 主键编号
     */
      @TableId(value = "uuid")
      private Long uuid;

      /**
     * 用户账号
     */
      private String userName;

      /**
     * 用户密码
     */
      private String userPwd;

      /**
     * 用户昵称
     */
      private String nickName;

      /**
     * 用户性别 0-男，1-女
     */
      private Integer userSex;

      /**
     * 用户邮箱
     */
      private String email;

      /**
     * 用户手机号
     */
      private String userPhone;

     /**
      * 用户余额
     */
      private Double money;
      /**
     * 支付密码
     */
      private String payPassword;

      /**
     * 创建时间
     */
      @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
      private LocalDateTime beginTime;

      /**
     * 修改时间
     */
      @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
      private LocalDateTime updateTime;

}
