package org.joshy.html.forms;

import java.util.*;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.*;
import javax.swing.JComponent;
import org.joshy.u;
import org.joshy.html.box.*;
import org.joshy.html.*;
import org.w3c.dom.*;

public class InputPassword extends InputText {
    
    public InputPassword() {
    }
    
    protected JTextField _createComponent() {
        return new JPasswordField();
    }
/*    
    public JComponent createComponent(Context c, Element elem) {
        JPasswordField comp = new JPasswordField();
        commonPrep(comp,elem);
        if(elem.hasAttribute("value")) {
            comp.setText(elem.getAttribute("value"));
        }
        if(elem.hasAttribute("size")) {
            comp.setColumns(Integer.parseInt(elem.getAttribute("size")));
        } else {
            comp.setColumns(15);
        }
        if(elem.hasAttribute("readonly") && 
           elem.getAttribute("readonly").equals("readonly")) {
            comp.setEditable(false);
        }
        return comp;
    }
    */
    
}
