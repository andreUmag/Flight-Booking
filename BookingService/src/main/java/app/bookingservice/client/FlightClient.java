package app.bookingservice.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "FlightService")
public interface FlightClient {

}
