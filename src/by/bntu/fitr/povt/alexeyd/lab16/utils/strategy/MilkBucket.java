package by.bntu.fitr.povt.alexeyd.lab16.utils.strategy;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Milk;
import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.ComparatorByPriceAndId;

import java.util.List;

public class MilkBucket extends Bucket {

    @Override
    public void addProduct(Product product) {
        getList().add((Milk) product);
    }

    public MilkBucket() {
        comparator = new ComparatorByPriceAndId();
    }

    public List getAll() {
        return getList();
    }

}
