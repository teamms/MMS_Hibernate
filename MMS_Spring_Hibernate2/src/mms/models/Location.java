package mms.models;
import javax.persistence.Embeddable;

@Embeddable
public class Location {
	private String currentCity;
	private String currentState;
	private String nativeCity;
	private String nativeState;
	public String getCurrentCity() {
		return currentCity;
	}
	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public String getNativeCity() {
		return nativeCity;
	}
	public void setNativeCity(String nativeCity) {
		this.nativeCity = nativeCity;
	}
	public String getNativeState() {
		return nativeState;
	}
	public void setNativeState(String nativeState) {
		this.nativeState = nativeState;
	}
	


}
