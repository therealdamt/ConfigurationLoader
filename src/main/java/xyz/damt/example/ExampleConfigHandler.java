package xyz.damt.example;

import xyz.damt.config.ConfigProperty;

public class ExampleConfigHandler {

    //Config is the default argument, not needed to be added.
    @ConfigProperty(config = "config", path = "website")
    public final String WEBSITE = "Input if the input provided was null"; //You can set this to null if you'd like
                                                                          //But to be safe just put a default message.

    @ConfigProperty(path = "size")
    public final int SIZE = 1;

}
