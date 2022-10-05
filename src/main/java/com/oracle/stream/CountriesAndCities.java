package com.oracle.stream;

import com.oracle.dao.CityDao;
import com.oracle.dao.CountryDao;
import com.oracle.dao.InMemoryWorldDao;

public class CountriesAndCities {
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    private static final CityDao cityDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {
        // Encontrar las ciudades mas pobladas en cada continente
    }
}
