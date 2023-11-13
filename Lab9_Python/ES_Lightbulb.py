from Lightbulb import Lightbulb  # Assuming Lightbulb class is in a separate module

class ES_Lightbulb(Lightbulb):
    def __init__(self, model="Voltic", energy_consumption=10, color="white", brightness_level=5, daylight_sensor=False):
        super().__init__(model, energy_consumption, color)
        self.brightness_level = brightness_level
        self.daylight_sensor = daylight_sensor

    def get_brightness_level(self):
        return self.brightness_level

    def set_brightness_level(self, brightness_level):
        self.brightness_level = brightness_level
        self.logFile.write(f"Brightness level changed to {brightness_level}\n")
        self.logFile.flush()

    def increase_brightness(self, amount):
        if self.brightness_level + amount <= 10:
            self.brightness_level += amount
            self.logFile.write(f"Brightness level increased by {amount}\n")
            self.logFile.flush()

    def decrease_brightness(self, amount):
        if self.brightness_level - amount >= 1:
            self.brightness_level -= amount
            self.logFile.write(f"Brightness level decreased by {amount}\n")
            self.logFile.flush()

    def has_daylight_sensor(self):
        return self.daylight_sensor

    def toggle_daylight_sensor(self):
        self.daylight_sensor = not self.daylight_sensor
        state = "enabled" if self.daylight_sensor else "disabled"
        self.logFile.write(f"Daylight sensor {state}\n")
        self.logFile.flush()

    def auto_turn_on_at_brightness_threshold(self, threshold):
        if self.brightness_level >= threshold and not self.isOn:
            self.turn_on()

    def get_info(self):
        super().get_info()
        print(f"Brightness level: {self.brightness_level}")
        print(f"Daylight sensor: {'present' if self.daylight_sensor else 'absent'}")
