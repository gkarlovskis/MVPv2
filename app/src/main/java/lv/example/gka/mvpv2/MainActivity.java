package lv.example.gka.mvpv2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private MainContract.Presenter mPresenter;
    private Button mButton;
    private TextView myTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter(this);

        myTv = (TextView) findViewById(R.id.text_view);
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.onButtonWasClicked();
            }
        });
    }

    @Override
    public void showText(String message) {
        myTv.setText(message);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }

}
