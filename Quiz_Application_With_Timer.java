import time

class Quiz:
    def __init__(self):
        self.questions = [
            {"question": "What is the capital of France?", "options": ["A) Berlin", "B) Madrid", "C) Paris", "D) Rome"], "answer": "C"},
            {"question": "Which planet is known as the Red Planet?", "options": ["A) Earth", "B) Mars", "C) Jupiter", "D) Venus"], "answer": "B"},
            {"question": "What is 5 + 7?", "options": ["A) 10", "B) 12", "C) 14", "D) 15"], "answer": "B"},
            {"question": "Who wrote 'To Kill a Mockingbird'?", "options": ["A) Harper Lee", "B) Mark Twain", "C) J.K. Rowling", "D) Jane Austen"], "answer": "A"},
            {"question": "What is the largest ocean on Earth?", "options": ["A) Atlantic", "B) Indian", "C) Arctic", "D) Pacific"], "answer": "D"}
        ]
        self.score = 0
        self.time_limit = 10  # seconds per question

    def start_quiz(self):
        print("Welcome to the Quiz Game!\n")
        
        for idx, q in enumerate(self.questions, start=1):
            print(f"Question {idx}: {q['question']}")
            for option in q["options"]:
                print(option)
            
            start_time = time.time()
            user_answer = input("Enter your answer (A, B, C, or D): ").strip().upper()
            time_taken = time.time() - start_time
            
            if time_taken > self.time_limit:
                print("Time's up! Moving to the next question.\n")
                continue
            
            if user_answer == q["answer"]:
                print("Correct!\n")
                self.score += 1
            else:
                print(f"Wrong! The correct answer was {q['answer']}.\n")
        
        self.show_results()

    def show_results(self):
        print("\nQuiz Over!")
        print(f"Your final score is {self.score} out of {len(self.questions)}.")

if __name__ == "__main__":
    quiz = Quiz()
    quiz.start_quiz()
