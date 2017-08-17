package test.ban.com.test_cool_service;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import test.ban.com.test_cool_service.entity.ResultCode;
import test.ban.com.test_cool_service.entity.Temperature;
import test.ban.com.test_cool_service.entity.UploadingDeviceParams;
import test.ban.com.test_cool_service.entity.UploadingTem;
import test.ban.com.test_cool_service.model.CoolGetDevService;
import test.ban.com.test_cool_service.model.CoolGetNewTempService;
import test.ban.com.test_cool_service.model.CoolGetTempService;
import test.ban.com.test_cool_service.model.CoolSendDevService;
import test.ban.com.test_cool_service.model.CoolSendTemService;

public class MainActivity extends AppCompatActivity {
    private static final String COOL_URL = "http://192.168.0.129:8080/cool/";
    //    private static final String COOL_URL = "http://119.23.228.4/cool/";
    private static final String TAG = "MainActivity";
    private TextView tv_msg;
    private Retrofit retrofit;
    private EditText et_uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_msg = (TextView) findViewById(R.id.tv_msg);
        et_uid = (EditText) findViewById(R.id.et_uid);
        retrofit = new Retrofit.Builder()
                .baseUrl(COOL_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * 发送设备信息
     *
     * @param view
     */
    public void sendDev(View view) {
        Log.i(TAG, "sendDev: ");
        initRe();
    }

    public void sendTemp(View view) {
        initTemp();
    }

    /**
     * 获取设备信息
     *
     * @param view
     */
    public void getDev(View view) {
        Log.i(TAG, "getDev: ");


        
    }

    /**
     * 获取设备信息
     */
    private void getDevPa() {
        //TODO 2017-8-14
        CoolGetDevService request = retrofit.create(CoolGetDevService.class);
        final Call<GetResult<UploadingDeviceParams>> call = request.call("riti");
        call.enqueue(new Callback<GetResult<UploadingDeviceParams>>() {
            @Override
            public void onResponse(Call<GetResult<UploadingDeviceParams>> call, Response<GetResult<UploadingDeviceParams>> response) {
                Log.i(TAG, "onResponse: " + response.body());
                tv_msg.setText("onResponse: " + response.body().getResult());
            }

            @Override
            public void onFailure(Call<GetResult<UploadingDeviceParams>> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getMessage());
            }
        });

    }

    public void getTemp(View view) {
        getTempPa();
    }

    /**
     * 获取温度信息
     */
    private void getTempPa() {
        //TODO 2017-8-14
        String u = et_uid.getText().toString().trim();
        if ("".equals(u)) {
            u = "111111111";
        }
        CoolGetTempService request = retrofit.create(CoolGetTempService.class);
        final Call<GetResult<Temperature>> call = request.call(u, "2017-08-13 15:50:00", "2017-08-18 17:20:00");
        call.enqueue(new Callback<GetResult<Temperature>>() {
            @Override
            public void onResponse(Call<GetResult<Temperature>> call, Response<GetResult<Temperature>> response) {
                Log.i(TAG, "onResponse: " + response.body());
                tv_msg.setText("onResponse: " + response.body().getResult());
            }

            @Override
            public void onFailure(Call<GetResult<Temperature>> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getMessage());
            }
        });
    }

    public void getNewTemp(View view) {
        getNewTempMsg();

    }

    /**
     * 根据uid获取最近的一条的温度信息
     */
    private void getNewTempMsg() {
        String u = et_uid.getText().toString().trim();
        if ("".equals(u)) {
            u = "110001316";
        }
        CoolGetNewTempService request = retrofit.create(CoolGetNewTempService.class);
        Call<GetResult<UploadingTem>> call = request.call(Integer.parseInt(u), "", "");
        call.enqueue(new Callback<GetResult<UploadingTem>>() {
            @Override
            public void onResponse(Call<GetResult<UploadingTem>> call, Response<GetResult<UploadingTem>> response) {
                Log.i(TAG, "onResponse: " + response.body());
                tv_msg.setText("onResponse: " + response.body());
            }

            @Override
            public void onFailure(Call<GetResult<UploadingTem>> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getMessage());
            }
        });
    }


    /**
     * 发送温度信息
     */
    private void initTemp() {
        String u = et_uid.getText().toString().trim();
        if ("".equals(u)) {
            u = "111111111";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        Gson gson = new Gson();
        List<Temperature> temps = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Temperature temp = new Temperature();
            temp.setUid(Integer.parseInt(u));
            temp.setDateTime(sdf.format(new Date(1502696936203L + i * 1000 * 60)));
            temp.setGoodsName("good" + i);
            temp.setMinTemperature(-10);
            temp.setMaxTemperature(20);
            temp.setTemperature(10);
            temp.setStatus(0);
            temp.setHum(80);
            temp.setMinHum(60);
            temp.setMaxHum(90);
            temp.setHumStatus(0);
            temps.add(temp);
        }
        String tempJson = gson.toJson(temps);
//        Log.i(TAG, "onResponse: "+tempJson);
        CoolSendTemService request = retrofit.create(CoolSendTemService.class);
        Call<GetResult<String>> call = request.call(tempJson);
        call.enqueue(new Callback<GetResult<String>>() {
            @Override
            public void onResponse(Call<GetResult<String>> call, Response<GetResult<String>> response) {
                Log.i(TAG, "onResponse: " + response.body());
                tv_msg.setText("onResponse: " + response.body());
            }

            @Override
            public void onFailure(Call<GetResult<String>> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getMessage());
            }
        });

    }

    /**
     * 发送设备信息
     */
    private void initRe() {
        String u = et_uid.getText().toString().trim();
        if ("".equals(u)) {
            u = "111111111";
        }
        try {

            UploadingDeviceParams dp = new UploadingDeviceParams();

            dp.setUid(Integer.parseInt(u));
            dp.setCompany("riti");
            dp.setDeviceNum("444444");
            dp.setDataUploadMode(1);
            dp.setInterval(1);
            dp.setMaxHum(new Float("92.0"));
            dp.setMaxTemperature(new Float("42.0"));
            dp.setMinHum(new Float("62.0"));
            dp.setMinTemperature(new Float("12.0"));
            dp.setModel(1);
            dp.setReadStop(1);
            dp.setTagType(1);
            dp.setGoodsName("2222");
            dp.setStart(1);
            Gson gson = new Gson();
            String dpJson = gson.toJson(dp);
            Log.i(TAG, "initRe: " + dpJson);
            final CoolSendDevService request = retrofit.create(CoolSendDevService.class);
            Call<GetResult<String>> call = request.call(dpJson);
            call.enqueue(new Callback<GetResult<String>>() {
                @Override
                public void onResponse(Call<GetResult<String>> call, Response<GetResult<String>> response) {
                    Log.i(TAG, "onResponse: " + response.body());
                    tv_msg.setText("onResponse: " + response.body());


                }

                @Override
                public void onFailure(Call<GetResult<String>> call, Throwable t) {
                    Log.i(TAG, "onFailure: " + t.getMessage());
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
