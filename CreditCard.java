package AirlinesReservationSystem;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author judyk
 */
import java.io.Serializable;
import java.util.Date;
import java.lang.constant.ConstantDesc;
import static java.lang.constant.ConstantDescs.NULL;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class CreditCard implements Serializable {
   private String cardNumber;
   private Date expiration;
   private String CVV;
  
   
   public CreditCard(){
       cardNumber= "0";
        Date d = new Date(); 
       expiration = d;
       CVV= " 0";
   }
  
   public CreditCard(String cardNumber, int year, int month, int day, String CVV ){
   this.cardNumber= cardNumber;
   Date d = new Date(year,month,day);
   this.expiration=d;
      this.CVV=CVV;
   }
   
   public String getCardNumber(){
       return cardNumber;
   }
   

   public Date getExpiration(){
       return this.expiration;
   }
  
   
}
