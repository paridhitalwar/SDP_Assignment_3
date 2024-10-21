/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: Main.java
 * Description: Main class to demonstrate the email generation for different customer segments.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.models.*;

public class Main {
  public static void main(String[] args) {
    EmailGenerationTemplate businessClient = new BusinessCustomer();
    EmailGenerationTemplate returningClient = new ReturningCustomer();
    EmailGenerationTemplate frequentClient = new FrequentCustomer();
    EmailGenerationTemplate newClient = new NewCustomer();
    EmailGenerationTemplate vipClient = new VIPCustomer();

    // Generating emails for different customer segments
    generateAndPrintEmail(businessClient, "Liam", "Emma", "Business");
    generateAndPrintEmail(returningClient, "Olivia", "Emma", "Returning");
    generateAndPrintEmail(frequentClient, "Noah", "Emma", "Frequent");
    generateAndPrintEmail(newClient, "Ava", "Emma", "New");
    generateAndPrintEmail(vipClient, "Sophia", "Emma", "VIP");
  }

  /**
   * Helper method to generate and print an email for a customer.
   * @param customer the customer type
   * @param recipient the name of the recipient
   * @param sender the name of the sender
   * @param customerType the type of customer
   */
  private static void generateAndPrintEmail(EmailGenerationTemplate customer, String recipient, String sender, String customerType) {
    System.out.println(customerType + " Customer Email:");
    customer.generateEmail(recipient, sender);
    System.out.println("\n--------------------------\n");
  }
}
