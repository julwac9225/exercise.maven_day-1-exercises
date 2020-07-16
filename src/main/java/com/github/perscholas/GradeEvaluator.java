package com.github.perscholas;
/*
* Write a program that returns a student's letter grade given a specific score.
* If a grade is between 100 and 90, return A
* If a grade is between 89 and 80, return B
*If a grade is between 79 and 70, return C
*If a grade is between 69 and 65, return D
* If a grade is less than 64, return F.
 */
/**
 * Created by leon on 7/14/2020.
 */
public class GradeEvaluator {
    public Boolean isGradeA(Double score) {
        if (score <= 100 && score >= 90) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isGradeB(Double score) {
        if (score <= 89 && score >= 80) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isGradeC(Double score) {
        if (score <= 79 && score >= 70) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isGradeD(Double score) {
        if (score <= 69 && score >= 65) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isGradeF(Double score) {
        if (score <= 64) {
            return true;
        } else {
            return false;
        }
    }

    public Character getGrade(Double score) {
        if (isGradeA(score)) {
            return 'A';
        } else if (isGradeB(score)) {
            return 'B';
        } else if (isGradeC(score)) {
            return 'C';
        } else if (isGradeD(score)) {
            return 'D';
        } else if (isGradeF(score)) {
            return 'F';
        } else {
            return null;
        }
    }
}

