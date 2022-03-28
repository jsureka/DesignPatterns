package StrategyPattern;

public class NightTemperature implements DayTemperature {

    @Override
    public void displayTemperature(String temp) {
        System.out.println("Today's temperature at night : " + temp);
    }

}