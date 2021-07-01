package sharing.dao;

import java.util.List;
import sharing.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
