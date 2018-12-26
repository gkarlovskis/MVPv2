package lv.example.gka.mvpv2;

public interface MainContract {
    interface View {
        void showText(String message);
    }

    interface Presenter {
        void onButtonWasClicked();
        void onDestroy();
    }

    interface Repository {
        String loadMessage();
    }
}
