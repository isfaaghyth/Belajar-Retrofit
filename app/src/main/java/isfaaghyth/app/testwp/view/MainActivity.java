package isfaaghyth.app.testwp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import isfaaghyth.app.testwp.R;
import isfaaghyth.app.testwp.base.BaseActivity;
import isfaaghyth.app.testwp.models.MainModelImp;
import isfaaghyth.app.testwp.presenter.MainPresenter;
import isfaaghyth.app.testwp.presenter.MainPresenterImp;
import isfaaghyth.app.testwp.utils.LaktasiaClient;
import isfaaghyth.app.testwp.utils.LaktasiaService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity implements MainView {

    @BindView(R.id.txt_content) TextView txtContent;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding(R.layout.activity_main);
        new MainPresenterImp(this).onRequest();
    }

    @Override public void onResponse(Response<MainModelImp> response) {
        StringBuilder str = new StringBuilder();
        List<MainModelImp.Posts> datas = response.body().getPosts();
        for (int i = 0; i < datas.size(); i++) str.append(datas.get(i).getSlug()).append("\n\n");
        txtContent.setText(str.toString());
    }

    @Override public void onFailure(String err) {
        showToast(err);
    }
}
