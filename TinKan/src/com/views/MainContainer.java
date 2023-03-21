package com.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import com.motor.Motor;

import javax.swing.JLayeredPane;
import javax.swing.BoxLayout;

public class MainContainer {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainContainer window = new MainContainer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainContainer() {
		initialize();
		Motor motor = new Motor();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		PanelMenuPrincipal panelMenu = new PanelMenuPrincipal();
		
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(new BoxLayout(layeredPane, BoxLayout.X_AXIS));
		layeredPane.add(panelMenu);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSave = new JMenuItem("Save Game");
		mnFile.add(mntmSave);
		
		JMenuItem mntmLoad = new JMenuItem("Load Game");
		mnFile.add(mntmLoad);
		
		JMenuItem mntmNew = new JMenuItem("New Game");
		mnFile.add(mntmNew);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmTutorial = new JMenuItem("How to play");
		mnHelp.add(mntmTutorial);
		
		JSeparator separator = new JSeparator();
		mnHelp.add(separator);
		
		JMenuItem mntmCredits = new JMenuItem("Credits");
		mnHelp.add(mntmCredits);
	}

}
