public class Policy {
      private int  policyNum;
      private String provName;
      private double BMI;
      private double fee;
      private double totalPrice;
      private int smokerNum = 0;
      private int nonSmokerNum = 0;
      
      
      PolicyHolder policyHolder;
      // Basic constructor if the user inputs no values
      public Policy() {
         policyNum = 0;
         provName = "Unknown";
         fee = 0;
         totalPrice = 600.00;
         
      }
      
      // Constructor
      public Policy(int policyNumber, String providerName, PolicyHolder policyHolder){
         
         policyNum = policyNumber;
         provName = providerName;
         this.policyHolder = policyHolder;
         if (policyHolder.getSmokeStatus().equals("smoker")){
            smokerNum++;
         } else {
            nonSmokerNum++;
         }
         totalPrice = 600.00;
      }
      
      
      // The following 8 methods are getters
      public int getPolicyNum() {
         return policyNum;
      }
      
      public String getProvName() {
         return provName;
      }
      
      public String getFirstName() {
         return policyHolder.getFirstName();
      }
      
      public String getLastName() {
         return policyHolder.getLastName();
      }
      
      public int getAge() {
         return policyHolder.getAge();
      }
      
      public String getSmokeStatus() {
         return policyHolder.getSmokeStatus();
      }
      
      public int getHeight() {
         return policyHolder.getHeight();
      }
      
      public double getWeight() {
         return policyHolder.getWeight();
      }
      
      public int getSmokerNum() {
         return smokerNum;
      }
      
      public int getNonSmokerNum() {
         return nonSmokerNum;
      }
      
      // setter and getter for BMI
      public void setBMI() {
         BMI = 703 * ((policyHolder.getWeight())/(policyHolder.getHeight() * policyHolder.getHeight()));
      }
      
      public double getBMI() {
         return BMI;
      }
      
      //setter and getter for the fee
      public void setFee() {
            fee = (getBMI() - 35) * 20;
      }
      
      public double getFee(){
         return fee;
      }
      
      //And lastly, the setter and getter for the total price
      public void setTotalPrice() {
         if (getAge() > 50) {
            totalPrice = totalPrice + 75;
         }
         if  (getSmokeStatus().equals("smoker")) {
            totalPrice = totalPrice + 100;
         }
         if (getBMI() > 35) {
            totalPrice = totalPrice + fee;
         }
      }
      
      public double getTotalPrice() {
         return totalPrice;
      }
      
      public String toString() {

         return  String.format("Policy Number: " + getPolicyNum() + " \nProvider Name: " + getProvName() + policyHolder.toString() + " \nPolicyholder's BMI: %.2f", getBMI()) + String.format(" \nPolicyholder's Price: %.2f", getTotalPrice());
      }
      
      
   }
