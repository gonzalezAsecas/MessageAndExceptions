/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Jon Gonzalez
 */
public class EmailNotUniqueException extends Exception{
    
    private final String MESSAGE;
    
    public EmailNotUniqueException() {
        MESSAGE = "The email exist in the database.";
    }

    public String getMESSAGE() {
        return MESSAGE;
    }
}
