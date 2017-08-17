package test.ban.com.test_cool_service.entity;

/**
 * nfc温度标签设备上传数据
 * Created by brander on 2017/6/13.
 */

public class UploadingDeviceParams {
    /**
     * 设备唯一码
     */
    private int Uid;
    /**
     * 公司名
     */
    private String Company;
    /**
     * 标签编号
     */
    private String DeviceNum;
    /**
     * 货品名
     */
    private String GoodsName;
    /**
     * 延时间隔
     */
    private int Start;
    /**
     * 采集间隔
     */
    private int Interval;
    /**
     * 温度上限
     */
    private double MaxTemperature;
    /**
     * 温度下限
     */
    private double MinTemperature;
    /**
     * 湿度上限 add by brander 2017-7-12
     */
    private double MaxHum;
    /**
     * 湿度下限 add by brander 2017-7-12
     */
    private double MinHum;
    /**
     * 循环存储：1
     * 正常存储：0
     */
    private int Model;
    /**
     * 读停启用：1
     * 读停未启用:0
     */
    private int ReadStop;
    /**
     * 1:insert
     * 2:update
     */
    private int DataUploadMode;
    /**
     * 1:NFC
     * 2:bluetooth
     */
    private int TagType;

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getDeviceNum() {
        return DeviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        DeviceNum = deviceNum;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public int getStart() {
        return Start;
    }

    public void setStart(int start) {
        Start = start;
    }

    public int getInterval() {
        return Interval;
    }

    public void setInterval(int interval) {
        Interval = interval;
    }

    public double getMaxTemperature() {
        return MaxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        MaxTemperature = maxTemperature;
    }

    public double getMinTemperature() {
        return MinTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        MinTemperature = minTemperature;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int model) {
        Model = model;
    }

    public int getReadStop() {
        return ReadStop;
    }

    public void setReadStop(int readStop) {
        ReadStop = readStop;
    }

    public int getDataUploadMode() {
        return DataUploadMode;
    }

    public void setDataUploadMode(int dataUploadMode) {
        DataUploadMode = dataUploadMode;
    }

    public int getTagType() {
        return TagType;
    }

    public void setTagType(int tagType) {
        TagType = tagType;
    }

    public double getMaxHum() {
        return MaxHum;
    }

    public void setMaxHum(double maxHum) {
        MaxHum = maxHum;
    }

    public double getMinHum() {
        return MinHum;
    }

    public void setMinHum(double minHum) {
        MinHum = minHum;
    }

    @Override
    public String toString() {
        return "uploadingDeviceParams{" +
                "Uid=" + Uid +
                ", Company='" + Company + '\'' +
                ", DeviceNum='" + DeviceNum + '\'' +
                ", GoodsName='" + GoodsName + '\'' +
                ", Start=" + Start +
                ", Interval=" + Interval +
                ", MaxTemperature=" + MaxTemperature +
                ", MinTemperature=" + MinTemperature +
                ", MaxHum=" + MaxHum +
                ", MinHum=" + MinHum +
                ", Model=" + Model +
                ", ReadStop=" + ReadStop +
                ", DataUploadMode=" + DataUploadMode +
                ", TagType=" + TagType +
                '}';
    }
}
