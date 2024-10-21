/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: FrequentCustomer.java
 * Description: Extends EmailGenerationTemplate to represent a frequent customer, sending an
 * email with a frequent-specific message.
 */

package edu.bu.met.cs665.models;

public class FrequentCustomer extends EmailGenerationTemplate {

    /**
     * Generates the subject line for a frequent customer email.
     */
    @Override
    public void doSubjectLine() {
        System.out.println("Thank You for Your Frequent Visits");
    }

    /**
     * Generates the main message for a frequent customer email.
     */
    @Override
    public void doMessage() {
        System.out.println("Dear Frequent Customer,");
        System.out.println("We appreciate your frequent visits and have a special reward for you.");
    }
}
