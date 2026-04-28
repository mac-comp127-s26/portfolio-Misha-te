

# Grades

## Description
**Grades** is a Java program that calculates a student's final average score and assigns a letter grade based on scores entered by the user.

The program was inspired by a real academic situation: trying to estimate and model possible outcomes in a Statistics class grade. Instead of calculating manually each time, this project was created to make the process faster, easier, and more interactive while also having fun building with Java.

The program uses the **Scanner** class in Java to accept user input from the keyboard.

## Features
- Accepts user input for:
  - Name
  - Midterm 1 score
  - Midterm 2 score
  - Final exam score
  - Extra credit points
- Calculates the weighted final average:
  - Midterm 1 = **15%**
  - Midterm 2 = **20%**
  - Final Exam = **65%**
- Adds extra credit to the final score
- Displays:
    - Final numeric average
    - Final letter grade
    - Name and comments

## Grading Scale

| Score Range | Grade |
|------------|-------|
| 90 - 100 | A |
| 80 - 89 | B |
| 70 - 79 | C |
| 60 - 69 | D |
| 50 - 59 | F |
| Below 50 | NC |

## Technology Used
- **Java**
- **Scanner Class** (`java.util.Scanner`)
- **Visual Studio Code**
- **Java Extension Pack**

# Sample Outputs for Grades Program

## 🟢 A Grade Example
```text
Enter your name: Misha
Enter Midterm 1 score: 95
Enter Midterm 2 score: 92
Enter Final Exam score: 94
Enter Extra Credit: 1

Your average score is: 93.05
Great Work Misha
Your final letter grade is: A

## How to Run the Program

### Option 1: Run in VS Code
1. Install Visual Studio Code  
2. Install the Java Extension Pack  
3. Open the project folder  
4. Open `Grades.java`  
5. Click **Run**

### Option 2: Run in Terminal

```bash
javac Grades.java
java Grades
exit

## Disclosures and AI
I refined the readMe using  ChatGPT