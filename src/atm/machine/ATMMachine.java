
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.machine;
import java.util.Scanner;
/**
 *
 * @author mlarrubia
 */
public class ATMMachine {
    static Scanner kb = new Scanner(System.in);
    private static final String USERNAME = "user";
    
    private static final int PIN = 1234;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Login: ");
        System.out.println("Username > ");
        String name = kb.nextLine();
        System.out.println("Pin > ");
        int pinCode = kb.nextInt();
        
        if(name.equals(USERNAME) && PIN == pinCode){
           
           accountManagement();
            
           
           
        }
        else{
            System.out.println("Try again");
            
            
        }
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
    public static void accountManagement(){
        System.out.println("WELCOME, user!");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Deposit Checks");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Logout");
        
        
        
        
    }
    
    
    
    
    
}
