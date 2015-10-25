
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nacho
 */

//Todo este código está escrito en el PDF de la práctica 7.1.7 y es una demostración del JViewPort
public class DemoViewPort {
    public static final int INCREMENTAR = 0;
    public static final int DISMINUIR = 1;
    public static final int X_AXIS = 0;
    public static final int Y_AXIS = 1;
    public static final int UNIDAD = 0;
    public static final int BLOQUE = 1;
    
    static class AccionMover extends AbstractAction{
        JViewport viewport;
        int direccion;
        int axis;
        int tipo;
        
        public AccionMover (JViewport viewport, int direccion, int axis, int tipo){
            this.viewport = viewport;
            this.direccion = direccion;
            this.tipo = tipo;
            this.axis = axis;
        }
        
        public void actionPerformed(ActionEvent e){
            Dimension extenSize = viewport.getExtentSize();
            int movimientoHorizontal = 0;
            int movimientoVertical = 0;
            if (axis == X_AXIS){
                if (tipo == UNIDAD){
                    movimientoHorizontal = 5;
                }else{
                    movimientoVertical = extenSize.width;
                }
            }else{
                if(tipo == UNIDAD){
                    movimientoVertical = 5;
                }else{
                    movimientoVertical = extenSize.height;
                }
            }
            
            if(direccion == DISMINUIR){
                movimientoHorizontal = -movimientoHorizontal;
                movimientoVertical = -movimientoVertical;
            }
            
            Point posicionActual = viewport.getViewPosition();
            posicionActual.x += movimientoHorizontal;
            posicionActual.y += movimientoVertical;
            viewport.setViewPosition(posicionActual);
        }
    }
    
    public static void main (String[] arg){
        Runnable ejecutor;
        ejecutor = new Runnable(){
            public void run(){
                JFrame frame = new JFrame("JViewport");
                
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                Icon icon = new ImageIcon(getClass().getResource("logo.gif"));
                JLabel logoLabel = new JLabel(icon);
                JViewport viewport = new JViewport();
                viewport.setView(logoLabel);
                
                InputMap inputMap = viewport.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
                ActionMap actionMap = viewport.getActionMap();
                Action upKeyAction = new AccionMover(viewport, DISMINUIR, Y_AXIS, UNIDAD);
                KeyStroke upKey = KeyStroke.getKeyStroke("UP");
                inputMap.put(upKey, "up");
                actionMap.put("up", upKeyAction);
                
                Action downKeyAction = new AccionMover(viewport, INCREMENTAR, Y_AXIS, UNIDAD);
                
                KeyStroke downKey = KeyStroke.getKeyStroke("DOWN");
                inputMap.put(downKey, "down");
                actionMap.put("down", upKeyAction);
                
                Action leftKeyAction = new AccionMover(viewport, DISMINUIR, X_AXIS, UNIDAD);
                KeyStroke leftKey = KeyStroke.getKeyStroke("LEFT");
                inputMap.put(leftKey, "left");
                actionMap.put("left", leftKeyAction);
                
                Action rightKeyAction = new AccionMover(viewport, INCREMENTAR, X_AXIS, UNIDAD);
                KeyStroke rightKey = KeyStroke.getKeyStroke("RIGHT");
                
                inputMap.put(rightKey, "right");
                actionMap.put("right", rightKeyAction);
                
                frame.add(viewport, BorderLayout.CENTER);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(ejecutor);
    }
}