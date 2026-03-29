# Security System Project

## 📌 Description
This project is a Java GUI application that communicates with an Arduino via USB (Serial Communication).

## ⚙️ Technologies Used
- Java (Swing GUI)
- Arduino
- Serial Communication (jSerialComm)

## 🔌 How it works
- Java GUI has 4 buttons: ARM, DISARM, ALARM, RESET
- When a button is pressed, a signal is sent to Arduino
- Arduino receives the signal and controls the LED

## 💡 Commands
- ARM → LED ON
- DISARM → LED OFF
- ALARM → LED ON
- RESET → LED OFF

## 🔗 Connection
- USB Serial Communication (9600 baud rate)
- COM port is selected in Java code

## 📁 Files
- SecurityGUI.java → Java interface
- security_system_arduino.ino → Arduino code

## 👨‍💻 Author
Kalbim27
