package org.example.Objectcreatingclasss;

import org.example.Implementsmethod.Andriod;
import org.example.interfaces.OS;

public class MAIN {
    public static void main(String args[])
    {


        operatingsystemFactory factory=new operatingsystemFactory();
         OS j=factory.getInstance("closed");


         //based on iam passing the get instance iwill get the result
      //  OS j=new Andriod();
        //here if i want to acess the differnt Os menas in ftures i have to
        // change and all the specification\
        // such a way that i have to create the implemenation of the factory method
        j.spec();
    }
}
