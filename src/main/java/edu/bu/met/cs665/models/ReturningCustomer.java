/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: ReturningCustomer.java
 * Description: Extends EmailGenerationTemplate to represent a returning customer, sending an
 * email with a returning-specific message.
 */

package edu.bu.met.cs665.models;

public class ReturningCustomer extends EmailGenerationTemplate {

    /**
     * Generates the subject line for a returning customer email.
     */
    @Override
    public void doSubjectLine() {
        System.out.println("Welcome Back! Special Offer Inside");
    }

    /**
     * Generates the main message for a returning customer email.
     */
    @Override
    public void doMessage() {
        System.out.println("Dear Returning Customer,");
        System.out.println("We are thrilled to have you back. Enjoy this special offer.");
    }
}
