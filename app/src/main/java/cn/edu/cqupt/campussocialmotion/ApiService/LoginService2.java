package cn.edu.cqupt.campussocialmotion.ApiService;

import cn.edu.cqupt.campussocialmotion.model.Const;
import cn.edu.cqupt.campussocialmotion.model.UserPost;
import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */

public interface LoginService2 {

    @FormUrlEncoded
    @POST(Const.POST_USER)
    Observable<UserPost> verify(@Field("id") String id, @Field("password") String pwd);
}
