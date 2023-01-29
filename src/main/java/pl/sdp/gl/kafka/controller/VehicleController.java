package pl.sdp.gl.kafka.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sdp.gl.kafka.model.Vehicle;
import pl.sdp.gl.kafka.service.ShopService;


@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final ShopService shopService;

    @PostMapping
    public ResponseEntity<Vehicle> sendOrder(@RequestBody Vehicle vehicle){

        shopService.doOrderForProduction(vehicle);
        return ResponseEntity.ok(vehicle);

    }


}
