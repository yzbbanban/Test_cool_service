package test.ban.com.test_cool_service.model;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import test.ban.com.test_cool_service.GetResult;
import test.ban.com.test_cool_service.entity.Temperature;

/**
 * Created by brander on 2017/8/14.
 */

public interface CoolGetTempService {
    @POST("queryTemp.do")
    @FormUrlEncoded
    Call<GetResult<Temperature>> call(@Field("uid") String uid,
                                      @Field("startTime") String startTime,
                                      @Field("endTime") String endTime);
}
