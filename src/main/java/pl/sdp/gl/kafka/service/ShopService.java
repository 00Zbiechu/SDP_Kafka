package pl.sdp.gl.kafka.service;

import pl.sdp.gl.kafka.model.Vehicle;

public interface ShopService {

    void doOrderForProduction(Vehicle vehicle);

}
