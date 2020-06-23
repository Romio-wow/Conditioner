package ru.netology;

public class Conditioner {
    private boolean on;
    private int maxTemperature = 30;
    private int minTemperature = 15;
    private int currentTemperature;

    // создаем геттер метод
    public boolean isOn() {
        return on;
    }

    // создаем сеттер метод
    public void setOn(boolean on) {
        this.on = on;
    }

    // создали геттеры для мин и макс температуры
    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    // создали сеттер для текущей температуры
    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;//создали условия при котором макс температура не выходит за границы присвоемого значение
            return;
        }
        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    // создали геттер для тек температуры
    public int getCurrentTemperature() {
        return currentTemperature;
    }

    //создали метод при котором температура увеличивалась на 1 градус
    public void increaseCurrentTemperature() {
        if (!isOn()) {
            return; // присвоили отрицательное значение  ! (false)
        }
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature++;
    }

    //создали метод при котором температура уменьшалось на 1 градус
    public void decreaseCurrentTemperature() {
        if (!isOn()) {
            return;
        }
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature--;
    }
}
