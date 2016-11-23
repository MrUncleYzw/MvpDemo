package demo.mvp.com.mvpdemo.model.entity;

import java.util.List;

/*************************************************
 * <p>类描述：${todo}(用一句话描述该文件做什么)</p>
 * <p>创建人：余志伟</p>
 * <p>创建时间 : 2016/11/23</p>
 * <p>修改人：       </p>
 * <p>修改时间：   </p>
 * <p>修改备注：   </p>
 *
 * @version V3.1
 *********************************/
public class CityWeathBean {
    private String wendu;
    private String ganmao;
    private List<CityWeatherDetailBean> forecast;
    private String aqi;
    private String city;
    private YesterDayWeather yesterday;

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<CityWeatherDetailBean> getForecast() {
        return forecast;
    }

    public void setForecast(List<CityWeatherDetailBean> forecast) {
        this.forecast = forecast;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public YesterDayWeather getYesterday() {
        return yesterday;
    }

    public void setYesterday(YesterDayWeather yesterday) {
        this.yesterday = yesterday;
    }
}
