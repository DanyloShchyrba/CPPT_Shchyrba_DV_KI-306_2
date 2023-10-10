package KI306.Shchyrba.Lab3;
import java.io.*;

/**
 * The {@code LightbulbApp} class provides a simple driver program to test the Lightbulb and ES_Lightbulb classes.
 *
 * @author Danylo Shchyrba
 * @version 1.0
 */

public class LightbulbApp {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ES_Lightbulb E77 = new ES_Lightbulb();
		E77.getBrightnessLevel();
		E77.setBrightnessLevel(8);
		E77.increaseBrightness(2);
		E77.decreaseBrightness(1);
		
		E77.hasDaylightSensor();
		E77.toggleDaylightSensor();
		
		E77.autoTurnOnAtBrightnessThreshold(7);
		
		E77.GetInfo();
	}
}