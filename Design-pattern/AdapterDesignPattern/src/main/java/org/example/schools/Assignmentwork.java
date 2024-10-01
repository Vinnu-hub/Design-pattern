package org.example.schools;

import org.example.model.pen;

public class Assignmentwork
{
    private pen p;
// since it is varible we need the getter and setter method's on
    // these
    public pen getP() {
        return p;
    }
    public void setP(pen p) {
        this.p = p;
    }
    public void writeAssignment(String str)
    {
        // to write a ssinment we need a  pen
        p.write(str);

    }
}
