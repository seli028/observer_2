package com.example.newsletter;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private final String name;
    private final List<NewsChannel> channels;


    public NewsAgency(String name) {
        this.name = name;
        this.channels = new ArrayList<>();
    }

    public void subscribe(NewsChannel channel) {
        System.err.println(channel + " has subscribed to " + this);
        this.channels.add(channel);
    }

    public void unsubscribe(NewsChannel channel) {
        System.err.println(channel + " has unsubscribed from " + this);
        this.channels.remove(channel);
    }

    public void broadcast(String news) {
        System.err.println(this + " broadcasts " + news);
        for (NewsChannel channel : channels) {
            channel.notify(news);
        }
        System.err.println("-------------------");
    }
    


    @Override
    public String toString() {
        return this.name;
    }

}
