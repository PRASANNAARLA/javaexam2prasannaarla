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
public abstract class Subject {

    public int subjectCOde;
    public boolean isprequisite;

    public Subject(int subjectCOde, boolean isprequisite) {
        this.subjectCOde = subjectCOde;
        this.isprequisite = isprequisite;
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

    public abstract char grades();

    @Override
    public String toString() {
        return "Subject{" + "subjectCOde=" + subjectCOde + ", isprequisite=" + isprequisite + '}';
    }

}
