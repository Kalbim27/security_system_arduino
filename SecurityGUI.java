import com.fazecast.jSerialComm.SerialPort;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecurityGUI {

    static SerialPort arduinoPort;

    public static void main(String[] args) {

        // Arduino port seç (okulda COM değişebilir)
        arduinoPort = SerialPort.getCommPort("COM3");
        arduinoPort.setBaudRate(9600);
        arduinoPort.openPort();

        JFrame frame = new JFrame("Security System");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton armBtn = new JButton("ARM");
        armBtn.setBounds(50, 20, 200, 30);
        frame.add(armBtn);

        JButton disarmBtn = new JButton("DISARM");
        disarmBtn.setBounds(50, 60, 200, 30);
        frame.add(disarmBtn);

        JButton alarmBtn = new JButton("ALARM");
        alarmBtn.setBounds(50, 100, 200, 30);
        frame.add(alarmBtn);

        JButton resetBtn = new JButton("RESET");
        resetBtn.setBounds(50, 140, 200, 30);
        frame.add(resetBtn);

        armBtn.addActionListener(e -> sendCommand("1"));
        disarmBtn.addActionListener(e -> sendCommand("2"));
        alarmBtn.addActionListener(e -> sendCommand("3"));
        resetBtn.addActionListener(e -> sendCommand("4"));

        frame.setVisible(true);
    }

    public static void sendCommand(String command) {
        if (arduinoPort != null && arduinoPort.isOpen()) {
            byte[] buffer = command.getBytes();
            arduinoPort.writeBytes(buffer, buffer.length);
            System.out.println("Sent: " + command);
        } else {
            
        }
    }
}