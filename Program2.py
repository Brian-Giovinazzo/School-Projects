#Brian Giovinazzo, Online CS11 Section 50439, 7/18/2021
#Python Program #2 is intended to get a user's name and two numbers as input.
#Then it will greet the user and add, subtract, multiply, and divide these two numbers and output the results.

yourName = input('Enter your name: ')

print('ADD, SUBTRACT MULTIPLY, and DIVIDE TWO NUMBERS')

number1 = float(input('Enter first number: '))
number2 = float(input('Enter second number: '))

add = number1 + number2
subtract = number1 - number2
multiply = number1 * number2
divide = number1 / number2

print()
print('Hello {:s}'.format(yourName))
print('The sum of {:.1f} and {:.1f} is {:.1f}'.format(number1, number2, add))
print('The difference of {:.1f} and {:.1f} is {:.1f}'.format(number1, number2, subtract))
print('The product of {:.1f} and {:.1f} is {:.1f}'.format(number1, number2, multiply))
print('The quotient of {:.1f} and {:.1f} is {:.1f}'.format(number1, number2, divide))
