package auto.main;

import auto.dao.CountryDao;
import org.junit.jupiter.api.Test;

public class CreateTable {

    @Test
    public void testOne(){
        CountryDao countryDao = new CountryDao();
        countryDao.createTable();
    }


}
