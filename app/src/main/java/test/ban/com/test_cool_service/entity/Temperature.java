package test.ban.com.test_cool_service.entity;

public class Temperature {
	private int Uid;
	private String GoodsName;
	private String DateTime;
	private double MaxTemperature;
	private double MinTemperature;
	private double Temperature;
	private int Status;

	private double MaxHum;
	private double MinHum;
	private double Hum;
	private int HumStatus;

	public int getUid() {
		return Uid;
	}

	public void setUid(int uid) {
		this.Uid = uid;
	}

	public String getGoodsName() {
		return GoodsName;
	}

	public void setGoodsName(String goodsName) {
		this.GoodsName = goodsName;
	}

	public String getDateTime() {
		return DateTime;
	}

	public void setDateTime(String dateTime) {
		this.DateTime = dateTime;
	}

	public double getMaxTemperature() {
		return MaxTemperature;
	}

	public void setMaxTemperature(double maxTemperature) {
		this.MaxTemperature = maxTemperature;
	}

	public double getMinTemperature(double v) {
		return MinTemperature;
	}

	public void setMinTemperature(double minTemperature) {
		this.MinTemperature = minTemperature;
	}

	public double getTemperature() {
		return Temperature;
	}

	public void setTemperature(double temperature) {
		this.Temperature = temperature;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		this.Status = status;
	}

	public double getMinTemperature() {
		return MinTemperature;
	}

	public double getMaxHum() {
		return MaxHum;
	}

	public void setMaxHum(double maxHum) {
		this.MaxHum = maxHum;
	}

	public double getMinHum() {
		return MinHum;
	}

	public void setMinHum(double minHum) {
		this.MinHum = minHum;
	}

	public double getHum() {
		return Hum;
	}

	public void setHum(double hum) {
		this.Hum = hum;
	}

	public int getHumStatus() {
		return HumStatus;
	}

	public void setHumStatus(int humStatus) {
		this.HumStatus = humStatus;
	}

	@Override
	public String toString() {
		return "UploadingTem{" + "Uid=" + Uid + ", GoodsName='" + GoodsName + '\'' + ", DateTime='" + DateTime + '\''
				+ ", MaxTemperature=" + MaxTemperature + ", MinTemperature=" + MinTemperature + ", Temperature="
				+ Temperature + ", Status=" + Status + ", MaxHum=" + MaxHum + ", MinHum=" + MinHum + ", Hum=" + Hum
				+ ", HumStatus=" + HumStatus + '}';
	}
}
