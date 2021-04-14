package top.inson.springcloud.hoxton.basic.common.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Getter
@Setter
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;
    private String account;
    private Integer sex;
    private String phone;
    private String address;
    private Integer userType;
    private Date createTime;
    private Date updateTime;


}
