package demo.mvp.com.mvpdemo.presenter.impl;

import java.util.List;

import demo.mvp.com.mvpdemo.intef.ResponListener;
import demo.mvp.com.mvpdemo.model.CityWeatherModel;
import demo.mvp.com.mvpdemo.model.entity.CityWeatherDetailBean;
import demo.mvp.com.mvpdemo.model.impl.CityWeatherModelImpl;
import demo.mvp.com.mvpdemo.presenter.WeatherPresenter;
import demo.mvp.com.mvpdemo.ui.view.mainView;

/*************************************************
 * <p/>
 * <p>类描述：${todo}(用一句话描述该文件做什么)</p>
 * <p>创建人：余志伟</p>
 * <p>创建时间 : 2016/11/23</p>
 * <p>修改人：       </p>
 * <p>修改时间：   </p>
 * <p>修改备注：   </p>
 *
 * @version V3.1
 *********************************/
public class WeatherPresenterImpl implements WeatherPresenter,ResponListener<List<CityWeatherDetailBean>> {
    private mainView mainView;
    private CityWeatherModel cityWeatherModel;

    public WeatherPresenterImpl(mainView mainView) {
        this.mainView = mainView;
        cityWeatherModel = new CityWeatherModelImpl();
    }

    @Override
    public void loadData(String url) {
        cityWeatherModel.loadData(url,this);
        mainView.showloadingDialog();
    }

    @Override
    public void onSuccess(List<CityWeatherDetailBean> dateBean) {
        mainView.setData(dateBean);
        mainView.hideDialog();
    }

    @Override
    public void onFailure(String str, Exception e) {
        mainView.hideDialog();
    }
}
