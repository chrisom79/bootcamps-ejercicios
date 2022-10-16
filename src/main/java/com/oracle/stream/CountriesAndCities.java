package com.oracle.stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import com.oracle.dao.CityDao;
import com.oracle.dao.CountryDao;
import com.oracle.dao.InMemoryWorldDao;
import com.oracle.domain.City;
import com.oracle.domain.Country;

public class CountriesAndCities {
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    private static final CityDao cityDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {
        // Encontrar las ciudades mas pobladas en cada continente
        // 1.- Obtengo continentes
        // 2.-Obtengo los paises por continentes
        // 3.-La ciudad más poblada de cada país
        // 4.-Busco la ciudad más poblada de ese continente
        try {            
            countryDao.getAllContinents().stream().forEach(c -> {
                System.out.println("Continente");
                System.out.println(c);
                System.out.println(
                countryDao.findCountriesByContinent(c).stream().map(pais ->
                    cityDao.findCitiesByCountryCode(pais.getCode()).stream().map(ciudad-> ciudad.getPopulation()).max(Comparator.naturalOrder())
                ).map(p -> p.isPresent() ? p.get() : 0).max(Comparator.naturalOrder()).get());
            });
        } catch (NoSuchElementException e) {
            System.out.println("");
        }
    }
}
