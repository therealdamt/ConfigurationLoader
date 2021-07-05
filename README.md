# ConfigurationLoader
Simple but advanced Config Loader uses reflection.

### Dependecy

**Resp**
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

**Dependency**
```xml
	<dependency>
	    <groupId>com.github.therealdamt</groupId>
	    <artifactId>ConfigurationLoader</artifactId>
	    <version>1.0</version>
	</dependency>
```

```gradle
dependencies {
	        implementation 'com.github.therealdamt:ConfigurationLoader:1.0'
	}
```


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

### Why use this?
Well, through this you store the data from the config into the ram of the server. This way you don't have to go through the config every time you need to get a value. This helps to organize everything and all that needs to be done is just to insert the path. This is highly recommeneded to be used in all your projects since it can actually help make a difference in many situaions. If you'd like to reload the config, just use the load method again 💯!

### Contact Information

* [Website](https://damt.xyz)
* [Telegram](https://t.me/therealdamt)
* Discord - damt#0886
