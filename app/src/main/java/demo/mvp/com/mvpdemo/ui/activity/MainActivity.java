package demo.mvp.com.mvpdemo.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import demo.mvp.com.mvpdemo.R;
import demo.mvp.com.mvpdemo.model.entity.CityWeatherDetailBean;
import demo.mvp.com.mvpdemo.presenter.WeatherPresenter;
import demo.mvp.com.mvpdemo.presenter.impl.WeatherPresenterImpl;
import demo.mvp.com.mvpdemo.ui.view.mainView;

public class MainActivity extends AppCompatActivity  implements mainView {
    private WeatherPresenter weatherPresenter;
    private String city="深圳";
    private TextView textView;
    private String date;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);
        linearLayout = (LinearLayout) findViewById(R.id.linearlayout);
        weatherPresenter = new WeatherPresenterImpl(this);
        weatherPresenter.loadData("http://wthrcdn.etouch.cn/weather_mini?city="+city);
    }

    @Override
    public void showloadingDialog() {
        linearLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideDialog() {
        linearLayout.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setData(List<CityWeatherDetailBean> mlist) {
        if(mlist!=null){
            for (int i = 0; i < mlist.size(); i++) {
                CityWeatherDetailBean cityWeatherDetailBean = mlist.get(i);
                 date += cityWeatherDetailBean.getDate()+"--";
            }
        }
        textView.setText(date);
    }
}
