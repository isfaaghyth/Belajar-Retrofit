package isfaaghyth.app.testwp.base;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import isfaaghyth.app.testwp.R;
import isfaaghyth.app.testwp.presenter.MainPresenterImp;

/**
 * ---------------------------------
 * Created by isfaaghyth with <3
 * Everything in here: @isfaaghyth
 * ---------------------------------
 */

public class BaseActivity extends AppCompatActivity {

    protected void binding(int layout) {
        setContentView(layout);
        ButterKnife.bind(this);
    }

    protected void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
