package com.han.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain=true) //链式写法
public class Dept implements Serializable {//Dept 实体类，类表关系映射

    private Long deptno;  //主键
    private String dname;

    //数据存在哪个数据库的字段
    //微服务中一个微服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

}
