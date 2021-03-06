package test.ban.com.test_cool_service.model;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import test.ban.com.test_cool_service.GetResult;

/**
 * Created by brander on 2017/8/3.
 */

public interface CoolSendDevService {
    @POST("uploadDevice.do")
    @FormUrlEncoded
    Call<GetResult<String>> call(@Field("dpJson") String dpJson);
}