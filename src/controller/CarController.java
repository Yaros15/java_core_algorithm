package controller;

import model.Car;
import repo.CarRepo;
import service.sort.SortingArray;

import static java.util.Arrays.sort;

public class CarController {

    private CarRepo carRepo;
    private SortingArray sortingArray;
    private SearchArray searchArray;
    private Car[] sortingCars;

    public CarController(SortingArray sortingArray, SearchArray searchArray) {
        this.carRepo = new CarRepo();
        this.sortingArray = sortingArray;
        this.searchArray = searchArray;
    }

    public void setSortingArray(SortingArray sortingArray) {
        this.sortingArray = sortingArray;
    }

    public void setSearchArray(SearchArray searchArray) {
        this.searchArray = searchArray;
    }

    public void carSort(){
        sortingCars = sortingArray.sort(carRepo.getCars());

    }

    public void showSortedCars(){
        for(Car car : sortingCars){
            System.out.println(car);
        }
    }

    public void carSearch(int releaseDate){
        int indexCar = searchArray.search(carRepo.getCars(), releaseDate);
        System.out.println(carRepo.getCar(indexCar));
    }

}
