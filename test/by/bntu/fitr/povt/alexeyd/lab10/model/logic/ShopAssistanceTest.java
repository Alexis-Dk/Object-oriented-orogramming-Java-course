package by.bntu.fitr.povt.alexeyd.lab10.model.logic;

import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Bread;
import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Bucket;
import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Milk;
import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Orange;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopAssistanceTest {

    @Test
    public void calculateAvgPrice() {
        double expected = 3.0;
        Bucket bucket = new Bucket("POIT30701117");

        bucket.addProduct(new Bread(true, 500, 1.0, true, "Borodinskiy",
                "Chilli", "Brown", "Square", 1012234));
        bucket.addProduct(new Orange(false, 110, 5.0, 11, 0.1,
                true, "Rosso", "Elipse", 201243));
        bucket.addProduct(new Milk(false, 450, 3.0, 500, 3.2, 7.7,
                false, true, 45134343));
        assertEquals("Calculate avg price is correct.",
                expected, ShopAssistance.calculateAvgPrice(bucket), 0);
    }

}
