package com.santa.cafe.beverage;

import com.santa.cafe.beverage.model.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeverageRepository extends JpaRepository<Beverage, Integer> {
}
