package xyz.damt.config;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.Arrays;

public class ConfigurationLoader {

    private final FileConfiguration yamlConfiguration;
    private final Object object;

    /**
     * ConfigurationLoader Class
     * @param yamlConfiguration Config To Be Loaded
     * @param object Instance Of The Config Handler
     */

    public ConfigurationLoader(FileConfiguration yamlConfiguration, Object object) {
        this.yamlConfiguration = yamlConfiguration;
        this.object = object;
    }

    /**
     * What the load method does is it loads all variables or fields
     * Located in the ExampleConfigHandler and it sets them to their
     * Values inside of the config.
     */

    public void load() {
        Arrays.asList(object.getClass().getFields()).forEach(field -> {

            field.setAccessible(true);

            ConfigProperty configProperty = field.getAnnotation(ConfigProperty.class);

            if (configProperty == null)
                return;

            if (!configProperty.config().equals(yamlConfiguration.getName().replace(".yml", "")))
                return;

            try {
                field.set(object, yamlConfiguration.get(configProperty.path()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        });
    }
}
