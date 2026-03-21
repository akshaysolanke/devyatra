package com.example.user.userModel;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uid;
    private String uname;
    @Column(unique = true, nullable = false)
    private String uemail;
    private String ugender;
    private String ucontact;
    private String uage;
    private String uaddr;
    private String urole;
    @Column(nullable = false)
    private String upassword;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public String getUcontact() {
        return ucontact;
    }

    public void setUcontact(String ucontact) {
        this.ucontact = ucontact;
    }

    public String getUage() {
        return uage;
    }

    public void setUage(String uage) {
        this.uage = uage;
    }

    public String getUaddr() {
        return uaddr;
    }

    public void setUaddr(String uaddr) {
        this.uaddr = uaddr;
    }

    public String getUrole() {
        return urole;
    }

    public void setUrole(String urole) {
        this.urole = urole;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uemail='" + uemail + '\'' +
                ", ugender='" + ugender + '\'' +
                ", ucontact='" + ucontact + '\'' +
                ", uage='" + uage + '\'' +
                ", uaddr='" + uaddr + '\'' +
                ", urole='" + urole + '\'' +
                ", upassword='" + upassword + '\'' +
                '}';
    }
}
