package org.example.schools;

import org.example.Adapter.penadapter;
import org.example.model.pen;

public class school {

    public static void main(String args[])
    {

        pen p=new penadapter();
        Assignmentwork aw=new Assignmentwork();
        aw.setP(p);
        aw.writeAssignment("ism bit tried to wrte an assignment");

    }
}

