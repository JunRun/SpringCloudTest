package entity;

import lombok.Data;

/**
 * @description: 用户实体类
 * @author: lcl
 * @create: 2019-07-23 14:22
 **/
@Data
public class User {
    private String name;
    private String passwd;
    private Integer age;
}
