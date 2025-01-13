package catalogue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BetterBasketTest {

    @Test
    void testMergeAddProduct() {
        //create new better basket
        BetterBasket b = new BetterBasket();
        //create new test products
        Product p1 = new Product("0001","Radio",24.99,1);
        Product p2 = new Product("0002","TV",144.47,1);
        //add test products to basket
        b.add(p1);
        b.add(p1);
        b.add(p2);
        //Test assertions
        assertEquals(2,b.size(),"Incorrect basket size after merge");
        assertEquals(2,b.get(0).getQuantity(),"Incorrect product quantity after merge");
    }

    @Test
    void testSortAddProduct(){
        //create new better basket
        BetterBasket b = new BetterBasket();
        //create new test products
        Product p1 = new Product("0001","Radio",24.99,1);
        Product p2 = new Product("0002","TV",144.47,1);
        Product p3 = new Product("0003","Kettle",14.72,1);
        Product p4 = new Product("0004","Toaster",14.35,1);
        //add test products to basket
        b.add(p4);
        b.add(p2);
        b.add(p3);
        b.add(p1);
        //Test assertions
        assertEquals("0001",b.get(0).getProductNum(),"Incorrect product number, basket not sorted");

    }

}