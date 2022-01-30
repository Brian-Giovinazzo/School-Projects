#Brian Giovinazzo, Online CS11 Section 50439, 7/17/2021
#Python Program #1

name = input("Enter your name: ")

print("MULTIPLY TWO NUMBERS")
number1 = float(input("Enter first number: "))
number2 = float(input("Enter second number: "))

product = number1 * number2

print("")

print("Hello {0},".format(name))
print("The product of {0} and {1} is {2}".format(number1, number2, product))
