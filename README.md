# Java Number Guess Game

Welcome to the **Java Number Guess Game**! This is a simple and interactive game where players guess a randomly generated number within a specific range. The game provides feedback to guide the player toward the correct answer and keeps track of their score.

---

## Game Features
- **Random Number Generation:** The program generates a random number between 1 and 100 for each round.
- **Limited Attempts:** Players have up to 3 attempts to guess the correct number.
- **Feedback:**
  - If the guessed number is too low, the game prompts to try a higher number.
  - If the guessed number is too high, the game prompts to try a lower number.
- **Replay Option:** After each round, players can choose to play again.
- **Score Tracking:** The program tracks the player's score across multiple rounds.
- **Game Over Summary:** Displays the final score when the player decides to stop.

---

## How to Run

### Prerequisites
- **Java Development Kit (JDK):** Ensure JDK is installed on your system.
- **Java Compiler:** Use `javac` to compile the program.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/Vasanth03-s/JavaNumberGame.git
   ```
2. Navigate to the project directory:
   ```bash
   cd JavaNumberGame
   ```
3. Compile the program:
   ```bash
   javac NumberGame.java
   ```
4. Run the game:
   ```bash
   java NumberGame
   ```

---

## How to Play
1. The game starts by generating a random number between 1 and 100.
2. You have 3 attempts to guess the correct number.
3. After each guess, the game provides feedback:
   - "Try higher number" if your guess is too low.
   - "Try lower number" if your guess is too high.
4. If you guess the correct number within 3 attempts, you score a point.
5. If you fail to guess the correct number, the game reveals the correct answer.
6. You can choose to play another round or end the game.
7. At the end of the game, your total score is displayed.

---

## Example Gameplay
```
NUMBER GUESS GAME
Guess number between 1 to 100
ATTEMPT 1: Enter your guessed number:
50
OOPS! Wrong. Try higher number.
ATTEMPT 2: Enter your guessed number:
75
OOPS! Wrong. Try lower number.
ATTEMPT 3: Enter your guessed number:
60
Hurray! You guessed the right number.
Do you want to play again? (yes/no)
```

---

## Repository Structure
```
JavaNumberGame/
├── NumberGame.java
└── README.md
```

---

## Future Enhancements
- Add a difficulty level with varying ranges and attempts.
- Implement a graphical user interface (GUI) version.
- Save high scores for competitive gameplay.

---

## Contact
For any questions or feedback, feel free to reach out:
- **GitHub:** [Vasanth03-s](https://github.com/Vasanth03-s)
- **Email:** [vasanthsethu0310@gmail.com]

---

Thank you for trying the Java Number Guess Game! Have fun and happy guessing!
