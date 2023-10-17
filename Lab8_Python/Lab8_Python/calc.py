import math

def calculate(x):
    if x == 45 or x == -45 or x == 90 or x == -90 or x == 360 or x==0:
        return None
    else:
        return math.tan(2 * x * math.pi / 180)