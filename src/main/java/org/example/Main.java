package org.example;

public class Main {
    //private static final Configuration configuration = new Configuration("src/main/resources/config.properties");
    public static void main(String[] args) {
        SingletonConfiguration singletonConfiguration = SingletonConfiguration.getInstance();
        new Bot(singletonConfiguration.getBotToken());
    }
}
