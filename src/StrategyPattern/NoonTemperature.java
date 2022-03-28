package StrategyPattern;

public class NoonTemperature implements DayTemperature {

    @Override
    public void displayTemperature(String temp) {
        System.out.println("Today's temperature at noon : " + temp);
    }

}