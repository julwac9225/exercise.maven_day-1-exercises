package com.github.perscholas;

import java.util.Scanner;

/**
 * Created by leon on 7/14/2020.
 */
public class MainApplication {
    public static void main(String[] args) {
        do {
            GradeEvaluator gradeEvaluator = new GradeEvaluator(); //to get implementation of grade evaluator;
            Scanner scanner = new Scanner(System.in); //to get input from user;
            System.out.println("What score did the student receive in the class?");
            String studentScoreAsString = scanner.nextLine(); //get input from user;
            Double studentScoreAsDouble = Double.parseDouble(studentScoreAsString); //convert input String to Double;
            Character studentGrade = gradeEvaluator.getGrade(studentScoreAsDouble);
            System.out.println("The student's class-score was " + studentScoreAsString);
            System.out.println("The student's grade was " + studentGrade);
        } while(true);
    }
}
