import random

def play_game():
    lower_bound = 1
    upper_bound = 10
    number_to_guess = random.randint(lower_bound, upper_bound)
    attempts = 0
    max_attempts = 10  # Limit the number of attempts
    
    print(f"Guess the number between {lower_bound} and {upper_bound}. You have {max_attempts} attempts.")
    
    while attempts < max_attempts:
        try:
            user_guess = int(input("Enter your guess: "))
            attempts += 1
            
            if user_guess < lower_bound or user_guess > upper_bound:
                print(f"Please enter a number between {lower_bound} and {upper_bound}.")
            elif user_guess < number_to_guess:
                print("Too low! Try again.")
            elif user_guess > number_to_guess:
                print("Too high! Try again.")
            else:
                print(f"Congratulations! You guessed the number in {attempts} attempts.")
                return attempts
        except ValueError:
            print("Invalid input! Please enter a number.")
    
    print(f"Sorry, you've used all {max_attempts} attempts. The number was {number_to_guess}.")
    return max_attempts

def main():
    rounds_played = 0
    total_score = 0
    
    while True:
        rounds_played += 1
        attempts_used = play_game()
        total_score += attempts_used
        
        play_again = input("Do you want to play again? (yes/no): ").strip().lower()
        if play_again != 'yes':
            break
    
    print(f"Game Over! You played {rounds_played} rounds with a total score of {total_score}.")

if __name__ == "__main__":
    main()
