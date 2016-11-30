public interface IParking {
    Car pick(CarTicket ticket);

    CarTicket park(Car car);

    int getVacancy();

    int getCapacity();

    String report();
}
