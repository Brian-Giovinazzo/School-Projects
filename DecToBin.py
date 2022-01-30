def DecimalToBinary(num):

    return bin(num).replace("0b", "")

if __name__ == '__main__':

    userDecimal = int(input("Please enter a decimal value "))

    print("The binary representation of {:d} is {:s}".format(userDecimal, DecimalToBinary(userDecimal)))

