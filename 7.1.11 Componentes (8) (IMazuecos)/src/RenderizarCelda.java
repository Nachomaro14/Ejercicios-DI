
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nacho
 */
public class RenderizarCelda implements ListCellRenderer{
    private DefaultListCellRenderer renderer = new DefaultListCellRenderer();
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
         JLabel celda = (JLabel) renderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
         if(isSelected){
             celda.setIcon(new ImageIcon(getClass().getResource("icono.png")));
         }
         if(value instanceof Color){
             celda.setBackground((Color) value);
         }
         celda.setBackground((Color) value);
         return celda;
    }    
}