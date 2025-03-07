package gr.aueb.cf;

import gr.aueb.cf.schoolapp.view_controller.Dashboard;
import gr.aueb.cf.schoolapp.view_controller.LandingPage;
import gr.aueb.cf.schoolapp.view_controller.LoginPage;

import java.awt.EventQueue;

public class Main {
	private static final LandingPage landingPage = new LandingPage();
	private static final LoginPage loginPage = new LoginPage();
	private static final Dashboard dashboard = new Dashboard();
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					landingPage.setVisible(true);
					landingPage.setLocationRelativeTo(null);
					
					loginPage.setVisible(false);
					loginPage.setLocationRelativeTo(null);
					
					dashboard.setVisible(false);
					dashboard.setLocationRelativeTo(null);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static LandingPage getLandingPage() {
		return landingPage;
	}

	public static LoginPage getLoginPage() {
		return loginPage;
	}

	public static Dashboard getDashboard() {
		return dashboard;
	}
	
	
	
	
}
