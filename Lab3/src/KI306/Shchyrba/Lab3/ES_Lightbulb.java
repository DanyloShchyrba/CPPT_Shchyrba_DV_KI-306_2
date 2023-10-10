package KI306.Shchyrba.Lab3;

import java.io.FileNotFoundException;

/**
 * The {@code ES_Lightbulb} class represents an energysaving lightbulb, which extends the {@code Lightbulb}
 * abstract class and implements the {@code ES_Lightbulb_Interface} interface. It adds specific
 * functionality for an office center, including office space allocation and office equipment management.
 *
 * @author Danylo Shchyrba
 * @version 1.0
 */

public class ES_Lightbulb extends Lightbulb implements ES_Lightbulb_Interface {

	 private int brightnessLevel; // г���� ��������� (�� 1 �� 10)
	 private boolean daylightSensor; // �������� ������� �����
	 
	 
	 	/**
	     * Default constructor initializes an object with default values.
	     */
	    public ES_Lightbulb() throws FileNotFoundException {
	        super(); // ��������� ����������� �� ������������� � �������� �����
	        brightnessLevel = 5; // �� ������������� ����� ��������� - 5
	        daylightSensor = false; // �� ������������� ������ ����� ���������
	    }
	 
	    /**
	     * Constructor with parameters initializes an object with specified values
	     * @param brightnessLevel           The brigntess level of the ES_Lightbulb.
	     * @param daylightSensor        	The state of the daylight sensor of the ES_Lighbulb.
	     **/
	    public ES_Lightbulb(String model, int energy_consumption, String color, int brightnessLevel, boolean daylightSensor) throws FileNotFoundException {
	        super(model, energy_consumption, color);
	        this.brightnessLevel = brightnessLevel;
	        this.daylightSensor = daylightSensor;
	    }

	    /* Getter for brightnessLevel
	     * @returns brightnessLevel Returns current brightness level of the ES_lightbulb
	    **/
	    
	    public int getBrightnessLevel() {
	        return brightnessLevel;
	    }

	    /* Setter for brightnessLevel
	     * @param brightnessLevel Sets the brightness level of the ES_lightbulb
	    **/
	    
	    public void setBrightnessLevel(int brightnessLevel) {
	        this.brightnessLevel = brightnessLevel;
	        // ������ ���� ���� ���������
	        logFile.println("г���� ��������� ������ �� " + brightnessLevel);
	        logFile.flush();
	    }
	    
	    /* Increases brightnessLevel of the ES_Lightbulb
	     * @param amount Sets amount on which will be the brightness level of the ES_lightbulb increased
	    **/
	    
	    public void increaseBrightness(int amount) {
	    	 if (brightnessLevel + amount <= 10)
	        brightnessLevel += amount;
	        // ������ ���� ���� ���������
	        logFile.println("г���� ��������� �������� �� " + amount);
	        logFile.flush();
	    }
	    
	    /* Decreases brightnessLevel of the ES_Lightbulb
	     * @param amount Sets amount on which will be the brightness level of the ES_lightbulb decreased
	    **/
	    
	    public void decreaseBrightness(int amount) {
	        if (brightnessLevel - amount >= 1) {
	            brightnessLevel -= amount;
	            // ������ ���� ���� ���������
	            logFile.println("г���� ��������� �������� �� " + amount);
	            logFile.flush();
	        }
	    }

	    // ����� ��� �������� �������� ������� �����
	    public boolean hasDaylightSensor() {
	        return daylightSensor;
	    }

	    /* 
	     * Toggles daylightSensor state an logs the change
	    **/
	    
	    public void toggleDaylightSensor() {
	        daylightSensor = !daylightSensor;
	        // ������ ���� ����� ������� �����
	        logFile.println("������ ����� " + (daylightSensor ? "��������" : "��������"));
	        logFile.flush();
	    }
	    
	    /* 
	     * Turns on Lightbulb depending on environment brightness and Lightbulb brightness an logs the change
	     * @param threshold Environment brightness
	    **/
	    
	    public void autoTurnOnAtBrightnessThreshold(int threshold) {
	        if (brightnessLevel >= threshold && !isOn) {
	            TurnOn();
	        }
	    }
	    
	    @Override
	    public void GetInfo() {
	        super.GetInfo(); // ��������� ����� GetInfo() � �������� �����
	        System.out.println("г���� ���������: " + brightnessLevel);
	        System.out.println("������ �����: " + (daylightSensor ? "��������" : "�������"));
	    }
}
