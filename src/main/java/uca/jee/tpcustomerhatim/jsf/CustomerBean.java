/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package uca.jee.tpcustomerhatim.jsf;

import uca.jee.tpcustomerhatim.entity.Customer;
import jakarta.inject.Inject;  
import jakarta.inject.Named;  
import jakarta.faces.view.ViewScoped;  
import java.io.Serializable;  
import java.util.List;  
import uca.jee.tpcustomerhatim.service.CustomerManager;
/**
 *
 * @author intra
 */
/**
 * Backing bean de la page customerList.xhtml.
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
    private List<Customer> customerList;  

  @Inject
  private CustomerManager customerManager;

    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {}
        /** 
   * Retourne la liste des clients pour affichage dans une DataTable.
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
}
    

