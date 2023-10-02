package KI306.Shchyrba.Lab2;
import java.io.*;

public class LightbulbApp {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Lightbulb A = new Lightbulb ("Blitz", 15, "yellow");
		A.GetInfo();
		A.TurnOn();
		A.GetModel();
		A.GetEnergyConsumption();
		A.LuminousEfficiency();
		A.ChangeEnergyConsumption(20);
		A.LuminousEfficiency();
		A.ChangeModel("Lumos");
		A.TurnOff();
		A.GetInfo();
		A.CloseLogFile();
	}
}