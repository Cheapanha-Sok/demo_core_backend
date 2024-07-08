package com.panha.demo_core_backend.repositories;

import com.panha.base.BaseRepository;
import com.panha.demo_core_backend.models.Bike;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends BaseRepository<Bike , Long> {
    Bike findByName(String name);
}
