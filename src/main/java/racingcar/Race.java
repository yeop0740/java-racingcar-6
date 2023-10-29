package racingcar;

import java.util.List;

public class Race {

    private int round;
    private List<Car> cars;

    public Race(int round, List<Car> cars) {
        this.round = round;
        this.cars = cars;
    }

    public int getRound() {
        return round;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void proceedRound() {
        for (Car car : cars) {
            car.proceed();
        }
    }

}
