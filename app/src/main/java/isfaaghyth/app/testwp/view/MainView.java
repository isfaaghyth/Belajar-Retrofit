package isfaaghyth.app.testwp.view;

import isfaaghyth.app.testwp.models.MainModelImp;
import retrofit2.Call;
import retrofit2.Response;

/**
 * ---------------------------------
 * Created by isfaaghyth with <3
 * Everything in here: @isfaaghyth
 * ---------------------------------
 */

public interface MainView {
    void onResponse(Response<MainModelImp> response);
    void onFailure(String err);
}
