/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Projekt_indywidualny;

import java.awt.event.*;
import javax.swing.*;

public class MainProgram {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int []resolution = {900, 200};
		int marginx = 20;
		int marginy = 20;
		int buttonHeight = 20;
		int buttonWidth = 60;
		int argSysWidth = 30;
		int textBoxLength = marginx + 4 * buttonWidth + argSysWidth + 90;
		int textBoxHeight = 20;
		int calculateWidth = 120;
		JFrame frame = new JFrame("Numeric system calculator");
		frame.setSize(resolution[0], resolution[1]);
		final JTextField argValue = new JTextField();
		argValue.setBounds(marginx, marginy, textBoxLength, textBoxHeight);
		argValue.setText("0");
		final JTextField argSys = new JTextField();
		argSys.setBounds(argValue.getX() + buttonWidth * 4, argValue.getY() + argValue.getHeight(), argSysWidth, buttonHeight);
		argSys.setText("10");
		JLabel argSysText = new JLabel("Current System");
		argSysText.setBounds(argSys.getX() + argSys.getWidth(), argSys.getY(), 90, buttonHeight);
		
		JButton argbin = new JButton("BIN");
		argbin.setBounds(argValue.getX(), argValue.getY() + argValue.getHeight(), buttonWidth, buttonHeight);
		argbin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				argSys.setText("2");
			}
		});
		JButton argoct = new JButton("OCT");
		argoct.setBounds((argValue.getX() + buttonWidth), argValue.getY() + argValue.getHeight(), buttonWidth, buttonHeight);
		argoct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				argSys.setText("8");
			}
		});
		JButton argdec = new JButton("DEC");
		argdec.setBounds((argValue.getX() + buttonWidth * 2), argValue.getY() + argValue.getHeight(), buttonWidth, buttonHeight);
		argdec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				argSys.setText("10");
			}
		});
		JButton arghex = new JButton("HEX");
		arghex.setBounds((argValue.getX() + buttonWidth * 3), argValue.getY() + argValue.getHeight(), buttonWidth, buttonHeight);
		arghex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				argSys.setText("16");
			}
		});
		
		final JTextField resultValue = new JTextField();
		resultValue.setBounds(marginx + textBoxLength + 30, marginy, textBoxLength, textBoxHeight);
		resultValue.setText("0");
		final JTextField resultSys = new JTextField();
		resultSys.setBounds(resultValue.getX() + buttonWidth * 4, resultValue.getY() + resultValue.getHeight(), argSysWidth, buttonHeight);
		resultSys.setText("10");
		JLabel resultSysText = new JLabel("Current System");
		resultSysText.setBounds(resultSys.getX() + resultSys.getWidth(), resultSys.getY(), 90, buttonHeight);
		JButton resultbin = new JButton("BIN");
		resultbin.setBounds(resultValue.getX(), resultValue.getY() + resultValue.getHeight(), buttonWidth, buttonHeight);
		resultbin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultSys.setText("2");
			}
		});
		JButton resultoct = new JButton("OCT");
		resultoct.setBounds((resultValue.getX() + buttonWidth), resultValue.getY() + resultValue.getHeight(), buttonWidth, buttonHeight);
		resultoct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultSys.setText("8");
			}
		});
		JButton resultdec = new JButton("DEC");
		resultdec.setBounds((resultValue.getX() + buttonWidth * 2), resultValue.getY() + resultValue.getHeight(), buttonWidth, buttonHeight);
		resultdec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultSys.setText("10");
			}
		});
		JButton resulthex = new JButton("HEX");
		resulthex.setBounds((resultValue.getX() + buttonWidth * 3), resultValue.getY() + resultValue.getHeight(), buttonWidth, buttonHeight);
		resulthex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultSys.setText("16");
			}
		});
		JButton calculate = new JButton("Calculate");
		calculate.setBounds(resultValue.getX() + resultValue.getWidth() / 2 - calculateWidth / 2, resultValue.getY() + resultValue.getHeight() + buttonHeight + 20, calculateWidth, buttonHeight);
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(!calculator.checkIfcorrect(argValue.getText(), Integer.parseInt(argSys.getText()))) {
						new WrongArgumentValuePane();
						return;
					}
					if(!calculator.checkSys(Integer.parseInt(argSys.getText()))) {
						new WrongArgumentSysPane();
						return;
					}
					if(!calculator.checkSys(Integer.parseInt(resultSys.getText()))) {
						new WrongResultSysPane();
						return;
					}
					resultValue.setText(calculator.convert(argValue.getText(), Integer.parseInt(argSys.getText()), Integer.parseInt(resultSys.getText())));
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (UnknownCharacterException e1) {
					e1.printStackTrace();
				}
			}
		});
		JLabel argText = new JLabel("Argument");
		argText.setBounds(argValue.getX(), argValue.getY() - 20, 60, 20);
		JLabel resultText = new JLabel("Result");
		resultText.setBounds(resultValue.getX(), resultValue.getY() - 20, 40, 20);
		frame.add(argValue);
		frame.add(argSys);
		frame.add(argSysText);
		frame.add(argbin);
		frame.add(argoct);
		frame.add(argdec);
		frame.add(arghex);
		frame.add(resultValue);
		frame.add(resultSys);
		frame.add(resultSysText);
		frame.add(resultbin);
		frame.add(resultoct);
		frame.add(resultdec);
		frame.add(resulthex);
		frame.add(calculate);
		frame.add(argText);
		frame.add(resultText);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		 
	}
}