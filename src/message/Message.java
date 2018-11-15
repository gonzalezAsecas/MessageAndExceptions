/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.Serializable;

/**
 * The message. The data is the object that we need to send between the layers
 * and the message is the type of error or the utility
 * @author Jon Gonzalez
 */
public class Message implements Serializable{
    private static long serialVersionUID = 666L;
    //The message for the generic exception
    private static final int KO=0;
    //The messages for the login communication
    private static final int LOGIN=1;
    private static final int LOGIN_OK=10;
    private static final int LOGIN_NOEXIST=11;
    private static final int WRONG_PASS=12;
    //The messages for the signup communication
    private static final int SIGNUP=2;
    private static final int SIGNUP_OK=20;
    private static final int LOGIN_EXIST=21;
    private static final int EMAIL_NOTUNIQUE=22;
    
    private int message;
    private Object data;

    public Message(int message, Object data) {
        this.message = message;
        this.data = data;
    }
    
    public Message(){
        
    }
    
    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
}
