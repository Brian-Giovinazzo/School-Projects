hexString = ("0123456789abcdefABCDEF")
while True:
    try:
        userHexadecimal = input("Enter hexadecimal value: ")
        if all(x in hexString for x in userHexadecimal):
            decimal = int(userHexadecimal, 16)
            print("The decimal equivalent of {:s} is {:d}.".format(userHexadecimal, decimal))
            goAgain = input('Would you like to go again? (Y or N) ')

            while (goAgain == 'Y') or (goAgain == 'y'):
                userHexadecimal = input("Enter hexadecimal value: ")
                decimal = int(userHexadecimal, 16)
                print("The decimal equivalent of {:s} is {:d}.".format(userHexadecimal, decimal))
                goAgain = input("Would you like to go again? (Y or N) ")

            else:
                print("Thank you for using the converter.")
            break

        else:
            print("Please enter a hexadecimal value (0-9 or A-F)")

    except ValueError:
        print("Please enter a hexadecimal value (0-9 or A-F)")
        continue
