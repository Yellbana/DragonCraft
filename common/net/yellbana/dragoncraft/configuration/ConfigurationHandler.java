package net.yellbana.dragoncraft.configuration;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;

import net.minecraftforge.common.Configuration;
import net.yellbana.dragoncraft.lib.BlockIds;
import net.yellbana.dragoncraft.lib.ItemIds;
import net.yellbana.dragoncraft.lib.Strings;

public class ConfigurationHandler {

    public static Configuration config;

    public static void init(File configFile) {
        config = new Configuration(configFile);

        /* General configs */
        ConfigurationSettings.DISPLAY_VERSION_RESULT = config.get(CATEGORY_GENERAL, ConfigurationSettings.DISPLAY_VERSION_RESULT_CONFIGNAME, ConfigurationSettings.DISPLAY_VERSION_RESULT_DEFAULT).getBoolean(ConfigurationSettings.DISPLAY_VERSION_RESULT_DEFAULT);
        ConfigurationSettings.LAST_DISCOVERED_VERSION = config.get(CATEGORY_GENERAL, ConfigurationSettings.LAST_DISCOVERED_VERSION_CONFIGNAME, ConfigurationSettings.LAST_DISCOVERED_VERSION_DEFAULT).getString();
        ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE = config.get(CATEGORY_GENERAL, ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE_CONFIGNAME, ConfigurationSettings.LAST_DISCOVERED_VERSION_TYPE_DEFAULT).getString();

        //Block Configs
        BlockIds.DRAGONPORTAL = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.DRAGONPORTAL_NAME, BlockIds.DRAGONPORTAL_DEFAULT).getInt(BlockIds.DRAGONPORTAL_DEFAULT);
        BlockIds.DRAGONEMERALD = config.getBlock(Configuration.CATEGORY_BLOCK, Strings.DRAGONEMERALD_NAME, BlockIds.DRAGONEMERALD_DEFAULT).getInt(BlockIds.DRAGONEMERALD_DEFAULT);

        //Item Configs
        ItemIds.DRAGONSPHERE = config.getItem(Configuration.CATEGORY_ITEM, Strings.DRAGONSPHERE_NAME, ItemIds.DRAGONSPHERE_DEFAULT).getInt(ItemIds.DRAGONSPHERE_DEFAULT);
    }

    public static void set(String categoryName, String propertyName, String newValue) {

        config.load();
        if (config.getCategoryNames().contains(categoryName)) {
            if (config.getCategory(categoryName).containsKey(propertyName)) {
                config.getCategory(categoryName).get(propertyName).set(newValue);
            }
        }
        config.save();
    }
}
