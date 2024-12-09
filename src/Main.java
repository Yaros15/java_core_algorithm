import controller.CarController;
import service.sort.SortingByInsertion;

public class Main {
    public static void main(String[] args) {
        CarController carController = new CarController(new SortingByInsertion());
        carController.carSort();
        carController.showSortedCars();

    }
}