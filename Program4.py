#Brian Giovinazzo, Online CS11 Section 50439, 7/20/2021
#Python Program #4 is intended to get a user's name, two numbers, and an operator as input.
#It will perform the selected operation to these two numbers and output the result.
#Next, the user will be prompted to continue or not.

def selectedOperation(number1, number2, operator):
        if operator == '*':
            result = number1 * number2

        elif operator == '/':
            result = number1 / number2

        elif operator == '-':
            result = number1 - number2

        elif operator == '+':
            result = number1 + number2

        return result


yourName = input('Enter your name: ')

print('SIMPLE CALCULATOR')

number1 = float(input('Enter first number: '))
operator = input('Enter + to add, - to subtract, * to multiply, / to divide: ')
number2 = float(input('Enter second number: '))

print()
print('The result of {:.1f} {:s} {:.1f} is {:.1f}'.format(number1, operator, number2, selectedOperation(number1, number2, operator)))
print()

goAgain = input('Would you like to go again? (Y or N) ')

while goAgain == 'Y':
    number1 = float(input('Enter first number: '))
    operator = input('Enter + to add, - to subtract, * to multiply, / to divide: ')
    number2 = float(input('Enter second number: '))

    print()
    print('The result of {:.1f} {:s} {:.1f} is {:.1f}'.format(number1, operator, number2, selectedOperation(number1, number2, operator)))
    print()

    goAgain = input('Would you like to go again? (Y or N) ')

else:
    print('Thank you, {:s}, for using the calculator.'.format(yourName))
