def calculate_grade(percentage):
    if percentage >= 90:
        return 'A+'
    elif percentage >= 80:
        return 'A'
    elif percentage >= 70:
        return 'B'
    elif percentage >= 60:
        return 'C'
    elif percentage >= 50:
        return 'D'
    else:
        return 'F'

def main():
    subjects = int(input("Enter the number of subjects: "))
    marks = []
    
    for i in range(subjects):
        while True:
            try:
                mark = float(input(f"Enter marks obtained in subject {i+1} (out of 100): "))
                if 0 <= mark <= 100:
                    marks.append(mark)
                    break
                else:
                    print("Marks should be between 0 and 100. Please try again.")
            except ValueError:
                print("Invalid input! Please enter a numerical value.")
    
    total_marks = sum(marks)
    average_percentage = total_marks / subjects
    grade = calculate_grade(average_percentage)
    
    print("\n--- Results ---")
    print(f"Total Marks: {total_marks}")
    print(f"Average Percentage: {average_percentage:.2f}%")
    print(f"Grade: {grade}")

if __name__ == "__main__":
    main()
