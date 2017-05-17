package isfaaghyth.app.testwp.utils;

import isfaaghyth.app.testwp.models.MainModelImp;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * ---------------------------------
 * Created by isfaaghyth with <3
 * Everything in here: @isfaaghyth
 * ---------------------------------
 */

public interface LaktasiaService {
    @GET("api/get_recent_posts/")
    Call<MainModelImp> getRecentPost();
}
