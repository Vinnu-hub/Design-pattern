package org.example.Objectcreatingclasss;

import org.example.Implementsmethod.Andriod;
import org.example.Implementsmethod.IOS;
import org.example.Implementsmethod.Windows;
import org.example.interfaces.OS;


// these is factory classs depence onthe input you pass
public class operatingsystemFactory
{
    public OS getInstance(String str)
    {
        if(str.equals("open"))
            return new Andriod();
        else if (str.equals("Closed"))
            return new IOS();
        else
            return new Windows();
    }
}
