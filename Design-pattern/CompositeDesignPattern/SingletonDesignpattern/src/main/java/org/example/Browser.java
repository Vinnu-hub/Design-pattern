package org.example;

public class Browser
{
    // 1. private the static instance of classs;
    private  volatile  static Browser browser;
    // 2.private constroctor
    private Browser()
    {
// construor private
    }
    public   static Browser getInstance()
    //public static Browser getInstance()
    {
        if(browser==null) {
            synchronized (Browser.class) {
                if (browser == null) {
                    browser = new Browser();
                }
            }
        }
        return browser;
    }
    public void displaymessage()
    {
        System.out.println("hi vinay");
    }

}
//
// it is only creating the object only one time
//  the disadvantage is if the couple of threads are access then it is
// big problem to access the threads  to achivew that we use the "synchrozation" foe that
// i willl make the differnet class removing the synchorization and i will write the below code for that

// class Browser
// {
//      private static Browser browser;
//      private Browser()
//      {
//
//      }
//
//      private static Browser getInstance()
//      {
//           if(browser==null)
//           {
//               browser=new Browser();
//              }
//           return browser;
//          }
//
//
//          public void displaymessage()
//          {
//              System.out.println("hi vinay");
//      }
// }