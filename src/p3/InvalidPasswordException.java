/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author User
 */
public class InvalidPasswordException extends Exception {

    public InvalidPasswordException() {
        super("Invalid password exception");
    }

    public InvalidPasswordException(String errorMsg) {
        super(errorMsg);
    }
    
}
