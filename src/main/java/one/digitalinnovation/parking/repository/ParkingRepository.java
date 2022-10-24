package one.digitalinnovation.parking.repository;

import one.digitalinnovation.parking.controller.dto.ParkingDTO;
import one.digitalinnovation.parking.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {

    @Query(value = "SELECT * FROM PARKING WHERE LICENSE = ?", nativeQuery = true)
    Optional<Parking> findByLicense(String lincense);
}
