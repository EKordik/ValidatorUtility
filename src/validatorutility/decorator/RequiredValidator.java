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
public class RequiredValidator extends ValidateDecorator {
    private String message;
    private JTextField txt;
    
    public RequiredValidator(JTextField txtField){
        this.txt = txtField;
        message = "Required Field";
    }
    
    public RequiredValidator(JTextField txtField, String message) throws IllegalArgumentException{
        this.txt = txtField;
        setMessage(message);
    }
    
    @Override
    public void setMessage(String message) throws IllegalArgumentException{
        if(message == null || message.length() == 0){
            throw new IllegalArgumentException();
        }
        
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    

    @Override
    public String getText() {
        String temp = txt.getText();
        
        if(temp == null || temp.length() == 0){
            return message;
        }
        
        return temp;
    }
    
}
