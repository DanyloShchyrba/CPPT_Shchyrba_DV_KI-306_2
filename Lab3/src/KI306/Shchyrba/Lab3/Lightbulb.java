package KI306.Shchyrba.Lab3;

import java.io.FileNotFoundException;
import java.io.*;

/**
 * This class represents a Lightbulb with various attributes and functionality.
 */

public abstract class Lightbulb {
	
	private String model;  
    private int energy_consumption;     
    protected boolean isOn;    
    private String color;    
    protected PrintWriter logFile;
    
    /**
     * Default constructor initializes an object with default values.
     */

    public Lightbulb() throws FileNotFoundException
    {    
    	model = "Voltic";
    	energy_consumption = 10;   
        isOn = false;    
        color = "white"; 
        logFile = new PrintWriter(new File("Lightbulb_Log.txt"));
    }
    
    /**
     * Constructor with parameters initializes an object with specified values.
     *
     * @param model            			The model of the Lightbulb.
     * @param energy_consumption        The energy  consumption of the Lighbulb (in watts).
     * @param isOn            			The state of Lightbulb.
     * @param color            			The color which Lightbulb emits.
     * @throws FileNotFoundException 	Occurs when the log file cannot be created.
     */
    
    public Lightbulb(String model, int energy_consumption, String color) throws FileNotFoundException
    {
    	
    	this.model = model;
	    this.energy_consumption = energy_consumption;
	    this.isOn = false; // Лампочка за замовчуванням вимкнена
	    this.color = color;
	    logFile = new PrintWriter(new File("Lightbulb_Log.txt"));
    }	
    
    /**
     * Turns on lightbulb and logs the change.
     *
     */
   
    public void TurnOn ()
    {
    	this.isOn = true;
    	logFile.println("Лампочку ввімкнено.");
    	logFile.flush();
    }
    
    /**
     * Turns off lightbulb and logs the change.
     *
     */
    
    public void TurnOff ()
    {
    	this.isOn = false;
    	logFile.println("Лампочку ввимкненно.");
    	logFile.flush();
    }
    
    /**
     * Changes the color of lightbulb and logs the change.
     *
     ** @param newColor New color of the lightbulb .
     */
    
    public void changeColor(String newColor) {
        color = newColor;
        logFile.println("Колір світла змінено на " + newColor);
        logFile.flush();
    }
    
    /**
     * Changes the model of the lightbulb and logs the change.
     *
     ** @param newModel New model of the lightbulb .
     */
    
    public void ChangeModel(String newModel) {
        model = newModel;
        logFile.println("Модель змінено на " + newModel);
        logFile.flush();
    }
    
    /**
     *Returns model of the lightbulb
     *
     *@return model
     */
    
    public String GetModel() {
        return model;
    }
    
    /**
     *Returns energy consumption of the lightbulb
     *
     *@return energy consumption value
     */
    
    public int GetEnergyConsumption() {
        return energy_consumption;
    }
    
    /**
     * Changes energy consumption of the lightbulb and logs the change.
     *
     ** @param newEnergyConsumption New energy consumption of the lightbulb .
     */
    
    public void ChangeEnergyConsumption(int newEnergyConsumption) {
        energy_consumption = newEnergyConsumption;
        logFile.println("Потужність змінено на " + newEnergyConsumption + " ватт");
        logFile.flush();
    }
    
    /**
     * Defines luminous efficiency of the lightbulb and logs the stats.
     * 
     * @return Luminous efficiency value
     */
    
    public int LuminousEfficiency ()
    {
    	int efficiency = 10 * energy_consumption;
    	logFile.println("Енергоефективність лампочки " + efficiency + "люмен/ватт");
		logFile.flush();
		return efficiency;
    }
    
    /**
     * Displays info about the current lightbulb
     */
    
    public void GetInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Потужність (ватт): " + energy_consumption);
        System.out.println("Стан: " + (isOn ? "увімкнена" : "вимкнена"));
        System.out.println("Колір світла: " + color);
    }
    
    /**
     * Closes log file.
     */
    
    public void CloseLogFile() {
        logFile.close();
    }
 
    
    
}
