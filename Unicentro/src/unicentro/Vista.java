package unicentro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Vista extends JFrame {

    private InfoLocal1 WindowLocal1;

    public Vista() {

        this.setVisible(true); //hacer visible la ventana
        this.setTitle("Centro Comercial");   // Establece el título de la ventana
        this.setSize(700, 700); // Establece el tamaño de la ventana
        this.setLocationRelativeTo(null);  // Centra la ventana en la pantalla
        //this.getContentPane().setBackground(Color.MAGENTA);  // Establece el color de fondoc

        // Crear un JPanel
        JPanel panel = new JPanel();
        Color BackPanel = Color.decode("#F1EEE7");
        panel.setBackground(BackPanel); //Establecemos un color al JPanel
        panel.setLayout(null);// Establece el administrador de diseño del JPanel (null)

        //primer JLabel
        JLabel label1 = new JLabel();
        label1.setText("     Unicentro"); //añadirle texto
        label1.setBounds(245, 10, 190, 40); // Agrega un JLabel y ubícalo en el punto (240(x), 10(y)) con un tamaño de 200x30
        Color color = Color.decode("#005832");
        label1.setForeground(color); //cambiar el color a la letra
        label1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 25)); //cambiar tamaño de letra
        label1.setOpaque(true); //para especificar si el componente debería ser dibujado de manera opaca(true) o transparente(false).
        Color labelBack1 = Color.decode("#F1EEE7");
        label1.setBackground(labelBack1);  //agregarle un fondo al JLabel
        panel.add(label1); // Agrega el JLabel al JPanel

        //primer Button
        JButton local1 = new JButton();
        local1.setText("Local 1");
        local1.setBounds(60, 450, 150, 40);
        local1.setForeground(Color.BLACK);
        local1.setFont(new Font("Arial", Font.BOLD, 20));
        local1.setOpaque(true);
        Color ColorBack1 = Color.decode("#B9BF11");
        local1.setBackground(ColorBack1);


        //al oprimir el JButton mostrar la otra ventana con la información del local 1
        local1.addActionListener((ActionEvent e) -> {
            // Inicializa WindowLocal1 si aún no se ha hecho
            setVisible(false);
            if (WindowLocal1 == null) {
                WindowLocal1 = new InfoLocal1();
            }
            WindowLocal1.setVisible(true);
      
        });

        panel.add(local1);

        //segundo Button
        JButton local2 = new JButton();
        local2.setText("Local 2");
        local2.setBounds(265, 450, 150, 40);
        local2.setForeground(Color.black);
        local2.setFont(new Font("Arial", Font.BOLD, 20));
        local2.setOpaque(true);
        Color ColorBack2 = Color.decode("#B9BF11");
        local2.setBackground(ColorBack2);
        panel.add(local2);

        //tercer Button
        JButton local3 = new JButton();
        local3.setText("Local 3");
        local3.setBounds(470, 450, 150, 40);
        local3.setForeground(Color.BLACK);
        local3.setFont(new Font("Arial", Font.BOLD, 20));
        local3.setOpaque(true);
        Color ColorBack3 = Color.decode("#B9BF11");
        local3.setBackground(ColorBack3);
        panel.add(local3);

        //JLabel Imagen Logo Unicentro
        ImageIcon imagen11 = new ImageIcon("Logo_Unicentro-removebg-preview.png");
        JLabel imagen1 = new JLabel();
        imagen1.setIcon(new ImageIcon("Logo_Unicentro-removebg-preview.png"));
        imagen1.setBounds(198, 80, 310, 310);
        imagen1.setIcon(new ImageIcon(imagen11.getImage().getScaledInstance(310, 310, Image.SCALE_SMOOTH)));
        panel.add(imagen1);

        /*//Primer JButton
        JButton boton = new JButton();
        //boton.setText("SUMAR");
        boton.setBounds(300, 300, 100, 60);
        boton.setFont(new Font("Arial", Font.BOLD, 15));
        boton.setForeground(Color.red);//color del texto
        //boton.setMnemonic('t'); //selecionar el boton por medio de una tecla presionando 't'
        
        ImageIcon sumar = new ImageIcon("boton_sumar.png");
        boton.setIcon(new ImageIcon(sumar.getImage().getScaledInstance(100, 60, Image.SCALE_SMOOTH)));
        
        panel.add(boton);
         */
        // Agrega el JPanel a la ventana
        this.getContentPane().add(panel);

        // Establece la operación de cierre
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
