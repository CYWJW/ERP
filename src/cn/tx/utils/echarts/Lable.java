package cn.tx.utils.echarts;

import java.util.List;

public class Lable {

	private Normal normal;

	public Normal getNormal() {
		return normal;
	}

	public void setNormal(Normal normal) {
		this.normal = normal;
	} 

	
	
	
	
}
class Normal{
	private boolean show;
	private String position;
	public boolean isShow() {
		return show;
	}
	public void setShow(boolean show) {
		this.show = show;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}