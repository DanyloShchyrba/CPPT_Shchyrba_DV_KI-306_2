package KI306.Shchyrba.Lab3;

public interface ES_Lightbulb_Interface {

	public int getBrightnessLevel();
	public void setBrightnessLevel(int brightnessLevel);
	public void increaseBrightness(int amount);
	public void decreaseBrightness(int amount);
	
	public boolean hasDaylightSensor();
	public void toggleDaylightSensor();
	
	public void autoTurnOnAtBrightnessThreshold(int threshold);
	public void GetInfo();
	
	
}
