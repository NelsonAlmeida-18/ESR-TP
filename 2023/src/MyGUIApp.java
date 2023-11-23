import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIApp extends JFrame implements ActionListener {
    private JButton buttonPlay; // Declare buttonPlay as a class member
    private JButton buttonStream; // Declare buttonPlay as a class member

    public MyGUIApp() {
        // Set up the JFrame
        setTitle("My GUI App");
        setSize(500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ...

        JPanel panelSouth = new JPanel();
        JPanel panelEast = new JPanel();
        JPanel panelWest = new JPanel();
        JPanel panelNorth= new JPanel();
        JPanel panelCenter = new JPanel();

        panelSouth.setSize(new Dimension(100,100));
        panelEast.setSize(new Dimension(100,100));
        panelWest.setSize(new Dimension(100,100));
        panelNorth.setSize(new Dimension(100,100));
        panelCenter.setSize(new Dimension(100,100));

        // ...
        buttonPlay = new JButton("Play"); // Assign the buttonPlay instance
        JButton buttonPause = new JButton("Pause");
        JButton buttonLeave = new JButton("Leave");
        buttonStream = new JButton("Stream");

        // Add buttons to the panel
        panelSouth.add(buttonPlay);
        panelSouth.add(buttonPause);
        panelSouth.add(buttonStream);
        panelSouth.add(buttonLeave);

        add(panelSouth, BorderLayout.SOUTH);
        add(panelEast, BorderLayout.EAST);
        add(panelWest, BorderLayout.WEST);
        add(panelNorth, BorderLayout.NORTH);
        add(panelCenter, BorderLayout.CENTER);

        buttonPlay.addActionListener(this); // Register ActionListener for buttonPlay
        buttonStream.addActionListener(this); // Register ActionListener for buttonStream
    }

    // Implement actionPerformed method
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonPlay){
            buttonPlayPressed(); // Call buttonPlayPressed method
        } else if(e.getSource()==buttonStream) {
            buttonStreamPressed(); // Call buttonStreamPressed method
        }
    }

    // Define buttonPlayPressed method
    private void buttonPlayPressed() {
        // TODO: Implement your logic here
    }
    
    // Define buttonPlayPressed method
    private void buttonStreamPressed() {
        // TODO: Implement your logic here
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyGUIApp app = new MyGUIApp();
            app.setVisible(true);
        });
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     if(e.getSource()==buttonPlay){
    //         NewWindow nw = new NewWindow();
    //     }
    // }
}
