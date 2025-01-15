package clients.customer;

/**
 * The Customer Controller
 */

public class CustomerController
{
  private CustomerModel model = null;
  private CustomerView  view  = null;

  /**
   * Constructor
   * @param model The model 
   * @param view  The view from which the interaction came
   */
  public CustomerController( CustomerModel model, CustomerView view )
  {
    this.view  = view;
    this.model = model;
  }

  /**
   * Check interaction from view
   * @param pn The product number to be checked
   * @param searchType Type of search to be performed, product code or text
   */
  public void doCheck( String pn ,String searchType)
  {
    if(searchType.equals("PrCode")){
      model.doCheck(pn);
    }else{
      model.textCheck(pn);
    }

  }

  /**
   * Clear interaction from view
   */
  public void doClear()
  {
    model.doClear();
  }

  
}

