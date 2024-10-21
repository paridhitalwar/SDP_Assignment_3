/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: NewCustomer.java
 * Description: Extends EmailGenerationTemplate to represent a new customer, sending an
 * email with a new-specific message.
 */

package edu.bu.met.cs665.models;

public class NewCustomer extends EmailGenerationTemplate {

    /**
     * Generates the subject line for a new customer email.
     */
    @Override
    public void doSubjectLine() {
        System.out.println("Welcome to Our Community");
    }

    /**
     * Generates the main message for a new customer email.
     */
    @Override
    public void doMessage() {
        System.out.println("Dear New Customer,");
        System.out.println("Thank you for joining us! We have a special welcome offer for you.");
    }
}
