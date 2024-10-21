/**
 * Name: Paridhi Talwar
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: EmailGenerationTemplate.java
 * Description: Employs the template method pattern, offering abstract methods for generating emails.
 */

package edu.bu.met.cs665.models;

public abstract class EmailGenerationTemplate {

    public boolean isBusiness;
    public boolean isReturning;
    public boolean isFrequent;
    public boolean isNew;
    public boolean isVip;

    /**
     * Template method to generate an email.
     * @param recipientName name of email recipient
     * @param senderName name of email sender
     */
    public final void generateEmail(String recipientName, String senderName) {
        doHeader();
        doSubjectLine();
        doGreeting(recipientName);
        doMessage();
        if (isFrequent || isVip) {
            doPromotion();
        }
        doSignature(senderName);
    }

    /**
     * Generates the header of the email.
     */
    public void doHeader() {
        System.out.println("The Nike Shoes Shop - Personalized Shoes for Everyone!");
    }

    /**
     * Abstract method to generate the subject line of the email.
     */
    public abstract void doSubjectLine();

    /**
     * Generates the greeting of the email.
     * @param recipientName name of the email recipient
     */
    public void doGreeting(String recipientName) {
        System.out.println("Hello " + recipientName + ",");
    }

    /**
     * Abstract method to generate the main message of the email.
     */
    public abstract void doMessage();

    /**
     * Generates a promotion for frequent or VIP customers.
     */
    public void doPromotion() {
        System.out.println("Thank you for being a loyal customer!");
        System.out.println("Save 40% on your next purchase with promo code: SHOE2023NX");
    }

    /**
     * Generates the signature of the email.
     * @param senderName name of the email sender
     */
    public void doSignature(String senderName) {
        System.out.println("Best regards,");
        System.out.println(senderName);
        System.out.println("Team Member @ The Nike Corporation");
    }
}
