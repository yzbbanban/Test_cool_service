package test.ban.com.test_cool_service;


import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/8/4.
 */

public class GetResult<T> implements Serializable {
    private String code;
    private String message;
    private List<T> result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "GetResult{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
