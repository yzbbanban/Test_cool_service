package test.ban.com.test_cool_service.entity;

import java.util.Date;

/**
 * Created by brander on 2017/8/4.
 */

public class NFCDevice {
    private String uid;
    private Date dateTime;
    private String devName;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    @Override
    public String toString() {
        return "NFCDevice [uid=" + uid + ", dateTime=" + dateTime
                + ", devName=" + devName + "]";
    }
}
