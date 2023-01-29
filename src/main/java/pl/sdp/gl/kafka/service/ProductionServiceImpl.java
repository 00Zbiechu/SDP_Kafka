package pl.sdp.gl.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import pl.sdp.gl.kafka.model.Vehicle;

@Slf4j
@Service
public class ProductionServiceImpl implements ProductionService {

    @Override
    @KafkaListener(topics = "vehicle-create")
    public void consumer(@Payload Vehicle vehicle) {
        log.info("Przyjęto zgłoszenie na wyprodukowanie auta o numerze VIN: {}", vehicle.getVin());
    }

}
