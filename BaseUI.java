/**
 * 
 */
package com.mistkafka.empmis.ui;

/**
 * 基础UI接口。
 * @author Mistkafka Nov 17, 2014
 *
 */
public interface BaseUI {
	
	/**
	 * UI部件的运行类。
	 */
	public void run();
	
	/**
	 * 打印UI部件的帮助信息。不需要帮助信息请空实现。
	 */
	public void displayHelpInfo();
}
