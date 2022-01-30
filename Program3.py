#Brian Giovinazzo, Online CS11 Section 50439, 7/20/2021
#Python Program #2 is intended to get a user's name, two numbers, and an operator as input.
#Then it will greet the user and perform the selected operation to these two numbers and output the result.

def selectedOperation(number1, number2, operator):
        if operator == '*':
            result = number1 * number2

        elif operator == '/':
            result = number1 / number2

        return result


yourName = input('Enter your name: ')

print('MULTIPLY OR DIVIDE TWO NUMBERS')

number1 = float(input('Enter first number: '))
number2 = float(input('Enter second number: '))
operator = input('Enter * to multiply, / to divide: ')

print()
print('Hello {:s}'.format(yourName))
print('The result of {:.1f} {:s} {:.1f} is {:.1f}'.format(number1, operator, number2, selectedOperation(number1, number2, operator)))
