package com.oracle.stream;

import com.oracle.dao.CityDao;
import com.oracle.dao.CountryDao;
import com.oracle.dao.InMemoryWorldDao;
import com.oracle.domain.City;
import com.oracle.domain.Country;

import java.util.*;
import java.util.stream.Collectors;

public class CountriesAndCities {
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    private static final CityDao cityDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {
        // Encontrar las ciudades mas pobladas en cada continente
        Map<String, Optional<City>> ciudadesMasPobladas = cityDao.findAllCities().stream().collect(Collectors.groupingBy(city -> countryDao.findCountryByCode(city.getCountryCode()).getContinent(),Collectors.maxBy(Comparator.comparingInt(City::getPopulation))));
        ciudadesMasPobladas.entrySet().forEach(System.out::println);
    }
}
