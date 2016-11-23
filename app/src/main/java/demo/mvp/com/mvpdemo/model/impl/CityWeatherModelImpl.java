package demo.mvp.com.mvpdemo.model.impl;

import java.util.List;

import demo.mvp.com.mvpdemo.intef.ResponListener;
import demo.mvp.com.mvpdemo.model.CityWeatherModel;
import demo.mvp.com.mvpdemo.model.entity.CityWeathBean;
import demo.mvp.com.mvpdemo.model.entity.CityWeatherDetailBean;
import demo.mvp.com.mvpdemo.model.entity.Result;
import demo.mvp.com.mvpdemo.utils.OkHttpUtils;

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
public class CityWeatherModelImpl implements CityWeatherModel {

    @Override
    public void loadData(String url, final ResponListener<List<CityWeatherDetailBean>> responListener) {
        OkHttpUtils.ResultCallback<Result> callback = new OkHttpUtils.ResultCallback<Result>() {
            @Override
            public void onSuccess(Result response) {
                CityWeathBean data = response.getData();
                responListener.onSuccess(data.getForecast());
        }
            @Override
            public void onFailure(Exception e) {
                responListener.onFailure("Load weather faild", e);
            }
        };
        OkHttpUtils.get(url, callback);
    }
}
