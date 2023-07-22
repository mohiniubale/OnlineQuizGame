package javaproject; 
import java.util.Scanner; 
public class Quiz {
private static final String[] MCQQUESTIONS = { 
"HTML Stands For?",
"CSS Stands For?",
"Who Devloped By Java?", 
"Java Relase In",
"Whats is Extension of Java?"
};
private static final String[][] OPTIONS = {
{"Hypertext mark-up language", "Hyper", "H-Text", "Home-Text"}, 
{"css-cading", "Cading", "Style-sheet", "Castcading Style-Sheet"}, 
{"Games gosling", "harry-top", "brendon-elch", "golsing"}, 
{"1995", "1999", "2000", "2015"},
{"java", ".js", ".js", ".java"} 
};
private static final int[] ANSWERS = {0, 3, 0,0 , 3}; 
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); 
int score = 0;
for (int i = 0; i < MCQQUESTIONS.length; i++) {
System.out.printf("Question %d: %s\n", i + 1, MCQQUESTIONS[i]); 
for (int j = 0; j < OPTIONS[i].length; j++) {
System.out.printf("%d. %s\n", j + 1, OPTIONS[i][j]); 
}
int answer = -1;
while (answer < 1 || answer > OPTIONS[i].length) {+ "): ");
System.out.print("Enter your answer (1-" + OPTIONS[i].length 
answer = scanner.nextInt();
}
if (answer - 1 == ANSWERS[i]) {
System.out.println("Congrats Your Answer is Correct.....!");
score++; 
} else {
System.out.println(" Your answer is Incorrect.....!"); 
}
System.out.println();
}
System.out.println("u'r Win.....!");
System.out.printf(" Your Final Score Are: %d out of %d\n", score, 
MCQQUESTIONS.length);
} 
}