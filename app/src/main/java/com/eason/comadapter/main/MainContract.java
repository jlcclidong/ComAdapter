package com.eason.comadapter.main;

import com.eason.comadapter.base.BasePresenter;
import com.eason.comadapter.base.BaseView;

/**
 * Created by cclej on 2017/7/6.
 */

public class MainContract {
    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
        void normal();
    }
}
