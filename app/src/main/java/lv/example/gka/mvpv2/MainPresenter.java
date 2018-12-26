package lv.example.gka.mvpv2;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;
    private MainContract.Repository mRepository;
    private String message;

    public MainPresenter(MainContract.View mView) {
        this.mView = mView;
        this.mRepository = new MainRepository();
    }

    @Override
    public void onButtonWasClicked() {
        message = mRepository.loadMessage();
        mView.showText(message);
    }

    @Override
    public void onDestroy() {

    }
}
