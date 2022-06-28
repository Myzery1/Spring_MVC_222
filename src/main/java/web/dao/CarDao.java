package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    private static int CAR_COUNT;

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "Audi", 11));
        cars.add(new Car(++CAR_COUNT, "Mercedes", 12));
        cars.add(new Car(++CAR_COUNT, "Volvo", 13));
        cars.add(new Car(++CAR_COUNT, "Chevrolet", 14));
        cars.add(new Car(++CAR_COUNT, "Ford", 15));
    }

    public List<Car> carsTable(Integer value) {
        if (value != null && value >= 0 && value < 5) {
            return cars.stream().filter(car -> car.getId() <= value).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
