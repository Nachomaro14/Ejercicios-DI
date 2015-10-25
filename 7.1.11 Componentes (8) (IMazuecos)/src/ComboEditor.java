
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.EventListenerList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nacho
 */
public class ComboEditor implements ComboBoxEditor{
    protected JButton editor;
    protected EventListenerList listListener = new EventListenerList();
    public ComboEditor (Color colorInicial){
        editor = new JButton ("");
        editor.setBackground(colorInicial);
        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Color colorActual = editor.getBackground();
                Color colorSeleccionado = JColorChooser.showDialog(editor, "Selecciona color", colorActual);
                if(colorSeleccionado != null && colorSeleccionado != colorActual){
                    editor.setBackground(colorSeleccionado);
                    fireActionEvent(colorSeleccionado);
                }
            }
        };
        editor.addActionListener(actionListener);
    }

    @Override
    public Component getEditorComponent() {
        return editor;
    }

    @Override
    public void setItem(Object anObject) {
        if(anObject instanceof Color){
            Color color = (Color) anObject;
            editor.setBackground(color);
        }else{
            try{
                Color color = Color.decode(anObject.toString());
                editor.setBackground(color);
            }catch(NumberFormatException e){}
        }
    }

    @Override
    public Object getItem() {
        return editor.getBackground();
    }

    @Override
    public void selectAll() {}

    @Override
    public void addActionListener(ActionListener l) {
        this.listListener.add(ActionListener.class, l);
    }

    @Override
    public void removeActionListener(ActionListener l) {
        this.listListener.remove(ActionListener.class, l);
    }
    
    protected void fireActionEvent(Color color){
        Object[] escuchadores = this.listListener.getListenerList();
        for(int i = escuchadores.length - 2; i >= 0; i -= 2){
            if(escuchadores[i] == ActionListener.class){
                ActionEvent actionEvent;
                actionEvent = new ActionEvent(editor, ActionEvent.ACTION_PERFORMED, color.toString());
                ((ActionListener) escuchadores [i+1]).actionPerformed(actionEvent);
            }
        }
    }    
}