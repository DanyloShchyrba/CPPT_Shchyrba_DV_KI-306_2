class Lightbulb:
    def __init__(self, model="Voltic", energy_consumption=10, color="white"):
        self.model = model
        self.energy_consumption = energy_consumption
        self.isOn = False
        self.color = color
        self.logFile = open("Lightbulb_Log.txt", "w")

    def turn_on(self):
        self.isOn = True
        self.logFile.write("Lightbulb turned on.\n")
        self.logFile.flush()

    def turn_off(self):
        self.isOn = False
        self.logFile.write("Lightbulb turned off.\n")
        self.logFile.flush()

    def change_color(self, new_color):
        self.color = new_color
        self.logFile.write(f"Color changed to {new_color}\n")
        self.logFile.flush()

    def change_model(self, new_model):
        self.model = new_model
        self.logFile.write(f"Model changed to {new_model}\n")
        self.logFile.flush()

    def get_model(self):
        return self.model

    def get_energy_consumption(self):
        return self.energy_consumption

    def change_energy_consumption(self, new_energy_consumption):
        self.energy_consumption = new_energy_consumption
        self.logFile.write(f"Energy consumption changed to {new_energy_consumption} watts\n")
        self.logFile.flush()

    def luminous_efficiency(self):
        efficiency = 10 * self.energy_consumption
        self.logFile.write(f"Luminous efficiency of the lightbulb: {efficiency} lumens/watt\n")
        self.logFile.flush()
        return efficiency

    def get_info(self):
        print(f"Model: {self.model}")
        print(f"Power (watts): {self.energy_consumption}")
        print(f"State: {'on' if self.isOn else 'off'}")
        print(f"Light color: {self.color}")

    def close_log_file(self):
        self.logFile.close()
