package com.eliseu.maisprati.service;

import com.eliseu.maisprati.model.Bike;
import com.eliseu.maisprati.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BikeService {

    @Autowired
    public BikeRepository bikeRepository;

    public List<Bike> findAll() {
        return bikeRepository.findAll();
    }

    public Bike findById(Long id) {
        Optional<Bike> obj = bikeRepository.findById(id);
        return obj.orElseThrow();
    }

    public Bike insert(Bike bike) {
        return bikeRepository.save(bike);
    }

    public void delete(Long id) {
        bikeRepository.deleteById(id);
    }

    public Bike update(Long id, Bike obj) {
        Bike entity = bikeRepository.getOne(id);
        entity.setDescription(obj.getDescription());
        entity.setModel(obj.getModel());
        entity.setPrice(obj.getPrice());
        entity.setPurchaseDate(obj.getPurchaseDate());
        entity.setBuyerName(obj.getBuyerName());
        entity.setStore(obj.getStore());
        return bikeRepository.save(entity);
    }

    public Bike updatePatch(Long id, Bike obj) {
        Bike entity = bikeRepository.getOne(id);
        if (obj.getDescription() != null){
            entity.setDescription(obj.getDescription());
        }
        if (obj.getModel() != null) {
            entity.setModel(obj.getModel());
        }
        if (obj.getPrice() != null) {
            entity.setPrice(obj.getPrice());
        }
        if (obj.getPurchaseDate() != null){
        entity.setPurchaseDate(obj.getPurchaseDate());
        }
        if (obj.getBuyerName() != null){
        entity.setBuyerName(obj.getBuyerName());
        }
        if (obj.getStore() != null) {
            entity.setStore(obj.getStore());
        }
        return bikeRepository.save(entity);
    }

}
