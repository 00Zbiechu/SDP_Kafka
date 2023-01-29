package pl.sdp.gl.kafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pl.sdp.gl.kafka.model.Vehicle;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService{

    private final KafkaTemplate kafkaTemplate;

    @Override
    public void doOrderForProduction(Vehicle vehicle) {

        this.kafkaTemplate.send("vehicle-create", new Vehicle(vehicle.getVin()));

    }

}
