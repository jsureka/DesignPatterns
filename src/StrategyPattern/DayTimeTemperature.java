package StrategyPattern;

public class DayTimeTemperature {

    private DayTemperature strategy;

    public DayTimeTemperature(DayTemperature strategy) {
        this.strategy = strategy;
    }

    public DayTemperature getStrategy() {
        return strategy;
    }

    public void setStrategy(DayTemperature strategy) {
        this.strategy = strategy;
    }

    public void showTemperature(String temp) {
        strategy.displayTemperature(temp);
    }

}