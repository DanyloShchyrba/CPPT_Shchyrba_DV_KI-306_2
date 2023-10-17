import os

def main():
    size = int(input("Enter the size of the square matrix: "))
    filler = input("Enter the filler character: ")

    data_file = "MyFile.txt"
    with open(data_file, "w") as fout:
        arr = [[' ' for _ in range(size)] for _ in range(size)]

        mid = size // 2

        for i in range(mid):
            for j in range(size - i - 1, size):
                arr[i][j] = filler

        for i in range(mid, size):
            for j in range(i, size):
                arr[i][j] = filler

        for chArr in arr:
            for ch in chArr:
                print(ch, end=' ')
                fout.write(ch + ' ')
            print()
            fout.write('\n')

if __name__ == "__main__":
    main()