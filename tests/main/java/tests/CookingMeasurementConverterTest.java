package main.java.tests;

import CookingConvertor.CookingMeasurement;
import CookingConvertor.CookingMeasurementConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CookingMeasurementConverterTest {

    @Test
    void convert_zeroNumberCheck() {
        CookingMeasurement forCheck = new CookingMeasurement(0, "TSP");

        CookingMeasurement converted = CookingMeasurementConverter.convert(new CookingMeasurement(0, "ML"), "TSP");

        assertEquals(forCheck.getAmount(), converted.getAmount());
        assertEquals(forCheck.getUnit(), converted.getUnit());
    }

    @Test
    void convert_CheckIfConversion_FromMinusOne_IsCorrect() {
        CookingMeasurement forCheck = new CookingMeasurement(0, "TSP");

        CookingMeasurement converted = CookingMeasurementConverter.convert(new CookingMeasurement(-1, "ML"), "TSP");

        assertEquals(forCheck.getAmount(), converted.getAmount());
        assertEquals(forCheck.getUnit(), converted.getUnit());
    }

    @Test
    void convert_CheckIfConversion_IsCorrect() {
        CookingMeasurement forCheck = new CookingMeasurement(1, "TSP");

        CookingMeasurement converted = CookingMeasurementConverter.convert(new CookingMeasurement(5, "ML"), "TSP");

        assertEquals(forCheck.getAmount(), converted.getAmount());
        assertEquals(forCheck.getUnit(), converted.getUnit());
    }
}