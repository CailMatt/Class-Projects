public class PolicyHolder {

   protected String firstName;
   protected String lastName;
   protected int age;
   protected String smokeStatus;
   protected int height;
   protected double weight;
   
   public PolicyHolder() {
         firstName = "---";
         lastName = "---";
         age = 0;
         smokeStatus = "non-smoker";
         height = 0;
         weight = 0;
   }

   public PolicyHolder(String firstName, String lastName, int age, String smokeStatus, int height, double weight) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.smokeStatus = smokeStatus;
         this.height = height;
         this.weight = weight;
   }

   public String getFirstName() {
      return firstName;
   }
      
   public String getLastName() {
      return lastName;
   }
      
   public int getAge() {
      return age;
   }
      
   public String getSmokeStatus() {
      return smokeStatus;
   }
      
   public int getHeight() {
      return height;
   }
      
   public double getWeight() {
      return weight;
   }

   public String toString() { 
      return String.format("\nPolicyholder's First Name: " + getFirstName() + 
      " \nPolicyholder's Last Name: " + getLastName() + " \nPolicyholder's Age : " + 
      getAge() + " \nPolicyholder's Smoking Status (Y/N): " + getSmokeStatus() + 
      " \nPolicyholder's Height: " + getHeight() + " \nPolicyholder's Weight: " + getWeight());
   }




}