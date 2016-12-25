package ru.ifmo;

import org.apache.log4j.Logger;

/**
 * Created by xmitya on 25.12.16.
 */
public class HelloWorld {
    private static final Logger LOG = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        LOG.info("Application started");

        System.out.printf("Hello, %s!\n", new DataSource().getData());

        LOG.info("Application stopped");
    }
}
