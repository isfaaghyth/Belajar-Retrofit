package isfaaghyth.app.testwp.presenter;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;

import isfaaghyth.app.testwp.models.MainModelImp;
import isfaaghyth.app.testwp.utils.LaktasiaClient;
import isfaaghyth.app.testwp.utils.LaktasiaService;
import isfaaghyth.app.testwp.view.MainView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * ---------------------------------
 * Created by isfaaghyth with <3
 * Everything in here: @isfaaghyth
 * ---------------------------------
 */

public class MainPresenterImp implements MainPresenter {

    private MainView mainView;

    public MainPresenterImp(MainView mainView) {
        this.mainView = mainView;
    }

    @Override public void onRequest() {
        LaktasiaService laktasiaService = LaktasiaClient.getClient().create(LaktasiaService.class);
        Call<MainModelImp> modelCall = laktasiaService.getRecentPost();
        modelCall.enqueue(new Callback<MainModelImp>() {
            @Override public void onResponse(@NonNull Call<MainModelImp> call, @NonNull Response<MainModelImp> response) {
                mainView.onResponse(response);
            }
            @Override public void onFailure(@NonNull Call<MainModelImp> call, @NonNull Throwable t) {
                mainView.onFailure(t.getMessage());
            }
        });
    }
}
