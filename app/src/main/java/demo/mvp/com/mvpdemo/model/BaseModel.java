package demo.mvp.com.mvpdemo.model;

import demo.mvp.com.mvpdemo.intef.ResponListener;

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
public interface BaseModel<T> {
    public void loadData(String  url,ResponListener<T> responListener);
}
