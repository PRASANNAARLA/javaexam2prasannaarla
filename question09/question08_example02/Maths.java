/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08_example02;

/**
 *
 * @author prasanna arla
 */
public class Maths extends Subject {

    public int marks;
    public int totalChapters;

    public Maths(int marks, int totalChapters, int subjectCOde, boolean isprequisite) {
        super(subjectCOde, isprequisite);
        this.marks = marks;
        this.totalChapters = totalChapters;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getTotalChapters() {
        return totalChapters;
    }

    public void setTotalChapters(int totalChapters) {
        this.totalChapters = totalChapters;
    }

    public boolean isIsprequisite() {
        return isprequisite;
    }

    public void setIsprequisite(boolean isprequisite) {
        this.isprequisite = isprequisite;
    }

    public char grades() {
        char grade = 'q';
        if (marks <= 25) {
            grade = 'C';
        } else if (marks > 25 && marks < 75) {
            grade = 'B';
        } else if (marks > 90) {
            grade = 'A';
        }
        return grade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMaths{" + "marks=" + marks + ", totalChapters=" + totalChapters + ", grades=" + grades() + '}';
    }

}
