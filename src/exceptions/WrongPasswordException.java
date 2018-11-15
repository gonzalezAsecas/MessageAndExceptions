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
public class WrongPasswordException extends Exception{
    
    private final String MESSAGE;

    public WrongPasswordException() {
        MESSAGE = "The password is wrong.";
    }

    public String getMESSAGE() {
        return MESSAGE;
    }
}
