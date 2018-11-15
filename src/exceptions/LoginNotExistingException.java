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
public class LoginNotExistingException extends Exception{
    
    private final String MESSAGE;

    public LoginNotExistingException() {
        MESSAGE = "The login not exist in the database.";
    }

    public String getMESSAGE() {
        return MESSAGE;
    }
}
