package StrategyPattern;

public class MorningTemperature implements DayTemperature {

    @Override
    public void displayTemperature(String temp) {
        System.out.println("Today's temperature at morning : " + temp);
    }

}