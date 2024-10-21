/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: VIPCustomer.java
 * Description: Extends EmailGenerationTemplate to represent a VIP customer, sending an
 * email with a VIP-specific message.
 */

package edu.bu.met.cs665.models;

public class VIPCustomer extends EmailGenerationTemplate {

    /**
     * Generates the subject line for a VIP customer email.
     */
    @Override
    public void doSubjectLine() {
        System.out.println("Exclusive VIP Offer Just for You");
    }

    /**
     * Generates the main message for a VIP customer email.
     */
    @Override
    public void doMessage() {
        System.out.println("Dear Valued VIP Customer,");
        System.out.println("As a token of our appreciation, enjoy this exclusive VIP offer.");
    }
}
