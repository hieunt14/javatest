package com.nokavietnam;

import com.nokavietnam.config.LoadConfig;

/**
 * @author : noka
 * @since : 25/Apr/2021
 **/
public class TestPoolDB {
    public static void main(String[] args) {
        try {
            (new LoadConfig()).loadConfig();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
