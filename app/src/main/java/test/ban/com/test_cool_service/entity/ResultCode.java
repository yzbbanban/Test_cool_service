package test.ban.com.test_cool_service.entity;

public class ResultCode {
	private String code;
	private String message;
	private Temperature temp;
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
	public Temperature getTemp() {
		return temp;
	}
	public void setTemp(Temperature temp) {
		this.temp = temp;
	}
	@Override
	public String toString() {
		return "ResultCode [code=" + code + ", message=" + message + ", temp=" + temp + "]";
	}

	
}
