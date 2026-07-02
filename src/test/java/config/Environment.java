package config;

public class Environment {
    public static String browser(){
        return System.getProperty("browser",ConfigReader.get("browser"));
    }
    public static boolean headless(){
        return Boolean.parseBoolean(System.getProperty("headless",ConfigReader.get("headless")));
    }

}
