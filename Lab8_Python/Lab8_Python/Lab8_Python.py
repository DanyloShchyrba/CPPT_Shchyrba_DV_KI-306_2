import sys
import calc
import Files_utils

if __name__ == "__main__":
    data = float(input("Enter X: "))
    result = calc.calculate(data)
    print(f"Result in python is : {result}")

    try:
        Files_utils.write_res_txt("textRes.txt", result)
        Files_utils.write_res_bin("binRes.bin", result)
        print("Result in txt is: {0}".format(Files_utils.read_res_bin("binRes.bin")))
        print("Result in bin is: {0}".format(Files_utils.read_res_txt("textRes.txt")))
    except FileNotFoundError as e:
        print(e)
        sys.exit(1)
