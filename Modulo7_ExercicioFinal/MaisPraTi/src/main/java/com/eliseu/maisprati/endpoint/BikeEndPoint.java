package com.eliseu.maisprati.endpoint;

import com.eliseu.maisprati.model.Bike;
import com.eliseu.maisprati.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("v1")
public class BikeEndPoint {

    @Autowired
    private BikeService bikeService;

    @GetMapping(path = "/bikes")
    public ResponseEntity<List<Bike>> findAll() {
        List<Bike> list = bikeService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(path = "/bikes/{id}")
    public ResponseEntity<?> getBikeById(@PathVariable("id") Long id) {
        Bike obj = bikeService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping(path = "/bikes")
    public ResponseEntity<?> insert(@RequestBody Bike obj) {
        obj = bikeService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(path = "/bikes/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        bikeService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/bikes/{id}")
    public ResponseEntity<Bike> update(@PathVariable Long id, @RequestBody Bike obj) {
        obj = bikeService.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

    @PatchMapping(path = "/bikes/{id}")
    public ResponseEntity<Bike> updatePatch(@PathVariable Long id, @RequestBody Bike obj) {
        obj = bikeService.updatePatch(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}