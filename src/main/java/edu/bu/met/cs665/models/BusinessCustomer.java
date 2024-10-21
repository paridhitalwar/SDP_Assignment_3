/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: BusinessCustomer.java
 * Description: Extends EmailGenerationTemplate to represent a business customer, sending an
 * email with a business-specific message.
 */

package edu.bu.met.cs665.models;

public class BusinessCustomer extends EmailGenerationTemplate {

    /**
     * Generates the subject line for a business customer email.
     */
    @Override
    public void doSubjectLine() {
        System.out.println("Exclusive Business Offer Inside");
    }

    /**
     * Generates the main message for a business customer email.
     */
    @Override
    public void doMessage() {
        System.out.println("Dear Valued Business Customer,");
        System.out.println("We have an exclusive offer tailored just for your business needs.");
    }
}
