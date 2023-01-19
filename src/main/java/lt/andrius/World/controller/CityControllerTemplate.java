package lt.andrius.World.controller;

import lt.andrius.World.repository.model.City;
import lt.andrius.World.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller //https://localhost:8080/
@RequestMapping(path = "/citytemplate")
public class CityControllerTemplate {
    @Autowired
    private CityService cityService;

    //   http://localhost:8080/citytemplate/firstpage/city/112
    @GetMapping(path = "/firstpage/city/{id}")
    public String getCityWithFirstPage(Model model, @PathVariable int id) {
        City city = cityService.getCityById(id);
        model.addAttribute("id", city.getId());
        model.addAttribute("name", city.getName());
        model.addAttribute("country_code", city.getCountryCode());
        model.addAttribute("district", city.getDistrict());
        model.addAttribute("population", city.getPopulation());
        return "city_firstpage";
    }

    //   http://localhost:8080/citytemplate/firstpage/city/all
    @GetMapping(path = "/firstpage/city/all")
    public String getAllCity(Model model) {
        List<City> cityList = cityService.getAllCity();
        model.addAttribute("key_city_list", cityList);
        return "firstpage_city_list";
    }
}

