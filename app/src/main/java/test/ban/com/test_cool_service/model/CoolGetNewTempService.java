package test.ban.com.test_cool_service.model;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import test.ban.com.test_cool_service.GetResult;
import test.ban.com.test_cool_service.entity.UploadingTem;

/**
 * Created by brander on 2017/8/16.
 */

public interface CoolGetNewTempService {
    @POST("getNewTemp.do")
    @FormUrlEncoded
    Call<GetResult<UploadingTem>> call(@Field("uid") int uid,
                                       @Field("newTime") String newTime,
                                       @Field("remark") String remark);
}
