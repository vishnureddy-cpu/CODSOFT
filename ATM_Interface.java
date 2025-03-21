class BankAccount:
    def __init__(self, balance=0.0):
        self.balance = balance
    
    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"${amount} deposited successfully.")
        else:
            print("Invalid deposit amount.")
    
    def withdraw(self, amount):
        if 0 < amount <= self.balance:
            self.balance -= amount
            print(f"${amount} withdrawn successfully.")
        elif amount > self.balance:
            print("Insufficient balance!")
        else:
            print("Invalid withdrawal amount.")
    
    def check_balance(self):
        print(f"Current balance: ${self.balance}")


class ATM:
    def __init__(self, account):
        self.account = account
    
    def show_menu(self):
        while True:
            print("\nATM Menu:")
            print("1. Deposit")
            print("2. Withdraw")
            print("3. Check Balance")
            print("4. Exit")
            
            choice = input("Select an option (1-4): ")
            
            if choice == '1':
                amount = float(input("Enter amount to deposit: "))
                self.account.deposit(amount)
            elif choice == '2':
                amount = float(input("Enter amount to withdraw: "))
                self.account.withdraw(amount)
            elif choice == '3':
                self.account.check_balance()
            elif choice == '4':
                print("Thank you for using the ATM. Goodbye!")
                break
            else:
                print("Invalid option! Please choose a valid option.")

if __name__ == "__main__":
    user_account = BankAccount(1000.0)  # Initial balance of $1000
    atm = ATM(user_account)
    atm.show_menu()
