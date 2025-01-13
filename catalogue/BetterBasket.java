package catalogue;


import java.util.Collections;

/**
 * Adds a product to the BetterBasket.
 * The product is compared to products currently in the basket.
 * If the product is found, the quantity is updated.
 * Otherwise, the product is added and then the basket is sorted by product number.
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket
{
  @Override
    public boolean add(Product pr) {
      //Loop through current product list
      for(Product prInList:this){
          //check if product is already in list
          if(prInList.getProductNum().equals(pr.getProductNum())){
              //calculate new quantity
              int quantity = pr.getQuantity()+prInList.getQuantity();
              //update product quantity
              prInList.setQuantity(quantity);
              return(true);
          }
      }
      super.add(pr);
      Collections.sort(this);
      return (true);
  }
  // You need to add code here
  // merge the items for same product,
  // or sort the item based on the product number
}
