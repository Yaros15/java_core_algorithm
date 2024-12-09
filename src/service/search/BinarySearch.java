package service.search;

import model.Car;

public class BinarySearch implements SearchArray{

    @Override
    public int search(Car[] cars, int releaseDate) {

        int index = 0;
        int left = 0;
        int right = cars.length - 1;
        int middle = 0;

        if (releaseDate < cars[left].getReleaseDate()) {
            return index;
        }

        if (releaseDate > cars[right].getReleaseDate()) {
            return cars.length;
        }

        while (left <= right) {
            middle = (int) ((left + right) / 2);
            if (releaseDate == cars[middle].getReleaseDate()) {
                return middle;
            }
            if (releaseDate < cars[middle].getReleaseDate()) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }

        if (releaseDate < cars[middle].getReleaseDate()) {
            index = middle;
            return index;
        }
        if (releaseDate > cars[middle].getReleaseDate()) {
            index = middle + 1;
            return index;
        }
        return 9999999;
    }
}