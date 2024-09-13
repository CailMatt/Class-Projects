public class Order {
   
   private static int instanceNum;
   
   
   Desk Desks;
   double discountedPrice;
   double orderPrice = 0;
   int orderNum;
   public Order() {
       Desks = new Desk();
      double discountedPrice = 0;
      double orderPrice = 0;
      int orderNum = instanceNum;
   }
   
   public Order(String typeOfWood, int numOfDrawers, int numOfDesks) {
      Desks = new Desk(typeOfWood, numOfDrawers, numOfDesks);
      double discountedPrice = 0;
      double orderPrice = 0;
      ++instanceNum;
      int orderNum = instanceNum;
   }
   
   
   public void setDiscountedPrice() {
      Desks.setPrice();
      final double DISCOUNT = 12.5;
      final int CHERRYNEED = 10;
      final int OAKNEED = 12;
      final int PINENEED = 15;
      
      if (Desks.getWoodType().equals("Cherry")) {
         if (Desks.getDeskNum() > 10) {
            discountedPrice = Desks.getPrice() * (100 - DISCOUNT)/100;
         } else {
            discountedPrice = Desks.getPrice();
         }
      } else if (Desks.getWoodType().equals("Oak")){
         if (Desks.getDeskNum() > 12) {
            discountedPrice = Desks.getPrice() * (100 - DISCOUNT)/100;
         } else {
            discountedPrice = Desks.getPrice();
         }
      } else if (Desks.getWoodType().equals("Pine")){
         if (Desks.getDeskNum() > 15) {
            discountedPrice = Desks.getPrice() * (100 - DISCOUNT)/100;
         } else {
            discountedPrice = Desks.getPrice();
         }
      }
      
   }
   
   public void setOrderPrice() {
      orderPrice = discountedPrice *  Desks.getDeskNum();
   }
   
   public double getDiscountedPrice() {
      return discountedPrice;
   }
   
   public double getOrderPrice() {
      return orderPrice;
   }
   
   public int getOrderNum() {
      return orderNum;
   }
   
   public String toString() {
      return Desks.toString() + "\nDiscounted Desk Price: $" + discountedPrice + "\nTotal Order Cost" + orderPrice;
   }
   
   
   
   

}