package xyz.damt.example;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.damt.config.ConfigurationLoader;

public class ExampleMainClass extends JavaPlugin {

    /**
     * Creating an instance of the ExampleConfigHandler to use later
     */

    private ExampleConfigHandler exampleConfigHandler;

    /**
     * What the load method does is it loads all variables or fields
     * Located in the ExampleConfigHandler and it sets them to their
     * Values inside of the config.
     */

    @Override
    public void onEnable() {
        this.exampleConfigHandler = new ExampleConfigHandler();
        new ConfigurationLoader(getConfig(), exampleConfigHandler).load();

        this.testMethod();
    }

    /**
     * Small Test Method
     */

    public void testMethod() {
        System.out.println("Your Shoe Size: " + exampleConfigHandler.SIZE);
        System.out.println("Our Website: " + exampleConfigHandler.WEBSITE);
    }

}
