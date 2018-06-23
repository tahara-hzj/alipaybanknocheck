package com.example.alipaybanknocheck.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  Jello
 * @create  2018/6/23 17:47
 * @desc    用户银行卡信息实体类
 **/
public class UserBank implements Serializable {
    private int id;
    private String bank_number;//银行卡号
    private String bank_name;//银行名称
    private int user_id;
    private String user_name;//用户真实姓名
    private String bank_user_tel;//预留电话
    private int del_status;//0正常 1删除
    private Date time;
    private Date set_time;

    public UserBank() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBank_number() {
        return bank_number;
    }

    public void setBank_number(String bank_number) {
        this.bank_number = bank_number;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getBank_user_tel() {
        return bank_user_tel;
    }

    public void setBank_user_tel(String bank_user_tel) {
        this.bank_user_tel = bank_user_tel;
    }

    public int getDel_status() {
        return del_status;
    }

    public void setDel_status(int del_status) {
        this.del_status = del_status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getSet_time() {
        return set_time;
    }

    public void setSet_time(Date set_time) {
        this.set_time = set_time;
    }

    @Override
    public String toString() {
        return "UserBank{" +
                "id=" + id +
                ", bank_number='" + bank_number + '\'' +
                ", bank_name='" + bank_name + '\'' +
                ", user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", bank_user_tel='" + bank_user_tel + '\'' +
                ", del_status=" + del_status +
                ", time=" + time +
                ", set_time=" + set_time +
                '}';
    }
}

