package Day5;

public class City extends State {

	private String cityName;
	private  int pinCode;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "City Details [cityName = " + cityName + ", pinCode = " + pinCode + ", StateName = " + getStateName()
				+ ", CapitalCity = " + getCapitalCity() + ", CountryName = " + getCountryName()
				+ ", CountryPopulation = " + getCountryPopulation() + "]";
	}
	
}