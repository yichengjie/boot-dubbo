package com.yicj.study.api.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id ;
    //姓名
    private String name ;
    //年龄
    private Integer age ;
    //邮箱
    private String email ;
    //直属上级
    private Long managerId ;
    //创建事件
    private Date createTime ;
}