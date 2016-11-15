import java.util.List;

public class SmartParkingBoy extends ParkingStaffBase {
    public SmartParkingBoy(ParkingLot parkingLot) {
        super(parkingLot);
    }

    public SmartParkingBoy(List<ParkingLot> parkingLot) {
        super(parkingLot);
    }

    public CarTicket park(Car car) {
        return getMaxVacancyParkingLot().park(car);
    }

    private ParkingLot getMaxVacancyParkingLot() {
        ParkingLot maxParkingLot = parkingLots.get(0);
        for (ParkingLot parkLot : parkingLots) {
            if(parkLot.vacancy() > maxParkingLot.vacancy()){
                maxParkingLot = parkLot;
            }
        }
        return maxParkingLot;
    }
}
