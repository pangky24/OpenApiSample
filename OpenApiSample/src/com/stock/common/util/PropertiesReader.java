package com.stock.common.util;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * http://javaant.com/how-to-use-properties-file-in-android/#.X4MYeGj7SUk
 */
public class PropertiesReader {
    private static Properties stockProperties;

    public static void init(Context context) {
        stockProperties = new Properties();
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = null;
        try {
            inputStream = assetManager.open("prop/stock.properties");
            stockProperties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getStockProperty(String key) {
        return stockProperties.getProperty(key);
    }
}
