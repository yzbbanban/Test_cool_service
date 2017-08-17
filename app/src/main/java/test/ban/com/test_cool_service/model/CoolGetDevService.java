package test.ban.com.test_cool_service.model;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import test.ban.com.test_cool_service.GetResult;
import test.ban.com.test_cool_service.entity.UploadingDeviceParams;

/**
 * Created by brander on 2017/8/14.
 */

public interface CoolGetDevService {
    @POST("queryDevice.do")
    @FormUrlEncoded
    Call<GetResult<UploadingDeviceParams>> call(@Field("company") String company);
}
