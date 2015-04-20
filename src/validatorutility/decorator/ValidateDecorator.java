/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatorutility.decorator;

import javax.swing.JTextField;

/**
 *
 * @author emmakordik
 */
public abstract class ValidateDecorator extends JTextField{
    
    public abstract void setMessage(String message);
    
    public abstract String getMessage();
    
    public abstract String getText();
}
