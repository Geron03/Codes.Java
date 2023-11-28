package unicentro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class InfoLocal1 extends JFrame {

    public InfoLocal1() {

        this.setTitle("Local 1");   // Establece el título de la ventana
        this.setSize(700, 700); // Establece el tamaño de la ventana
        this.setLocationRelativeTo(null);  // Centra la ventana en la pantalla
        //this.getContentPane().setBackground(Color.MAGENTA);  // Establece el color de fondoc

        // Crear un JPanel
        JPanel panel = new JPanel();
        Color BackPanel = Color.decode("#DFF2EB");
        panel.setBackground(BackPanel); //Establecemos un color al JPanel
        panel.setLayout(null);// Establece el administrador de diseño del JPanel (null)

        //primer JLabel
        JLabel label1 = new JLabel();
        label1.setText("     Local 1"); //añadirle texto
        label1.setBounds(245, 10, 190, 40); // Agrega un JLabel y ubícalo en el punto (240(x), 10(y)) con un tamaño de 200x30
        Color color = Color.decode("#005832");
        label1.setForeground(color); //cambiar el color a la letra
        label1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 25)); //cambiar tamaño de letra
        label1.setOpaque(true); //para especificar si el componente debería ser dibujado de manera opaca(true) o transparente(false).
        Color labelBack1 = Color.decode("#DFF2EB");
        label1.setBackground(labelBack1);  //agregarle un fondo al JLabel
        panel.add(label1); // Agrega el JLabel al JPanel

        //JLabel Imagen Logo Unicentro
        ImageIcon imagen11 = new ImageIcon("Logo_Unicentro-removebg-preview.png");
        JLabel imagen1 = new JLabel();
        imagen1.setIcon(new ImageIcon("Logo_Unicentro-removebg-preview.png"));
        imagen1.setBounds(198, 80, 310, 310);
        imagen1.setIcon(new ImageIcon(imagen11.getImage().getScaledInstance(310, 310, Image.SCALE_SMOOTH)));
        panel.add(imagen1);

        JLabel question1 = new JLabel();
        question1.setText("Nombre del Local: "); //añadirle texto
        question1.setBounds(110, 480, 215, 40); // Agrega un JLabel y ubícalo en el punto (240(x), 10(y)) con un tamaño de 200x30
        Color colorquestion1 = Color.decode("#005832");
        question1.setForeground(colorquestion1); //cambiar el color a la letra
        question1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18)); //cambiar tamaño de letra
        question1.setOpaque(true); //para especificar si el componente debería ser dibujado de manera opaca(true) o transparente(false).
        Color labelBackquestion1 = Color.decode("#DFF2EB");
        question1.setBackground(labelBackquestion1);  //agregarle un fondo al JLabel

        panel.add(question1); // Agrega el JLabel al JPanel

        JTextField NameLocal1 = new JTextField(20);//creamos el texfiel
        NameLocal1.setBounds(330, 480, 215, 30);
        NameLocal1.setHorizontalAlignment(JTextField.CENTER);
        panel.add(NameLocal1);

        JButton confirmButton = new JButton("Confirmar"); // Agregamos un botón de confirmación
        confirmButton.setBounds(330, 520, 100, 30);
        panel.add(confirmButton);

        confirmButton.addActionListener((ActionEvent e) -> {
            String nombreLocal = NameLocal1.getText();
            if (!nombreLocal.isEmpty()) {
                label1.setVisible(false);
                imagen1.setVisible(false);
                question1.setVisible(false);
                confirmButton.setVisible(false);
                NameLocal1.setVisible(false);

                
                
                JLabel Nombre_Local = new JLabel();
                Nombre_Local.setText(nombreLocal); //añadirle texto
                Nombre_Local.setBounds(245, 10, 200, 40); // Agrega un JLabel y ubícalo en el punto (240(x), 10(y)) con un tamaño de 200x30
                Color colorLocal = Color.decode("#F2B90F");
                Nombre_Local.setForeground(colorLocal); //cambiar el color a la letra
                Nombre_Local.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25)); //cambiar tamaño de letra
                Nombre_Local.setOpaque(true); //para especificar si el componente debería ser dibujado de manera opaca(true) o transparente(false).
                Color labelBackLocal = Color.decode("#DFF2EB");
                Nombre_Local.setBackground(labelBackLocal);  //agregarle un fondo al JLabel
                Nombre_Local.setHorizontalAlignment(JLabel.CENTER);//CENTRAR TEXTO DE MANERA HORIZONTAL
                Nombre_Local.setVerticalAlignment(JLabel.CENTER);//CENTRAR EL TEXTO DE MANERA VERTICAL
                panel.add(Nombre_Local); // Agrega el JLabel al JPanel

                JLabel ubi = new JLabel();
                ubi.setText("Ubicación: ");
                ubi.setBounds(110, 100, 215, 40);
                Color colorUbi = Color.decode("#F2B90F");
                ubi.setForeground(colorUbi);
                ubi.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
                ubi.setOpaque(true);
                Color BackUbi = Color.decode("#DFF2EB");
                ubi.setBackground(BackUbi);
                ubi.setHorizontalAlignment(JLabel.CENTER);//CENTRAR TEXTO DE MANERA HORIZONTAL
                ubi.setVerticalAlignment(JLabel.CENTER);//CENTRAR EL TEXTO DE MANERA VERTICAL
                panel.add(ubi); // Agrega el JLabel al JPanel
                JTextField ubicacion = new JTextField(25);//creamos el texfiel
                ubicacion.setBounds(330, 100, 215, 30);
                ubicacion.setHorizontalAlignment(JTextField.CENTER);
                panel.add(ubicacion);

                JLabel Horario = new JLabel();
                Horario.setText("Horario: ");
                Horario.setBounds(110, 200, 215, 40);
                Color colorHorario = Color.decode("#F2B90F");
                Horario.setForeground(colorHorario);
                Horario.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
                Horario.setOpaque(true);
                Color Backhorario = Color.decode("#DFF2EB");
                Horario.setBackground(Backhorario);
                Horario.setHorizontalAlignment(JLabel.CENTER);//CENTRAR TEXTO DE MANERA HORIZONTAL
                Horario.setVerticalAlignment(JLabel.CENTER);//CENTRAR EL TEXTO DE MANERA VERTICAL
                panel.add(ubi); // Agrega el JLabel al JPanel
                JTextField horario = new JTextField(25);//creamos el texfiel
                horario.setBounds(330, 200, 215, 30);
                horario.setHorizontalAlignment(JTextField.CENTER);
                panel.add(horario);

                JLabel Nit = new JLabel();
                Nit.setText("NIT: ");
                Nit.setBounds(110, 200, 215, 40);
                Color colorNit = Color.decode("#F2B90F");
                Nit.setForeground(colorNit);
                Nit.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
                Nit.setOpaque(true);
                Color BackNit = Color.decode("#DFF2EB");
                Nit.setBackground(BackNit);
                Nit.setHorizontalAlignment(JLabel.CENTER);//CENTRAR TEXTO DE MANERA HORIZONTAL
                Nit.setVerticalAlignment(JLabel.CENTER);//CENTRAR EL TEXTO DE MANERA VERTICAL
                panel.add(Nit); // Agrega el JLabel al JPanel
                JTextField nit = new JTextField(25);//creamos el texfiel
                nit.setBounds(330, 300, 215, 30);
                nit.setHorizontalAlignment(JTextField.CENTER);
                panel.add(nit);

                JLabel Clientes = new JLabel();
                Clientes.setText("Total Clientes: "); //añadirle texto
                Clientes.setBounds(110, 300, 215, 40); // Agrega un JLabel y ubícalo en el punto (240(x), 10(y)) con un tamaño de 200x30
                Color colorClientes = Color.decode("#F2B90F");
                Clientes.setForeground(colorClientes); //cambiar el color a la letra
                Clientes.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18)); //cambiar tamaño de letra
                Clientes.setOpaque(true); //para especificar si el componente debería ser dibujado de manera opaca(true) o transparente(false).
                Color BackClientes = Color.decode("#DFF2EB");
                Clientes.setBackground(BackClientes);  //agregarle un fondo al JLabel
                Clientes.setHorizontalAlignment(JLabel.CENTER);//CENTRAR TEXTO DE MANERA HORIZONTAL
                Clientes.setVerticalAlignment(JLabel.CENTER);//CENTRAR EL TEXTO DE MANERA VERTICAL
                panel.add(Clientes); // Agrega el JLabel al JPanel
                JTextField clientes = new JTextField(25);//creamos el texfiel
                clientes.setBounds(330, 400, 215, 30);
                clientes.setHorizontalAlignment(JTextField.CENTER);
                panel.add(clientes);

                JLabel Mensual = new JLabel();
                Mensual.setText("Ingreso Mensual: "); //añadirle texto
                Mensual.setBounds(110, 400, 215, 40); // Agrega un JLabel y ubícalo en el punto (240(x), 10(y)) con un tamaño de 200x30
                Color colorMensual = Color.decode("#F2B90F");
                Mensual.setForeground(colorMensual); //cambiar el color a la letra
                Mensual.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18)); //cambiar tamaño de letra
                Mensual.setOpaque(true); //para especificar si el componente debería ser dibujado de manera opaca(true) o transparente(false).
                Color BackMensual = Color.decode("#DFF2EB");
                Mensual.setBackground(BackMensual);  //agregarle un fondo al JLabel
                Mensual.setHorizontalAlignment(JLabel.CENTER);//CENTRAR TEXTO DE MANERA HORIZONTAL
                Mensual.setVerticalAlignment(JLabel.CENTER);//CENTRAR EL TEXTO DE MANERA VERTICAL
                panel.add(Mensual); // Agrega el JLabel al JPanel
                JTextField mensual = new JTextField(25);//creamos el texfiel
                mensual.setBounds(330, 500, 215, 30);
                mensual.setHorizontalAlignment(JTextField.CENTER);
                panel.add(Mensual);

                //JLabel Imagen Logo Unicentro
                ImageIcon imagen12 = new ImageIcon("Logo_Unicentro-removebg-preview.png");
                JLabel imagen2 = new JLabel();
                imagen2.setIcon(new ImageIcon("Logo_Unicentro-removebg-preview.png"));
                imagen2.setBounds(180, 450, 100, 100);
                imagen2.setIcon(new ImageIcon(imagen12.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                panel.add(imagen2);

            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese el nombre del local antes de continuar.");
            }
        });

        // Agrega el JPanel a la ventana
        this.getContentPane().add(panel);

        // Establece la operación de cierre
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
