/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: EmailGenerationTest.java
 * Description: Unit tests for email generation for different customer segments.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.models.*;
import org.junit.Test;


public class EmailGenerationTest {

    @Test
    public void testBusinessCustomerEmail() {
        EmailGenerationTemplate businessClient = new BusinessCustomer();
        businessClient.generateEmail("Liam", "Emma");
        // Since this method prints to console, manually verify the output or redirect output to a string for assertion
    }

    @Test
    public void testReturningCustomerEmail() {
        EmailGenerationTemplate returningClient = new ReturningCustomer();
        returningClient.generateEmail("Olivia", "Emma");
        // Since this method prints to console, manually verify the output or redirect output to a string for assertion
    }

    @Test
    public void testFrequentCustomerEmail() {
        EmailGenerationTemplate frequentClient = new FrequentCustomer();
        frequentClient.generateEmail("Noah", "Emma");
        // Since this method prints to console, manually verify the output or redirect output to a string for assertion
    }

    @Test
    public void testNewCustomerEmail() {
        EmailGenerationTemplate newClient = new NewCustomer();
        newClient.generateEmail("Ava", "Emma");
        // Since this method prints to console, manually verify the output or redirect output to a string for assertion
    }

    @Test
    public void testVIPCustomerEmail() {
        EmailGenerationTemplate vipClient = new VIPCustomer();
        vipClient.generateEmail("Sophia", "Emma");
        // Since this method prints to console, manually verify the output or redirect output to a string for assertion
    }
}
