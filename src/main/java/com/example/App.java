package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Logger logger = new Logger("iofiles","log.txt");


        logger.log("New message for log");



        logger.tidyUp();
    }
}
