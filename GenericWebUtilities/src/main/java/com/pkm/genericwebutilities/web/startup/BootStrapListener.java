package com.pkm.genericwebutilities.web.startup;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 * @author pmartin
 *
 */
@WebListener
public class BootStrapListener implements ServletContextListener {

	public static String appName;
	
	private static final String APP_NAME_ATTRIBUTE = "ApplicationName";

	public BootStrapListener() {
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		
		this.initializeAppName(servletContextEvent.getServletContext());
		this.initializeLogging();
		this.initializeManifest();
		this.initializeSpring();
	}

	/**
	 * Finds the Application Name from the Initial Context
	 */
	private void initializeAppName(ServletContext servletContext) {

		appName = servletContext.getInitParameter(APP_NAME_ATTRIBUTE);
	}

	/**
	 * Initializes Logging for this Application
	 */
	private void initializeLogging() {
		
	}

	/**
	 * Reads attributes from the Web Application Manifest and stores them in the application context
	 */
	private void initializeManifest() {
		
	}

	/**
	 * Initializes the Spring Framework
	 */
	private void initializeSpring() {
		
	}
}
