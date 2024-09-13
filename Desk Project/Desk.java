public class Desk {
   
   //Initiating Variables
   int deskNum;
   double price;
   int drawerNum;
   String woodType;
   
   //No arg Constructor
   public Desk () {
      String woodType = "";
      int drawerNum = 0;
      double price = 0;
      int deskNum = 0;
   }
   
   //Argument accepting constructor
   public Desk(String woodType2, int drawerNum2, int deskNum2) {
      String woodType = woodType2;
      int drawerNum = drawerNum2;
      int deskNum = deskNum2;
   }
   
   //Setter and Getters
   
   //@return woodType
   public String getWoodType() {
      return woodType;
   }

   //@return srawerNum
   public int getDrawerNum() {
      return drawerNum;
   }
   
   //@return price
   public double getPrice() {
      return price;
   }
   
   //@return deskNum
   public int getDeskNum() {
      return deskNum;
   }
   
   //@Param woodType
   public void setWoodType(String woodType) {
      this.woodType = woodType;
   }
   
   //@Param drawerNum
   public void setDrawerNum(int drawerNum) {
      this.drawerNum = drawerNum;
   }
   
   //@Param deskNum
   public void setDeskNum(int deskNum) {
      this.deskNum = deskNum;
   }
   
   //The setPrice method sets the price of the desks by taking into account the number of drawers, Type of wood and the number of desks being bought
   public void setPrice() {
      final double CHERRYBASE = 575.00;
      final double OAKBASE = 425.00;
      final double PINEBASE = 250.00;
      
      final double CHERRYEXPENSIVE = 65.75;
      final double CHERRYCHEAP = 61.50;
      final double OAKEXPENSIVE = 55.40;
      final double OAKCHEAP = 52.85;
      final double PINEEXPENSIVE = 45.15;
      final double PINECHEAP = 43.25;
      
      if (woodType == "Cherry"){
         if (drawerNum > 0 && drawerNum < 3) {
            price = CHERRYBASE + drawerNum * CHERRYEXPENSIVE;
         } else if (drawerNum > 3 || drawerNum == 3) {
            price = CHERRYBASE + drawerNum * CHERRYCHEAP;
         } else if (drawerNum == 0) {
            price = CHERRYBASE;
         }
      } else if (woodType == "Oak") {
         if (drawerNum > 0 && drawerNum < 3) {
            price = OAKBASE + drawerNum * OAKEXPENSIVE;
         } else if (drawerNum > 3 || drawerNum == 3) {
            price = OAKBASE + drawerNum * OAKCHEAP;
         } else if (drawerNum == 0) {
            price = OAKBASE;
         }
      } else if (woodType == "Pine") {
         if (drawerNum > 0 && drawerNum < 3) {
            price = PINEBASE + drawerNum * PINEEXPENSIVE;
         } else if (drawerNum > 3 || drawerNum == 3) {
            price = PINEBASE + drawerNum * PINECHEAP;
         } else if (drawerNum == 0) {
            price = PINEBASE;
         }
      }
   }
   
   //To String method
   //@return The variable used in this class as a String
   public String toString(){
      return "\nType of Wood: " + woodType + "\nNumber of drawers: " + 
         drawerNum + "\nRegular Price: " + price + "\nQuantity: " + deskNum;
   }
   




}