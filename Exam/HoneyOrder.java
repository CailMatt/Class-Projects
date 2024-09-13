public class HoneyOrder {
   private int honeyType;
   private int amtPounds;
   private double totalPrice;
   private int sixlbBottles;
   private int threelbBottles;
   private int onelbBottles;
   private double rate;
   private double orangeCheap = 1.15;
   private double orangeExpensive = 1.25;
   private double wildCheap = 1.05;
   private double wildExpensive = 1.10;
   private double cloverCheap = .97;
   private double cloverExpensive = 1;
   
   //Constructor that does not accept parameters
   public HoneyOrder() {
      honeyType = 0;
      amtPounds = 0;
   }
   
   //Parameter accepting constructor
   //@param typeHoney, This is the menu selection that is referring to the type of honey
   //@param honeyAmt, the pounds of honey input
   public HoneyOrder(int typeHoney, int honeyAmt) {
      honeyType = typeHoney;
      amtPounds = honeyAmt;
   }
   
   //The setTotalPrice method sets the total price based off the rates applied 
   //via the number of pounds and the type fo honey bought
   public void setTotalPrice() {
      if (honeyType == 1 && amtPounds > 35) {
         rate = orangeCheap;
      } 
      if (honeyType == 1 && amtPounds <= 35) {
         rate = orangeExpensive;
      }
      
      if (honeyType == 2 && amtPounds > 35) {
         rate = wildCheap;
      }
      if (honeyType == 2 && amtPounds <= 35) {
         rate = wildExpensive;
      }
      
      if (honeyType == 3 && amtPounds > 35) {
         rate = cloverCheap;
      }
      if (honeyType == 3 && amtPounds <= 35) {
         rate = cloverExpensive;
      }
      totalPrice = rate * amtPounds;
   }

   //The setBottles method sets the number of bottles required to optimally package the honey for the user
   //Works by taking the remainder of the pounds of honey divided by 6, then 3
   public void setBottles() {
      int tempAmtPounds = 0;
      int sixlbMod = amtPounds % 6;
      int threelbMod = 0;
      if (amtPounds >= 6) {
         if (sixlbMod > 0) {
            tempAmtPounds = amtPounds - sixlbMod;
            sixlbBottles = tempAmtPounds/6;
            threelbMod = sixlbMod % 3;
            if (threelbMod > 0) {
               tempAmtPounds = sixlbMod - threelbMod;
               threelbBottles = tempAmtPounds/3;
               onelbBottles = threelbMod;
            } 
            else {
               threelbBottles = sixlbMod/3;
            }
         } 
         else {
            sixlbBottles = amtPounds/6;
         }
      } 
      else {
         threelbMod = amtPounds % 3;
         if (threelbMod > 0) {
            tempAmtPounds = amtPounds - threelbMod;
            threelbBottles = tempAmtPounds/3
            
            ;
            onelbBottles = threelbMod;
         } else {
            threelbBottles = amtPounds/3;
         }
      }
   }

   //The getAmtPounds gets the amount of pounds bought in the object
   //@return amtPounds
   public int getAmtPounds() {
      return amtPounds;
   }
   
   //the getHoneyType method gets the value of the type of honey selected
   //@return honeyType
   public int getHoneyType() {
      return honeyType;
   }
   
   //The getTotalPrice method gets the Total price of the honey
   //@return totalPrice 
   public double getTotalPrice() {
      return totalPrice;
   }
   
   //The getSixlbBottles method gets the number of six pound bottles required to be optimal
   //@return sixlbBottles
   public int getSixlbBottles() {
      return sixlbBottles;
   }
   
   //The getThreelbBottles method gets the optimal number of three pound bottles required
   //@return threelbBottles
   public int getThreelbBottles() {
      return threelbBottles;
   }
   
   //The getOnelbBottles method gets the amount of one pound bottle required to be optimal
   //@return onelbBottles
   public int getOnelbBottles() {
      return onelbBottles;
   }
   
}