package week10.vo;

public class Result {

	private String province;
	private int count;
	private String name;
	public Result() {
		super();
	}
	public Result(String province, int count, String name) {
		super();
		this.province = province;
		this.count = count;
		this.name = name;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "省份：" + province + "，人数：" + count + "，姓名：" + name;
	}


}