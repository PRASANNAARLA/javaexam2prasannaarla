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
public class Science extends Subject {

    public int scmarks;
    public int labmarks;

    public Science(int scmarks, int labmarks, int subjectCOde, boolean isprequisite) {
        super(subjectCOde, isprequisite);
        this.scmarks = scmarks;
        this.labmarks = labmarks;
    }

    public int getScmarks() {
        return scmarks;
    }

    public void setScmarks(int scmarks) {
        this.scmarks = scmarks;
    }

    public int getLabmarks() {
        return labmarks;
    }

    public void setLabmarks(int labmarks) {
        this.labmarks = labmarks;
    }

    public int getSubjectCOde() {
        return subjectCOde;
    }

    public void setSubjectCOde(int subjectCOde) {
        this.subjectCOde = subjectCOde;
    }

    public boolean isIsprequisite() {
        return isprequisite;
    }

    public void setIsprequisite(boolean isprequisite) {
        this.isprequisite = isprequisite;
    }

    public char grades() {
        char grade = 'q';
        if (scmarks <= 25) {
            grade = 'C';
        } else if (scmarks > 25 && scmarks < 75) {
            grade = 'B';
        } else if (scmarks > 90) {
            grade = 'A';
        }
        return grade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nScience{" + "marks in science=" + scmarks + ", labmarks=" + labmarks + ", grades=" + grades() + '}';
    }

}
