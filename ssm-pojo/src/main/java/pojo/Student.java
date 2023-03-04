package pojo;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private Integer sid;
    private String sName;
    private Integer sAge;
    private String sSex;
    private String sBirthday;

    public Student(Integer sid, String sName, Integer sAge, String sSex, String sBirthday) {
        this.sid = sid;
        this.sName = sName;
        this.sAge = sAge;
        this.sSex = sSex;
        this.sBirthday = sBirthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sSex='" + sSex + '\'' +
                ", sBirthday='" + sBirthday + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(String sBirthday) {
        this.sBirthday = sBirthday;
    }

    public Student() {
    }
}
