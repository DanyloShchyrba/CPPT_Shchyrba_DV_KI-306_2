import os
import struct

def write_res_txt(file_name, result):
    with open(file_name, 'w') as f:
        f.write(str(result))

def read_res_txt(file_name):
    result = 0.0
    try:
        if os.path.exists(file_name):
            with open(file_name, 'r') as f:
                result = float(f.read())
        else:
            raise FileNotFoundError(f"File {file_name} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

def write_res_bin(file_name, result):
    with open(file_name, 'wb') as f:
        f.write(struct.pack('d', result))

def read_res_bin(file_name):
    result = 0.0
    try:
        if os.path.exists(file_name):
            with open(file_name, 'rb') as f:
                result = struct.unpack('d', f.read())[0]
        else:
            raise FileNotFoundError(f"File {file_name} not found.")
    except FileNotFoundError as e:
        print(e)
    return result