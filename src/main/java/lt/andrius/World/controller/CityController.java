package lt.andrius.World.controller;

import lt.andrius.World.repository.model.City;
import lt.andrius.World.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller //https://localhost:8080/
@RequestMapping(path = "/citymapping")//https://localhost:8080/citymapping
public class CityController {

    @Autowired
    private CityService cityService;

//    //   http://localhost:8080/citymapping/test
//    @GetMapping(path = "/test")
//    public @ResponseBody String getTestPage() {
//        return "Testing";
//    }

    // http://localhost:8080/citymapping/city/all
    @GetMapping(path = "/city/all")
    public @ResponseBody List<City> getAllCity() {
        return cityService.getAllCity();
    }


    //  http://localhost:8080/citymapping/mycity/name/Newport
    @GetMapping(path = "/mycity/name/{name}")
    public @ResponseBody City getMyCityByName(@PathVariable String name) {
        return cityService.getMyCityByName(name);
    }


}
