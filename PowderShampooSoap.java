package javaapplication1;

public class PowderShampooSoap {
   public static void main(String[] args){
        int shortagePowder = 100;       //grams
        int shortageShampoo = 1;          //liters
        int shortageSoap = 3;        //units
        
        int powderExpected = 500;       //grams
        int shampooExpected = 2;          //liters
        int soapExpected = 5;        //units
        
        boolean holidays = true;
        
        
         int powder = powderExpected - shortagePowder;
            System.out.println("You have " + powder + " grams of powder");
        
        if (holidays &&  shortageShampoo != 0){
            int shampoo = shampooExpected/2;
            System.out.println("You have " + shampoo + " liters of shampoo");
        }
        else if (shortageShampoo > 0) {
            int shampoo = shampooExpected = shortageShampoo;
            System.out.println("You have " + shampoo + "liters of shampoo");            
        }
        if (holidays && shortageSoap != 0){
            int soap = soapExpected/2;
            System.out.println("You have " + soap + " units of soap");
        }
        else if (shortageSoap > 0){
            int soap = soapExpected-shortageSoap;
            System.out.println("You need to buy " + soap + " units of soap");
        } 
}
}
