package car.car_lab;

public class Car {
	private String color;
	private String type;
	private Integer displacement;
	private Boolean sunroof;
	private Integer speed;
	
	public String getColor() {
		return color;
	}
	
	public String getType() {
		return type;
	}
	
	public Integer getDisplacement() {
		return displacement;
	}
	
	public Boolean getSunroof() {
		return sunroof;
	}
	
	public Integer getSpeed() {
		return speed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setDisplacement(Integer displacement) {
		this.displacement = displacement;
	}
	
	public void setSunroof(Boolean sunroof) {
		this.sunroof = sunroof;
	}
	
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
}

