/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialapplicationtocomputethefutureinvestmentvalue;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class FinancialApplicationToComputeTheFutureInvestmentValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("The amount invested: ");
                double investmentAmount = input.nextDouble();
                
                
        System.out.print("Annual interest rate: ");
                double annualInterestRate = input.nextDouble();
                
        System.out.print("Enter years of investement: ");
                int NUMBER_OF_YEARS = input.nextInt();
                
           // Get monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
                
        System.out.println("The amount invested: " + investmentAmount);

        System.out.println("Monthly interest rate: " + monthlyInterestRate + "%");

        // Print a table that displays future value for the years 
		System.out.println("Years     Future Value"); // Table header
		for(int years = 1;years <= NUMBER_OF_YEARS;years++){
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
                
    }
    }
     public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
         
        
              return (investmentAmount * (Math.pow(1 + monthlyInterestRate, years * 12)));
              
              
         }
          
     }

