package View;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    public MainView(){
        setBounds(0,0,300,400);
        setLayout(new GridLayout(2,1));

        JButton jbAgregar = new JButton("Agregar");
        JButton jbConsultar = new JButton("Consultar");
        add(jbAgregar);
        add(jbConsultar);
    }
}
