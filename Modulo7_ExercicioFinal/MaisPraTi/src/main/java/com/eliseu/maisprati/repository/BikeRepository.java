package com.eliseu.maisprati.repository;

import com.eliseu.maisprati.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
