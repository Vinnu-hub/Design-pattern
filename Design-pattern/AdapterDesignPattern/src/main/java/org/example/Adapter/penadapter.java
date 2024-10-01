package org.example.Adapter;

import org.example.model.pen;

public class penadapter implements pen {



    pilotpen pp=new pilotpen();


    @Override
    public void write(String str)
    {
             pp.mark(str);
    }
}
