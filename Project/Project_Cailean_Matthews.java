import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Project_Cailean_Matthews {
      static int  policyNumber;
      static String providerName;
      static String patientFirstName;
      static String patientLastName;
      static int patientAge;
      static String patientSmokeStatus;
      static int patientHeight;
      static double patientWeight;
      static int i = 0;
      static int finalSmokerNum = 0;
      static int finalNonSmokerNum = 0;
      static int policyAmt = 0;

   public static void main(String[]args) throws IOException {
      
      Scanner scnr = new Scanner(System.in); 
      ArrayList<Object> policies = new ArrayList<Object>();
      BufferedReader objReader = new BufferedReader(new FileReader("C://Users//spoon//OneDrive//Documents//GitHubRepositories//CSC251Project//PolicyInformation.txt"));
      
      Policy policy;
      
      for (i = 0; i < 6; ++i) {
         policyNumber = Integer.valueOf(objReader.readLine());
         providerName = objReader.readLine();
         patientFirstName = objReader.readLine();
         patientLastName = objReader.readLine();
         patientAge = Integer.valueOf(objReader.readLine());
         patientSmokeStatus = objReader.readLine();
         patientHeight = Integer.valueOf(objReader.readLine());
         patientWeight = Integer.valueOf(objReader.readLine());
         objReader.readLine();
         
         PolicyHolder policyHolder = new PolicyHolder(patientFirstName, patientLastName, patientAge, patientSmokeStatus, patientHeight, patientWeight);
         policy = new Policy(policyNumber, providerName, policyHolder);
         
      
         policies.add(policy);
         policyAmt++;
         finalSmokerNum = finalSmokerNum + policy.getSmokerNum();
         finalNonSmokerNum = finalNonSmokerNum + policy.getNonSmokerNum();
         policy.setBMI();
         policy.setFee();
         policy.setTotalPrice();
         
         System.out.println(policy.toString());
         System.out.println();
      }

      System.out.println("The number of policies with a smoker is: " + finalSmokerNum);
      System.out.println("\nThe number of policies with a non-smoker is: " + finalNonSmokerNum);
      System.out.println("\nThe number of policies is: " + policyAmt);
   }   
}