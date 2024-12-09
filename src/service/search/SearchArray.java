package service.search;

import model.Car;

// Паттерн стратегия -->
public interface SearchArray {

    int search(Car[] cars, int releaseDate);

}
// Паттерн стратегия <--