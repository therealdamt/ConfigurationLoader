# ConfigurationLoader
Smiple but advanced Config Loader, uses reflection.

### How To Use

```java
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
````

```java
public class ExampleConfigHandler {

    //Config is the default argument, not needed to be added.
    @ConfigProperty(config = "config", path = "website")
    public final String WEBSITE = "Input if the input provided was null"; //You can set this to null if you'd like
                                                                          //But to be safe just put a default message.

    @ConfigProperty(path = "size")
    public final int SIZE = 1;

}
```

```yml
website: "https://github.com/therealdamt"
size: 0
```

### Contact Information

* [Website](https://damt.xyz)
* [Telegram](https://t.me/therealdamt)
* Discord - damt#0886
