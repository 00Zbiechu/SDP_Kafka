package pl.sdp.gl.kafka.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Vehicle {

    private String vin;

    public Vehicle(@JsonProperty String vin) {
        this.vin = vin;
    }



}
