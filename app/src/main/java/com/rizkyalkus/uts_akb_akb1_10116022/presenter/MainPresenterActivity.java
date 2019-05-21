package com.rizkyalkus.uts_akb_akb1_10116022.presenter;

import com.rizkyalkus.uts_akb_akb1_10116022.model.UserModel;
import com.rizkyalkus.uts_akb_akb1_10116022.view.MainView;


public class MainPresenterActivity implements MainPresenter{

    private MainView mainView;
    private UserModel user = new UserModel();

    public MainPresenterActivity(MainView mainView) {
        this.mainView = mainView;
    }



    @Override
    public void updateNamaWa(String WaUser) {

        user.setWaUser("087847427462");
        mainView.updateUserInfoTextView(user.toString());

    }

    @Override
    public void updateNamaIg(String IgUser) {

        user.setIgUser("Rizkyalkusaerii");
        mainView.updateUserInfoTextView(user.toString());

    }

    @Override
    public void updateNamaFb(String FbUser) {

        user.setFbUser("M Rizky Al Kusaeri");
        mainView.updateUserInfoTextView(user.toString());

    }
}
