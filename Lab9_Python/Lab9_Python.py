from ES_Lightbulb import ES_Lightbulb  # Assuming ES_Lightbulb class is in a separate module

def main():
    try:
        E77 = ES_Lightbulb()
        E77.get_brightness_level()
        E77.set_brightness_level(8)
        E77.increase_brightness(2)
        E77.decrease_brightness(1)

        E77.has_daylight_sensor()
        E77.toggle_daylight_sensor()

        E77.auto_turn_on_at_brightness_threshold(7)

        E77.get_info()
        E77.close_log_file()
    except FileNotFoundError as e:
        print(f"Error: {e}")

if __name__ == "__main__":
    main()