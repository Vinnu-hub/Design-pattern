package org.example.ObserverDesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

   private   List<Subscriber> subs =new ArrayList<>();

    String title;

   public void subscribe(Subscriber sub)
    {
        subs.add(sub);
    }
    public void unsubscriber(Subscriber sub)
    {
        subs.remove(sub);
    }

    public void notifysub() {

        for (Subscriber sub : subs) {
            sub.update();

        }
    }

        public void upload(String title)
        {

            this.title=title;
            notifysub();
        }
    }

